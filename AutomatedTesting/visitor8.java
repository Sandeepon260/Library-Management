	package AutomatedTesting;
	
	import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class visitor8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
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
        java.lang.String str15 = visitor13.getType();
        java.lang.String str16 = visitor13.getType();
        java.lang.Class<?> wildcardClass17 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
            visitor11.register("hi!", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
            java.lang.String str13 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.Class<?> wildcardClass9 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor17);
        java.lang.String str19 = visitor18.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "visitor" + "'", str19, "visitor");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        java.lang.Class<?> wildcardClass13 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "visitor", "visitor");
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
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        java.lang.String str11 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
            visitor10.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor3.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor15);
        // The following exception was thrown during execution in test generation
        try {
            visitor18.register("", "hi!", "visitor");
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
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        java.lang.String str9 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor8.getType();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor15.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
            java.lang.String str13 = visitor7.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        java.lang.String str10 = visitor7.getType();
        java.lang.String str11 = visitor7.getType();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
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
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        java.lang.String str17 = visitor16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
            visitor2.register("", "hi!", "");
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
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        java.lang.Class<?> wildcardClass9 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        java.lang.String str12 = visitor9.getType();
        java.lang.Class<?> wildcardClass13 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        // The following exception was thrown during execution in test generation
        try {
            visitor1.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
            java.lang.String str13 = visitor11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        java.lang.Class<?> wildcardClass12 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
            java.lang.String str13 = visitor11.getPassword("");
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
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        java.lang.String str13 = visitor7.getType();
        java.lang.Class<?> wildcardClass14 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        java.lang.String str5 = visitor3.getType();
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
            visitor10.register("visitor", "", "hi!");
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
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        java.lang.String str7 = visitor3.getType();
        java.lang.String str8 = visitor3.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor3);
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor6.getType();
        java.lang.Class<?> wildcardClass8 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        java.lang.Class<?> wildcardClass15 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass13 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        java.lang.String str9 = visitor3.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        java.lang.Class<?> wildcardClass11 = visitor4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
            java.lang.String str15 = visitor12.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        java.lang.String str12 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "visitor", "hi!");
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
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        java.lang.String str16 = visitor14.getType();
        java.lang.Class<?> wildcardClass17 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
            visitor9.register("hi!", "hi!", "visitor");
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
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "", "hi!");
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
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor5.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        java.lang.String str11 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor9);
        java.lang.String str16 = visitor9.getType();
        java.lang.Class<?> wildcardClass17 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("", "", "");
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
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        java.lang.String str11 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        java.lang.String str2 = visitor1.getType();
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("visitor", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "visitor" + "'", str2, "visitor");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor16);
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = visitor17.getPassword("hi!");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
            visitor9.register("", "", "");
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
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        java.lang.String str12 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        java.lang.String str12 = visitor5.getType();
        java.lang.Class<?> wildcardClass13 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        java.lang.String str8 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor2);
        java.lang.Class<?> wildcardClass12 = visitor2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.Class<?> wildcardClass8 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        java.lang.String str5 = visitor3.getType();
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor12);
        java.lang.Class<?> wildcardClass18 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor12.getPassword("hi!");
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
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        java.lang.String str11 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "", "");
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
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        java.lang.String str14 = visitor10.getType();
        java.lang.String str15 = visitor10.getType();
        java.lang.String str16 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("", "hi!", "hi!");
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
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        java.lang.String str12 = visitor8.getType();
        java.lang.Class<?> wildcardClass13 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        java.lang.String str10 = visitor7.getType();
        java.lang.String str11 = visitor7.getType();
        java.lang.String str12 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = visitor17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        java.lang.String str18 = visitor15.getType();
        java.lang.String str19 = visitor15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "visitor" + "'", str19, "visitor");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
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
            java.lang.String str9 = visitor7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        java.lang.String str14 = visitor10.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
            visitor11.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("hi!", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        java.lang.Class<?> wildcardClass13 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("hi!");
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
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("hi!", "visitor", "");
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
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        java.lang.String str14 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("hi!", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("visitor", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        java.lang.Class<?> wildcardClass11 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.Class<?> wildcardClass9 = visitor2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
            java.lang.String str9 = visitor3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
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
            visitor8.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
        java.lang.String str15 = visitor14.getType();
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor14);
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        java.lang.String str11 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        java.lang.String str10 = visitor6.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor6);
        java.lang.String str12 = visitor11.getType();
        java.lang.String str13 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor14);
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        java.lang.String str10 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        java.lang.String str8 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
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
        java.lang.String str15 = visitor14.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor9.getType();
        java.lang.Class<?> wildcardClass12 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
        java.lang.String str10 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.Class<?> wildcardClass8 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "visitor", "hi!");
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
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor14.getPassword("hi!");
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
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
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
        java.lang.String str14 = visitor4.getType();
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        java.lang.String str11 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor9);
        java.lang.String str16 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        java.lang.String str2 = visitor1.getType();
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "visitor" + "'", str2, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        java.lang.String str11 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor14.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass13 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        java.lang.String str12 = visitor10.getType();
        java.lang.String str13 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
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
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        login.Visitor visitor19 = new login.Visitor((login.Client) visitor18);
        login.Visitor visitor20 = new login.Visitor((login.Client) visitor18);
        // The following exception was thrown during execution in test generation
        try {
            visitor18.register("hi!", "hi!", "visitor");
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
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        java.lang.String str11 = visitor10.getType();
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        java.lang.String str8 = visitor5.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
        java.lang.String str14 = visitor10.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor10);
        java.lang.String str16 = visitor15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
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
        java.lang.String str17 = visitor16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        java.lang.String str14 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
            visitor6.register("visitor", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        java.lang.String str12 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        java.lang.String str10 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.Class<?> wildcardClass10 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        java.lang.String str15 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor14);
        java.lang.String str17 = visitor14.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.Class<?> wildcardClass15 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
            java.lang.String str12 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass13 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
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
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        java.lang.String str12 = visitor11.getType();
        java.lang.Class<?> wildcardClass13 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        java.lang.String str16 = visitor11.getType();
        java.lang.String str17 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
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
        java.lang.String str11 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("visitor", "", "");
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
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        java.lang.String str15 = visitor11.getType();
        java.lang.String str16 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor11.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor8.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "visitor", "hi!");
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
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        java.lang.Class<?> wildcardClass13 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        java.lang.Class<?> wildcardClass10 = visitor2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        java.lang.String str9 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            visitor3.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.Class<?> wildcardClass6 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
            java.lang.String str17 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
            visitor10.register("", "visitor", "visitor");
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
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        java.lang.Class<?> wildcardClass15 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
        java.lang.String str10 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor5.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
            visitor9.register("hi!", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
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
        java.lang.String str11 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        java.lang.String str12 = visitor11.getType();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        java.lang.String str15 = visitor14.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.Class<?> wildcardClass8 = visitor4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor3.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor3.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
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
            visitor11.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
        java.lang.Class<?> wildcardClass13 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
            java.lang.String str12 = visitor4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("visitor", "hi!", "hi!");
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
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
            java.lang.String str14 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
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
        java.lang.String str18 = visitor15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass15 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        java.lang.String str11 = visitor7.getType();
        java.lang.String str12 = visitor7.getType();
        java.lang.Class<?> wildcardClass13 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
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
        java.lang.String str16 = visitor15.getType();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
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
        java.lang.Class<?> wildcardClass11 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        java.lang.Class<?> wildcardClass15 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
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
        java.lang.String str12 = visitor10.getType();
        java.lang.String str13 = visitor10.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor10);
        java.lang.String str15 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "", "");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass11 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
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
        java.lang.String str12 = visitor7.getType();
        java.lang.Class<?> wildcardClass13 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        java.lang.String str2 = visitor1.getType();
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = visitor4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "visitor" + "'", str2, "visitor");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
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
        java.lang.String str10 = visitor6.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor6);
        java.lang.String str12 = visitor11.getType();
        java.lang.Class<?> wildcardClass13 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
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
            java.lang.String str11 = visitor8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
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
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        java.lang.String str17 = visitor16.getType();
        java.lang.String str18 = visitor16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
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
            java.lang.String str13 = visitor9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
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
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
        java.lang.String str16 = visitor15.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor15);
        java.lang.String str18 = visitor15.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor15.register("hi!", "hi!", "hi!");
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
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
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
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
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
        java.lang.String str15 = visitor14.getType();
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor14);
        // The following exception was thrown during execution in test generation
        try {
            visitor16.register("hi!", "visitor", "hi!");
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
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
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
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
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
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = visitor5.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
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
        java.lang.String str12 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        java.lang.String str15 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        java.lang.String str8 = visitor5.getType();
        java.lang.String str9 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.Class<?> wildcardClass15 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
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
            visitor12.register("hi!", "", "hi!");
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
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
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
        java.lang.String str17 = visitor16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
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
            java.lang.String str16 = visitor11.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor8);
        java.lang.String str16 = visitor15.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor20.register("visitor", "", "");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "visitor" + "'", str19, "visitor");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
        java.lang.String str13 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor5.getType();
        java.lang.String str9 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
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
        java.lang.String str11 = visitor10.getType();
        java.lang.String str12 = visitor10.getType();
        java.lang.String str13 = visitor10.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor10);
        java.lang.String str15 = visitor14.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor7.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
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
            visitor10.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor7.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("hi!", "hi!", "hi!");
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
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
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
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass11 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
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
        java.lang.String str10 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.String str14 = visitor13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        login.Visitor visitor4 = new login.Visitor(client0);
        login.Visitor visitor5 = new login.Visitor(client0);
        login.Visitor visitor6 = new login.Visitor(client0);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
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
        java.lang.String str12 = visitor11.getType();
        java.lang.String str13 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor11.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
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
        java.lang.String str14 = visitor12.getType();
        java.lang.String str15 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor12.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass13 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
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
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass11 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor2);
        java.lang.String str13 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
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
            java.lang.String str13 = visitor11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
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
        java.lang.String str13 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("hi!", "visitor", "");
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
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
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
            visitor13.register("hi!", "hi!", "");
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
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
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
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor16);
        java.lang.String str18 = visitor16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("hi!", "", "visitor");
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
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        java.lang.String str2 = visitor1.getType();
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "visitor" + "'", str2, "visitor");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        java.lang.String str13 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
        java.lang.String str15 = visitor14.getType();
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor14);
        java.lang.String str17 = visitor16.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor16.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
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
            visitor12.register("visitor", "hi!", "");
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
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
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
        java.lang.Class<?> wildcardClass11 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.Class<?> wildcardClass8 = visitor7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
            visitor11.register("visitor", "", "hi!");
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
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
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
        login.Visitor visitor22 = new login.Visitor((login.Client) visitor21);
        // The following exception was thrown during execution in test generation
        try {
            visitor21.register("hi!", "hi!", "");
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
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        java.lang.String str5 = visitor3.getType();
        java.lang.String str6 = visitor3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = visitor3.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.Class<?> wildcardClass15 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
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
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
            java.lang.String str12 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
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
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.Class<?> wildcardClass8 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
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
        java.lang.Class<?> wildcardClass22 = visitor21.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "visitor" + "'", str19, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
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
        java.lang.String str12 = visitor10.getType();
        java.lang.String str13 = visitor10.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor10);
        java.lang.String str15 = visitor14.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
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
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        java.lang.String str16 = visitor11.getType();
        java.lang.String str17 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        java.lang.String str17 = visitor15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
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
        java.lang.String str13 = visitor12.getType();
        java.lang.Class<?> wildcardClass14 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass11 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
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
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
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
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.Class<?> wildcardClass9 = visitor4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }
}

