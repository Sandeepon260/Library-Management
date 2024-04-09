package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class newsservice {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.util.List<java.lang.String> strList0 = NewsLetter.NewsletterService.getAvailableNewsletters();
        java.lang.Class<?> wildcardClass1 = strList0.getClass();
        org.junit.Assert.assertNotNull(strList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        login.NewsletterContentPublisher newsletterContentPublisher1 = NewsLetter.NewsletterService.getPublisher("");
        org.junit.Assert.assertNull(newsletterContentPublisher1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        login.NewsletterContentPublisher newsletterContentPublisher1 = null;
        NewsLetter.NewsletterService.registerNewsletter("", newsletterContentPublisher1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        login.NewsletterContentPublisher newsletterContentPublisher1 = NewsLetter.NewsletterService.getPublisher("hi!");
        org.junit.Assert.assertNull(newsletterContentPublisher1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        NewsLetter.NewsletterService newsletterService0 = new NewsLetter.NewsletterService();
        java.lang.Class<?> wildcardClass1 = newsletterService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        login.NewsletterContentPublisher newsletterContentPublisher1 = null;
        NewsLetter.NewsletterService.registerNewsletter("hi!", newsletterContentPublisher1);
    }
}

