package BookRequestAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        java.lang.String str21 = bookRequest14.getRequester();
        int int22 = bookRequest14.getPriority();
        java.lang.String str23 = bookRequest14.getBookTitle();
        java.lang.String str24 = bookRequest14.getRequester();
        java.lang.Class<?> wildcardClass25 = bookRequest14.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.lang.String str20 = bookRequest3.getBookTitle();
        int int21 = bookRequest3.getPriority();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        java.lang.Class<?> wildcardClass17 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 0);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) '#');
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) ' ');
        int int18 = bookRequest11.compareTo(bookRequest17);
        java.lang.String str19 = bookRequest11.getBookTitle();
        java.lang.String str20 = bookRequest11.getBookTitle();
        java.lang.String str21 = bookRequest11.getBookTitle();
        java.lang.String str22 = bookRequest11.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass24 = bookRequest11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getRequester();
        int int17 = bookRequest7.compareTo(bookRequest12);
        java.lang.String str18 = bookRequest12.getRequester();
        int int19 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str20 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.String str15 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        request.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bookRequest3.compareTo(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 10);
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        int int18 = bookRequest12.getPriority();
        java.lang.String str19 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bookRequest12.compareTo(bookRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        int int38 = bookRequest22.getPriority();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        java.lang.Class<?> wildcardClass28 = bookRequest15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        java.lang.String str16 = bookRequest12.getBookTitle();
        int int17 = bookRequest12.getPriority();
        java.lang.String str18 = bookRequest12.getBookTitle();
        int int19 = bookRequest12.getPriority();
        java.lang.String str20 = bookRequest12.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", 52);
        int int15 = bookRequest10.compareTo(bookRequest14);
        int int16 = bookRequest10.getPriority();
        int int17 = bookRequest3.compareTo(bookRequest10);
        int int18 = bookRequest10.getPriority();
        java.lang.String str19 = bookRequest10.getBookTitle();
        java.lang.String str20 = bookRequest10.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        java.lang.String str12 = bookRequest10.getRequester();
        int int13 = bookRequest10.getPriority();
        java.lang.String str14 = bookRequest10.getRequester();
        java.lang.String str15 = bookRequest10.getBookTitle();
        int int16 = bookRequest10.getPriority();
        java.lang.String str17 = bookRequest10.getRequester();
        java.lang.String str18 = bookRequest10.getBookTitle();
        java.lang.String str19 = bookRequest10.getBookTitle();
        int int20 = bookRequest10.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass22 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '4');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getBookTitle();
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        int int17 = bookRequest12.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str19 = bookRequest12.getRequester();
        java.lang.Class<?> wildcardClass20 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str18 = bookRequest17.getBookTitle();
        java.lang.String str19 = bookRequest17.getRequester();
        int int20 = bookRequest17.getPriority();
        int int21 = bookRequest13.compareTo(bookRequest17);
        int int22 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str23 = bookRequest3.getBookTitle();
        int int24 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass25 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        int int12 = bookRequest7.getPriority();
        int int13 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bookRequest3.compareTo(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        request.BookRequest bookRequest32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = bookRequest3.compareTo(bookRequest32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest26 = new request.BookRequest("", "", 1);
        java.lang.String str27 = bookRequest26.getBookTitle();
        java.lang.String str28 = bookRequest26.getBookTitle();
        java.lang.String str29 = bookRequest26.getRequester();
        int int30 = bookRequest22.compareTo(bookRequest26);
        int int31 = bookRequest26.getPriority();
        java.lang.String str32 = bookRequest26.getBookTitle();
        int int33 = bookRequest3.compareTo(bookRequest26);
        java.lang.String str34 = bookRequest3.getRequester();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getRequester();
        int int12 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        int int16 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookRequest3.compareTo(bookRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str18 = bookRequest17.getBookTitle();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getRequester();
        int int21 = bookRequest7.compareTo(bookRequest17);
        java.lang.String str22 = bookRequest17.getRequester();
        java.lang.Class<?> wildcardClass23 = bookRequest17.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        int int14 = bookRequest3.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", 0);
        java.lang.String str19 = bookRequest18.getBookTitle();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getRequester();
        java.lang.String str23 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", 100);
        int int28 = bookRequest18.compareTo(bookRequest27);
        int int29 = bookRequest3.compareTo(bookRequest27);
        int int30 = bookRequest27.getPriority();
        java.lang.String str31 = bookRequest27.getRequester();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", 52);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.lang.String str22 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        java.lang.String str25 = bookRequest7.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (byte) 100);
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getBookTitle();
        int int32 = bookRequest7.compareTo(bookRequest29);
        java.lang.String str33 = bookRequest29.getBookTitle();
        java.lang.String str34 = bookRequest29.getBookTitle();
        java.lang.Class<?> wildcardClass35 = bookRequest29.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", (int) '4');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getBookTitle();
        java.lang.String str16 = bookRequest13.getRequester();
        int int17 = bookRequest13.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest13);
        int int19 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest12);
        int int16 = bookRequest12.getPriority();
        int int17 = bookRequest12.getPriority();
        java.lang.String str18 = bookRequest12.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 97);
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) ' ');
        int int17 = bookRequest11.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        int int19 = bookRequest3.compareTo(bookRequest16);
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (-1));
        java.lang.String str24 = bookRequest23.getBookTitle();
        int int25 = bookRequest16.compareTo(bookRequest23);
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str30 = bookRequest29.getBookTitle();
        java.lang.String str31 = bookRequest29.getRequester();
        int int32 = bookRequest29.getPriority();
        java.lang.String str33 = bookRequest29.getRequester();
        java.lang.String str34 = bookRequest29.getRequester();
        java.lang.String str35 = bookRequest29.getRequester();
        int int36 = bookRequest23.compareTo(bookRequest29);
        java.lang.Class<?> wildcardClass37 = bookRequest23.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 52);
        int int12 = bookRequest3.compareTo(bookRequest11);
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        java.lang.String str37 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest13.getPriority();
        java.lang.String str17 = bookRequest13.getBookTitle();
        java.lang.String str18 = bookRequest13.getRequester();
        java.lang.String str19 = bookRequest13.getRequester();
        int int20 = bookRequest13.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str22 = bookRequest13.getRequester();
        java.lang.Class<?> wildcardClass23 = bookRequest13.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str9 = bookRequest8.getBookTitle();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest17.getPriority();
        java.lang.String str23 = bookRequest17.getBookTitle();
        int int24 = bookRequest8.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass25 = bookRequest17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        int int13 = bookRequest9.getPriority();
        int int14 = bookRequest9.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", 52);
        int int19 = bookRequest9.compareTo(bookRequest18);
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str27 = bookRequest26.getBookTitle();
        java.lang.String str28 = bookRequest26.getRequester();
        java.lang.String str29 = bookRequest26.getRequester();
        java.lang.String str30 = bookRequest26.getRequester();
        java.lang.String str31 = bookRequest26.getRequester();
        int int32 = bookRequest26.getPriority();
        int int33 = bookRequest18.compareTo(bookRequest26);
        java.lang.String str34 = bookRequest18.getRequester();
        java.lang.String str35 = bookRequest18.getRequester();
        int int36 = bookRequest3.compareTo(bookRequest18);
        java.lang.Class<?> wildcardClass37 = bookRequest18.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str20 = bookRequest19.getRequester();
        java.lang.String str21 = bookRequest19.getBookTitle();
        int int22 = bookRequest15.compareTo(bookRequest19);
        java.lang.String str23 = bookRequest15.getRequester();
        java.lang.String str24 = bookRequest15.getRequester();
        java.lang.String str25 = bookRequest15.getBookTitle();
        int int26 = bookRequest9.compareTo(bookRequest15);
        int int27 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str28 = bookRequest9.getRequester();
        java.lang.String str29 = bookRequest9.getRequester();
        java.lang.String str30 = bookRequest9.getBookTitle();
        int int31 = bookRequest9.getPriority();
        java.lang.Class<?> wildcardClass32 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        java.lang.String str25 = bookRequest7.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (byte) 100);
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getBookTitle();
        int int32 = bookRequest7.compareTo(bookRequest29);
        java.lang.String str33 = bookRequest29.getBookTitle();
        java.lang.Class<?> wildcardClass34 = bookRequest29.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (byte) 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest10.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        java.lang.String str22 = bookRequest12.getRequester();
        java.lang.String str23 = bookRequest12.getRequester();
        java.lang.Class<?> wildcardClass24 = bookRequest12.getClass();
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getRequester();
        int int36 = bookRequest32.getPriority();
        java.lang.String str37 = bookRequest32.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str42 = bookRequest41.getBookTitle();
        int int43 = bookRequest32.compareTo(bookRequest41);
        int int44 = bookRequest7.compareTo(bookRequest32);
        java.lang.String str45 = bookRequest32.getRequester();
        int int46 = bookRequest32.getPriority();
        int int47 = bookRequest32.getPriority();
        java.lang.String str48 = bookRequest32.getRequester();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", 52);
        int int15 = bookRequest10.compareTo(bookRequest14);
        int int16 = bookRequest10.getPriority();
        int int17 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass18 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        java.lang.String str25 = bookRequest3.getRequester();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        java.lang.String str28 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass29 = bookRequest7.getClass();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest12);
        int int16 = bookRequest12.getPriority();
        java.lang.Class<?> wildcardClass17 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getRequester();
        java.lang.String str13 = bookRequest9.getBookTitle();
        java.lang.String str14 = bookRequest9.getBookTitle();
        java.lang.String str15 = bookRequest9.getBookTitle();
        java.lang.String str16 = bookRequest9.getBookTitle();
        int int17 = bookRequest3.compareTo(bookRequest9);
        int int18 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        int int9 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getRequester();
        java.lang.String str12 = bookRequest8.getBookTitle();
        java.lang.String str13 = bookRequest8.getBookTitle();
        java.lang.String str14 = bookRequest8.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        int int21 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        java.lang.String str18 = bookRequest3.getBookTitle();
        int int19 = bookRequest3.getPriority();
        java.lang.String str20 = bookRequest3.getRequester();
        java.lang.String str21 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.String str17 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (byte) 10);
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str15 = bookRequest11.getRequester();
        java.lang.Class<?> wildcardClass16 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        int int19 = bookRequest12.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        int int19 = bookRequest12.compareTo(bookRequest18);
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.String str21 = bookRequest12.getRequester();
        java.lang.Class<?> wildcardClass22 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        int int13 = bookRequest7.getPriority();
        int int14 = bookRequest7.getPriority();
        java.lang.String str15 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getBookTitle();
        java.lang.String str22 = bookRequest19.getBookTitle();
        int int23 = bookRequest7.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        java.lang.Class<?> wildcardClass24 = bookRequest7.getClass();
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getRequester();
        java.lang.String str25 = bookRequest20.getBookTitle();
        int int26 = bookRequest20.getPriority();
        java.lang.String str27 = bookRequest20.getBookTitle();
        int int28 = bookRequest16.compareTo(bookRequest20);
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.getRequester();
        java.lang.String str35 = bookRequest32.getRequester();
        int int36 = bookRequest16.compareTo(bookRequest32);
        int int37 = bookRequest16.getPriority();
        int int38 = bookRequest7.compareTo(bookRequest16);
        java.lang.String str39 = bookRequest16.getRequester();
        java.lang.Class<?> wildcardClass40 = bookRequest16.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest7.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest14.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getBookTitle();
        int int24 = bookRequest20.getPriority();
        int int25 = bookRequest20.getPriority();
        int int26 = bookRequest14.compareTo(bookRequest20);
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int31 = bookRequest20.compareTo(bookRequest30);
        java.lang.String str32 = bookRequest20.getRequester();
        int int33 = bookRequest7.compareTo(bookRequest20);
        int int34 = bookRequest7.getPriority();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (byte) 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass12 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        int int18 = bookRequest3.getPriority();
        int int19 = bookRequest3.getPriority();
        int int20 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        int int16 = bookRequest3.getPriority();
        java.lang.String str17 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.getRequester();
        int int24 = bookRequest21.getPriority();
        int int25 = bookRequest21.getPriority();
        java.lang.String str26 = bookRequest21.getBookTitle();
        int int27 = bookRequest3.compareTo(bookRequest21);
        int int28 = bookRequest21.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "", 35);
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        int int28 = bookRequest16.compareTo(bookRequest25);
        int int29 = bookRequest25.getPriority();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str16 = bookRequest15.getRequester();
        java.lang.String str17 = bookRequest15.getBookTitle();
        int int18 = bookRequest15.getPriority();
        java.lang.String str19 = bookRequest15.getBookTitle();
        java.lang.String str20 = bookRequest15.getRequester();
        java.lang.String str21 = bookRequest15.getBookTitle();
        java.lang.String str22 = bookRequest15.getRequester();
        java.lang.String str23 = bookRequest15.getBookTitle();
        java.lang.String str24 = bookRequest15.getRequester();
        int int25 = bookRequest3.compareTo(bookRequest15);
        java.lang.String str26 = bookRequest3.getBookTitle();
        int int27 = bookRequest3.getPriority();
        int int28 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass29 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        int int11 = bookRequest3.getPriority();
        int int12 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", 52);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getRequester();
        int int18 = bookRequest3.compareTo(bookRequest12);
        int int19 = bookRequest3.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest3.compareTo(bookRequest23);
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 97);
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) ' ');
        int int17 = bookRequest11.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        int int19 = bookRequest3.compareTo(bookRequest16);
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (-1));
        java.lang.String str24 = bookRequest23.getBookTitle();
        int int25 = bookRequest16.compareTo(bookRequest23);
        int int26 = bookRequest23.getPriority();
        int int27 = bookRequest23.getPriority();
        java.lang.Class<?> wildcardClass28 = bookRequest23.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        int int21 = bookRequest15.getPriority();
        java.lang.Class<?> wildcardClass22 = bookRequest15.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        int int15 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        java.lang.String str19 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) '#');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getRequester();
        int int26 = bookRequest23.getPriority();
        java.lang.String str27 = bookRequest23.getBookTitle();
        java.lang.String str28 = bookRequest23.getBookTitle();
        int int29 = bookRequest13.compareTo(bookRequest23);
        java.lang.String str30 = bookRequest13.getRequester();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        java.lang.String str25 = bookRequest3.getBookTitle();
        java.lang.String str26 = bookRequest3.getBookTitle();
        java.lang.String str27 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        java.lang.String str21 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass22 = bookRequest12.getClass();
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
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) '#');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) ' ');
        int int19 = bookRequest12.compareTo(bookRequest18);
        java.lang.String str20 = bookRequest12.getBookTitle();
        java.lang.String str21 = bookRequest12.getBookTitle();
        int int22 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass23 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        java.lang.String str16 = bookRequest12.getBookTitle();
        int int17 = bookRequest12.getPriority();
        java.lang.String str18 = bookRequest12.getRequester();
        java.lang.Class<?> wildcardClass19 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) '#');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) ' ');
        int int15 = bookRequest8.compareTo(bookRequest14);
        int int16 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str17 = bookRequest14.getBookTitle();
        java.lang.Class<?> wildcardClass18 = bookRequest14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        int int17 = bookRequest11.getPriority();
        java.lang.String str18 = bookRequest11.getRequester();
        int int19 = bookRequest11.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", 0);
        int int24 = bookRequest11.compareTo(bookRequest23);
        int int25 = bookRequest23.getPriority();
        java.lang.Class<?> wildcardClass26 = bookRequest23.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 52);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int4 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", 52);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) '#');
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getRequester();
        int int17 = bookRequest14.getPriority();
        int int18 = bookRequest7.compareTo(bookRequest14);
        java.lang.String str19 = bookRequest14.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getRequester();
        int int12 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) '4');
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 100);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getBookTitle();
        java.lang.String str25 = bookRequest22.getRequester();
        int int26 = bookRequest18.compareTo(bookRequest22);
        int int27 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) ' ');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        int int16 = bookRequest8.getPriority();
        java.lang.String str17 = bookRequest8.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        java.lang.String str20 = bookRequest3.getRequester();
        int int21 = bookRequest3.getPriority();
        int int22 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        java.lang.String str32 = bookRequest7.getBookTitle();
        int int33 = bookRequest7.getPriority();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest3.getPriority();
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getBookTitle();
        int int15 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        java.lang.String str20 = bookRequest3.getBookTitle();
        java.lang.String str21 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str12 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        int int19 = bookRequest16.getPriority();
        java.lang.String str20 = bookRequest16.getBookTitle();
        java.lang.String str21 = bookRequest16.getRequester();
        java.lang.String str22 = bookRequest16.getRequester();
        int int23 = bookRequest11.compareTo(bookRequest16);
        java.lang.String str24 = bookRequest11.getRequester();
        java.lang.String str25 = bookRequest11.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str27 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("", "hi!", (int) (byte) 0);
        java.lang.String str16 = bookRequest15.getBookTitle();
        int int17 = bookRequest3.compareTo(bookRequest15);
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        java.lang.String str35 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass36 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        int int17 = bookRequest3.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.getBookTitle();
        java.lang.String str24 = bookRequest21.getRequester();
        int int25 = bookRequest21.getPriority();
        int int26 = bookRequest3.compareTo(bookRequest21);
        java.lang.String str27 = bookRequest21.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        java.lang.String str24 = bookRequest21.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.String str13 = bookRequest10.getRequester();
        java.lang.String str14 = bookRequest10.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass16 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        int int10 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass11 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        int int20 = bookRequest3.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest24.getPriority();
        int int28 = bookRequest3.compareTo(bookRequest24);
        int int29 = bookRequest24.getPriority();
        int int30 = bookRequest24.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass14 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bookRequest7.compareTo(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        int int14 = bookRequest3.getPriority();
        int int15 = bookRequest3.getPriority();
        java.lang.String str16 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        java.lang.String str19 = bookRequest3.getBookTitle();
        int int20 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        java.lang.String str21 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass22 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getRequester();
        java.lang.String str21 = bookRequest16.getBookTitle();
        int int22 = bookRequest16.getPriority();
        java.lang.String str23 = bookRequest16.getBookTitle();
        int int24 = bookRequest12.compareTo(bookRequest16);
        java.lang.String str25 = bookRequest12.getBookTitle();
        java.lang.String str26 = bookRequest12.getRequester();
        int int27 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str28 = bookRequest12.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest13.getPriority();
        java.lang.String str17 = bookRequest13.getBookTitle();
        java.lang.String str18 = bookRequest13.getRequester();
        java.lang.String str19 = bookRequest13.getRequester();
        int int20 = bookRequest13.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest13);
        int int22 = bookRequest13.getPriority();
        java.lang.String str23 = bookRequest13.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        int int51 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        int int17 = bookRequest12.getPriority();
        java.lang.String str18 = bookRequest12.getBookTitle();
        java.lang.String str19 = bookRequest12.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getRequester();
        java.lang.String str14 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        java.lang.String str31 = bookRequest18.getBookTitle();
        int int32 = bookRequest18.getPriority();
        java.lang.String str33 = bookRequest18.getBookTitle();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", 97);
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest3.getBookTitle();
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        java.lang.String str24 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest32 = new request.BookRequest("", "", 1);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.getBookTitle();
        java.lang.String str35 = bookRequest32.getRequester();
        int int36 = bookRequest28.compareTo(bookRequest32);
        int int37 = bookRequest32.getPriority();
        java.lang.String str38 = bookRequest32.getBookTitle();
        int int39 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getRequester();
        int int14 = bookRequest11.getPriority();
        int int15 = bookRequest11.getPriority();
        java.lang.String str16 = bookRequest11.getBookTitle();
        int int17 = bookRequest11.getPriority();
        java.lang.String str18 = bookRequest11.getBookTitle();
        int int19 = bookRequest11.getPriority();
        java.lang.String str20 = bookRequest11.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 1);
        java.lang.String str25 = bookRequest24.getRequester();
        int int26 = bookRequest11.compareTo(bookRequest24);
        java.lang.String str27 = bookRequest11.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass29 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        java.lang.String str23 = bookRequest21.getRequester();
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getBookTitle();
        java.lang.Class<?> wildcardClass26 = bookRequest21.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        java.lang.String str26 = bookRequest17.getBookTitle();
        java.lang.Class<?> wildcardClass27 = bookRequest17.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass11 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", 0);
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest17.getPriority();
        java.lang.String str23 = bookRequest17.getBookTitle();
        int int24 = bookRequest17.getPriority();
        int int25 = bookRequest17.getPriority();
        int int26 = bookRequest13.compareTo(bookRequest17);
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (byte) 10);
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest17.compareTo(bookRequest30);
        java.lang.String str33 = bookRequest17.getRequester();
        int int34 = bookRequest17.getPriority();
        int int35 = bookRequest17.getPriority();
        int int36 = bookRequest9.compareTo(bookRequest17);
        int int37 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass38 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        int int17 = bookRequest3.getPriority();
        int int18 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        java.lang.Class<?> wildcardClass24 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (byte) 100);
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        int int24 = bookRequest21.getPriority();
        java.lang.String str25 = bookRequest21.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest29.getPriority();
        int int32 = bookRequest21.compareTo(bookRequest29);
        int int33 = bookRequest29.getPriority();
        int int34 = bookRequest29.getPriority();
        int int35 = bookRequest29.getPriority();
        java.lang.String str36 = bookRequest29.getRequester();
        int int37 = bookRequest15.compareTo(bookRequest29);
        request.BookRequest bookRequest41 = new request.BookRequest("", "hi!", (int) (short) -1);
        java.lang.String str42 = bookRequest41.getBookTitle();
        int int43 = bookRequest15.compareTo(bookRequest41);
        int int44 = bookRequest7.compareTo(bookRequest15);
        int int45 = bookRequest15.getPriority();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        int int34 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        int int15 = bookRequest13.getPriority();
        java.lang.String str16 = bookRequest13.getRequester();
        int int17 = bookRequest13.getPriority();
        java.lang.String str18 = bookRequest13.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str23 = bookRequest22.getBookTitle();
        int int24 = bookRequest13.compareTo(bookRequest22);
        java.lang.String str25 = bookRequest22.getBookTitle();
        java.lang.String str26 = bookRequest22.getBookTitle();
        int int27 = bookRequest22.getPriority();
        java.lang.String str28 = bookRequest22.getBookTitle();
        int int29 = bookRequest22.getPriority();
        int int30 = bookRequest3.compareTo(bookRequest22);
        int int31 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass32 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (byte) 10);
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest17.getPriority();
        int int23 = bookRequest11.compareTo(bookRequest17);
        java.lang.String str24 = bookRequest17.getRequester();
        java.lang.String str25 = bookRequest17.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest17);
        java.lang.String str27 = bookRequest17.getRequester();
        java.lang.Class<?> wildcardClass28 = bookRequest17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", 52);
        int int13 = bookRequest3.compareTo(bookRequest12);
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str21 = bookRequest20.getBookTitle();
        java.lang.String str22 = bookRequest20.getBookTitle();
        java.lang.String str23 = bookRequest20.getBookTitle();
        int int24 = bookRequest20.getPriority();
        java.lang.String str25 = bookRequest20.getBookTitle();
        int int26 = bookRequest20.getPriority();
        int int27 = bookRequest12.compareTo(bookRequest20);
        int int28 = bookRequest20.getPriority();
        java.lang.Class<?> wildcardClass29 = bookRequest20.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        java.lang.String str14 = bookRequest12.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        java.lang.String str19 = bookRequest18.getBookTitle();
        java.lang.String str20 = bookRequest18.getBookTitle();
        int int21 = bookRequest12.compareTo(bookRequest18);
        int int22 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str23 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", (int) (short) -1);
        java.lang.String str28 = bookRequest27.getRequester();
        java.lang.String str29 = bookRequest27.getBookTitle();
        int int30 = bookRequest12.compareTo(bookRequest27);
        int int31 = bookRequest27.getPriority();
        java.lang.String str32 = bookRequest27.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        java.lang.String str16 = bookRequest3.getRequester();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest7.compareTo(bookRequest13);
        request.BookRequest bookRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bookRequest7.compareTo(bookRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass16 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        int int26 = bookRequest3.getPriority();
        int int27 = bookRequest3.getPriority();
        int int28 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass29 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 52);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        java.lang.String str17 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.getBookTitle();
        java.lang.String str24 = bookRequest21.getRequester();
        int int25 = bookRequest3.compareTo(bookRequest21);
        java.lang.Class<?> wildcardClass26 = bookRequest21.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 52);
        int int25 = bookRequest3.compareTo(bookRequest24);
        java.lang.String str26 = bookRequest3.getRequester();
        java.lang.String str27 = bookRequest3.getRequester();
        int int28 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest14.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("", "", 1);
        java.lang.String str21 = bookRequest20.getBookTitle();
        int int22 = bookRequest14.compareTo(bookRequest20);
        int int23 = bookRequest10.compareTo(bookRequest20);
        int int24 = bookRequest20.getPriority();
        java.lang.String str25 = bookRequest20.getRequester();
        int int26 = bookRequest20.getPriority();
        int int27 = bookRequest3.compareTo(bookRequest20);
        java.lang.String str28 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str16 = bookRequest15.getBookTitle();
        java.lang.String str17 = bookRequest15.getBookTitle();
        java.lang.String str18 = bookRequest15.getRequester();
        int int19 = bookRequest3.compareTo(bookRequest15);
        java.lang.String str20 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        java.lang.String str17 = bookRequest8.getBookTitle();
        java.lang.String str18 = bookRequest8.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        int int12 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        int int9 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getRequester();
        java.lang.Class<?> wildcardClass12 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getRequester();
        int int36 = bookRequest32.getPriority();
        java.lang.String str37 = bookRequest32.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str42 = bookRequest41.getBookTitle();
        int int43 = bookRequest32.compareTo(bookRequest41);
        int int44 = bookRequest7.compareTo(bookRequest32);
        int int45 = bookRequest7.getPriority();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "hi!", 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.String str19 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getRequester();
        int int26 = bookRequest23.getPriority();
        java.lang.String str27 = bookRequest23.getBookTitle();
        java.lang.String str28 = bookRequest23.getRequester();
        java.lang.String str29 = bookRequest23.getRequester();
        int int30 = bookRequest3.compareTo(bookRequest23);
        java.lang.Class<?> wildcardClass31 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        int int12 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bookRequest7.compareTo(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest10.getPriority();
        java.lang.String str15 = bookRequest10.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) '#');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) ' ');
        int int26 = bookRequest19.compareTo(bookRequest25);
        int int27 = bookRequest10.compareTo(bookRequest19);
        java.lang.String str28 = bookRequest10.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str33 = bookRequest32.getBookTitle();
        int int34 = bookRequest10.compareTo(bookRequest32);
        int int35 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass36 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        java.lang.String str23 = bookRequest12.getBookTitle();
        java.lang.String str24 = bookRequest12.getBookTitle();
        java.lang.String str25 = bookRequest12.getRequester();
        java.lang.String str26 = bookRequest12.getRequester();
        java.lang.String str27 = bookRequest12.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        int int21 = bookRequest3.getPriority();
        int int22 = bookRequest3.getPriority();
        java.lang.String str23 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str28 = bookRequest27.getBookTitle();
        java.lang.String str29 = bookRequest27.getRequester();
        java.lang.String str30 = bookRequest27.getRequester();
        java.lang.String str31 = bookRequest27.getRequester();
        int int32 = bookRequest3.compareTo(bookRequest27);
        java.lang.Class<?> wildcardClass33 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", 52);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getRequester();
        int int18 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str19 = bookRequest12.getRequester();
        java.lang.Class<?> wildcardClass20 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 10);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        java.lang.String str29 = bookRequest3.getRequester();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        java.lang.String str21 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "hi!", 0);
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getRequester();
        int int29 = bookRequest3.compareTo(bookRequest25);
        java.lang.String str30 = bookRequest25.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        int int26 = bookRequest22.getPriority();
        java.lang.Class<?> wildcardClass27 = bookRequest22.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        int int19 = bookRequest12.compareTo(bookRequest18);
        java.lang.String str20 = bookRequest18.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        java.lang.String str24 = bookRequest17.getBookTitle();
        java.lang.String str25 = bookRequest17.getBookTitle();
        java.lang.String str26 = bookRequest17.getRequester();
        int int27 = bookRequest17.getPriority();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        java.lang.Class<?> wildcardClass18 = bookRequest13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        int int20 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 35);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 35);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getRequester();
        java.lang.String str25 = bookRequest20.getBookTitle();
        int int26 = bookRequest20.getPriority();
        java.lang.String str27 = bookRequest20.getBookTitle();
        int int28 = bookRequest16.compareTo(bookRequest20);
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.getRequester();
        java.lang.String str35 = bookRequest32.getRequester();
        int int36 = bookRequest16.compareTo(bookRequest32);
        int int37 = bookRequest16.getPriority();
        int int38 = bookRequest7.compareTo(bookRequest16);
        java.lang.String str39 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass40 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getRequester();
        java.lang.String str14 = bookRequest7.getRequester();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest9.getRequester();
        java.lang.String str13 = bookRequest9.getBookTitle();
        java.lang.String str14 = bookRequest9.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", 52);
        int int13 = bookRequest3.compareTo(bookRequest12);
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str21 = bookRequest20.getBookTitle();
        java.lang.String str22 = bookRequest20.getBookTitle();
        java.lang.String str23 = bookRequest20.getBookTitle();
        int int24 = bookRequest20.getPriority();
        java.lang.String str25 = bookRequest20.getBookTitle();
        int int26 = bookRequest20.getPriority();
        int int27 = bookRequest12.compareTo(bookRequest20);
        java.lang.String str28 = bookRequest20.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        java.lang.String str19 = bookRequest17.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) '#');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getRequester();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest17.compareTo(bookRequest23);
        int int29 = bookRequest23.getPriority();
        java.lang.Class<?> wildcardClass30 = bookRequest23.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getRequester();
        java.lang.String str14 = bookRequest10.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "hi!", (int) (byte) 0);
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest9.compareTo(bookRequest19);
        int int22 = bookRequest9.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        int int24 = bookRequest20.getPriority();
        int int25 = bookRequest20.getPriority();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        int int36 = bookRequest8.getPriority();
        int int37 = bookRequest8.getPriority();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        java.lang.Class<?> wildcardClass18 = bookRequest10.getClass();
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
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        int int13 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        java.lang.Class<?> wildcardClass22 = bookRequest20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 97);
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) ' ');
        int int17 = bookRequest11.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        int int19 = bookRequest3.compareTo(bookRequest16);
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (-1));
        java.lang.String str24 = bookRequest23.getBookTitle();
        int int25 = bookRequest16.compareTo(bookRequest23);
        java.lang.Class<?> wildcardClass26 = bookRequest23.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        int int23 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass24 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
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
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        java.lang.String str16 = bookRequest3.getRequester();
        int int17 = bookRequest3.getPriority();
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.String str19 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        int int21 = bookRequest17.getPriority();
        java.lang.String str22 = bookRequest17.getRequester();
        java.lang.Class<?> wildcardClass23 = bookRequest17.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest20.compareTo(bookRequest24);
        java.lang.String str28 = bookRequest20.getRequester();
        java.lang.String str29 = bookRequest20.getBookTitle();
        int int30 = bookRequest12.compareTo(bookRequest20);
        java.lang.String str31 = bookRequest20.getRequester();
        java.lang.String str32 = bookRequest20.getRequester();
        java.lang.String str33 = bookRequest20.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str17 = bookRequest16.getRequester();
        java.lang.String str18 = bookRequest16.getBookTitle();
        int int19 = bookRequest12.compareTo(bookRequest16);
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.String str21 = bookRequest12.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", (int) (short) 100);
        int int26 = bookRequest12.compareTo(bookRequest25);
        java.lang.String str27 = bookRequest12.getBookTitle();
        java.lang.String str28 = bookRequest12.getRequester();
        java.lang.String str29 = bookRequest12.getBookTitle();
        java.lang.String str30 = bookRequest12.getBookTitle();
        int int31 = bookRequest7.compareTo(bookRequest12);
        java.lang.String str32 = bookRequest12.getBookTitle();
        java.lang.String str33 = bookRequest12.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        java.lang.String str20 = bookRequest19.getBookTitle();
        int int21 = bookRequest3.compareTo(bookRequest19);
        java.lang.String str22 = bookRequest19.getRequester();
        int int23 = bookRequest19.getPriority();
        java.lang.Class<?> wildcardClass24 = bookRequest19.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        int int40 = bookRequest23.getPriority();
        java.lang.String str41 = bookRequest23.getBookTitle();
        java.lang.String str42 = bookRequest23.getBookTitle();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        java.lang.String str24 = bookRequest19.getRequester();
        java.lang.String str25 = bookRequest19.getBookTitle();
        java.lang.Class<?> wildcardClass26 = bookRequest19.getClass();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getRequester();
        java.lang.String str21 = bookRequest16.getBookTitle();
        int int22 = bookRequest16.getPriority();
        java.lang.String str23 = bookRequest16.getBookTitle();
        int int24 = bookRequest12.compareTo(bookRequest16);
        java.lang.String str25 = bookRequest12.getBookTitle();
        java.lang.String str26 = bookRequest12.getRequester();
        int int27 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", 97);
        java.lang.String str10 = bookRequest9.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) ' ');
        int int15 = bookRequest9.compareTo(bookRequest14);
        int int16 = bookRequest14.getPriority();
        int int17 = bookRequest14.getPriority();
        int int18 = bookRequest14.getPriority();
        java.lang.String str19 = bookRequest14.getBookTitle();
        int int20 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str21 = bookRequest14.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getBookTitle();
        java.lang.String str23 = bookRequest20.getBookTitle();
        int int24 = bookRequest3.compareTo(bookRequest20);
        int int25 = bookRequest20.getPriority();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        int int18 = bookRequest15.getPriority();
        java.lang.String str19 = bookRequest15.getRequester();
        java.lang.String str20 = bookRequest15.getBookTitle();
        int int21 = bookRequest15.getPriority();
        java.lang.String str22 = bookRequest15.getRequester();
        java.lang.String str23 = bookRequest15.getBookTitle();
        int int24 = bookRequest7.compareTo(bookRequest15);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", 52);
        int int29 = bookRequest7.compareTo(bookRequest28);
        int int30 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass31 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getRequester();
        java.lang.String str18 = bookRequest12.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass20 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest3.getRequester();
        int int15 = bookRequest3.getPriority();
        int int16 = bookRequest3.getPriority();
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        java.lang.Class<?> wildcardClass24 = bookRequest18.getClass();
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
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str10 = bookRequest9.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (short) 0);
        int int19 = bookRequest14.compareTo(bookRequest18);
        int int20 = bookRequest9.compareTo(bookRequest18);
        java.lang.String str21 = bookRequest18.getBookTitle();
        int int22 = bookRequest3.compareTo(bookRequest18);
        java.lang.String str23 = bookRequest3.getRequester();
        int int24 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass25 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", 10);
        int int22 = bookRequest13.compareTo(bookRequest21);
        java.lang.String str23 = bookRequest13.getRequester();
        java.lang.Class<?> wildcardClass24 = bookRequest13.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str18 = bookRequest17.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getBookTitle();
        int int25 = bookRequest22.getPriority();
        int int26 = bookRequest17.compareTo(bookRequest22);
        java.lang.String str27 = bookRequest17.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest17);
        java.lang.String str29 = bookRequest17.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        int int14 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        int int20 = bookRequest3.getPriority();
        java.lang.String str21 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass22 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        java.lang.String str30 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        int int25 = bookRequest3.compareTo(bookRequest22);
        int int26 = bookRequest3.getPriority();
        java.lang.String str27 = bookRequest3.getBookTitle();
        int int28 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        java.lang.String str23 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        java.lang.String str19 = bookRequest17.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) '#');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getRequester();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest17.compareTo(bookRequest23);
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (short) -1);
        java.lang.String str33 = bookRequest32.getRequester();
        int int34 = bookRequest23.compareTo(bookRequest32);
        java.lang.String str35 = bookRequest23.getBookTitle();
        java.lang.Class<?> wildcardClass36 = bookRequest23.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("", "hi!", (int) '4');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getBookTitle();
        java.lang.String str18 = bookRequest15.getBookTitle();
        int int19 = bookRequest15.getPriority();
        int int20 = bookRequest15.getPriority();
        int int21 = bookRequest15.getPriority();
        int int22 = bookRequest3.compareTo(bookRequest15);
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        java.lang.String str22 = bookRequest7.getBookTitle();
        int int23 = bookRequest7.getPriority();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        java.lang.String str17 = bookRequest3.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.getRequester();
        java.lang.String str24 = bookRequest21.getRequester();
        int int25 = bookRequest3.compareTo(bookRequest21);
        java.lang.String str26 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass27 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        int int22 = bookRequest12.getPriority();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        int int23 = bookRequest7.getPriority();
        int int24 = bookRequest7.getPriority();
        java.lang.String str25 = bookRequest7.getRequester();
        java.lang.String str26 = bookRequest7.getBookTitle();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", 97);
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        int int19 = bookRequest12.compareTo(bookRequest18);
        int int20 = bookRequest12.getPriority();
        java.lang.Class<?> wildcardClass21 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getRequester();
        java.lang.String str18 = bookRequest12.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        java.lang.String str17 = bookRequest12.getRequester();
        java.lang.String str18 = bookRequest12.getRequester();
        int int19 = bookRequest12.getPriority();
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        java.lang.Class<?> wildcardClass35 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        int int23 = bookRequest7.getPriority();
        java.lang.String str24 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass25 = bookRequest7.getClass();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        int int14 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 100);
        int int4 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass12 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        int int19 = bookRequest9.getPriority();
        java.lang.String str20 = bookRequest9.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        int int25 = bookRequest3.getPriority();
        java.lang.String str26 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass27 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        int int31 = bookRequest27.getPriority();
        java.lang.String str32 = bookRequest27.getBookTitle();
        int int33 = bookRequest27.getPriority();
        int int34 = bookRequest19.compareTo(bookRequest27);
        java.lang.String str35 = bookRequest19.getRequester();
        java.lang.String str36 = bookRequest19.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "hi!", 0);
        int int23 = bookRequest9.compareTo(bookRequest22);
        java.lang.String str24 = bookRequest9.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        int int17 = bookRequest12.getPriority();
        java.lang.String str18 = bookRequest12.getBookTitle();
        java.lang.String str19 = bookRequest12.getBookTitle();
        java.lang.String str20 = bookRequest12.getRequester();
        int int21 = bookRequest12.getPriority();
        int int22 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str23 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        java.lang.String str36 = bookRequest32.getRequester();
        java.lang.String str37 = bookRequest32.getRequester();
        java.lang.Class<?> wildcardClass38 = bookRequest32.getClass();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "", 35);
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        int int28 = bookRequest16.compareTo(bookRequest25);
        java.lang.String str29 = bookRequest16.getBookTitle();
        int int30 = bookRequest16.getPriority();
        java.lang.String str31 = bookRequest16.getBookTitle();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", 1);
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest8.compareTo(bookRequest14);
        int int17 = bookRequest3.compareTo(bookRequest14);
        int int18 = bookRequest3.getPriority();
        java.lang.String str19 = bookRequest3.getBookTitle();
        java.lang.String str20 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        java.lang.String str4 = bookRequest3.getRequester();
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
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getRequester();
        int int13 = bookRequest9.getPriority();
        java.lang.String str14 = bookRequest9.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str19 = bookRequest18.getBookTitle();
        int int20 = bookRequest9.compareTo(bookRequest18);
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getBookTitle();
        int int23 = bookRequest18.getPriority();
        java.lang.String str24 = bookRequest18.getBookTitle();
        int int25 = bookRequest18.getPriority();
        int int26 = bookRequest3.compareTo(bookRequest18);
        java.lang.String str27 = bookRequest18.getRequester();
        int int28 = bookRequest18.getPriority();
        java.lang.Class<?> wildcardClass29 = bookRequest18.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.String str19 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        java.lang.String str16 = bookRequest3.getBookTitle();
        int int17 = bookRequest3.getPriority();
        int int18 = bookRequest3.getPriority();
        java.lang.String str19 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bookRequest3.compareTo(bookRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        java.lang.String str24 = bookRequest3.getRequester();
        java.lang.String str25 = bookRequest3.getBookTitle();
        int int26 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass27 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getBookTitle();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", 35);
        int int9 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str10 = bookRequest8.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 10);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        request.BookRequest bookRequest25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = bookRequest7.compareTo(bookRequest25);
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
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
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
        java.lang.String str51 = bookRequest3.getBookTitle();
        java.lang.String str52 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 0);
        int int18 = bookRequest13.compareTo(bookRequest17);
        java.lang.String str19 = bookRequest13.getRequester();
        int int20 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str21 = bookRequest3.getBookTitle();
        java.lang.String str22 = bookRequest3.getBookTitle();
        java.lang.String str23 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.Class<?> wildcardClass23 = bookRequest20.getClass();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.String str15 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        int int15 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 52);
        int int12 = bookRequest3.compareTo(bookRequest11);
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getRequester();
        java.lang.String str15 = bookRequest11.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) -1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getRequester();
        int int12 = bookRequest8.getPriority();
        java.lang.String str13 = bookRequest8.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str18 = bookRequest17.getBookTitle();
        int int19 = bookRequest8.compareTo(bookRequest17);
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getBookTitle();
        java.lang.String str22 = bookRequest17.getBookTitle();
        int int23 = bookRequest17.getPriority();
        java.lang.String str24 = bookRequest17.getRequester();
        int int25 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getBookTitle();
        java.lang.String str13 = bookRequest10.getRequester();
        java.lang.String str14 = bookRequest10.getBookTitle();
        int int15 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 35);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) '4');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getRequester();
        java.lang.String str12 = bookRequest8.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        int int19 = bookRequest16.getPriority();
        int int20 = bookRequest16.getPriority();
        java.lang.String str21 = bookRequest16.getBookTitle();
        int int22 = bookRequest16.getPriority();
        java.lang.String str23 = bookRequest16.getBookTitle();
        int int24 = bookRequest16.getPriority();
        java.lang.String str25 = bookRequest16.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 1);
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest16.compareTo(bookRequest29);
        java.lang.String str32 = bookRequest16.getRequester();
        int int33 = bookRequest8.compareTo(bookRequest16);
        int int34 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str35 = bookRequest16.getBookTitle();
        java.lang.Class<?> wildcardClass36 = bookRequest16.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) -1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        int int21 = bookRequest17.getPriority();
        java.lang.String str22 = bookRequest17.getRequester();
        java.lang.String str23 = bookRequest17.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 100);
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getBookTitle();
        int int15 = bookRequest11.getPriority();
        int int16 = bookRequest11.getPriority();
        int int17 = bookRequest11.getPriority();
        int int18 = bookRequest11.getPriority();
        int int19 = bookRequest11.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) '4');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getBookTitle();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest23.getPriority();
        int int29 = bookRequest23.getPriority();
        int int30 = bookRequest11.compareTo(bookRequest23);
        int int31 = bookRequest3.compareTo(bookRequest23);
        int int32 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass33 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        java.lang.String str22 = bookRequest20.getBookTitle();
        java.lang.Class<?> wildcardClass23 = bookRequest20.getClass();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        int int13 = bookRequest7.getPriority();
        int int14 = bookRequest7.getPriority();
        java.lang.String str15 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 10);
        java.lang.String str20 = bookRequest19.getRequester();
        java.lang.String str21 = bookRequest19.getBookTitle();
        int int22 = bookRequest7.compareTo(bookRequest19);
        java.lang.String str23 = bookRequest7.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 52);
        int int12 = bookRequest3.compareTo(bookRequest11);
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str10 = bookRequest9.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (short) 0);
        int int19 = bookRequest14.compareTo(bookRequest18);
        int int20 = bookRequest9.compareTo(bookRequest18);
        java.lang.String str21 = bookRequest18.getBookTitle();
        int int22 = bookRequest3.compareTo(bookRequest18);
        int int23 = bookRequest18.getPriority();
        java.lang.String str24 = bookRequest18.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        int int26 = bookRequest3.getPriority();
        int int27 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", 35);
        int int9 = bookRequest3.compareTo(bookRequest8);
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        int int12 = bookRequest7.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getBookTitle();
        int int21 = bookRequest16.getPriority();
        int int22 = bookRequest16.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int27 = bookRequest16.compareTo(bookRequest26);
        java.lang.String str28 = bookRequest16.getRequester();
        int int29 = bookRequest16.getPriority();
        java.lang.String str30 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", (int) '4');
        int int35 = bookRequest34.getPriority();
        java.lang.String str36 = bookRequest34.getRequester();
        java.lang.String str37 = bookRequest34.getRequester();
        java.lang.String str38 = bookRequest34.getRequester();
        int int39 = bookRequest16.compareTo(bookRequest34);
        int int40 = bookRequest7.compareTo(bookRequest34);
        java.lang.Class<?> wildcardClass41 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 100);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", 97);
        java.lang.String str15 = bookRequest14.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) ' ');
        int int20 = bookRequest14.compareTo(bookRequest19);
        int int21 = bookRequest10.compareTo(bookRequest19);
        java.lang.String str22 = bookRequest10.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "hi!", 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str17 = bookRequest16.getBookTitle();
        java.lang.String str18 = bookRequest16.getRequester();
        java.lang.String str19 = bookRequest16.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) '#');
        int int24 = bookRequest16.compareTo(bookRequest23);
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str29 = bookRequest28.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) (short) 0);
        int int38 = bookRequest33.compareTo(bookRequest37);
        int int39 = bookRequest28.compareTo(bookRequest37);
        java.lang.String str40 = bookRequest37.getBookTitle();
        request.BookRequest bookRequest44 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str45 = bookRequest44.getRequester();
        int int46 = bookRequest44.getPriority();
        int int47 = bookRequest37.compareTo(bookRequest44);
        java.lang.String str48 = bookRequest37.getBookTitle();
        int int49 = bookRequest16.compareTo(bookRequest37);
        int int50 = bookRequest3.compareTo(bookRequest37);
        java.lang.String str51 = bookRequest3.getBookTitle();
        java.lang.String str52 = bookRequest3.getRequester();
        int int53 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        int int20 = bookRequest3.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest24.getPriority();
        int int28 = bookRequest3.compareTo(bookRequest24);
        java.lang.String str29 = bookRequest24.getRequester();
        java.lang.Class<?> wildcardClass30 = bookRequest24.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '4');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 100);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getRequester();
        int int14 = bookRequest11.getPriority();
        int int15 = bookRequest11.getPriority();
        java.lang.String str16 = bookRequest11.getBookTitle();
        int int17 = bookRequest11.getPriority();
        java.lang.String str18 = bookRequest11.getBookTitle();
        int int19 = bookRequest11.getPriority();
        java.lang.String str20 = bookRequest11.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 1);
        java.lang.String str25 = bookRequest24.getRequester();
        int int26 = bookRequest11.compareTo(bookRequest24);
        java.lang.String str27 = bookRequest11.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest11);
        int int29 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass30 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        java.lang.String str46 = bookRequest40.getBookTitle();
        java.lang.String str47 = bookRequest40.getBookTitle();
        java.lang.String str48 = bookRequest40.getRequester();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        java.lang.String str35 = bookRequest27.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest13.getPriority();
        java.lang.String str17 = bookRequest13.getBookTitle();
        java.lang.String str18 = bookRequest13.getRequester();
        java.lang.String str19 = bookRequest13.getRequester();
        int int20 = bookRequest13.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest13);
        int int22 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest9.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str17 = bookRequest16.getRequester();
        java.lang.String str18 = bookRequest16.getBookTitle();
        int int19 = bookRequest16.getPriority();
        java.lang.String str20 = bookRequest16.getBookTitle();
        java.lang.String str21 = bookRequest16.getRequester();
        int int22 = bookRequest16.getPriority();
        int int23 = bookRequest16.getPriority();
        int int24 = bookRequest9.compareTo(bookRequest16);
        java.lang.Class<?> wildcardClass25 = bookRequest16.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str9 = bookRequest8.getBookTitle();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest17.getPriority();
        java.lang.String str23 = bookRequest17.getBookTitle();
        int int24 = bookRequest8.compareTo(bookRequest17);
        java.lang.String str25 = bookRequest8.getBookTitle();
        java.lang.Class<?> wildcardClass26 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        int int12 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest7.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest10.getPriority();
        java.lang.String str15 = bookRequest10.getRequester();
        int int16 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) '#');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) ' ');
        int int27 = bookRequest20.compareTo(bookRequest26);
        java.lang.String str28 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest36 = new request.BookRequest("", "", 1);
        java.lang.String str37 = bookRequest36.getBookTitle();
        java.lang.String str38 = bookRequest36.getBookTitle();
        java.lang.String str39 = bookRequest36.getRequester();
        int int40 = bookRequest32.compareTo(bookRequest36);
        int int41 = bookRequest36.getPriority();
        int int42 = bookRequest20.compareTo(bookRequest36);
        int int43 = bookRequest36.getPriority();
        int int44 = bookRequest3.compareTo(bookRequest36);
        java.lang.String str45 = bookRequest36.getRequester();
        int int46 = bookRequest36.getPriority();
        java.lang.Class<?> wildcardClass47 = bookRequest36.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getBookTitle();
        int int15 = bookRequest11.getPriority();
        int int16 = bookRequest11.getPriority();
        int int17 = bookRequest11.getPriority();
        int int18 = bookRequest11.getPriority();
        int int19 = bookRequest11.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) '4');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getBookTitle();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest23.getPriority();
        int int29 = bookRequest23.getPriority();
        int int30 = bookRequest11.compareTo(bookRequest23);
        int int31 = bookRequest3.compareTo(bookRequest23);
        int int32 = bookRequest3.getPriority();
        java.lang.String str33 = bookRequest3.getRequester();
        java.lang.String str34 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", 1);
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str13 = bookRequest9.getRequester();
        java.lang.String str14 = bookRequest9.getRequester();
        java.lang.Class<?> wildcardClass15 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        request.BookRequest bookRequest16 = new request.BookRequest("", "", 1);
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        int int22 = bookRequest19.getPriority();
        java.lang.String str23 = bookRequest19.getRequester();
        java.lang.Class<?> wildcardClass24 = bookRequest19.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest23.compareTo(bookRequest27);
        int int29 = bookRequest27.getPriority();
        int int30 = bookRequest27.getPriority();
        java.lang.String str31 = bookRequest27.getRequester();
        java.lang.String str32 = bookRequest27.getRequester();
        java.lang.String str33 = bookRequest27.getBookTitle();
        int int34 = bookRequest9.compareTo(bookRequest27);
        java.lang.Class<?> wildcardClass35 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) (byte) 10);
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest8);
        int int11 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        int int18 = bookRequest3.getPriority();
        int int19 = bookRequest3.getPriority();
        java.lang.String str20 = bookRequest3.getRequester();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 52);
        int int25 = bookRequest3.compareTo(bookRequest24);
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getRequester();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str18 = bookRequest17.getBookTitle();
        java.lang.String str19 = bookRequest17.getRequester();
        int int20 = bookRequest17.getPriority();
        int int21 = bookRequest13.compareTo(bookRequest17);
        int int22 = bookRequest3.compareTo(bookRequest13);
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest10.compareTo(bookRequest14);
        int int17 = bookRequest10.getPriority();
        java.lang.String str18 = bookRequest10.getRequester();
        java.lang.String str19 = bookRequest10.getBookTitle();
        int int20 = bookRequest3.compareTo(bookRequest10);
        int int21 = bookRequest10.getPriority();
        java.lang.String str22 = bookRequest10.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        int int37 = bookRequest3.getPriority();
        java.lang.String str38 = bookRequest3.getRequester();
        int int39 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass40 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        int int4 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int15 = bookRequest14.getPriority();
        int int16 = bookRequest14.getPriority();
        int int17 = bookRequest10.compareTo(bookRequest14);
        java.lang.String str18 = bookRequest14.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest14);
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        int int11 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        int int13 = bookRequest7.getPriority();
        java.lang.String str14 = bookRequest7.getRequester();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.String str15 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        int int19 = bookRequest13.getPriority();
        java.lang.Class<?> wildcardClass20 = bookRequest13.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest7.getPriority();
        int int12 = bookRequest7.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        int int18 = bookRequest12.getPriority();
        java.lang.Class<?> wildcardClass19 = bookRequest12.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.String str15 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        int int18 = bookRequest15.getPriority();
        java.lang.String str19 = bookRequest15.getRequester();
        java.lang.String str20 = bookRequest15.getBookTitle();
        int int21 = bookRequest15.getPriority();
        java.lang.String str22 = bookRequest15.getRequester();
        java.lang.String str23 = bookRequest15.getBookTitle();
        int int24 = bookRequest7.compareTo(bookRequest15);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", 52);
        int int29 = bookRequest7.compareTo(bookRequest28);
        int int30 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str31 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass32 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getRequester();
        java.lang.String str14 = bookRequest7.getRequester();
        java.lang.String str15 = bookRequest7.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bookRequest3.compareTo(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 32);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str9 = bookRequest8.getBookTitle();
        java.lang.String str10 = bookRequest8.getBookTitle();
        java.lang.String str11 = bookRequest8.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest3.getBookTitle();
        int int14 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        java.lang.String str19 = bookRequest3.getRequester();
        int int20 = bookRequest3.getPriority();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 32);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str26 = bookRequest25.getBookTitle();
        java.lang.String str27 = bookRequest25.getRequester();
        java.lang.String str28 = bookRequest25.getRequester();
        java.lang.String str29 = bookRequest25.getBookTitle();
        java.lang.String str30 = bookRequest25.getBookTitle();
        java.lang.String str31 = bookRequest25.getRequester();
        java.lang.String str32 = bookRequest25.getBookTitle();
        int int33 = bookRequest7.compareTo(bookRequest25);
        int int34 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str35 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass36 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        int int16 = bookRequest9.getPriority();
        java.lang.String str17 = bookRequest9.getBookTitle();
        java.lang.String str18 = bookRequest9.getBookTitle();
        int int19 = bookRequest9.getPriority();
        int int20 = bookRequest9.getPriority();
        java.lang.String str21 = bookRequest9.getBookTitle();
        java.lang.String str22 = bookRequest9.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        request.BookRequest bookRequest46 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int47 = bookRequest40.compareTo(bookRequest46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", 97);
        java.lang.String str10 = bookRequest9.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) ' ');
        int int15 = bookRequest9.compareTo(bookRequest14);
        int int16 = bookRequest14.getPriority();
        int int17 = bookRequest14.getPriority();
        int int18 = bookRequest14.getPriority();
        java.lang.String str19 = bookRequest14.getBookTitle();
        int int20 = bookRequest3.compareTo(bookRequest14);
        int int21 = bookRequest14.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", 1);
        java.lang.String str16 = bookRequest15.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getRequester();
        int int25 = bookRequest20.getPriority();
        int int26 = bookRequest15.compareTo(bookRequest20);
        java.lang.String str27 = bookRequest20.getBookTitle();
        java.lang.String str28 = bookRequest20.getRequester();
        int int29 = bookRequest3.compareTo(bookRequest20);
        java.lang.Class<?> wildcardClass30 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        int int17 = bookRequest12.getPriority();
        java.lang.String str18 = bookRequest12.getRequester();
        java.lang.String str19 = bookRequest12.getBookTitle();
        java.lang.String str20 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        int int23 = bookRequest9.getPriority();
        java.lang.String str24 = bookRequest9.getBookTitle();
        java.lang.String str25 = bookRequest9.getRequester();
        java.lang.String str26 = bookRequest9.getBookTitle();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        java.lang.String str26 = bookRequest17.getBookTitle();
        java.lang.String str27 = bookRequest17.getBookTitle();
        java.lang.Class<?> wildcardClass28 = bookRequest17.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        java.lang.Class<?> wildcardClass16 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", 35);
        int int9 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest10.getPriority();
        java.lang.String str15 = bookRequest10.getRequester();
        int int16 = bookRequest3.compareTo(bookRequest10);
        int int17 = bookRequest10.getPriority();
        java.lang.Class<?> wildcardClass18 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (byte) 10);
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest17.getPriority();
        int int23 = bookRequest11.compareTo(bookRequest17);
        java.lang.String str24 = bookRequest17.getRequester();
        java.lang.String str25 = bookRequest17.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass27 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", 52);
        int int15 = bookRequest10.compareTo(bookRequest14);
        int int16 = bookRequest10.getPriority();
        int int17 = bookRequest3.compareTo(bookRequest10);
        int int18 = bookRequest10.getPriority();
        java.lang.String str19 = bookRequest10.getBookTitle();
        java.lang.String str20 = bookRequest10.getBookTitle();
        java.lang.String str21 = bookRequest10.getBookTitle();
        java.lang.String str22 = bookRequest10.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 100);
        int int12 = bookRequest3.compareTo(bookRequest11);
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest11.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getRequester();
        java.lang.String str13 = bookRequest9.getBookTitle();
        int int14 = bookRequest9.getPriority();
        java.lang.String str15 = bookRequest9.getBookTitle();
        int int16 = bookRequest9.getPriority();
        int int17 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str18 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        java.lang.String str16 = bookRequest13.getRequester();
        java.lang.String str17 = bookRequest13.getBookTitle();
        java.lang.String str18 = bookRequest13.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str20 = bookRequest13.getBookTitle();
        int int21 = bookRequest13.getPriority();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        java.lang.String str31 = bookRequest18.getBookTitle();
        int int32 = bookRequest18.getPriority();
        java.lang.Class<?> wildcardClass33 = bookRequest18.getClass();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest8.getPriority();
        int int13 = bookRequest8.getPriority();
        java.lang.String str14 = bookRequest8.getRequester();
        int int15 = bookRequest8.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int24 = bookRequest19.compareTo(bookRequest23);
        java.lang.String str25 = bookRequest19.getRequester();
        int int26 = bookRequest8.compareTo(bookRequest19);
        int int27 = bookRequest3.compareTo(bookRequest19);
        java.lang.String str28 = bookRequest19.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        java.lang.String str30 = bookRequest3.getBookTitle();
        java.lang.String str31 = bookRequest3.getBookTitle();
        int int32 = bookRequest3.getPriority();
        int int33 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass34 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        java.lang.String str16 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        java.lang.String str18 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 100);
        int int12 = bookRequest3.compareTo(bookRequest11);
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getRequester();
        int int36 = bookRequest32.getPriority();
        java.lang.String str37 = bookRequest32.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str42 = bookRequest41.getBookTitle();
        int int43 = bookRequest32.compareTo(bookRequest41);
        int int44 = bookRequest7.compareTo(bookRequest32);
        int int45 = bookRequest32.getPriority();
        java.lang.String str46 = bookRequest32.getBookTitle();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", 35);
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest9);
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) '#');
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 97);
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest11);
        int int15 = bookRequest11.getPriority();
        java.lang.String str16 = bookRequest11.getRequester();
        java.lang.String str17 = bookRequest11.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        java.lang.String str18 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", 100);
        java.lang.String str23 = bookRequest22.getRequester();
        int int24 = bookRequest3.compareTo(bookRequest22);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        int int13 = bookRequest7.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", 100);
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getBookTitle();
        java.lang.String str26 = bookRequest22.getBookTitle();
        int int27 = bookRequest22.getPriority();
        int int28 = bookRequest22.getPriority();
        int int29 = bookRequest22.getPriority();
        java.lang.String str30 = bookRequest22.getRequester();
        int int31 = bookRequest17.compareTo(bookRequest22);
        int int32 = bookRequest7.compareTo(bookRequest17);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest16 = new request.BookRequest("", "", 1);
        int int17 = bookRequest8.compareTo(bookRequest16);
        int int18 = bookRequest8.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        int int16 = bookRequest9.getPriority();
        java.lang.String str17 = bookRequest9.getBookTitle();
        java.lang.String str18 = bookRequest9.getBookTitle();
        int int19 = bookRequest9.getPriority();
        java.lang.Class<?> wildcardClass20 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        java.lang.String str19 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str24 = bookRequest23.getBookTitle();
        java.lang.String str25 = bookRequest23.getRequester();
        int int26 = bookRequest23.getPriority();
        java.lang.String str27 = bookRequest23.getRequester();
        java.lang.String str28 = bookRequest23.getBookTitle();
        int int29 = bookRequest23.getPriority();
        int int30 = bookRequest3.compareTo(bookRequest23);
        java.lang.Class<?> wildcardClass31 = bookRequest23.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", 10);
        int int22 = bookRequest13.compareTo(bookRequest21);
        java.lang.String str23 = bookRequest13.getBookTitle();
        int int24 = bookRequest13.getPriority();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        java.lang.String str18 = bookRequest7.getRequester();
        java.lang.String str19 = bookRequest7.getRequester();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        java.lang.Class<?> wildcardClass22 = bookRequest3.getClass();
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
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        java.lang.String str27 = bookRequest3.getRequester();
        java.lang.String str28 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass29 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        int int18 = bookRequest3.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", (int) (short) -1);
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getRequester();
        int int25 = bookRequest3.compareTo(bookRequest22);
        java.lang.Class<?> wildcardClass26 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        int int19 = bookRequest15.getPriority();
        int int20 = bookRequest15.getPriority();
        int int21 = bookRequest9.compareTo(bookRequest15);
        int int22 = bookRequest3.compareTo(bookRequest15);
        java.lang.String str23 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass24 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest10.getPriority();
        java.lang.String str15 = bookRequest10.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) '#');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) ' ');
        int int26 = bookRequest19.compareTo(bookRequest25);
        int int27 = bookRequest10.compareTo(bookRequest19);
        java.lang.String str28 = bookRequest10.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str33 = bookRequest32.getBookTitle();
        int int34 = bookRequest10.compareTo(bookRequest32);
        int int35 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest39 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str40 = bookRequest39.getRequester();
        java.lang.String str41 = bookRequest39.getRequester();
        int int42 = bookRequest10.compareTo(bookRequest39);
        int int43 = bookRequest10.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest9.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", 0);
        java.lang.String str16 = bookRequest15.getBookTitle();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getRequester();
        java.lang.String str20 = bookRequest15.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        java.lang.String str32 = bookRequest28.getRequester();
        java.lang.String str33 = bookRequest28.getBookTitle();
        int int34 = bookRequest28.getPriority();
        java.lang.String str35 = bookRequest28.getBookTitle();
        int int36 = bookRequest24.compareTo(bookRequest28);
        java.lang.String str37 = bookRequest24.getBookTitle();
        java.lang.String str38 = bookRequest24.getRequester();
        int int39 = bookRequest15.compareTo(bookRequest24);
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int44 = bookRequest43.getPriority();
        java.lang.String str45 = bookRequest43.getBookTitle();
        int int46 = bookRequest43.getPriority();
        java.lang.String str47 = bookRequest43.getBookTitle();
        int int48 = bookRequest15.compareTo(bookRequest43);
        int int49 = bookRequest9.compareTo(bookRequest15);
        java.lang.String str50 = bookRequest9.getRequester();
        java.lang.String str51 = bookRequest9.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        int int14 = bookRequest3.getPriority();
        int int15 = bookRequest3.getPriority();
        java.lang.String str16 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        int int35 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.String str17 = bookRequest3.getRequester();
        int int18 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        java.lang.String str20 = bookRequest3.getBookTitle();
        java.lang.String str21 = bookRequest3.getRequester();
        java.lang.String str22 = bookRequest3.getRequester();
        java.lang.String str23 = bookRequest3.getRequester();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        int int26 = bookRequest3.getPriority();
        java.lang.String str27 = bookRequest3.getBookTitle();
        int int28 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "hi!", 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str17 = bookRequest16.getBookTitle();
        java.lang.String str18 = bookRequest16.getRequester();
        java.lang.String str19 = bookRequest16.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) '#');
        int int24 = bookRequest16.compareTo(bookRequest23);
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str29 = bookRequest28.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) (short) 0);
        int int38 = bookRequest33.compareTo(bookRequest37);
        int int39 = bookRequest28.compareTo(bookRequest37);
        java.lang.String str40 = bookRequest37.getBookTitle();
        request.BookRequest bookRequest44 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str45 = bookRequest44.getRequester();
        int int46 = bookRequest44.getPriority();
        int int47 = bookRequest37.compareTo(bookRequest44);
        java.lang.String str48 = bookRequest37.getBookTitle();
        int int49 = bookRequest16.compareTo(bookRequest37);
        int int50 = bookRequest3.compareTo(bookRequest37);
        java.lang.String str51 = bookRequest37.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getRequester();
        java.lang.String str14 = bookRequest7.getBookTitle();
        int int15 = bookRequest7.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        java.lang.String str25 = bookRequest7.getRequester();
        java.lang.String str26 = bookRequest7.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        java.lang.String str32 = bookRequest10.getRequester();
        java.lang.Class<?> wildcardClass33 = bookRequest10.getClass();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.String str17 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (byte) 1);
        int int18 = bookRequest13.compareTo(bookRequest17);
        java.lang.String str19 = bookRequest13.getBookTitle();
        java.lang.String str20 = bookRequest13.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str22 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '4');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 100);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("", "hi!", 52);
        int int16 = bookRequest7.compareTo(bookRequest15);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) (short) 100);
        int int21 = bookRequest15.compareTo(bookRequest20);
        int int22 = bookRequest3.compareTo(bookRequest20);
        java.lang.String str23 = bookRequest20.getRequester();
        java.lang.Class<?> wildcardClass24 = bookRequest20.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest9);
        int int13 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        int int19 = bookRequest15.getPriority();
        int int20 = bookRequest15.getPriority();
        int int21 = bookRequest9.compareTo(bookRequest15);
        int int22 = bookRequest3.compareTo(bookRequest15);
        java.lang.String str23 = bookRequest15.getRequester();
        int int24 = bookRequest15.getPriority();
        int int25 = bookRequest15.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", 52);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getRequester();
        int int18 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str19 = bookRequest3.getBookTitle();
        java.lang.String str20 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        java.lang.String str19 = bookRequest7.getRequester();
        int int20 = bookRequest7.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", 0);
        java.lang.String str25 = bookRequest24.getBookTitle();
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getBookTitle();
        java.lang.String str28 = bookRequest24.getBookTitle();
        int int29 = bookRequest24.getPriority();
        int int30 = bookRequest7.compareTo(bookRequest24);
        java.lang.String str31 = bookRequest24.getRequester();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", 35);
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest9);
        int int13 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) '#');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        java.lang.String str18 = bookRequest15.getBookTitle();
        int int19 = bookRequest15.getPriority();
        int int20 = bookRequest3.compareTo(bookRequest15);
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 10);
        int int25 = bookRequest3.compareTo(bookRequest24);
        int int26 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass27 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", 52);
        int int15 = bookRequest10.compareTo(bookRequest14);
        int int16 = bookRequest10.getPriority();
        int int17 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (byte) 1);
        int int15 = bookRequest10.compareTo(bookRequest14);
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "hi!", 52);
        int int24 = bookRequest19.compareTo(bookRequest23);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        java.lang.String str30 = bookRequest28.getRequester();
        int int31 = bookRequest28.getPriority();
        java.lang.String str32 = bookRequest28.getBookTitle();
        java.lang.String str33 = bookRequest28.getRequester();
        int int34 = bookRequest19.compareTo(bookRequest28);
        int int35 = bookRequest28.getPriority();
        int int36 = bookRequest10.compareTo(bookRequest28);
        int int37 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass38 = bookRequest10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getRequester();
        java.lang.String str17 = bookRequest12.getBookTitle();
        int int18 = bookRequest12.getPriority();
        java.lang.String str19 = bookRequest12.getBookTitle();
        int int20 = bookRequest8.compareTo(bookRequest12);
        java.lang.String str21 = bookRequest8.getBookTitle();
        int int22 = bookRequest3.compareTo(bookRequest8);
        int int23 = bookRequest8.getPriority();
        java.lang.Class<?> wildcardClass24 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        int int18 = bookRequest15.getPriority();
        java.lang.String str19 = bookRequest15.getRequester();
        java.lang.String str20 = bookRequest15.getBookTitle();
        int int21 = bookRequest15.getPriority();
        java.lang.String str22 = bookRequest15.getRequester();
        java.lang.String str23 = bookRequest15.getBookTitle();
        int int24 = bookRequest7.compareTo(bookRequest15);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", 52);
        int int29 = bookRequest7.compareTo(bookRequest28);
        int int30 = bookRequest3.compareTo(bookRequest7);
        int int31 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass32 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        int int17 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        java.lang.String str25 = bookRequest3.getRequester();
        int int26 = bookRequest3.getPriority();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest3.getBookTitle();
        int int16 = bookRequest3.getPriority();
        java.lang.String str17 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        java.lang.String str24 = bookRequest3.getRequester();
        int int25 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass26 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str27 = bookRequest26.getRequester();
        java.lang.String str28 = bookRequest26.getBookTitle();
        int int29 = bookRequest22.compareTo(bookRequest26);
        java.lang.String str30 = bookRequest26.getBookTitle();
        int int31 = bookRequest15.compareTo(bookRequest26);
        int int32 = bookRequest15.getPriority();
        java.lang.String str33 = bookRequest15.getRequester();
        java.lang.Class<?> wildcardClass34 = bookRequest15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest8.getPriority();
        int int13 = bookRequest8.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", 52);
        int int18 = bookRequest8.compareTo(bookRequest17);
        java.lang.String str19 = bookRequest17.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest17.compareTo(bookRequest23);
        java.lang.String str26 = bookRequest23.getBookTitle();
        java.lang.String str27 = bookRequest23.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest23);
        int int29 = bookRequest23.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getRequester();
        java.lang.String str14 = bookRequest10.getBookTitle();
        int int15 = bookRequest10.getPriority();
        int int16 = bookRequest10.getPriority();
        java.lang.String str17 = bookRequest10.getRequester();
        int int18 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str15 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bookRequest3.compareTo(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", 10);
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest12.compareTo(bookRequest18);
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getBookTitle();
        java.lang.String str28 = bookRequest24.getBookTitle();
        java.lang.String str29 = bookRequest24.getBookTitle();
        java.lang.String str30 = bookRequest24.getRequester();
        int int31 = bookRequest24.getPriority();
        java.lang.String str32 = bookRequest24.getBookTitle();
        int int33 = bookRequest18.compareTo(bookRequest24);
        int int34 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        int int29 = bookRequest26.getPriority();
        java.lang.String str30 = bookRequest26.getBookTitle();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        int int18 = bookRequest15.getPriority();
        java.lang.String str19 = bookRequest15.getRequester();
        java.lang.String str20 = bookRequest15.getBookTitle();
        int int21 = bookRequest15.getPriority();
        java.lang.String str22 = bookRequest15.getRequester();
        java.lang.String str23 = bookRequest15.getBookTitle();
        int int24 = bookRequest7.compareTo(bookRequest15);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", 52);
        int int29 = bookRequest7.compareTo(bookRequest28);
        int int30 = bookRequest3.compareTo(bookRequest7);
        int int31 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass32 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) (short) 10);
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest3.compareTo(bookRequest14);
        java.lang.Class<?> wildcardClass17 = bookRequest14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bookRequest3.compareTo(bookRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (byte) 10);
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest17.getPriority();
        int int23 = bookRequest11.compareTo(bookRequest17);
        java.lang.String str24 = bookRequest17.getRequester();
        java.lang.String str25 = bookRequest17.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest17);
        java.lang.String str27 = bookRequest3.getBookTitle();
        java.lang.String str28 = bookRequest3.getBookTitle();
        java.lang.String str29 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 10);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        java.lang.String str20 = bookRequest13.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest13.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getRequester();
        int int36 = bookRequest32.getPriority();
        java.lang.String str37 = bookRequest32.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str42 = bookRequest41.getBookTitle();
        int int43 = bookRequest32.compareTo(bookRequest41);
        int int44 = bookRequest7.compareTo(bookRequest32);
        int int45 = bookRequest32.getPriority();
        java.lang.Class<?> wildcardClass46 = bookRequest32.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str9 = bookRequest8.getBookTitle();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest17.getPriority();
        java.lang.String str23 = bookRequest17.getBookTitle();
        int int24 = bookRequest8.compareTo(bookRequest17);
        int int25 = bookRequest17.getPriority();
        int int26 = bookRequest17.getPriority();
        java.lang.Class<?> wildcardClass27 = bookRequest17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        java.lang.String str24 = bookRequest16.getBookTitle();
        int int25 = bookRequest16.getPriority();
        java.lang.String str26 = bookRequest16.getBookTitle();
        java.lang.Class<?> wildcardClass27 = bookRequest16.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getRequester();
        java.lang.String str14 = bookRequest7.getRequester();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest7);
        int int15 = bookRequest7.getPriority();
        java.lang.String str16 = bookRequest7.getRequester();
        java.lang.String str17 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass18 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest14.compareTo(bookRequest18);
        java.lang.String str21 = bookRequest14.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", (int) '4');
        int int26 = bookRequest14.compareTo(bookRequest25);
        int int27 = bookRequest3.compareTo(bookRequest25);
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        java.lang.String str25 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getBookTitle();
        java.lang.String str16 = bookRequest13.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 52);
        int int25 = bookRequest20.compareTo(bookRequest24);
        int int26 = bookRequest20.getPriority();
        int int27 = bookRequest13.compareTo(bookRequest20);
        int int28 = bookRequest3.compareTo(bookRequest20);
        java.lang.Class<?> wildcardClass29 = bookRequest20.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str18 = bookRequest17.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getBookTitle();
        int int25 = bookRequest22.getPriority();
        int int26 = bookRequest17.compareTo(bookRequest22);
        java.lang.String str27 = bookRequest17.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest17);
        int int29 = bookRequest3.getPriority();
        java.lang.String str30 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        int int22 = bookRequest16.getPriority();
        int int23 = bookRequest16.getPriority();
        java.lang.Class<?> wildcardClass24 = bookRequest16.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) ' ');
        int int18 = bookRequest17.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str23 = bookRequest22.getRequester();
        int int24 = bookRequest22.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", 1);
        java.lang.String str29 = bookRequest28.getBookTitle();
        int int30 = bookRequest22.compareTo(bookRequest28);
        int int31 = bookRequest17.compareTo(bookRequest28);
        java.lang.String str32 = bookRequest17.getRequester();
        int int33 = bookRequest3.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass34 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getBookTitle();
        int int12 = bookRequest7.getPriority();
        int int13 = bookRequest7.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "hi!", 0);
        int int13 = bookRequest12.getPriority();
        int int14 = bookRequest12.getPriority();
        int int15 = bookRequest12.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", 1);
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getBookTitle();
        java.lang.String str22 = bookRequest19.getRequester();
        int int23 = bookRequest12.compareTo(bookRequest19);
        java.lang.String str24 = bookRequest12.getBookTitle();
        java.lang.String str25 = bookRequest12.getBookTitle();
        java.lang.String str26 = bookRequest12.getBookTitle();
        int int27 = bookRequest3.compareTo(bookRequest12);
        int int28 = bookRequest12.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "hi!", 52);
        int int10 = bookRequest3.compareTo(bookRequest9);
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest9.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str15 = bookRequest7.getRequester();
        java.lang.String str16 = bookRequest7.getBookTitle();
        java.lang.String str17 = bookRequest7.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getBookTitle();
        java.lang.String str15 = bookRequest11.getBookTitle();
        java.lang.String str16 = bookRequest11.getBookTitle();
        java.lang.String str17 = bookRequest11.getRequester();
        int int18 = bookRequest11.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        int int24 = bookRequest14.getPriority();
        java.lang.Class<?> wildcardClass25 = bookRequest14.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }
}

