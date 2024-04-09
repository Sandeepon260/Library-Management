package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class user {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass6 = strList5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass5 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass4 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass3 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.lang.Class<?> wildcardClass5 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass4 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass4 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass5 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.setEmail("");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass5 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.String str9 = user1.getEmail();
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str10 = user1.getEmail();
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        java.lang.String str4 = user1.getEmail();
        java.lang.Class<?> wildcardClass5 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        java.lang.Class<?> wildcardClass2 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str6 = user1.getEmail();
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass5 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass5 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str13 = user1.getEmail();
        java.lang.String str14 = user1.getEmail();
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass4 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        java.lang.String str12 = user1.getEmail();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.String str13 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str5 = user1.getEmail();
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.update("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass6 = strList5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.String str20 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        user1.update("");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        user1.update("hi!");
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str7 = user1.getEmail();
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        user1.update("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.update("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str7 = user1.getEmail();
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        java.lang.String str11 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        user1.update("");
        java.util.List<java.lang.String> strList19 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass20 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str13 = user1.getEmail();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.lang.String str16 = user1.getEmail();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass20 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.update("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("");
        user1.setEmail("");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass5 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.update("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("");
        user1.update("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str11 = user1.getEmail();
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.lang.String str5 = user1.getEmail();
        user1.setEmail("");
        java.lang.String str8 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        user1.update("");
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str13 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.lang.String str17 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str9 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        java.lang.Class<?> wildcardClass20 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str14 = user1.getEmail();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.setEmail("");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.String str9 = user1.getEmail();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        java.lang.String str4 = user1.getEmail();
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.update("");
        java.lang.String str14 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str16 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        java.lang.Class<?> wildcardClass21 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str5 = user1.getEmail();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("");
        user1.update("hi!");
        java.lang.String str9 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass6 = strList5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.lang.String str8 = user1.getEmail();
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.lang.Class<?> wildcardClass5 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str12 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        user1.update("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str13 = user1.getEmail();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str11 = user1.getEmail();
        user1.setEmail("");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList3 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.setEmail("");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        java.lang.String str9 = user1.getEmail();
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str13 = user1.getEmail();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str17 = user1.getEmail();
        java.lang.Class<?> wildcardClass18 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str13 = user1.getEmail();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        user1.setEmail("");
        user1.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str13 = user1.getEmail();
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str11 = user1.getEmail();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str14 = user1.getEmail();
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.update("");
        java.lang.String str17 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        user1.update("hi!");
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        user1.update("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        java.lang.String str12 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.String str12 = user1.getEmail();
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        user1.update("");
        user1.setEmail("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        java.lang.String str12 = user1.getEmail();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList15 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass16 = user1.getClass();
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.lang.String str5 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.setEmail("");
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.update("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList14 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        java.lang.String str15 = user1.getEmail();
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        user1.update("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.update("hi!");
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str8 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.String str11 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        java.util.List<java.lang.String> strList16 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        java.lang.String str11 = user1.getEmail();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        user1.unsubscribeFromNewsletter("");
        java.lang.String str11 = user1.getEmail();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.Class<?> wildcardClass23 = strList22.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        java.util.List<java.lang.String> strList11 = user1.getSubscriptions();
        user1.setEmail("");
        java.lang.String str14 = user1.getEmail();
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        java.lang.String str15 = user1.getEmail();
        user1.update("hi!");
        java.util.List<java.lang.String> strList18 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.update("");
        java.lang.Class<?> wildcardClass4 = user1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        java.lang.Class<?> wildcardClass12 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.setEmail("hi!");
        user1.setEmail("hi!");
        java.lang.String str15 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        java.util.List<java.lang.String> strList17 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.update("");
        java.lang.String str6 = user1.getEmail();
        user1.subscribeToNewsletter("");
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.lang.String str18 = user1.getEmail();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.lang.Class<?> wildcardClass19 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.lang.String str7 = user1.getEmail();
        user1.update("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.update("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        user1.update("hi!");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        user1.setEmail("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.update("hi!");
        java.lang.String str7 = user1.getEmail();
        user1.subscribeToNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        java.util.List<java.lang.String> strList12 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass13 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.String str6 = user1.getEmail();
        java.util.List<java.lang.String> strList7 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass11 = user1.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.update("");
        java.lang.String str4 = user1.getEmail();
        user1.update("");
        user1.unsubscribeFromNewsletter("");
        user1.update("");
        user1.update("");
        java.util.List<java.lang.String> strList13 = user1.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        user1.unsubscribeFromNewsletter("");
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList10 = user1.getSubscriptions();
        java.lang.String str11 = user1.getEmail();
        user1.subscribeToNewsletter("");
        java.lang.Class<?> wildcardClass14 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.update("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.setEmail("hi!");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("");
        user1.update("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        user1.update("hi!");
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        java.util.List<java.lang.String> strList21 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass22 = user1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.Class<?> wildcardClass17 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        user1.unsubscribeFromNewsletter("hi!");
        user1.subscribeToNewsletter("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        java.lang.String str10 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        user1.subscribeToNewsletter("hi!");
        user1.update("hi!");
        java.lang.Class<?> wildcardClass10 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        java.lang.String str6 = user1.getEmail();
        user1.update("");
        user1.update("");
        user1.subscribeToNewsletter("");
        user1.update("hi!");
        user1.subscribeToNewsletter("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        user1.setEmail("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        NewsLetter.User user1 = new NewsLetter.User("");
        java.util.List<java.lang.String> strList2 = user1.getSubscriptions();
        user1.subscribeToNewsletter("");
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList6 = user1.getSubscriptions();
        java.lang.String str7 = user1.getEmail();
        user1.unsubscribeFromNewsletter("");
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("hi!");
        user1.subscribeToNewsletter("hi!");
        java.lang.Class<?> wildcardClass15 = user1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        user1.unsubscribeFromNewsletter("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.subscribeToNewsletter("");
        user1.setEmail("");
        user1.update("");
        java.lang.String str8 = user1.getEmail();
        user1.setEmail("hi!");
        user1.update("");
        user1.subscribeToNewsletter("hi!");
        user1.unsubscribeFromNewsletter("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        NewsLetter.User user1 = new NewsLetter.User("hi!");
        user1.unsubscribeFromNewsletter("hi!");
        java.util.List<java.lang.String> strList4 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList5 = user1.getSubscriptions();
        java.lang.Class<?> wildcardClass6 = strList5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        NewsLetter.User user1 = new NewsLetter.User("");
        user1.unsubscribeFromNewsletter("");
        user1.setEmail("hi!");
        user1.unsubscribeFromNewsletter("");
        java.util.List<java.lang.String> strList8 = user1.getSubscriptions();
        java.util.List<java.lang.String> strList9 = user1.getSubscriptions();
        java.lang.String str10 = user1.getEmail();
        user1.setEmail("");
        user1.update("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }
}

