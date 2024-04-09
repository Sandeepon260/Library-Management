	package AutomatedTesting;
	import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class user3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        user1.update("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        java.lang.Class<?> wildcardClass18 = strList17.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        java.lang.String str13 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str13 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str21 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        user1.update("hi!");
        user1.update("");
        user1.update("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str9 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str12 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        java.lang.String str14 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        user1.setEmail("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.update("hi!");
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        user1.update("hi!");
        java.lang.String str20 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str5 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        java.lang.String str20 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        java.lang.String str12 = user1.getEmail();
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.update("hi!");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        java.lang.String str4 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.update("");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str10 = user1.getEmail();
        user1.update("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str12 = user1.getEmail();
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        user1.update("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str5 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str14 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        user1.unsubscribeFromNewsletter("");
        java.lang.String str18 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        java.lang.Class<?> wildcardClass24 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.update("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.lang.String str11 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.update("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        user1.update("");
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        java.lang.String str14 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str16 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str5 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str12 = user1.getEmail();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        java.lang.String str17 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("");
        user1.setEmail("hi!");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        java.lang.String str19 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        java.lang.Class<?> wildcardClass20 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str7 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str19 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.update("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str20 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        java.lang.String str20 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList24 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        java.util.List<java.lang.String> strList20 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        user1.update("");
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        java.lang.String str15 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.String str13 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.String str9 = user1.getEmail();
        java.lang.String str10 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        user1.setEmail("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str9 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str15 = user1.getEmail();
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass20 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str20 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        java.lang.String str16 = user1.getEmail();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        java.lang.String str14 = user1.getEmail();
        user1.update("");
        java.lang.String str17 = user1.getEmail();
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        user1.setEmail("");
        java.lang.String str17 = user1.getEmail();
        java.lang.String str18 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str21 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str5 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        user1.update("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList20 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        java.lang.String str14 = user1.getEmail();
        user1.update("");
        java.lang.String str17 = user1.getEmail();
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.update("");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        java.lang.Class<?> wildcardClass20 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str17 = user1.getEmail();
        user1.update("");
        java.util.List<java.lang.String> strList20 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass21 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str10 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.lang.String str14 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        java.lang.Class<?> wildcardClass20 = strList19.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.lang.String str2 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass21 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        java.lang.String str14 = user1.getEmail();
        user1.update("");
        java.lang.String str17 = user1.getEmail();
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str9 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str13 = user1.getEmail();
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str18 = user1.getEmail();
        java.lang.String str19 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.update("hi!");
        user1.setEmail("");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str24 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        user1.setEmail("");
        java.lang.String str19 = user1.getEmail();
        java.lang.String str20 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
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
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        user1.update("hi!");
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
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str17 = user1.getEmail();
        user1.update("");
        java.util.List<java.lang.String> strList20 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass21 = strList20.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        java.lang.String str4 = user1.getEmail();
        java.lang.String str5 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str13 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str24 = user1.getEmail();
        java.util.List<java.lang.String> strList25 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("");
        user1.update("");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.setEmail("");
        java.lang.String str9 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        user1.update("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        user1.update("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        java.lang.String str16 = user1.getEmail();
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.update("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.update("");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str19 = user1.getEmail();
        java.lang.Class<?> wildcardClass20 = user1.getClass();
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str20 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str10 = user1.getEmail();
        java.lang.String str11 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str11 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str17 = user1.getEmail();
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.update("hi!");
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        java.lang.String str4 = user1.getEmail();
        java.lang.String str5 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        java.lang.String str10 = user1.getEmail();
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        user1.update("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass23 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.lang.String str12 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("");
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        java.lang.String str4 = user1.getEmail();
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        java.lang.Class<?> wildcardClass21 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        java.lang.String str4 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str8 = user1.getEmail();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        java.util.List<java.lang.String> strList20 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.String str12 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.setEmail("");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        user1.update("hi!");
        user1.update("");
        user1.update("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass25 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str10 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        user1.subscribeToNewsletter("");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str14 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.lang.String str5 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.update("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        java.lang.String str14 = user1.getEmail();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        user1.unsubscribeFromNewsletter("");
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str5 = user1.getEmail();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str9 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.lang.String str12 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str18 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str5 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.update("");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.String str9 = user1.getEmail();
        java.lang.String str10 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("hi!");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass21 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str13 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str13 = user1.getEmail();
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        user1.setEmail("");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.update("");
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str16 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str5 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        java.lang.String str13 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str5 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str9 = user1.getEmail();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        user1.update("");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        user1.setEmail("");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass20 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.String str3 = user1.getEmail();
        user1.update("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str13 = user1.getEmail();
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str14 = user1.getEmail();
        user1.setEmail("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        java.lang.String str16 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

