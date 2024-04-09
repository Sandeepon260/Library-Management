	package AutomatedTesting;
	
	import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class user4 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        user1.update("");
        user1.update("");
        java.lang.Class<?> wildcardClass22 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str13 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str16 = user1.getEmail();
        java.lang.String str17 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList20 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        java.lang.String str16 = user1.getEmail();
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str9 = user1.getEmail();
        user1.update("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("");
        user1.update("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str15 = user1.getEmail();
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.String str9 = user1.getEmail();
        user1.update("");
        user1.setEmail("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str12 = user1.getEmail();
        java.lang.String str13 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList20 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass21 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.lang.String str5 = user1.getEmail();
        user1.setEmail("");
        user1.update("hi!");
        user1.setEmail("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str18 = user1.getEmail();
        java.lang.String str19 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("");
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass21 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str14 = user1.getEmail();
        java.lang.String str15 = user1.getEmail();
        java.lang.String str16 = user1.getEmail();
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.update("hi!");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        java.lang.String str11 = user1.getEmail();
        java.lang.String str12 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str17 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        java.lang.String str11 = user1.getEmail();
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.lang.String str15 = user1.getEmail();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.lang.String str5 = user1.getEmail();
        user1.setEmail("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str15 = user1.getEmail();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str5 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass20 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str13 = user1.getEmail();
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str12 = user1.getEmail();
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.String str9 = user1.getEmail();
        user1.update("");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        java.lang.String str4 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str9 = user1.getEmail();
        user1.setEmail("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str5 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str17 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str10 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str16 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str19 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str10 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str15 = user1.getEmail();
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str16 = user1.getEmail();
        java.lang.String str17 = user1.getEmail();
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str14 = user1.getEmail();
        java.lang.String str15 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList20 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        java.lang.String str4 = user1.getEmail();
        user1.setEmail("hi!");
        user1.setEmail("");
        java.lang.String str9 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        user1.update("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str17 = user1.getEmail();
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str16 = user1.getEmail();
        java.lang.String str17 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.String str9 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.setEmail("hi!");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.lang.String str19 = user1.getEmail();
        java.lang.String str20 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.lang.String str12 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str11 = user1.getEmail();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.update("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        java.lang.String str23 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.String str19 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str13 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str10 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str12 = user1.getEmail();
        user1.setEmail("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str14 = user1.getEmail();
        user1.update("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str14 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        user1.setEmail("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str13 = user1.getEmail();
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str17 = user1.getEmail();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str5 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str5 = user1.getEmail();
        user1.setEmail("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("");
        user1.update("hi!");
        user1.setEmail("hi!");
        java.lang.String str17 = user1.getEmail();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str9 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str12 = user1.getEmail();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.String str14 = user1.getEmail();
        java.lang.String str15 = user1.getEmail();
        java.lang.String str16 = user1.getEmail();
        java.lang.String str17 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.update("");
        java.lang.String str18 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        java.lang.String str15 = user1.getEmail();
        java.lang.String str16 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str14 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.Class<?> wildcardClass21 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str16 = user1.getEmail();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.update("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str18 = user1.getEmail();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList24 = user1.getSubscriptions();
        java.lang.String str25 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.lang.String str5 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str14 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str21 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str17 = user1.getEmail();
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("hi!");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.update("hi!");
        user1.update("");
        user1.setEmail("");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str12 = user1.getEmail();
        java.lang.String str13 = user1.getEmail();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str20 = user1.getEmail();
        java.lang.String str21 = user1.getEmail();
        java.lang.Class<?> wildcardClass22 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str16 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.setEmail("");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass18 = strList17.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str9 = user1.getEmail();
        java.lang.String str10 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
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
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.lang.String str5 = user1.getEmail();
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str17 = user1.getEmail();
        user1.setEmail("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.lang.String str18 = user1.getEmail();
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str20 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass23 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        user1.update("");
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str15 = user1.getEmail();
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.update("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        java.lang.String str17 = user1.getEmail();
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.String str15 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        java.lang.String str16 = user1.getEmail();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str14 = user1.getEmail();
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        java.lang.String str14 = user1.getEmail();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.String str12 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str19 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList24 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList24 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList27 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str14 = user1.getEmail();
        user1.setEmail("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.setEmail("hi!");
        java.lang.String str19 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.setEmail("");
        user1.setEmail("hi!");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
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
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.setEmail("");
        user1.update("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("");
        java.lang.String str13 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str14 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str10 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str9 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str12 = user1.getEmail();
        java.lang.String str13 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.lang.String str18 = user1.getEmail();
        java.lang.String str19 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
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
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str10 = user1.getEmail();
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str18 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        user1.update("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str12 = user1.getEmail();
        java.lang.String str13 = user1.getEmail();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.lang.String str19 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str9 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        user1.update("");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str19 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str9 = user1.getEmail();
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str13 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.update("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str13 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass20 = strList19.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.update("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        user1.update("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.update("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.lang.String str5 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        java.lang.String str4 = user1.getEmail();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str15 = user1.getEmail();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
        user1.setEmail("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass23 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str14 = user1.getEmail();
        user1.update("");
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.setEmail("hi!");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.update("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str12 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
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
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str9 = user1.getEmail();
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
        user1.subscribeToNewsletter("");
        java.lang.String str19 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str12 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str12 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str9 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str12 = user1.getEmail();
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
        user1.setEmail("");
        java.lang.String str19 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass21 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.update("");
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str15 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str13 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str14 = user1.getEmail();
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        user1.update("");
        java.lang.String str20 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str23 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
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
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str5 = user1.getEmail();
        java.lang.String str6 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
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
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.update("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
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
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str11 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.update("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass23 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("");
        user1.update("");
        user1.update("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        java.lang.String str13 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass20 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
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
        user1.subscribeToNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("");
        java.lang.String str24 = user1.getEmail();
        java.lang.Class<?> wildcardClass25 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
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
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        java.lang.String str15 = user1.getEmail();
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.lang.String str14 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str13 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
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
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
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
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.String str14 = user1.getEmail();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.lang.String str16 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        java.lang.String str4 = user1.getEmail();
        java.lang.String str5 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str17 = user1.getEmail();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass22 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
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
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList23 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
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
        java.lang.Class<?> wildcardClass22 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str14 = user1.getEmail();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.update("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass20 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        java.lang.String str4 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
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
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.setEmail("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
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
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.update("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
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
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.String str18 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str21 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        java.lang.String str15 = user1.getEmail();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str14 = user1.getEmail();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str12 = user1.getEmail();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str21 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str12 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }
}

