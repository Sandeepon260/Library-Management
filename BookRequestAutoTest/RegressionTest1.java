package BookRequestAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 35);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str12 = bookRequest11.getBookTitle();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str19 = bookRequest18.getRequester();
        java.lang.String str20 = bookRequest18.getBookTitle();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getBookTitle();
        java.lang.String str23 = bookRequest18.getRequester();
        java.lang.String str24 = bookRequest18.getBookTitle();
        java.lang.String str25 = bookRequest18.getRequester();
        java.lang.String str26 = bookRequest18.getBookTitle();
        java.lang.String str27 = bookRequest18.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest31.getPriority();
        int int36 = bookRequest31.getPriority();
        java.lang.String str37 = bookRequest31.getRequester();
        int int38 = bookRequest18.compareTo(bookRequest31);
        int int39 = bookRequest3.compareTo(bookRequest18);
        java.lang.Class<?> wildcardClass40 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest9.getPriority();
        int int15 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str15 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        java.lang.String str14 = bookRequest7.getBookTitle();
        int int15 = bookRequest7.getPriority();
        java.lang.String str16 = bookRequest7.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("", "", 1);
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest7.compareTo(bookRequest20);
        int int23 = bookRequest3.compareTo(bookRequest20);
        request.BookRequest bookRequest24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = bookRequest3.compareTo(bookRequest24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (byte) 10);
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest17);
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getBookTitle();
        java.lang.Class<?> wildcardClass22 = bookRequest17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (byte) 0);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str15 = bookRequest3.getRequester();
        java.lang.String str16 = bookRequest3.getRequester();
        int int17 = bookRequest3.getPriority();
        java.lang.String str18 = bookRequest3.getRequester();
        java.lang.String str19 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", 35);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass11 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str22 = bookRequest21.getRequester();
        java.lang.String str23 = bookRequest21.getBookTitle();
        int int24 = bookRequest17.compareTo(bookRequest21);
        java.lang.String str25 = bookRequest17.getRequester();
        java.lang.String str26 = bookRequest17.getRequester();
        int int27 = bookRequest17.getPriority();
        int int28 = bookRequest3.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass29 = bookRequest17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest13);
        int int17 = bookRequest13.getPriority();
        java.lang.String str18 = bookRequest13.getRequester();
        request.BookRequest bookRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bookRequest13.compareTo(bookRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        int int13 = bookRequest9.getPriority();
        int int14 = bookRequest9.getPriority();
        int int15 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int20 = bookRequest9.compareTo(bookRequest19);
        java.lang.String str21 = bookRequest9.getRequester();
        int int22 = bookRequest9.getPriority();
        java.lang.Class<?> wildcardClass23 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        int int17 = bookRequest12.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        java.lang.String str19 = bookRequest16.getBookTitle();
        int int20 = bookRequest16.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str22 = bookRequest3.getRequester();
        int int23 = bookRequest3.getPriority();
        java.lang.String str24 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass25 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass13 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        int int17 = bookRequest12.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        java.lang.String str19 = bookRequest16.getBookTitle();
        int int20 = bookRequest16.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str22 = bookRequest16.getRequester();
        java.lang.String str23 = bookRequest16.getBookTitle();
        java.lang.Class<?> wildcardClass24 = bookRequest16.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        int int17 = bookRequest12.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        java.lang.String str19 = bookRequest16.getBookTitle();
        int int20 = bookRequest16.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str22 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest8.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str15 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", 52);
        int int20 = bookRequest3.compareTo(bookRequest19);
        java.lang.String str21 = bookRequest19.getRequester();
        java.lang.String str22 = bookRequest19.getRequester();
        java.lang.Class<?> wildcardClass23 = bookRequest19.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        int int15 = bookRequest14.getPriority();
        int int16 = bookRequest14.getPriority();
        java.lang.String str17 = bookRequest14.getBookTitle();
        java.lang.String str18 = bookRequest14.getBookTitle();
        java.lang.String str19 = bookRequest14.getBookTitle();
        int int20 = bookRequest3.compareTo(bookRequest14);
        int int21 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass22 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        int int15 = bookRequest3.getPriority();
        int int16 = bookRequest3.getPriority();
        java.lang.String str17 = bookRequest3.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", 0);
        java.lang.String str22 = bookRequest21.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getBookTitle();
        int int31 = bookRequest21.compareTo(bookRequest26);
        java.lang.String str32 = bookRequest21.getBookTitle();
        java.lang.String str33 = bookRequest21.getBookTitle();
        int int34 = bookRequest3.compareTo(bookRequest21);
        java.lang.String str35 = bookRequest21.getRequester();
        java.lang.Class<?> wildcardClass36 = bookRequest21.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str17 = bookRequest16.getBookTitle();
        java.lang.String str18 = bookRequest16.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str20 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", 1);
        java.lang.String str16 = bookRequest15.getBookTitle();
        int int17 = bookRequest9.compareTo(bookRequest15);
        java.lang.String str18 = bookRequest15.getRequester();
        int int19 = bookRequest3.compareTo(bookRequest15);
        java.lang.String str20 = bookRequest15.getRequester();
        java.lang.String str21 = bookRequest15.getBookTitle();
        java.lang.Class<?> wildcardClass22 = bookRequest15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str13 = bookRequest12.getRequester();
        int int14 = bookRequest12.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        int int22 = bookRequest18.getPriority();
        int int23 = bookRequest18.getPriority();
        int int24 = bookRequest12.compareTo(bookRequest18);
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int29 = bookRequest18.compareTo(bookRequest28);
        int int30 = bookRequest3.compareTo(bookRequest18);
        java.lang.String str31 = bookRequest3.getBookTitle();
        java.lang.String str32 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass33 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 32);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookRequest3.compareTo(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        int int15 = bookRequest7.getPriority();
        int int16 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (byte) 10);
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest7.compareTo(bookRequest20);
        int int23 = bookRequest20.getPriority();
        java.lang.Class<?> wildcardClass24 = bookRequest20.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bookRequest3.compareTo(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str13 = bookRequest12.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getRequester();
        int int16 = bookRequest12.getPriority();
        java.lang.String str17 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass18 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", 97);
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass12 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getBookTitle();
        int int12 = bookRequest7.getPriority();
        int int13 = bookRequest7.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int18 = bookRequest7.compareTo(bookRequest17);
        java.lang.String str19 = bookRequest17.getRequester();
        int int20 = bookRequest17.getPriority();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest3.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getRequester();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getBookTitle();
        int int23 = bookRequest16.getPriority();
        int int24 = bookRequest16.getPriority();
        java.lang.String str25 = bookRequest16.getRequester();
        java.lang.String str26 = bookRequest16.getBookTitle();
        int int27 = bookRequest8.compareTo(bookRequest16);
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str32 = bookRequest31.getBookTitle();
        java.lang.String str33 = bookRequest31.getBookTitle();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest8.compareTo(bookRequest31);
        java.lang.String str36 = bookRequest8.getRequester();
        java.lang.Class<?> wildcardClass37 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        int int14 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str20 = bookRequest19.getRequester();
        int int21 = bookRequest19.getPriority();
        int int22 = bookRequest12.compareTo(bookRequest19);
        java.lang.String str23 = bookRequest19.getBookTitle();
        java.lang.Class<?> wildcardClass24 = bookRequest19.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getBookTitle();
        java.lang.String str14 = bookRequest10.getBookTitle();
        int int15 = bookRequest10.getPriority();
        int int16 = bookRequest10.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int21 = bookRequest10.compareTo(bookRequest20);
        java.lang.String str22 = bookRequest10.getRequester();
        int int23 = bookRequest10.getPriority();
        java.lang.String str24 = bookRequest10.getBookTitle();
        int int25 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass26 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass18 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        int int15 = bookRequest11.getPriority();
        int int16 = bookRequest11.getPriority();
        java.lang.String str17 = bookRequest11.getRequester();
        java.lang.Class<?> wildcardClass18 = bookRequest11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str16 = bookRequest15.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        int int23 = bookRequest20.getPriority();
        java.lang.String str24 = bookRequest20.getBookTitle();
        java.lang.String str25 = bookRequest20.getRequester();
        java.lang.String str26 = bookRequest20.getRequester();
        int int27 = bookRequest15.compareTo(bookRequest20);
        int int28 = bookRequest20.getPriority();
        int int29 = bookRequest3.compareTo(bookRequest20);
        java.lang.Class<?> wildcardClass30 = bookRequest20.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest13.getPriority();
        java.lang.String str17 = bookRequest13.getBookTitle();
        java.lang.String str18 = bookRequest13.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        int int14 = bookRequest3.getPriority();
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str15 = bookRequest3.getRequester();
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.String str18 = bookRequest3.getRequester();
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.String str20 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        int int16 = bookRequest8.compareTo(bookRequest12);
        int int17 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str22 = bookRequest21.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 0);
        int int31 = bookRequest26.compareTo(bookRequest30);
        int int32 = bookRequest21.compareTo(bookRequest30);
        java.lang.String str33 = bookRequest21.getBookTitle();
        int int34 = bookRequest3.compareTo(bookRequest21);
        java.lang.Class<?> wildcardClass35 = bookRequest21.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        java.lang.String str14 = bookRequest7.getBookTitle();
        int int15 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getRequester();
        java.lang.String str22 = bookRequest19.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest19);
        int int24 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass25 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        int int17 = bookRequest12.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        java.lang.String str19 = bookRequest16.getBookTitle();
        int int20 = bookRequest16.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest16);
        int int22 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '4');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 100);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass12 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest9.compareTo(bookRequest13);
        java.lang.String str17 = bookRequest9.getRequester();
        java.lang.String str18 = bookRequest9.getRequester();
        java.lang.String str19 = bookRequest9.getBookTitle();
        int int20 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        java.lang.String str17 = bookRequest12.getBookTitle();
        java.lang.String str18 = bookRequest12.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int21 = bookRequest16.compareTo(bookRequest20);
        java.lang.String str22 = bookRequest16.getBookTitle();
        int int23 = bookRequest7.compareTo(bookRequest16);
        int int24 = bookRequest3.compareTo(bookRequest7);
        int int25 = bookRequest7.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getBookTitle();
        java.lang.String str18 = bookRequest12.getRequester();
        int int19 = bookRequest12.getPriority();
        java.lang.Class<?> wildcardClass20 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", 0);
        java.lang.String str11 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getBookTitle();
        int int20 = bookRequest10.compareTo(bookRequest15);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (byte) 10);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest10.compareTo(bookRequest24);
        int int27 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str28 = bookRequest3.getRequester();
        int int29 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass30 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bookRequest3.compareTo(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest11.compareTo(bookRequest15);
        int int17 = bookRequest15.getPriority();
        int int18 = bookRequest15.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest15);
        java.lang.String str20 = bookRequest3.getBookTitle();
        int int21 = bookRequest3.getPriority();
        java.lang.String str22 = bookRequest3.getBookTitle();
        java.lang.String str23 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass24 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str15 = bookRequest3.getRequester();
        java.lang.String str16 = bookRequest3.getRequester();
        int int17 = bookRequest3.getPriority();
        java.lang.String str18 = bookRequest3.getRequester();
        java.lang.String str19 = bookRequest3.getBookTitle();
        java.lang.String str20 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        int int12 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass13 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookRequest3.compareTo(bookRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) '#');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) ' ');
        int int15 = bookRequest8.compareTo(bookRequest14);
        int int16 = bookRequest3.compareTo(bookRequest14);
        java.lang.Class<?> wildcardClass17 = bookRequest14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "hi!", (int) '#');
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (short) 10);
        int int14 = bookRequest13.getPriority();
        int int15 = bookRequest9.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass17 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) '#');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) ' ');
        int int22 = bookRequest15.compareTo(bookRequest21);
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getRequester();
        int int25 = bookRequest7.compareTo(bookRequest21);
        request.BookRequest bookRequest26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = bookRequest21.compareTo(bookRequest26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest16);
        java.lang.Class<?> wildcardClass20 = bookRequest16.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str13 = bookRequest12.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        java.lang.Class<?> wildcardClass17 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest9.compareTo(bookRequest13);
        java.lang.String str17 = bookRequest9.getRequester();
        java.lang.String str18 = bookRequest9.getRequester();
        java.lang.String str19 = bookRequest9.getBookTitle();
        int int20 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str21 = bookRequest9.getRequester();
        int int22 = bookRequest9.getPriority();
        java.lang.Class<?> wildcardClass23 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        int int15 = bookRequest7.getPriority();
        int int16 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (byte) 10);
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest7.compareTo(bookRequest20);
        java.lang.String str23 = bookRequest20.getRequester();
        int int24 = bookRequest20.getPriority();
        java.lang.String str25 = bookRequest20.getBookTitle();
        java.lang.Class<?> wildcardClass26 = bookRequest20.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (byte) 100);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str13 = bookRequest12.getRequester();
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getRequester();
        int int17 = bookRequest12.getPriority();
        int int18 = bookRequest7.compareTo(bookRequest12);
        int int19 = bookRequest7.getPriority();
        java.lang.String str20 = bookRequest7.getRequester();
        java.lang.String str21 = bookRequest7.getRequester();
        java.lang.String str22 = bookRequest7.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest7);
        int int24 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass25 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", 0);
        java.lang.String str9 = bookRequest8.getBookTitle();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bookRequest3.compareTo(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        java.lang.String str14 = bookRequest7.getBookTitle();
        int int15 = bookRequest7.getPriority();
        java.lang.String str16 = bookRequest7.getRequester();
        int int17 = bookRequest7.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 1);
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getBookTitle();
        int int25 = bookRequest7.compareTo(bookRequest22);
        java.lang.String str26 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass27 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", 0);
        java.lang.String str11 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getBookTitle();
        int int20 = bookRequest10.compareTo(bookRequest15);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (byte) 10);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest10.compareTo(bookRequest24);
        int int27 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str28 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass29 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        int int17 = bookRequest12.getPriority();
        int int18 = bookRequest12.getPriority();
        java.lang.String str19 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("", "", 1);
        int int24 = bookRequest12.compareTo(bookRequest23);
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (byte) -1);
        int int29 = bookRequest12.compareTo(bookRequest28);
        java.lang.Class<?> wildcardClass30 = bookRequest28.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        int int20 = bookRequest16.getPriority();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getBookTitle();
        int int23 = bookRequest3.compareTo(bookRequest16);
        request.BookRequest bookRequest24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = bookRequest16.compareTo(bookRequest24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        java.lang.String str14 = bookRequest7.getBookTitle();
        int int15 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str16 = bookRequest3.getBookTitle();
        int int17 = bookRequest3.getPriority();
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.String str20 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getRequester();
        int int14 = bookRequest11.getPriority();
        java.lang.String str15 = bookRequest11.getRequester();
        java.lang.String str16 = bookRequest11.getBookTitle();
        int int17 = bookRequest11.getPriority();
        java.lang.String str18 = bookRequest11.getRequester();
        java.lang.String str19 = bookRequest11.getBookTitle();
        int int20 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) '4');
        int int18 = bookRequest3.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass19 = bookRequest17.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getBookTitle();
        int int12 = bookRequest7.getPriority();
        int int13 = bookRequest7.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int18 = bookRequest7.compareTo(bookRequest17);
        java.lang.String str19 = bookRequest17.getRequester();
        int int20 = bookRequest17.getPriority();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest3.compareTo(bookRequest17);
        int int23 = bookRequest17.getPriority();
        java.lang.Class<?> wildcardClass24 = bookRequest17.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str12 = bookRequest11.getBookTitle();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str19 = bookRequest18.getRequester();
        java.lang.String str20 = bookRequest18.getBookTitle();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getBookTitle();
        java.lang.String str23 = bookRequest18.getRequester();
        java.lang.String str24 = bookRequest18.getBookTitle();
        java.lang.String str25 = bookRequest18.getRequester();
        java.lang.String str26 = bookRequest18.getBookTitle();
        java.lang.String str27 = bookRequest18.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest31.getPriority();
        int int36 = bookRequest31.getPriority();
        java.lang.String str37 = bookRequest31.getRequester();
        int int38 = bookRequest18.compareTo(bookRequest31);
        int int39 = bookRequest3.compareTo(bookRequest18);
        java.lang.String str40 = bookRequest18.getBookTitle();
        int int41 = bookRequest18.getPriority();
        java.lang.Class<?> wildcardClass42 = bookRequest18.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", 0);
        java.lang.String str11 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getBookTitle();
        int int20 = bookRequest10.compareTo(bookRequest15);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (byte) 10);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest10.compareTo(bookRequest24);
        int int27 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str28 = bookRequest3.getRequester();
        java.lang.String str29 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass30 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        java.lang.String str14 = bookRequest7.getBookTitle();
        int int15 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str16 = bookRequest3.getBookTitle();
        int int17 = bookRequest3.getPriority();
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) '#');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) ' ');
        int int19 = bookRequest12.compareTo(bookRequest18);
        int int20 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str21 = bookRequest12.getRequester();
        java.lang.String str22 = bookRequest12.getRequester();
        int int23 = bookRequest12.getPriority();
        java.lang.String str24 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", 1);
        int int29 = bookRequest12.compareTo(bookRequest28);
        java.lang.Class<?> wildcardClass30 = bookRequest28.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest8.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "hi!", 52);
        int int23 = bookRequest18.compareTo(bookRequest22);
        int int24 = bookRequest3.compareTo(bookRequest22);
        java.lang.String str25 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass26 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        java.lang.String str18 = bookRequest15.getRequester();
        int int19 = bookRequest15.getPriority();
        int int20 = bookRequest15.getPriority();
        java.lang.String str21 = bookRequest15.getRequester();
        int int22 = bookRequest3.compareTo(bookRequest15);
        int int23 = bookRequest3.getPriority();
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (-1));
        java.lang.String str28 = bookRequest27.getBookTitle();
        java.lang.String str29 = bookRequest27.getBookTitle();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getBookTitle();
        java.lang.String str32 = bookRequest27.getRequester();
        java.lang.String str33 = bookRequest27.getRequester();
        int int34 = bookRequest3.compareTo(bookRequest27);
        java.lang.Class<?> wildcardClass35 = bookRequest27.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) ' ');
        int int16 = bookRequest15.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest20.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", 1);
        java.lang.String str27 = bookRequest26.getBookTitle();
        int int28 = bookRequest20.compareTo(bookRequest26);
        int int29 = bookRequest15.compareTo(bookRequest26);
        int int30 = bookRequest10.compareTo(bookRequest26);
        int int31 = bookRequest10.getPriority();
        java.lang.String str32 = bookRequest10.getRequester();
        java.lang.String str33 = bookRequest10.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str12 = bookRequest11.getBookTitle();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str19 = bookRequest18.getRequester();
        java.lang.String str20 = bookRequest18.getBookTitle();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getBookTitle();
        java.lang.String str23 = bookRequest18.getRequester();
        java.lang.String str24 = bookRequest18.getBookTitle();
        java.lang.String str25 = bookRequest18.getRequester();
        java.lang.String str26 = bookRequest18.getBookTitle();
        java.lang.String str27 = bookRequest18.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest31.getPriority();
        int int36 = bookRequest31.getPriority();
        java.lang.String str37 = bookRequest31.getRequester();
        int int38 = bookRequest18.compareTo(bookRequest31);
        int int39 = bookRequest3.compareTo(bookRequest18);
        java.lang.String str40 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass41 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        int int16 = bookRequest8.compareTo(bookRequest12);
        int int17 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str18 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass19 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str15 = bookRequest13.getRequester();
        java.lang.String str16 = bookRequest13.getRequester();
        java.lang.String str17 = bookRequest13.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) '4');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest13.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getRequester();
        java.lang.Class<?> wildcardClass26 = bookRequest21.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) '#');
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getRequester();
        java.lang.String str17 = bookRequest14.getBookTitle();
        int int18 = bookRequest14.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest14);
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getRequester();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getBookTitle();
        int int23 = bookRequest16.getPriority();
        int int24 = bookRequest16.getPriority();
        java.lang.String str25 = bookRequest16.getRequester();
        java.lang.String str26 = bookRequest16.getBookTitle();
        int int27 = bookRequest8.compareTo(bookRequest16);
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str32 = bookRequest31.getBookTitle();
        java.lang.String str33 = bookRequest31.getBookTitle();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest8.compareTo(bookRequest31);
        java.lang.String str36 = bookRequest8.getRequester();
        int int37 = bookRequest8.getPriority();
        java.lang.Class<?> wildcardClass38 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str18 = bookRequest17.getRequester();
        java.lang.String str19 = bookRequest17.getBookTitle();
        int int20 = bookRequest13.compareTo(bookRequest17);
        java.lang.String str21 = bookRequest13.getRequester();
        java.lang.String str22 = bookRequest13.getRequester();
        java.lang.String str23 = bookRequest13.getBookTitle();
        int int24 = bookRequest7.compareTo(bookRequest13);
        java.lang.String str25 = bookRequest7.getRequester();
        int int26 = bookRequest7.getPriority();
        int int27 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 52);
        int int4 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest9.compareTo(bookRequest13);
        java.lang.String str17 = bookRequest9.getRequester();
        java.lang.String str18 = bookRequest9.getRequester();
        java.lang.String str19 = bookRequest9.getBookTitle();
        int int20 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str21 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass22 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str15 = bookRequest3.getRequester();
        int int16 = bookRequest3.getPriority();
        java.lang.String str17 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) '4');
        int int18 = bookRequest3.compareTo(bookRequest17);
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", 10);
        int int23 = bookRequest3.compareTo(bookRequest22);
        int int24 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass25 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", 35);
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str18 = bookRequest17.getBookTitle();
        java.lang.String str19 = bookRequest17.getRequester();
        int int20 = bookRequest11.compareTo(bookRequest17);
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest17.getPriority();
        request.BookRequest bookRequest23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = bookRequest17.compareTo(bookRequest23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getRequester();
        java.lang.String str16 = bookRequest13.getRequester();
        java.lang.String str17 = bookRequest13.getRequester();
        int int18 = bookRequest9.compareTo(bookRequest13);
        int int19 = bookRequest9.getPriority();
        int int20 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str21 = bookRequest9.getBookTitle();
        java.lang.String str22 = bookRequest9.getRequester();
        java.lang.Class<?> wildcardClass23 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest9.getRequester();
        java.lang.String str13 = bookRequest9.getBookTitle();
        java.lang.String str14 = bookRequest9.getBookTitle();
        java.lang.String str15 = bookRequest9.getBookTitle();
        java.lang.Class<?> wildcardClass16 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getBookTitle();
        java.lang.String str18 = bookRequest12.getRequester();
        java.lang.String str19 = bookRequest12.getBookTitle();
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.String str21 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass22 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "hi!", (int) '#');
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str13 = bookRequest12.getRequester();
        int int14 = bookRequest12.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        int int22 = bookRequest18.getPriority();
        int int23 = bookRequest18.getPriority();
        int int24 = bookRequest12.compareTo(bookRequest18);
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int29 = bookRequest18.compareTo(bookRequest28);
        int int30 = bookRequest3.compareTo(bookRequest18);
        int int31 = bookRequest18.getPriority();
        java.lang.String str32 = bookRequest18.getRequester();
        java.lang.String str33 = bookRequest18.getBookTitle();
        java.lang.Class<?> wildcardClass34 = bookRequest18.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        int int10 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        int int14 = bookRequest3.getPriority();
        java.lang.String str15 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bookRequest3.compareTo(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        int int21 = bookRequest16.compareTo(bookRequest20);
        int int22 = bookRequest11.compareTo(bookRequest20);
        int int23 = bookRequest11.getPriority();
        int int24 = bookRequest11.getPriority();
        java.lang.String str25 = bookRequest11.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest11);
        int int27 = bookRequest11.getPriority();
        int int28 = bookRequest11.getPriority();
        java.lang.Class<?> wildcardClass29 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        int int15 = bookRequest14.getPriority();
        int int16 = bookRequest14.getPriority();
        int int17 = bookRequest10.compareTo(bookRequest14);
        int int18 = bookRequest3.compareTo(bookRequest14);
        java.lang.Class<?> wildcardClass19 = bookRequest14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", 52);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", 1);
        java.lang.String str13 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest17.getPriority();
        int int23 = bookRequest12.compareTo(bookRequest17);
        int int24 = bookRequest7.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass25 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest7.compareTo(bookRequest18);
        java.lang.String str22 = bookRequest18.getRequester();
        java.lang.Class<?> wildcardClass23 = bookRequest18.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        java.lang.String str13 = bookRequest9.getBookTitle();
        int int14 = bookRequest9.getPriority();
        int int15 = bookRequest9.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int20 = bookRequest9.compareTo(bookRequest19);
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        int int23 = bookRequest3.compareTo(bookRequest19);
        java.lang.Class<?> wildcardClass24 = bookRequest19.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getBookTitle();
        java.lang.String str17 = bookRequest14.getRequester();
        int int18 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str19 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str15 = bookRequest13.getRequester();
        java.lang.String str16 = bookRequest13.getRequester();
        java.lang.String str17 = bookRequest13.getRequester();
        int int18 = bookRequest13.getPriority();
        java.lang.Class<?> wildcardClass19 = bookRequest13.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 52);
        int int12 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bookRequest11.compareTo(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", 1);
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest8.compareTo(bookRequest14);
        int int17 = bookRequest3.compareTo(bookRequest14);
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str15 = bookRequest14.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 0);
        int int24 = bookRequest19.compareTo(bookRequest23);
        int int25 = bookRequest14.compareTo(bookRequest23);
        java.lang.String str26 = bookRequest23.getBookTitle();
        java.lang.String str27 = bookRequest23.getBookTitle();
        java.lang.String str28 = bookRequest23.getBookTitle();
        java.lang.String str29 = bookRequest23.getRequester();
        int int30 = bookRequest23.getPriority();
        java.lang.String str31 = bookRequest23.getRequester();
        int int32 = bookRequest7.compareTo(bookRequest23);
        java.lang.Class<?> wildcardClass33 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (byte) 100);
        int int14 = bookRequest13.getPriority();
        int int15 = bookRequest13.getPriority();
        java.lang.String str16 = bookRequest13.getRequester();
        int int17 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str18 = bookRequest13.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", 52);
        int int17 = bookRequest8.compareTo(bookRequest16);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) (short) 100);
        int int22 = bookRequest16.compareTo(bookRequest21);
        int int23 = bookRequest3.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest21.getRequester();
        java.lang.Class<?> wildcardClass25 = bookRequest21.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", 0);
        java.lang.String str11 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getBookTitle();
        int int20 = bookRequest10.compareTo(bookRequest15);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (byte) 10);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest10.compareTo(bookRequest24);
        int int27 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.String str15 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.String str15 = bookRequest3.getRequester();
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", 1);
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getBookTitle();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 0);
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getRequester();
        java.lang.String str14 = bookRequest11.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", 0);
        java.lang.String str12 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getBookTitle();
        int int21 = bookRequest11.compareTo(bookRequest16);
        java.lang.String str22 = bookRequest11.getRequester();
        java.lang.String str23 = bookRequest11.getRequester();
        int int24 = bookRequest3.compareTo(bookRequest11);
        int int25 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        java.lang.String str15 = bookRequest7.getBookTitle();
        java.lang.String str16 = bookRequest7.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 10);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getRequester();
        int int12 = bookRequest8.getPriority();
        java.lang.String str13 = bookRequest8.getBookTitle();
        int int14 = bookRequest8.getPriority();
        int int15 = bookRequest8.getPriority();
        int int16 = bookRequest3.compareTo(bookRequest8);
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        int int15 = bookRequest3.getPriority();
        int int16 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        int int12 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) '#');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) ' ');
        int int16 = bookRequest9.compareTo(bookRequest15);
        java.lang.String str17 = bookRequest9.getRequester();
        int int18 = bookRequest3.compareTo(bookRequest9);
        int int19 = bookRequest3.getPriority();
        java.lang.String str20 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "hi!", 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bookRequest3.compareTo(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str12 = bookRequest11.getBookTitle();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest11);
        int int15 = bookRequest3.getPriority();
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        int int9 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bookRequest8.compareTo(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) ' ');
        int int13 = bookRequest7.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest12.getPriority();
        int int16 = bookRequest12.getPriority();
        java.lang.Class<?> wildcardClass17 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        int int15 = bookRequest11.getPriority();
        java.lang.String str16 = bookRequest11.getRequester();
        java.lang.Class<?> wildcardClass17 = bookRequest11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        int int4 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest9.getPriority();
        int int15 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.String str17 = bookRequest3.getBookTitle();
        java.lang.String str18 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        int int21 = bookRequest16.compareTo(bookRequest20);
        int int22 = bookRequest11.compareTo(bookRequest20);
        int int23 = bookRequest11.getPriority();
        int int24 = bookRequest11.getPriority();
        java.lang.String str25 = bookRequest11.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str27 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int15 = bookRequest7.compareTo(bookRequest14);
        int int16 = bookRequest7.getPriority();
        java.lang.String str17 = bookRequest7.getRequester();
        int int18 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str23 = bookRequest22.getRequester();
        int int24 = bookRequest22.getPriority();
        int int25 = bookRequest22.getPriority();
        java.lang.String str26 = bookRequest22.getBookTitle();
        int int27 = bookRequest7.compareTo(bookRequest22);
        java.lang.Class<?> wildcardClass28 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int17 = bookRequest12.compareTo(bookRequest16);
        java.lang.String str18 = bookRequest12.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        int int15 = bookRequest7.getPriority();
        int int16 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (byte) 10);
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest7.compareTo(bookRequest20);
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getRequester();
        int int33 = bookRequest26.compareTo(bookRequest30);
        int int34 = bookRequest26.getPriority();
        java.lang.String str35 = bookRequest26.getRequester();
        int int36 = bookRequest7.compareTo(bookRequest26);
        java.lang.Class<?> wildcardClass37 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", 0);
        java.lang.String str12 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getBookTitle();
        int int21 = bookRequest11.compareTo(bookRequest16);
        java.lang.String str22 = bookRequest11.getRequester();
        java.lang.String str23 = bookRequest11.getRequester();
        int int24 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass25 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", 1);
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest8.compareTo(bookRequest14);
        int int17 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        java.lang.String str17 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bookRequest12.compareTo(bookRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getBookTitle();
        int int12 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 0);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str13 = bookRequest12.getRequester();
        java.lang.String str14 = bookRequest12.getBookTitle();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getRequester();
        java.lang.String str18 = bookRequest12.getBookTitle();
        java.lang.String str19 = bookRequest12.getRequester();
        java.lang.String str20 = bookRequest12.getBookTitle();
        java.lang.String str21 = bookRequest12.getRequester();
        int int22 = bookRequest8.compareTo(bookRequest12);
        int int23 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str24 = bookRequest12.getBookTitle();
        int int25 = bookRequest12.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str15 = bookRequest13.getRequester();
        java.lang.String str16 = bookRequest13.getRequester();
        java.lang.String str17 = bookRequest13.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) '4');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest13.compareTo(bookRequest21);
        java.lang.Class<?> wildcardClass24 = bookRequest21.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest9.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str27 = bookRequest26.getRequester();
        int int28 = bookRequest26.getPriority();
        int int29 = bookRequest18.compareTo(bookRequest26);
        int int30 = bookRequest26.getPriority();
        int int31 = bookRequest26.getPriority();
        int int32 = bookRequest26.getPriority();
        int int33 = bookRequest9.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str9 = bookRequest8.getBookTitle();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getRequester();
        java.lang.String str12 = bookRequest8.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str17 = bookRequest16.getBookTitle();
        java.lang.String str18 = bookRequest16.getBookTitle();
        int int19 = bookRequest8.compareTo(bookRequest16);
        java.lang.String str20 = bookRequest16.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest16);
        java.lang.Class<?> wildcardClass22 = bookRequest16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        java.lang.String str14 = bookRequest9.getRequester();
        java.lang.Class<?> wildcardClass15 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "hi!", 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 0);
        int int27 = bookRequest22.compareTo(bookRequest26);
        int int28 = bookRequest17.compareTo(bookRequest26);
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getBookTitle();
        int int31 = bookRequest26.getPriority();
        java.lang.String str32 = bookRequest26.getRequester();
        int int33 = bookRequest3.compareTo(bookRequest26);
        java.lang.Class<?> wildcardClass34 = bookRequest26.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getBookTitle();
        int int15 = bookRequest3.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getRequester();
        java.lang.String str22 = bookRequest19.getRequester();
        java.lang.String str23 = bookRequest19.getBookTitle();
        int int24 = bookRequest3.compareTo(bookRequest19);
        java.lang.Class<?> wildcardClass25 = bookRequest19.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", 97);
        java.lang.String str13 = bookRequest12.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) ' ');
        int int18 = bookRequest12.compareTo(bookRequest17);
        java.lang.String str19 = bookRequest17.getRequester();
        java.lang.String str20 = bookRequest17.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest17);
        int int22 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str11 = bookRequest10.getRequester();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getBookTitle();
        java.lang.String str14 = bookRequest10.getRequester();
        int int15 = bookRequest10.getPriority();
        java.lang.String str16 = bookRequest10.getBookTitle();
        int int17 = bookRequest10.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass19 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest13);
        int int17 = bookRequest13.getPriority();
        int int18 = bookRequest13.getPriority();
        java.lang.String str19 = bookRequest13.getBookTitle();
        java.lang.Class<?> wildcardClass20 = bookRequest13.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str12 = bookRequest11.getBookTitle();
        java.lang.String str13 = bookRequest11.getRequester();
        int int14 = bookRequest11.getPriority();
        java.lang.String str15 = bookRequest11.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str20 = bookRequest19.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (short) 0);
        int int29 = bookRequest24.compareTo(bookRequest28);
        int int30 = bookRequest19.compareTo(bookRequest28);
        int int31 = bookRequest19.getPriority();
        int int32 = bookRequest19.getPriority();
        java.lang.String str33 = bookRequest19.getRequester();
        int int34 = bookRequest11.compareTo(bookRequest19);
        java.lang.String str35 = bookRequest11.getRequester();
        int int36 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str41 = bookRequest40.getRequester();
        java.lang.String str42 = bookRequest40.getBookTitle();
        int int43 = bookRequest40.getPriority();
        java.lang.String str44 = bookRequest40.getRequester();
        int int45 = bookRequest11.compareTo(bookRequest40);
        java.lang.Class<?> wildcardClass46 = bookRequest40.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        int int21 = bookRequest16.compareTo(bookRequest20);
        int int22 = bookRequest11.compareTo(bookRequest20);
        int int23 = bookRequest11.getPriority();
        int int24 = bookRequest11.getPriority();
        java.lang.String str25 = bookRequest11.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) '#');
        int int31 = bookRequest30.getPriority();
        java.lang.String str32 = bookRequest30.getRequester();
        java.lang.String str33 = bookRequest30.getBookTitle();
        int int34 = bookRequest30.getPriority();
        int int35 = bookRequest11.compareTo(bookRequest30);
        java.lang.String str36 = bookRequest30.getRequester();
        java.lang.Class<?> wildcardClass37 = bookRequest30.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (byte) -1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.String str16 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        int int15 = bookRequest3.getPriority();
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.String str17 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) '#');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) ' ');
        int int15 = bookRequest8.compareTo(bookRequest14);
        int int16 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str17 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 10);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", 1);
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getBookTitle();
        java.lang.String str13 = bookRequest10.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest17.getPriority();
        java.lang.String str23 = bookRequest17.getBookTitle();
        int int24 = bookRequest17.getPriority();
        int int25 = bookRequest10.compareTo(bookRequest17);
        int int26 = bookRequest3.compareTo(bookRequest17);
        int int27 = bookRequest17.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        int int13 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getRequester();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getBookTitle();
        int int23 = bookRequest16.getPriority();
        int int24 = bookRequest16.getPriority();
        java.lang.String str25 = bookRequest16.getRequester();
        java.lang.String str26 = bookRequest16.getBookTitle();
        int int27 = bookRequest8.compareTo(bookRequest16);
        java.lang.Class<?> wildcardClass28 = bookRequest16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 100);
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest11.getRequester();
        java.lang.Class<?> wildcardClass14 = bookRequest11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 10);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str11 = bookRequest10.getRequester();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getBookTitle();
        java.lang.String str14 = bookRequest10.getRequester();
        int int15 = bookRequest10.getPriority();
        java.lang.String str16 = bookRequest10.getBookTitle();
        int int17 = bookRequest10.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str19 = bookRequest10.getBookTitle();
        java.lang.String str20 = bookRequest10.getRequester();
        int int21 = bookRequest10.getPriority();
        java.lang.String str22 = bookRequest10.getRequester();
        java.lang.Class<?> wildcardClass23 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        int int15 = bookRequest7.getPriority();
        int int16 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (byte) 10);
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest7.compareTo(bookRequest20);
        int int23 = bookRequest20.getPriority();
        java.lang.String str24 = bookRequest20.getBookTitle();
        int int25 = bookRequest20.getPriority();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str15 = bookRequest13.getRequester();
        java.lang.String str16 = bookRequest13.getRequester();
        java.lang.String str17 = bookRequest13.getRequester();
        java.lang.String str18 = bookRequest13.getRequester();
        java.lang.String str19 = bookRequest13.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", 35);
        int int12 = bookRequest3.compareTo(bookRequest11);
        int int13 = bookRequest11.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", 0);
        java.lang.String str18 = bookRequest17.getBookTitle();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getRequester();
        int int21 = bookRequest17.getPriority();
        java.lang.String str22 = bookRequest17.getBookTitle();
        int int23 = bookRequest11.compareTo(bookRequest17);
        int int24 = bookRequest17.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        java.lang.String str17 = bookRequest12.getBookTitle();
        java.lang.String str18 = bookRequest12.getBookTitle();
        java.lang.String str19 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass20 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.String str15 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str15 = bookRequest3.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int20 = bookRequest3.compareTo(bookRequest19);
        int int21 = bookRequest19.getPriority();
        int int22 = bookRequest19.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", 1);
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getBookTitle();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str15 = bookRequest10.getBookTitle();
        java.lang.String str16 = bookRequest10.getRequester();
        java.lang.Class<?> wildcardClass17 = bookRequest10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", 1);
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest8.compareTo(bookRequest14);
        int int17 = bookRequest3.compareTo(bookRequest14);
        int int18 = bookRequest14.getPriority();
        int int19 = bookRequest14.getPriority();
        java.lang.Class<?> wildcardClass20 = bookRequest14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int16 = bookRequest8.compareTo(bookRequest15);
        int int17 = bookRequest15.getPriority();
        int int18 = bookRequest15.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest15);
        int int20 = bookRequest15.getPriority();
        java.lang.Class<?> wildcardClass21 = bookRequest15.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", 1);
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getBookTitle();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str15 = bookRequest3.getBookTitle();
        int int16 = bookRequest3.getPriority();
        int int17 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) '#');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) ' ');
        int int16 = bookRequest9.compareTo(bookRequest15);
        java.lang.String str17 = bookRequest9.getRequester();
        int int18 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass19 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        java.lang.String str17 = bookRequest12.getRequester();
        int int18 = bookRequest12.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str27 = bookRequest26.getRequester();
        java.lang.String str28 = bookRequest26.getBookTitle();
        int int29 = bookRequest22.compareTo(bookRequest26);
        java.lang.String str30 = bookRequest26.getBookTitle();
        java.lang.String str31 = bookRequest26.getRequester();
        int int32 = bookRequest12.compareTo(bookRequest26);
        java.lang.Class<?> wildcardClass33 = bookRequest26.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        int int15 = bookRequest9.getPriority();
        java.lang.String str16 = bookRequest9.getRequester();
        java.lang.Class<?> wildcardClass17 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getRequester();
        int int12 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 32);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str15 = bookRequest3.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int20 = bookRequest3.compareTo(bookRequest19);
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        java.lang.String str18 = bookRequest15.getRequester();
        int int19 = bookRequest15.getPriority();
        int int20 = bookRequest15.getPriority();
        java.lang.String str21 = bookRequest15.getRequester();
        int int22 = bookRequest3.compareTo(bookRequest15);
        int int23 = bookRequest3.getPriority();
        java.lang.String str24 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass25 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (byte) 100);
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest12.compareTo(bookRequest19);
        java.lang.String str22 = bookRequest19.getRequester();
        java.lang.Class<?> wildcardClass23 = bookRequest19.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest13);
        int int17 = bookRequest3.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int22 = bookRequest3.compareTo(bookRequest21);
        int int23 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) '#');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) ' ');
        int int19 = bookRequest12.compareTo(bookRequest18);
        int int20 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str21 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass22 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str9 = bookRequest8.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 0);
        int int18 = bookRequest13.compareTo(bookRequest17);
        int int19 = bookRequest8.compareTo(bookRequest17);
        java.lang.String str20 = bookRequest17.getBookTitle();
        int int21 = bookRequest17.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str30 = bookRequest29.getRequester();
        java.lang.String str31 = bookRequest29.getBookTitle();
        int int32 = bookRequest25.compareTo(bookRequest29);
        java.lang.String str33 = bookRequest25.getRequester();
        java.lang.String str34 = bookRequest25.getBookTitle();
        int int35 = bookRequest17.compareTo(bookRequest25);
        int int36 = bookRequest17.getPriority();
        int int37 = bookRequest17.getPriority();
        int int38 = bookRequest3.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass39 = bookRequest17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getBookTitle();
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) '4');
        int int18 = bookRequest3.compareTo(bookRequest17);
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", 10);
        int int23 = bookRequest3.compareTo(bookRequest22);
        int int24 = bookRequest3.getPriority();
        java.lang.String str25 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        int int15 = bookRequest9.getPriority();
        java.lang.Class<?> wildcardClass16 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.String str15 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str9 = bookRequest8.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 0);
        int int18 = bookRequest13.compareTo(bookRequest17);
        int int19 = bookRequest8.compareTo(bookRequest17);
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getBookTitle();
        java.lang.String str22 = bookRequest17.getBookTitle();
        java.lang.String str23 = bookRequest17.getRequester();
        int int24 = bookRequest17.getPriority();
        java.lang.String str25 = bookRequest17.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        int int16 = bookRequest3.getPriority();
        java.lang.String str17 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookRequest3.compareTo(bookRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 32);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest7);
        int int15 = bookRequest7.getPriority();
        java.lang.String str16 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass17 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        int int21 = bookRequest16.compareTo(bookRequest20);
        int int22 = bookRequest11.compareTo(bookRequest20);
        int int23 = bookRequest11.getPriority();
        int int24 = bookRequest11.getPriority();
        java.lang.String str25 = bookRequest11.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest11);
        int int27 = bookRequest11.getPriority();
        java.lang.String str28 = bookRequest11.getBookTitle();
        java.lang.Class<?> wildcardClass29 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 0);
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest11.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        java.lang.String str19 = bookRequest18.getBookTitle();
        java.lang.String str20 = bookRequest18.getBookTitle();
        java.lang.String str21 = bookRequest18.getRequester();
        int int22 = bookRequest11.compareTo(bookRequest18);
        java.lang.String str23 = bookRequest11.getBookTitle();
        java.lang.String str24 = bookRequest11.getBookTitle();
        java.lang.String str25 = bookRequest11.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str27 = bookRequest11.getRequester();
        java.lang.Class<?> wildcardClass28 = bookRequest11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        int int14 = bookRequest3.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str19 = bookRequest18.getRequester();
        java.lang.String str20 = bookRequest18.getBookTitle();
        int int21 = bookRequest3.compareTo(bookRequest18);
        int int22 = bookRequest18.getPriority();
        java.lang.String str23 = bookRequest18.getBookTitle();
        java.lang.Class<?> wildcardClass24 = bookRequest18.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest8.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest8);
        int int15 = bookRequest3.getPriority();
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.String str17 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getBookTitle();
        java.lang.String str14 = bookRequest10.getBookTitle();
        int int15 = bookRequest10.getPriority();
        int int16 = bookRequest10.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int21 = bookRequest10.compareTo(bookRequest20);
        java.lang.String str22 = bookRequest10.getRequester();
        int int23 = bookRequest10.getPriority();
        java.lang.String str24 = bookRequest10.getBookTitle();
        int int25 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass26 = bookRequest10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) -1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getRequester();
        int int14 = bookRequest7.getPriority();
        java.lang.String str15 = bookRequest7.getBookTitle();
        java.lang.String str16 = bookRequest7.getBookTitle();
        int int17 = bookRequest7.getPriority();
        java.lang.String str18 = bookRequest7.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str28 = bookRequest27.getRequester();
        java.lang.String str29 = bookRequest27.getBookTitle();
        int int30 = bookRequest23.compareTo(bookRequest27);
        java.lang.String str31 = bookRequest23.getRequester();
        java.lang.String str32 = bookRequest23.getRequester();
        java.lang.String str33 = bookRequest23.getBookTitle();
        java.lang.String str34 = bookRequest23.getRequester();
        int int35 = bookRequest23.getPriority();
        int int36 = bookRequest23.getPriority();
        java.lang.String str37 = bookRequest23.getRequester();
        int int38 = bookRequest7.compareTo(bookRequest23);
        java.lang.String str39 = bookRequest23.getRequester();
        java.lang.Class<?> wildcardClass40 = bookRequest23.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str11 = bookRequest10.getRequester();
        java.lang.String str12 = bookRequest10.getBookTitle();
        int int13 = bookRequest10.getPriority();
        java.lang.String str14 = bookRequest10.getBookTitle();
        java.lang.String str15 = bookRequest10.getRequester();
        int int16 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str21 = bookRequest20.getBookTitle();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getBookTitle();
        int int25 = bookRequest3.compareTo(bookRequest20);
        java.lang.Class<?> wildcardClass26 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", 0);
        java.lang.String str11 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getBookTitle();
        int int20 = bookRequest10.compareTo(bookRequest15);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (byte) 10);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest10.compareTo(bookRequest24);
        int int27 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str28 = bookRequest10.getRequester();
        java.lang.String str29 = bookRequest10.getBookTitle();
        java.lang.Class<?> wildcardClass30 = bookRequest10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest9.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getRequester();
        java.lang.String str25 = bookRequest22.getBookTitle();
        int int26 = bookRequest18.compareTo(bookRequest22);
        int int27 = bookRequest9.compareTo(bookRequest22);
        java.lang.Class<?> wildcardClass28 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str13 = bookRequest12.getRequester();
        int int14 = bookRequest12.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        int int22 = bookRequest18.getPriority();
        int int23 = bookRequest18.getPriority();
        int int24 = bookRequest12.compareTo(bookRequest18);
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int29 = bookRequest18.compareTo(bookRequest28);
        int int30 = bookRequest3.compareTo(bookRequest18);
        java.lang.String str31 = bookRequest3.getBookTitle();
        java.lang.String str32 = bookRequest3.getRequester();
        java.lang.String str33 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass34 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) '#');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) ' ');
        int int19 = bookRequest12.compareTo(bookRequest18);
        java.lang.String str20 = bookRequest12.getBookTitle();
        java.lang.String str21 = bookRequest12.getRequester();
        int int22 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest10.getPriority();
        int int15 = bookRequest10.getPriority();
        java.lang.String str16 = bookRequest10.getRequester();
        int int17 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str20 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str13 = bookRequest12.getRequester();
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getRequester();
        int int17 = bookRequest12.getPriority();
        int int18 = bookRequest7.compareTo(bookRequest12);
        int int19 = bookRequest7.getPriority();
        java.lang.String str20 = bookRequest7.getRequester();
        java.lang.String str21 = bookRequest7.getRequester();
        java.lang.String str22 = bookRequest7.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest7);
        int int24 = bookRequest3.getPriority();
        int int25 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest3.compareTo(bookRequest14);
        java.lang.Class<?> wildcardClass17 = bookRequest14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str19 = bookRequest18.getRequester();
        java.lang.String str20 = bookRequest18.getBookTitle();
        int int21 = bookRequest14.compareTo(bookRequest18);
        java.lang.String str22 = bookRequest18.getBookTitle();
        int int23 = bookRequest3.compareTo(bookRequest18);
        java.lang.Class<?> wildcardClass24 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 52);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str13 = bookRequest12.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest3.getRequester();
        java.lang.String str16 = bookRequest3.getRequester();
        int int17 = bookRequest3.getPriority();
        java.lang.String str18 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 52);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookRequest3.compareTo(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", 52);
        int int17 = bookRequest12.compareTo(bookRequest16);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        int int24 = bookRequest21.getPriority();
        java.lang.String str25 = bookRequest21.getBookTitle();
        java.lang.String str26 = bookRequest21.getRequester();
        int int27 = bookRequest12.compareTo(bookRequest21);
        int int28 = bookRequest21.getPriority();
        int int29 = bookRequest3.compareTo(bookRequest21);
        int int30 = bookRequest21.getPriority();
        java.lang.String str31 = bookRequest21.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest15);
        java.lang.String str19 = bookRequest15.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getRequester();
        java.lang.String str17 = bookRequest14.getRequester();
        java.lang.String str18 = bookRequest14.getBookTitle();
        java.lang.String str19 = bookRequest14.getBookTitle();
        java.lang.String str20 = bookRequest14.getRequester();
        int int21 = bookRequest14.getPriority();
        java.lang.String str22 = bookRequest14.getBookTitle();
        int int23 = bookRequest7.compareTo(bookRequest14);
        java.lang.String str24 = bookRequest7.getBookTitle();
        java.lang.String str25 = bookRequest7.getRequester();
        request.BookRequest bookRequest26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = bookRequest7.compareTo(bookRequest26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) '4');
        int int15 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str12 = bookRequest11.getBookTitle();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str19 = bookRequest18.getRequester();
        java.lang.String str20 = bookRequest18.getBookTitle();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getBookTitle();
        java.lang.String str23 = bookRequest18.getRequester();
        java.lang.String str24 = bookRequest18.getBookTitle();
        java.lang.String str25 = bookRequest18.getRequester();
        java.lang.String str26 = bookRequest18.getBookTitle();
        java.lang.String str27 = bookRequest18.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest31.getPriority();
        int int36 = bookRequest31.getPriority();
        java.lang.String str37 = bookRequest31.getRequester();
        int int38 = bookRequest18.compareTo(bookRequest31);
        int int39 = bookRequest3.compareTo(bookRequest18);
        int int40 = bookRequest3.getPriority();
        int int41 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass42 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) '4');
        int int18 = bookRequest3.compareTo(bookRequest17);
        int int19 = bookRequest3.getPriority();
        java.lang.String str20 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bookRequest3.compareTo(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        int int12 = bookRequest3.getPriority();
        int int13 = bookRequest3.getPriority();
        int int14 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 0);
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getRequester();
        java.lang.String str14 = bookRequest11.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass16 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        int int15 = bookRequest7.getPriority();
        int int16 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str17 = bookRequest3.getBookTitle();
        java.lang.String str18 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest8);
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        int int15 = bookRequest11.getPriority();
        int int16 = bookRequest11.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", (int) ' ');
        int int21 = bookRequest11.compareTo(bookRequest20);
        int int22 = bookRequest20.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest10.getPriority();
        int int13 = bookRequest10.getPriority();
        java.lang.String str14 = bookRequest10.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str11 = bookRequest10.getRequester();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getBookTitle();
        java.lang.String str14 = bookRequest10.getRequester();
        int int15 = bookRequest10.getPriority();
        java.lang.String str16 = bookRequest10.getBookTitle();
        int int17 = bookRequest10.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str19 = bookRequest10.getBookTitle();
        java.lang.String str20 = bookRequest10.getRequester();
        java.lang.String str21 = bookRequest10.getRequester();
        java.lang.Class<?> wildcardClass22 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str12 = bookRequest11.getBookTitle();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str15 = bookRequest11.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", 0);
        java.lang.String str20 = bookRequest19.getBookTitle();
        int int21 = bookRequest11.compareTo(bookRequest19);
        int int22 = bookRequest11.getPriority();
        java.lang.Class<?> wildcardClass23 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", 97);
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getBookTitle();
        int int17 = bookRequest10.compareTo(bookRequest14);
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (short) 10);
        int int22 = bookRequest10.compareTo(bookRequest21);
        int int23 = bookRequest3.compareTo(bookRequest21);
        java.lang.Class<?> wildcardClass24 = bookRequest21.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) '#');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) ' ');
        int int19 = bookRequest12.compareTo(bookRequest18);
        int int20 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str21 = bookRequest3.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str26 = bookRequest25.getBookTitle();
        int int27 = bookRequest3.compareTo(bookRequest25);
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) -1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) '4');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getBookTitle();
        java.lang.String str12 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int17 = bookRequest9.compareTo(bookRequest16);
        int int18 = bookRequest9.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str20 = bookRequest9.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", 1);
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest8.compareTo(bookRequest14);
        int int17 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str18 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bookRequest3.compareTo(bookRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        int int13 = bookRequest9.getPriority();
        int int14 = bookRequest9.getPriority();
        int int15 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int20 = bookRequest9.compareTo(bookRequest19);
        java.lang.Class<?> wildcardClass21 = bookRequest19.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass12 = bookRequest10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str9 = bookRequest8.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 0);
        int int18 = bookRequest13.compareTo(bookRequest17);
        int int19 = bookRequest8.compareTo(bookRequest17);
        java.lang.String str20 = bookRequest17.getBookTitle();
        int int21 = bookRequest17.getPriority();
        int int22 = bookRequest17.getPriority();
        java.lang.String str23 = bookRequest17.getRequester();
        int int24 = bookRequest3.compareTo(bookRequest17);
        java.lang.String str25 = bookRequest17.getBookTitle();
        java.lang.String str26 = bookRequest17.getRequester();
        java.lang.String str27 = bookRequest17.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) ' ');
        int int8 = bookRequest7.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str13 = bookRequest12.getRequester();
        int int14 = bookRequest12.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        java.lang.String str19 = bookRequest18.getBookTitle();
        int int20 = bookRequest12.compareTo(bookRequest18);
        int int21 = bookRequest7.compareTo(bookRequest18);
        java.lang.String str22 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        int int29 = bookRequest7.compareTo(bookRequest26);
        int int30 = bookRequest3.compareTo(bookRequest7);
        int int31 = bookRequest7.getPriority();
        java.lang.String str32 = bookRequest7.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str15 = bookRequest13.getRequester();
        java.lang.String str16 = bookRequest13.getRequester();
        java.lang.String str17 = bookRequest13.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) '4');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest13.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.Class<?> wildcardClass25 = bookRequest21.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int13 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", (int) '4');
        int int18 = bookRequest17.getPriority();
        java.lang.String str19 = bookRequest17.getBookTitle();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest3.compareTo(bookRequest17);
        int int23 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass24 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        int int13 = bookRequest9.getPriority();
        int int14 = bookRequest9.getPriority();
        int int15 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int20 = bookRequest9.compareTo(bookRequest19);
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getRequester();
        java.lang.String str23 = bookRequest19.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass12 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getBookTitle();
        java.lang.String str18 = bookRequest12.getRequester();
        java.lang.String str19 = bookRequest12.getBookTitle();
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str15 = bookRequest3.getRequester();
        java.lang.String str16 = bookRequest3.getRequester();
        int int17 = bookRequest3.getPriority();
        java.lang.String str18 = bookRequest3.getRequester();
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        int int16 = bookRequest3.getPriority();
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.String str19 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (byte) 10);
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest17);
        int int20 = bookRequest17.getPriority();
        java.lang.String str21 = bookRequest17.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        int int19 = bookRequest12.compareTo(bookRequest18);
        int int20 = bookRequest18.getPriority();
        int int21 = bookRequest18.getPriority();
        int int22 = bookRequest18.getPriority();
        int int23 = bookRequest18.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "hi!", 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 0);
        int int27 = bookRequest22.compareTo(bookRequest26);
        int int28 = bookRequest17.compareTo(bookRequest26);
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getBookTitle();
        int int31 = bookRequest26.getPriority();
        java.lang.String str32 = bookRequest26.getRequester();
        int int33 = bookRequest3.compareTo(bookRequest26);
        java.lang.String str34 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        int int20 = bookRequest16.getPriority();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str24 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (byte) 10);
        int int13 = bookRequest12.getPriority();
        int int14 = bookRequest12.getPriority();
        int int15 = bookRequest12.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        int int26 = bookRequest19.compareTo(bookRequest23);
        int int27 = bookRequest12.compareTo(bookRequest23);
        int int28 = bookRequest3.compareTo(bookRequest23);
        java.lang.String str29 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        int int13 = bookRequest9.getPriority();
        int int14 = bookRequest9.getPriority();
        int int15 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int20 = bookRequest9.compareTo(bookRequest19);
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        java.lang.Class<?> wildcardClass23 = bookRequest19.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getBookTitle();
        java.lang.String str13 = bookRequest8.getRequester();
        java.lang.String str14 = bookRequest8.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest8);
        int int16 = bookRequest8.getPriority();
        java.lang.Class<?> wildcardClass17 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", 52);
        int int13 = bookRequest3.compareTo(bookRequest12);
        int int14 = bookRequest12.getPriority();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getRequester();
        java.lang.String str17 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass18 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str13 = bookRequest12.getRequester();
        int int14 = bookRequest12.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        int int22 = bookRequest18.getPriority();
        int int23 = bookRequest18.getPriority();
        int int24 = bookRequest12.compareTo(bookRequest18);
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int29 = bookRequest18.compareTo(bookRequest28);
        int int30 = bookRequest3.compareTo(bookRequest18);
        int int31 = bookRequest3.getPriority();
        java.lang.String str32 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest9.compareTo(bookRequest13);
        java.lang.String str17 = bookRequest9.getRequester();
        java.lang.String str18 = bookRequest9.getRequester();
        java.lang.String str19 = bookRequest9.getBookTitle();
        int int20 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str21 = bookRequest9.getRequester();
        java.lang.Class<?> wildcardClass22 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getRequester();
        java.lang.String str16 = bookRequest13.getRequester();
        java.lang.String str17 = bookRequest13.getRequester();
        int int18 = bookRequest9.compareTo(bookRequest13);
        int int19 = bookRequest9.getPriority();
        int int20 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str21 = bookRequest9.getRequester();
        java.lang.String str22 = bookRequest9.getBookTitle();
        java.lang.Class<?> wildcardClass23 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        int int19 = bookRequest12.compareTo(bookRequest18);
        int int20 = bookRequest18.getPriority();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getBookTitle();
        java.lang.String str23 = bookRequest18.getBookTitle();
        java.lang.String str24 = bookRequest18.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) '#');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) ' ');
        int int16 = bookRequest9.compareTo(bookRequest15);
        java.lang.String str17 = bookRequest9.getRequester();
        int int18 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str19 = bookRequest9.getRequester();
        java.lang.String str20 = bookRequest9.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest14.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", 52);
        int int21 = bookRequest14.compareTo(bookRequest20);
        java.lang.String str22 = bookRequest20.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest20);
        java.lang.Class<?> wildcardClass24 = bookRequest20.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", 1);
        java.lang.String str11 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str16 = bookRequest15.getRequester();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getRequester();
        int int20 = bookRequest15.getPriority();
        int int21 = bookRequest10.compareTo(bookRequest15);
        java.lang.String str22 = bookRequest15.getBookTitle();
        java.lang.String str23 = bookRequest15.getRequester();
        int int24 = bookRequest3.compareTo(bookRequest15);
        java.lang.Class<?> wildcardClass25 = bookRequest15.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getBookTitle();
        int int23 = bookRequest16.compareTo(bookRequest20);
        java.lang.String str24 = bookRequest16.getRequester();
        java.lang.String str25 = bookRequest16.getBookTitle();
        java.lang.String str26 = bookRequest16.getRequester();
        int int27 = bookRequest7.compareTo(bookRequest16);
        int int28 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass29 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getRequester();
        java.lang.String str12 = bookRequest8.getBookTitle();
        java.lang.String str13 = bookRequest8.getBookTitle();
        java.lang.String str14 = bookRequest8.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest8);
        int int16 = bookRequest3.getPriority();
        java.lang.String str17 = bookRequest3.getRequester();
        int int18 = bookRequest3.getPriority();
        int int19 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (-1));
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str16 = bookRequest15.getBookTitle();
        int int17 = bookRequest15.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "hi!", 52);
        int int22 = bookRequest15.compareTo(bookRequest21);
        int int23 = bookRequest7.compareTo(bookRequest15);
        java.lang.String str24 = bookRequest15.getRequester();
        java.lang.Class<?> wildcardClass25 = bookRequest15.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        int int20 = bookRequest9.compareTo(bookRequest17);
        int int21 = bookRequest17.getPriority();
        int int22 = bookRequest17.getPriority();
        int int23 = bookRequest17.getPriority();
        java.lang.String str24 = bookRequest17.getRequester();
        int int25 = bookRequest3.compareTo(bookRequest17);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest29.getPriority();
        int int32 = bookRequest29.getPriority();
        int int33 = bookRequest17.compareTo(bookRequest29);
        java.lang.Class<?> wildcardClass34 = bookRequest29.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str12 = bookRequest11.getBookTitle();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest11);
        int int15 = bookRequest3.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str20 = bookRequest19.getRequester();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "hi!", 100);
        int int27 = bookRequest19.compareTo(bookRequest26);
        java.lang.String str28 = bookRequest19.getRequester();
        java.lang.String str29 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str34 = bookRequest33.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest42 = new request.BookRequest("", "", (int) (short) 0);
        int int43 = bookRequest38.compareTo(bookRequest42);
        int int44 = bookRequest33.compareTo(bookRequest42);
        java.lang.String str45 = bookRequest42.getBookTitle();
        java.lang.String str46 = bookRequest42.getBookTitle();
        int int47 = bookRequest42.getPriority();
        java.lang.String str48 = bookRequest42.getRequester();
        int int49 = bookRequest19.compareTo(bookRequest42);
        int int50 = bookRequest3.compareTo(bookRequest19);
        java.lang.String str51 = bookRequest19.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        int int9 = bookRequest3.compareTo(bookRequest8);
        int int10 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", 1);
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getBookTitle();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bookRequest3.compareTo(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest3.getPriority();
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        int int14 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        int int15 = bookRequest11.getPriority();
        java.lang.Class<?> wildcardClass16 = bookRequest11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        int int21 = bookRequest16.compareTo(bookRequest20);
        int int22 = bookRequest11.compareTo(bookRequest20);
        int int23 = bookRequest11.getPriority();
        int int24 = bookRequest11.getPriority();
        java.lang.String str25 = bookRequest11.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str27 = bookRequest11.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str15 = bookRequest3.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int20 = bookRequest3.compareTo(bookRequest19);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 32);
        int int25 = bookRequest3.compareTo(bookRequest24);
        java.lang.String str26 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass27 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int13 = bookRequest3.compareTo(bookRequest12);
        int int14 = bookRequest12.getPriority();
        java.lang.Class<?> wildcardClass15 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) '#');
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookRequest3.compareTo(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest11.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        int int12 = bookRequest7.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest16.compareTo(bookRequest20);
        int int23 = bookRequest16.getPriority();
        int int24 = bookRequest7.compareTo(bookRequest16);
        java.lang.Class<?> wildcardClass25 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "hi!", 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        int int14 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        int int15 = bookRequest7.getPriority();
        int int16 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str25 = bookRequest24.getBookTitle();
        java.lang.String str26 = bookRequest24.getRequester();
        int int27 = bookRequest24.getPriority();
        int int28 = bookRequest20.compareTo(bookRequest24);
        int int29 = bookRequest3.compareTo(bookRequest24);
        int int30 = bookRequest3.getPriority();
        java.lang.String str31 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass32 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bookRequest3.compareTo(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", 1);
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest8.compareTo(bookRequest14);
        int int17 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str18 = bookRequest3.getRequester();
        java.lang.String str19 = bookRequest3.getBookTitle();
        int int20 = bookRequest3.getPriority();
        java.lang.String str21 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        int int15 = bookRequest7.getPriority();
        int int16 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str25 = bookRequest24.getBookTitle();
        java.lang.String str26 = bookRequest24.getRequester();
        int int27 = bookRequest24.getPriority();
        int int28 = bookRequest20.compareTo(bookRequest24);
        int int29 = bookRequest3.compareTo(bookRequest24);
        int int30 = bookRequest3.getPriority();
        int int31 = bookRequest3.getPriority();
        java.lang.String str32 = bookRequest3.getBookTitle();
        java.lang.String str33 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass34 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.String str15 = bookRequest3.getRequester();
        int int16 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookRequest7.compareTo(bookRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        int int4 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 32);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest13.getPriority();
        java.lang.String str17 = bookRequest13.getRequester();
        int int18 = bookRequest7.compareTo(bookRequest13);
        java.lang.String str19 = bookRequest7.getRequester();
        java.lang.String str20 = bookRequest7.getRequester();
        java.lang.String str21 = bookRequest7.getBookTitle();
        int int22 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) (short) -1);
        java.lang.String str27 = bookRequest26.getRequester();
        int int28 = bookRequest7.compareTo(bookRequest26);
        request.BookRequest bookRequest29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = bookRequest26.compareTo(bookRequest29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest16 = new request.BookRequest("", "", 1);
        int int17 = bookRequest8.compareTo(bookRequest16);
        java.lang.Class<?> wildcardClass18 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (byte) -1);
        java.lang.String str12 = bookRequest11.getRequester();
        java.lang.String str13 = bookRequest11.getBookTitle();
        java.lang.String str14 = bookRequest11.getBookTitle();
        int int15 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str16 = bookRequest11.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 32);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str14 = bookRequest13.getRequester();
        int int15 = bookRequest13.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", 1);
        java.lang.String str20 = bookRequest19.getBookTitle();
        int int21 = bookRequest13.compareTo(bookRequest19);
        int int22 = bookRequest9.compareTo(bookRequest19);
        int int23 = bookRequest19.getPriority();
        int int24 = bookRequest3.compareTo(bookRequest19);
        request.BookRequest bookRequest25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = bookRequest3.compareTo(bookRequest25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getRequester();
        java.lang.String str17 = bookRequest14.getRequester();
        java.lang.String str18 = bookRequest14.getBookTitle();
        java.lang.String str19 = bookRequest14.getBookTitle();
        java.lang.String str20 = bookRequest14.getRequester();
        int int21 = bookRequest14.getPriority();
        java.lang.String str22 = bookRequest14.getBookTitle();
        int int23 = bookRequest7.compareTo(bookRequest14);
        java.lang.Class<?> wildcardClass24 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str14 = bookRequest13.getBookTitle();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest13.getPriority();
        int int17 = bookRequest9.compareTo(bookRequest13);
        int int18 = bookRequest9.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str20 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getRequester();
        java.lang.String str17 = bookRequest12.getBookTitle();
        int int18 = bookRequest12.getPriority();
        int int19 = bookRequest7.compareTo(bookRequest12);
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int17 = bookRequest12.compareTo(bookRequest16);
        java.lang.String str18 = bookRequest12.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str20 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (-1));
        java.lang.String str25 = bookRequest24.getBookTitle();
        java.lang.String str26 = bookRequest24.getRequester();
        int int27 = bookRequest12.compareTo(bookRequest24);
        java.lang.Class<?> wildcardClass28 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.String str18 = bookRequest3.getRequester();
        int int19 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        java.lang.String str18 = bookRequest15.getRequester();
        int int19 = bookRequest15.getPriority();
        int int20 = bookRequest15.getPriority();
        java.lang.String str21 = bookRequest15.getRequester();
        int int22 = bookRequest3.compareTo(bookRequest15);
        int int23 = bookRequest15.getPriority();
        java.lang.String str24 = bookRequest15.getRequester();
        java.lang.String str25 = bookRequest15.getRequester();
        int int26 = bookRequest15.getPriority();
        java.lang.Class<?> wildcardClass27 = bookRequest15.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bookRequest7.compareTo(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 0);
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest11.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        java.lang.String str19 = bookRequest18.getBookTitle();
        java.lang.String str20 = bookRequest18.getBookTitle();
        java.lang.String str21 = bookRequest18.getRequester();
        int int22 = bookRequest11.compareTo(bookRequest18);
        java.lang.String str23 = bookRequest11.getBookTitle();
        java.lang.String str24 = bookRequest11.getBookTitle();
        java.lang.String str25 = bookRequest11.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass27 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        java.lang.String str18 = bookRequest15.getRequester();
        int int19 = bookRequest15.getPriority();
        int int20 = bookRequest15.getPriority();
        java.lang.String str21 = bookRequest15.getRequester();
        int int22 = bookRequest3.compareTo(bookRequest15);
        int int23 = bookRequest15.getPriority();
        java.lang.String str24 = bookRequest15.getRequester();
        java.lang.String str25 = bookRequest15.getRequester();
        int int26 = bookRequest15.getPriority();
        int int27 = bookRequest15.getPriority();
        java.lang.String str28 = bookRequest15.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int16 = bookRequest8.compareTo(bookRequest15);
        int int17 = bookRequest15.getPriority();
        int int18 = bookRequest15.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest15);
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str24 = bookRequest23.getBookTitle();
        java.lang.String str25 = bookRequest23.getRequester();
        java.lang.String str26 = bookRequest23.getRequester();
        java.lang.String str27 = bookRequest23.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str32 = bookRequest31.getBookTitle();
        java.lang.String str33 = bookRequest31.getBookTitle();
        int int34 = bookRequest23.compareTo(bookRequest31);
        int int35 = bookRequest15.compareTo(bookRequest23);
        java.lang.Class<?> wildcardClass36 = bookRequest23.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 100);
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass13 = bookRequest11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest7.getPriority();
        int int12 = bookRequest7.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", 52);
        int int17 = bookRequest7.compareTo(bookRequest16);
        int int18 = bookRequest16.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str20 = bookRequest16.getRequester();
        java.lang.String str21 = bookRequest16.getBookTitle();
        java.lang.Class<?> wildcardClass22 = bookRequest16.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (byte) 10);
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest15);
        java.lang.String str19 = bookRequest15.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        int int21 = bookRequest16.compareTo(bookRequest20);
        int int22 = bookRequest11.compareTo(bookRequest20);
        int int23 = bookRequest11.getPriority();
        int int24 = bookRequest11.getPriority();
        java.lang.String str25 = bookRequest11.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) '#');
        int int31 = bookRequest30.getPriority();
        java.lang.String str32 = bookRequest30.getRequester();
        java.lang.String str33 = bookRequest30.getBookTitle();
        int int34 = bookRequest30.getPriority();
        int int35 = bookRequest11.compareTo(bookRequest30);
        java.lang.String str36 = bookRequest30.getRequester();
        java.lang.String str37 = bookRequest30.getRequester();
        java.lang.Class<?> wildcardClass38 = bookRequest30.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        int int19 = bookRequest12.compareTo(bookRequest18);
        int int20 = bookRequest18.getPriority();
        int int21 = bookRequest18.getPriority();
        java.lang.Class<?> wildcardClass22 = bookRequest18.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str9 = bookRequest8.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 0);
        int int18 = bookRequest13.compareTo(bookRequest17);
        int int19 = bookRequest8.compareTo(bookRequest17);
        java.lang.String str20 = bookRequest17.getBookTitle();
        int int21 = bookRequest17.getPriority();
        int int22 = bookRequest17.getPriority();
        java.lang.String str23 = bookRequest17.getRequester();
        int int24 = bookRequest3.compareTo(bookRequest17);
        java.lang.String str25 = bookRequest17.getRequester();
        java.lang.String str26 = bookRequest17.getRequester();
        java.lang.Class<?> wildcardClass27 = bookRequest17.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) '4');
        int int18 = bookRequest3.compareTo(bookRequest17);
        int int19 = bookRequest3.getPriority();
        java.lang.String str20 = bookRequest3.getRequester();
        java.lang.String str21 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest8.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str15 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", 52);
        int int20 = bookRequest3.compareTo(bookRequest19);
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        java.lang.String str15 = bookRequest7.getRequester();
        java.lang.String str16 = bookRequest7.getBookTitle();
        int int17 = bookRequest7.getPriority();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 10);
        int int15 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str16 = bookRequest14.getBookTitle();
        java.lang.String str17 = bookRequest14.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str12 = bookRequest11.getBookTitle();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str15 = bookRequest11.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str20 = bookRequest19.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (short) 0);
        int int29 = bookRequest24.compareTo(bookRequest28);
        int int30 = bookRequest19.compareTo(bookRequest28);
        java.lang.String str31 = bookRequest28.getBookTitle();
        int int32 = bookRequest28.getPriority();
        int int33 = bookRequest28.getPriority();
        int int34 = bookRequest28.getPriority();
        int int35 = bookRequest28.getPriority();
        java.lang.String str36 = bookRequest28.getRequester();
        int int37 = bookRequest11.compareTo(bookRequest28);
        java.lang.Class<?> wildcardClass38 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (-1));
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str10 = bookRequest9.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getRequester();
        int int17 = bookRequest14.getPriority();
        java.lang.String str18 = bookRequest14.getRequester();
        int int19 = bookRequest9.compareTo(bookRequest14);
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str28 = bookRequest27.getRequester();
        java.lang.String str29 = bookRequest27.getBookTitle();
        int int30 = bookRequest23.compareTo(bookRequest27);
        java.lang.String str31 = bookRequest23.getRequester();
        java.lang.String str32 = bookRequest23.getRequester();
        int int33 = bookRequest23.getPriority();
        int int34 = bookRequest9.compareTo(bookRequest23);
        java.lang.String str35 = bookRequest9.getBookTitle();
        int int36 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int13 = bookRequest12.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (byte) 10);
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest12.compareTo(bookRequest17);
        int int20 = bookRequest12.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass22 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest8.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str14 = bookRequest13.getBookTitle();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest13.getPriority();
        int int17 = bookRequest3.compareTo(bookRequest13);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str22 = bookRequest21.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str27 = bookRequest26.getRequester();
        java.lang.String str28 = bookRequest26.getBookTitle();
        int int29 = bookRequest26.getPriority();
        int int30 = bookRequest21.compareTo(bookRequest26);
        java.lang.String str31 = bookRequest21.getRequester();
        java.lang.String str32 = bookRequest21.getRequester();
        java.lang.String str33 = bookRequest21.getBookTitle();
        int int34 = bookRequest21.getPriority();
        int int35 = bookRequest3.compareTo(bookRequest21);
        int int36 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str16 = bookRequest15.getBookTitle();
        java.lang.String str17 = bookRequest15.getRequester();
        java.lang.String str18 = bookRequest15.getRequester();
        java.lang.String str19 = bookRequest15.getRequester();
        java.lang.String str20 = bookRequest15.getRequester();
        int int21 = bookRequest15.getPriority();
        java.lang.String str22 = bookRequest15.getRequester();
        int int23 = bookRequest7.compareTo(bookRequest15);
        java.lang.Class<?> wildcardClass24 = bookRequest15.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest9.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getRequester();
        java.lang.String str25 = bookRequest22.getBookTitle();
        int int26 = bookRequest18.compareTo(bookRequest22);
        int int27 = bookRequest9.compareTo(bookRequest22);
        java.lang.String str28 = bookRequest22.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str15 = bookRequest3.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int20 = bookRequest3.compareTo(bookRequest19);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 32);
        int int25 = bookRequest3.compareTo(bookRequest24);
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass10 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        int int19 = bookRequest15.getPriority();
        int int20 = bookRequest15.getPriority();
        java.lang.String str21 = bookRequest15.getRequester();
        java.lang.String str22 = bookRequest15.getRequester();
        java.lang.String str23 = bookRequest15.getRequester();
        java.lang.String str24 = bookRequest15.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int29 = bookRequest15.compareTo(bookRequest28);
        int int30 = bookRequest7.compareTo(bookRequest28);
        java.lang.String str31 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass32 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        int int13 = bookRequest9.getPriority();
        int int14 = bookRequest9.getPriority();
        int int15 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int20 = bookRequest9.compareTo(bookRequest19);
        java.lang.String str21 = bookRequest19.getBookTitle();
        java.lang.String str22 = bookRequest19.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", (int) (byte) 0);
        java.lang.String str27 = bookRequest26.getBookTitle();
        int int28 = bookRequest26.getPriority();
        int int29 = bookRequest19.compareTo(bookRequest26);
        int int30 = bookRequest26.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str16 = bookRequest15.getBookTitle();
        java.lang.String str17 = bookRequest15.getRequester();
        java.lang.String str18 = bookRequest15.getRequester();
        java.lang.String str19 = bookRequest15.getRequester();
        java.lang.String str20 = bookRequest15.getRequester();
        int int21 = bookRequest15.getPriority();
        java.lang.String str22 = bookRequest15.getRequester();
        int int23 = bookRequest7.compareTo(bookRequest15);
        int int24 = bookRequest7.getPriority();
        java.lang.String str25 = bookRequest7.getBookTitle();
        java.lang.String str26 = bookRequest7.getRequester();
        request.BookRequest bookRequest27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = bookRequest7.compareTo(bookRequest27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest8.getRequester();
        java.lang.String str14 = bookRequest8.getBookTitle();
        int int15 = bookRequest8.getPriority();
        java.lang.String str16 = bookRequest8.getRequester();
        java.lang.Class<?> wildcardClass17 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) '#');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) ' ');
        int int15 = bookRequest8.compareTo(bookRequest14);
        java.lang.String str16 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 1);
        java.lang.String str25 = bookRequest24.getBookTitle();
        java.lang.String str26 = bookRequest24.getBookTitle();
        java.lang.String str27 = bookRequest24.getRequester();
        int int28 = bookRequest20.compareTo(bookRequest24);
        int int29 = bookRequest24.getPriority();
        int int30 = bookRequest8.compareTo(bookRequest24);
        int int31 = bookRequest24.getPriority();
        int int32 = bookRequest3.compareTo(bookRequest24);
        java.lang.Class<?> wildcardClass33 = bookRequest24.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) '4');
        int int18 = bookRequest3.compareTo(bookRequest17);
        int int19 = bookRequest3.getPriority();
        java.lang.String str20 = bookRequest3.getRequester();
        request.BookRequest bookRequest21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bookRequest3.compareTo(bookRequest21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest13.getPriority();
        java.lang.String str17 = bookRequest13.getBookTitle();
        java.lang.String str18 = bookRequest13.getRequester();
        request.BookRequest bookRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bookRequest13.compareTo(bookRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookRequest3.compareTo(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getRequester();
        int int23 = bookRequest18.getPriority();
        int int24 = bookRequest13.compareTo(bookRequest18);
        int int25 = bookRequest3.compareTo(bookRequest13);
        java.lang.Class<?> wildcardClass26 = bookRequest13.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str12 = bookRequest11.getBookTitle();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest11);
        int int15 = bookRequest3.getPriority();
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.String str17 = bookRequest3.getBookTitle();
        int int18 = bookRequest3.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getRequester();
        java.lang.String str31 = bookRequest26.getBookTitle();
        int int32 = bookRequest26.getPriority();
        java.lang.String str33 = bookRequest26.getBookTitle();
        int int34 = bookRequest22.compareTo(bookRequest26);
        java.lang.String str35 = bookRequest22.getBookTitle();
        java.lang.String str36 = bookRequest22.getRequester();
        int int37 = bookRequest3.compareTo(bookRequest22);
        java.lang.Class<?> wildcardClass38 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        java.lang.String str19 = bookRequest16.getRequester();
        java.lang.String str20 = bookRequest16.getBookTitle();
        int int21 = bookRequest16.getPriority();
        int int22 = bookRequest7.compareTo(bookRequest16);
        java.lang.String str23 = bookRequest7.getRequester();
        java.lang.String str24 = bookRequest7.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 100);
        java.lang.String str9 = bookRequest8.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest8);
        java.lang.Class<?> wildcardClass11 = bookRequest8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        java.lang.Class<?> wildcardClass17 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getBookTitle();
        java.lang.String str13 = bookRequest8.getRequester();
        java.lang.String str14 = bookRequest8.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (byte) 100);
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest12.compareTo(bookRequest19);
        java.lang.String str22 = bookRequest19.getRequester();
        java.lang.String str23 = bookRequest19.getBookTitle();
        java.lang.Class<?> wildcardClass24 = bookRequest19.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", 0);
        java.lang.String str11 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getBookTitle();
        int int20 = bookRequest10.compareTo(bookRequest15);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (byte) 10);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest10.compareTo(bookRequest24);
        int int27 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str28 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "hi!", 32);
        int int33 = bookRequest32.getPriority();
        java.lang.String str34 = bookRequest32.getBookTitle();
        int int35 = bookRequest10.compareTo(bookRequest32);
        java.lang.String str36 = bookRequest10.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        int int15 = bookRequest11.getPriority();
        int int16 = bookRequest11.getPriority();
        java.lang.String str17 = bookRequest11.getRequester();
        int int18 = bookRequest11.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.String str17 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getRequester();
        int int15 = bookRequest3.getPriority();
        int int16 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", 0);
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getRequester();
        java.lang.String str13 = bookRequest9.getBookTitle();
        java.lang.String str14 = bookRequest9.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest9);
        int int16 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) '4');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getBookTitle();
        java.lang.String str12 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int17 = bookRequest9.compareTo(bookRequest16);
        int int18 = bookRequest9.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) ' ');
        int int16 = bookRequest15.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest20.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", 1);
        java.lang.String str27 = bookRequest26.getBookTitle();
        int int28 = bookRequest20.compareTo(bookRequest26);
        int int29 = bookRequest15.compareTo(bookRequest26);
        int int30 = bookRequest10.compareTo(bookRequest26);
        java.lang.String str31 = bookRequest10.getRequester();
        int int32 = bookRequest10.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getRequester();
        java.lang.String str15 = bookRequest7.getBookTitle();
        java.lang.String str16 = bookRequest7.getRequester();
        int int17 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass18 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest8.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str15 = bookRequest8.getBookTitle();
        int int16 = bookRequest8.getPriority();
        java.lang.Class<?> wildcardClass17 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest9.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getRequester();
        java.lang.String str25 = bookRequest22.getBookTitle();
        int int26 = bookRequest18.compareTo(bookRequest22);
        int int27 = bookRequest9.compareTo(bookRequest22);
        java.lang.Class<?> wildcardClass28 = bookRequest22.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", (int) (byte) 1);
        int int17 = bookRequest7.compareTo(bookRequest16);
        java.lang.Class<?> wildcardClass18 = bookRequest16.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) '#');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) ' ');
        int int15 = bookRequest8.compareTo(bookRequest14);
        java.lang.String str16 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 1);
        java.lang.String str25 = bookRequest24.getBookTitle();
        java.lang.String str26 = bookRequest24.getBookTitle();
        java.lang.String str27 = bookRequest24.getRequester();
        int int28 = bookRequest20.compareTo(bookRequest24);
        int int29 = bookRequest24.getPriority();
        int int30 = bookRequest8.compareTo(bookRequest24);
        int int31 = bookRequest24.getPriority();
        int int32 = bookRequest3.compareTo(bookRequest24);
        int int33 = bookRequest3.getPriority();
        java.lang.String str34 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass35 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str16 = bookRequest15.getBookTitle();
        java.lang.String str17 = bookRequest15.getBookTitle();
        int int18 = bookRequest3.compareTo(bookRequest15);
        java.lang.Class<?> wildcardClass19 = bookRequest15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        int int13 = bookRequest9.getPriority();
        int int14 = bookRequest9.getPriority();
        int int15 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int20 = bookRequest9.compareTo(bookRequest19);
        request.BookRequest bookRequest21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bookRequest9.compareTo(bookRequest21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }
}

