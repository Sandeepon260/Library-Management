	package AutomatedTesting;
	
	import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class user6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str13 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.update("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.String str9 = user1.getEmail();
        user1.update("");
        java.lang.String str12 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str15 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        java.lang.String str4 = user1.getEmail();
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.setEmail("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str13 = user1.getEmail();
        java.lang.String str14 = user1.getEmail();
        user1.update("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str7 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str10 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.String str17 = user1.getEmail();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.update("");
        user1.setEmail("");
        java.lang.String str19 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList20 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass21 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str13 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.String str9 = user1.getEmail();
        user1.update("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str20 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str9 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str9 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str9 = user1.getEmail();
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("hi!");
        user1.update("");
        java.lang.String str16 = user1.getEmail();
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str18 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass23 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str14 = user1.getEmail();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        user1.update("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        user1.update("hi!");
        java.lang.String str12 = user1.getEmail();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        java.lang.String str4 = user1.getEmail();
        java.lang.String str5 = user1.getEmail();
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass23 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str12 = user1.getEmail();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("hi!");
        user1.update("");
        user1.update("hi!");
        java.lang.String str18 = user1.getEmail();
        user1.update("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str16 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str9 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        user1.update("");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass21 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        java.lang.String str15 = user1.getEmail();
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.update("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str14 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.update("");
        user1.update("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        java.lang.String str14 = user1.getEmail();
        user1.update("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        java.lang.String str14 = user1.getEmail();
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.setEmail("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.String str12 = user1.getEmail();
        user1.update("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList20 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str12 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str5 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str12 = user1.getEmail();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        user1.update("hi!");
        java.lang.String str19 = user1.getEmail();
        java.lang.String str20 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        java.lang.String str12 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList22 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass23 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.update("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.lang.String str19 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str13 = user1.getEmail();
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("");
        user1.update("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        user1.update("");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        java.lang.String str12 = user1.getEmail();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str19 = user1.getEmail();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str13 = user1.getEmail();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        user1.update("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList23 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str19 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str16 = user1.getEmail();
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass18 = strList17.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        java.lang.String str15 = user1.getEmail();
        user1.update("");
        java.lang.String str18 = user1.getEmail();
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str15 = user1.getEmail();
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        java.lang.String str17 = user1.getEmail();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str5 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        java.lang.String str17 = user1.getEmail();
        java.lang.String str18 = user1.getEmail();
        java.lang.String str19 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.String str15 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.lang.String str15 = user1.getEmail();
        java.lang.String str16 = user1.getEmail();
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str9 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        java.lang.String str17 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str17 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        java.lang.String str14 = user1.getEmail();
        user1.update("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }
}

