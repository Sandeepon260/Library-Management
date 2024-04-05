package BookRequestAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest7);
        int int14 = bookRequest7.getPriority();
        int int15 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass16 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.lang.String str31 = bookRequest26.getBookTitle();
        java.lang.Class<?> wildcardClass32 = bookRequest26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass12 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        int int21 = bookRequest12.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        int int20 = bookRequest12.getPriority();
        java.lang.String str21 = bookRequest12.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        request.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bookRequest8.compareTo(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        request.BookRequest bookRequest26 = new request.BookRequest("", "", 1);
        java.lang.String str27 = bookRequest26.getRequester();
        java.lang.String str28 = bookRequest26.getBookTitle();
        java.lang.String str29 = bookRequest26.getRequester();
        java.lang.String str30 = bookRequest26.getRequester();
        int int31 = bookRequest26.getPriority();
        int int32 = bookRequest3.compareTo(bookRequest26);
        int int33 = bookRequest3.getPriority();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) (short) 100);
        int int17 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.String str20 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        java.lang.String str23 = bookRequest12.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) '4');
        int int15 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str16 = bookRequest14.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest14.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int13 = bookRequest3.compareTo(bookRequest12);
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        int int14 = bookRequest3.getPriority();
        java.lang.String str15 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.String str20 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        java.lang.Class<?> wildcardClass35 = bookRequest7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", 35);
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) ' ');
        int int32 = bookRequest31.getPriority();
        int int33 = bookRequest27.compareTo(bookRequest31);
        int int34 = bookRequest3.compareTo(bookRequest27);
        java.lang.String str35 = bookRequest27.getBookTitle();
        java.lang.Class<?> wildcardClass36 = bookRequest27.getClass();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        java.lang.Class<?> wildcardClass17 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str12 = bookRequest11.getBookTitle();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        java.lang.Class<?> wildcardClass41 = bookRequest23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        java.lang.String str19 = bookRequest13.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest3.compareTo(bookRequest29);
        java.lang.Class<?> wildcardClass32 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass9 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        int int24 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass25 = bookRequest7.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", 1);
        java.lang.String str9 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str14 = bookRequest13.getRequester();
        int int15 = bookRequest13.getPriority();
        java.lang.String str16 = bookRequest13.getBookTitle();
        java.lang.String str17 = bookRequest13.getRequester();
        int int18 = bookRequest13.getPriority();
        int int19 = bookRequest8.compareTo(bookRequest13);
        int int20 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str21 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        java.lang.Class<?> wildcardClass24 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) '#');
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getRequester();
        java.lang.String str17 = bookRequest12.getRequester();
        java.lang.String str18 = bookRequest12.getBookTitle();
        int int19 = bookRequest8.compareTo(bookRequest12);
        java.lang.String str20 = bookRequest12.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest12);
        int int22 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        int int9 = bookRequest3.compareTo(bookRequest8);
        int int10 = bookRequest8.getPriority();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) -1);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bookRequest3.compareTo(bookRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", 35);
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest11.getBookTitle();
        java.lang.String str14 = bookRequest11.getBookTitle();
        java.lang.String str15 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bookRequest11.compareTo(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 0);
        int int18 = bookRequest13.compareTo(bookRequest17);
        java.lang.String str19 = bookRequest13.getRequester();
        int int20 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str21 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        int int16 = bookRequest8.compareTo(bookRequest12);
        int int17 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        java.lang.String str31 = bookRequest7.getBookTitle();
        int int32 = bookRequest7.getPriority();
        int int33 = bookRequest7.getPriority();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", 10);
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getBookTitle();
        int int17 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str18 = bookRequest14.getBookTitle();
        java.lang.String str19 = bookRequest14.getBookTitle();
        java.lang.String str20 = bookRequest14.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        java.lang.String str4 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        int int18 = bookRequest3.getPriority();
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        int int25 = bookRequest15.getPriority();
        java.lang.Class<?> wildcardClass26 = bookRequest15.getClass();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 1);
        int int4 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest3.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getRequester();
        int int21 = bookRequest17.getPriority();
        java.lang.String str22 = bookRequest17.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str27 = bookRequest26.getBookTitle();
        int int28 = bookRequest17.compareTo(bookRequest26);
        java.lang.String str29 = bookRequest26.getBookTitle();
        int int30 = bookRequest3.compareTo(bookRequest26);
        int int31 = bookRequest26.getPriority();
        java.lang.Class<?> wildcardClass32 = bookRequest26.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (byte) 100);
        int int18 = bookRequest17.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str23 = bookRequest22.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (short) 0);
        int int32 = bookRequest27.compareTo(bookRequest31);
        int int33 = bookRequest22.compareTo(bookRequest31);
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest31.getPriority();
        int int36 = bookRequest31.getPriority();
        java.lang.String str37 = bookRequest31.getRequester();
        int int38 = bookRequest17.compareTo(bookRequest31);
        int int39 = bookRequest3.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass40 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", 35);
        java.lang.String str22 = bookRequest21.getRequester();
        int int23 = bookRequest21.getPriority();
        int int24 = bookRequest21.getPriority();
        java.lang.String str25 = bookRequest21.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest21);
        java.lang.String str27 = bookRequest21.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", 97);
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.lang.Class<?> wildcardClass20 = bookRequest11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getRequester();
        int int14 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass15 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int19 = bookRequest14.compareTo(bookRequest18);
        java.lang.String str20 = bookRequest14.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str22 = bookRequest14.getRequester();
        java.lang.Class<?> wildcardClass23 = bookRequest14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        java.lang.String str19 = bookRequest3.getBookTitle();
        java.lang.String str20 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        int int23 = bookRequest18.getPriority();
        int int24 = bookRequest18.getPriority();
        java.lang.Class<?> wildcardClass25 = bookRequest18.getClass();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        java.lang.String str22 = bookRequest9.getRequester();
        java.lang.String str23 = bookRequest9.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest23 = new request.BookRequest("", "", 1);
        java.lang.String str24 = bookRequest23.getBookTitle();
        java.lang.String str25 = bookRequest23.getBookTitle();
        java.lang.String str26 = bookRequest23.getRequester();
        int int27 = bookRequest19.compareTo(bookRequest23);
        java.lang.String str28 = bookRequest23.getRequester();
        java.lang.String str29 = bookRequest23.getRequester();
        int int30 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        java.lang.String str26 = bookRequest23.getBookTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 10);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) (short) -1);
        java.lang.String str30 = bookRequest29.getBookTitle();
        int int31 = bookRequest3.compareTo(bookRequest29);
        int int32 = bookRequest29.getPriority();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        java.lang.String str13 = bookRequest8.getBookTitle();
        java.lang.String str14 = bookRequest8.getRequester();
        int int15 = bookRequest8.getPriority();
        int int16 = bookRequest3.compareTo(bookRequest8);
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getRequester();
        int int29 = bookRequest26.getPriority();
        java.lang.String str30 = bookRequest26.getRequester();
        java.lang.String str31 = bookRequest26.getBookTitle();
        int int32 = bookRequest26.getPriority();
        java.lang.String str33 = bookRequest26.getRequester();
        int int34 = bookRequest26.getPriority();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str39 = bookRequest38.getRequester();
        java.lang.String str40 = bookRequest38.getBookTitle();
        int int41 = bookRequest38.getPriority();
        java.lang.String str42 = bookRequest38.getBookTitle();
        java.lang.String str43 = bookRequest38.getRequester();
        java.lang.String str44 = bookRequest38.getBookTitle();
        java.lang.String str45 = bookRequest38.getRequester();
        java.lang.String str46 = bookRequest38.getBookTitle();
        java.lang.String str47 = bookRequest38.getRequester();
        int int48 = bookRequest26.compareTo(bookRequest38);
        int int49 = bookRequest11.compareTo(bookRequest26);
        int int50 = bookRequest11.getPriority();
        java.lang.Class<?> wildcardClass51 = bookRequest11.getClass();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        java.lang.String str30 = bookRequest28.getRequester();
        java.lang.String str31 = bookRequest28.getBookTitle();
        int int32 = bookRequest28.getPriority();
        java.lang.Class<?> wildcardClass33 = bookRequest28.getClass();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        int int19 = bookRequest12.getPriority();
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.String str21 = bookRequest12.getRequester();
        java.lang.Class<?> wildcardClass22 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.lang.String str25 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass26 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        java.lang.Class<?> wildcardClass32 = bookRequest10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        java.lang.String str35 = bookRequest29.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        int int22 = bookRequest17.getPriority();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        int int16 = bookRequest9.getPriority();
        java.lang.String str17 = bookRequest9.getBookTitle();
        java.lang.Class<?> wildcardClass18 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        java.lang.String str16 = bookRequest9.getRequester();
        java.lang.String str17 = bookRequest9.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str22 = bookRequest21.getBookTitle();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        int int25 = bookRequest9.compareTo(bookRequest21);
        java.lang.Class<?> wildcardClass26 = bookRequest9.getClass();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 10);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        java.lang.String str26 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = bookRequest3.compareTo(bookRequest27);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        int int24 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass25 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 10);
        int int12 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bookRequest3.compareTo(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        java.lang.Class<?> wildcardClass20 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) ' ');
        int int13 = bookRequest7.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", 52);
        int int13 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str14 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 10);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest8.getPriority();
        java.lang.String str13 = bookRequest8.getBookTitle();
        int int14 = bookRequest8.getPriority();
        java.lang.String str15 = bookRequest8.getBookTitle();
        int int16 = bookRequest8.getPriority();
        java.lang.String str17 = bookRequest8.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", 1);
        java.lang.String str22 = bookRequest21.getRequester();
        int int23 = bookRequest8.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest8.getBookTitle();
        int int25 = bookRequest8.getPriority();
        int int26 = bookRequest3.compareTo(bookRequest8);
        java.lang.Class<?> wildcardClass27 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        java.lang.String str32 = bookRequest23.getBookTitle();
        java.lang.Class<?> wildcardClass33 = bookRequest23.getClass();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        java.lang.String str19 = bookRequest12.getRequester();
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass11 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str21 = bookRequest20.getBookTitle();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getRequester();
        java.lang.String str24 = bookRequest20.getRequester();
        int int25 = bookRequest9.compareTo(bookRequest20);
        java.lang.String str26 = bookRequest9.getRequester();
        request.BookRequest bookRequest27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = bookRequest9.compareTo(bookRequest27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        java.lang.String str28 = bookRequest23.getRequester();
        java.lang.Class<?> wildcardClass29 = bookRequest23.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        int int25 = bookRequest20.getPriority();
        java.lang.String str26 = bookRequest20.getBookTitle();
        java.lang.Class<?> wildcardClass27 = bookRequest20.getClass();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        java.lang.String str32 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        java.lang.String str22 = bookRequest3.getRequester();
        int int23 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass24 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest3.getPriority();
        int int12 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        java.lang.Class<?> wildcardClass25 = bookRequest20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        java.lang.String str18 = bookRequest3.getRequester();
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getRequester();
        int int29 = bookRequest26.getPriority();
        java.lang.String str30 = bookRequest26.getRequester();
        java.lang.String str31 = bookRequest26.getBookTitle();
        int int32 = bookRequest26.getPriority();
        java.lang.String str33 = bookRequest26.getRequester();
        int int34 = bookRequest26.getPriority();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str39 = bookRequest38.getRequester();
        java.lang.String str40 = bookRequest38.getBookTitle();
        int int41 = bookRequest38.getPriority();
        java.lang.String str42 = bookRequest38.getBookTitle();
        java.lang.String str43 = bookRequest38.getRequester();
        java.lang.String str44 = bookRequest38.getBookTitle();
        java.lang.String str45 = bookRequest38.getRequester();
        java.lang.String str46 = bookRequest38.getBookTitle();
        java.lang.String str47 = bookRequest38.getRequester();
        int int48 = bookRequest26.compareTo(bookRequest38);
        int int49 = bookRequest11.compareTo(bookRequest26);
        java.lang.Class<?> wildcardClass50 = bookRequest26.getClass();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        java.lang.Class<?> wildcardClass25 = bookRequest12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        java.lang.String str31 = bookRequest10.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str27 = bookRequest26.getBookTitle();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getRequester();
        int int30 = bookRequest19.compareTo(bookRequest26);
        java.lang.Class<?> wildcardClass31 = bookRequest26.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str14 = bookRequest3.getRequester();
        int int15 = bookRequest3.getPriority();
        java.lang.String str16 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        java.lang.String str23 = bookRequest7.getRequester();
        int int24 = bookRequest7.getPriority();
        java.lang.String str25 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass26 = bookRequest7.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 32);
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int24 = bookRequest7.compareTo(bookRequest23);
        int int25 = bookRequest7.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", 52);
        int int30 = bookRequest7.compareTo(bookRequest29);
        int int31 = bookRequest3.compareTo(bookRequest29);
        java.lang.Class<?> wildcardClass32 = bookRequest29.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        int int16 = bookRequest12.getPriority();
        int int17 = bookRequest12.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass19 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) ' ');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass10 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        java.lang.String str28 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass29 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) '#');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getBookTitle();
        java.lang.String str26 = bookRequest23.getRequester();
        int int27 = bookRequest3.compareTo(bookRequest23);
        java.lang.Class<?> wildcardClass28 = bookRequest23.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        java.lang.String str31 = bookRequest3.getRequester();
        java.lang.String str32 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        int int19 = bookRequest12.compareTo(bookRequest18);
        java.lang.String str20 = bookRequest12.getRequester();
        int int21 = bookRequest12.getPriority();
        java.lang.String str22 = bookRequest12.getRequester();
        java.lang.String str23 = bookRequest12.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (byte) -1);
        java.lang.String str24 = bookRequest23.getRequester();
        java.lang.String str25 = bookRequest23.getRequester();
        int int26 = bookRequest10.compareTo(bookRequest23);
        java.lang.Class<?> wildcardClass27 = bookRequest23.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest3.compareTo(bookRequest29);
        java.lang.String str32 = bookRequest29.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getBookTitle();
        int int12 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) '#');
        int int11 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str16 = bookRequest15.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (short) 0);
        int int25 = bookRequest20.compareTo(bookRequest24);
        int int26 = bookRequest15.compareTo(bookRequest24);
        java.lang.String str27 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str32 = bookRequest31.getRequester();
        int int33 = bookRequest31.getPriority();
        int int34 = bookRequest24.compareTo(bookRequest31);
        java.lang.String str35 = bookRequest24.getBookTitle();
        int int36 = bookRequest3.compareTo(bookRequest24);
        request.BookRequest bookRequest40 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str41 = bookRequest40.getRequester();
        java.lang.String str42 = bookRequest40.getBookTitle();
        java.lang.String str43 = bookRequest40.getRequester();
        java.lang.String str44 = bookRequest40.getRequester();
        java.lang.String str45 = bookRequest40.getBookTitle();
        int int46 = bookRequest24.compareTo(bookRequest40);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        int int13 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str16 = bookRequest15.getBookTitle();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest15);
        int int20 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bookRequest3.compareTo(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", 0);
        int int13 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.String str15 = bookRequest3.getRequester();
        java.lang.String str16 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 100);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) '#');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) ' ');
        int int19 = bookRequest12.compareTo(bookRequest18);
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.String str21 = bookRequest12.getRequester();
        int int22 = bookRequest12.getPriority();
        int int23 = bookRequest12.getPriority();
        int int24 = bookRequest12.getPriority();
        int int25 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str26 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        java.lang.Class<?> wildcardClass16 = bookRequest8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        int int22 = bookRequest9.getPriority();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        java.lang.String str25 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass26 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        java.lang.String str16 = bookRequest8.getRequester();
        java.lang.String str17 = bookRequest8.getBookTitle();
        int int18 = bookRequest8.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        int int22 = bookRequest19.getPriority();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) '#');
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 10);
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest13.compareTo(bookRequest17);
        int int20 = bookRequest7.compareTo(bookRequest13);
        int int21 = bookRequest3.compareTo(bookRequest13);
        int int22 = bookRequest13.getPriority();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        int int29 = bookRequest16.getPriority();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int19 = bookRequest14.compareTo(bookRequest18);
        java.lang.String str20 = bookRequest14.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest14);
        java.lang.Class<?> wildcardClass22 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (-1));
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        int int12 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        java.lang.Class<?> wildcardClass34 = bookRequest3.getClass();
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
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        java.lang.String str27 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        int int16 = bookRequest3.getPriority();
        int int17 = bookRequest3.getPriority();
        int int18 = bookRequest3.getPriority();
        java.lang.String str19 = bookRequest3.getBookTitle();
        int int20 = bookRequest3.getPriority();
        int int21 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass22 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        int int25 = bookRequest3.getPriority();
        int int26 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        java.lang.Class<?> wildcardClass38 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        java.lang.String str26 = bookRequest13.getBookTitle();
        java.lang.Class<?> wildcardClass27 = bookRequest13.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        java.lang.String str21 = bookRequest3.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", 0);
        java.lang.String str26 = bookRequest25.getBookTitle();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getRequester();
        int int30 = bookRequest3.compareTo(bookRequest25);
        java.lang.Class<?> wildcardClass31 = bookRequest25.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.lang.String str16 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        java.lang.String str14 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        int int24 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass25 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getBookTitle();
        int int18 = bookRequest12.getPriority();
        java.lang.Class<?> wildcardClass19 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        java.lang.String str24 = bookRequest18.getBookTitle();
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
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.String str18 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest11.compareTo(bookRequest15);
        int int17 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str18 = bookRequest11.getRequester();
        java.lang.Class<?> wildcardClass19 = bookRequest11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        int int20 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 10);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        int int12 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        java.lang.Class<?> wildcardClass19 = bookRequest13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        int int18 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        java.lang.Class<?> wildcardClass20 = bookRequest15.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str21 = bookRequest20.getBookTitle();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getRequester();
        java.lang.String str24 = bookRequest20.getRequester();
        int int25 = bookRequest9.compareTo(bookRequest20);
        int int26 = bookRequest20.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        int int17 = bookRequest12.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        int int19 = bookRequest7.getPriority();
        int int20 = bookRequest7.getPriority();
        java.lang.String str21 = bookRequest7.getRequester();
        java.lang.String str22 = bookRequest7.getBookTitle();
        java.lang.String str23 = bookRequest7.getBookTitle();
        int int24 = bookRequest7.getPriority();
        int int25 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass26 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        java.lang.Class<?> wildcardClass26 = bookRequest7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getRequester();
        int int14 = bookRequest11.getPriority();
        java.lang.String str15 = bookRequest11.getRequester();
        java.lang.String str16 = bookRequest11.getBookTitle();
        int int17 = bookRequest11.getPriority();
        java.lang.String str18 = bookRequest11.getRequester();
        java.lang.String str19 = bookRequest11.getBookTitle();
        int int20 = bookRequest11.getPriority();
        int int21 = bookRequest11.getPriority();
        java.lang.String str22 = bookRequest11.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass24 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest21 = new request.BookRequest("", "", 1);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.getBookTitle();
        java.lang.String str24 = bookRequest21.getRequester();
        int int25 = bookRequest17.compareTo(bookRequest21);
        java.lang.String str26 = bookRequest17.getRequester();
        java.lang.String str27 = bookRequest17.getBookTitle();
        java.lang.String str28 = bookRequest17.getRequester();
        int int29 = bookRequest3.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass30 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        java.lang.Class<?> wildcardClass28 = bookRequest21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        java.lang.Class<?> wildcardClass18 = bookRequest9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getBookTitle();
        int int9 = bookRequest3.compareTo(bookRequest7);
        int int10 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass11 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        request.BookRequest bookRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bookRequest3.compareTo(bookRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        java.lang.Class<?> wildcardClass16 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        java.lang.Class<?> wildcardClass31 = bookRequest3.getClass();
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        java.lang.String str13 = bookRequest9.getBookTitle();
        java.lang.String str14 = bookRequest9.getBookTitle();
        java.lang.String str15 = bookRequest9.getRequester();
        int int16 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.String str18 = bookRequest3.getRequester();
        java.lang.String str19 = bookRequest3.getBookTitle();
        int int20 = bookRequest3.getPriority();
        java.lang.String str21 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getBookTitle();
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass12 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        int int36 = bookRequest23.getPriority();
        java.lang.Class<?> wildcardClass37 = bookRequest23.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        java.lang.String str36 = bookRequest23.getRequester();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest9);
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", (int) '4');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        java.lang.String str23 = bookRequest19.getRequester();
        java.lang.Class<?> wildcardClass24 = bookRequest19.getClass();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        java.lang.String str24 = bookRequest14.getBookTitle();
        int int25 = bookRequest14.getPriority();
        java.lang.String str26 = bookRequest14.getBookTitle();
        java.lang.String str27 = bookRequest14.getBookTitle();
        java.lang.Class<?> wildcardClass28 = bookRequest14.getClass();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bookRequest3.compareTo(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        int int19 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.lang.Class<?> wildcardClass25 = bookRequest17.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "hi!", 10);
        java.lang.String str19 = bookRequest18.getRequester();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest18);
        int int22 = bookRequest18.getPriority();
        java.lang.Class<?> wildcardClass23 = bookRequest18.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass12 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 100);
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest11.getPriority();
        java.lang.Class<?> wildcardClass15 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        int int19 = bookRequest16.getPriority();
        java.lang.String str20 = bookRequest16.getRequester();
        int int21 = bookRequest11.compareTo(bookRequest16);
        java.lang.String str22 = bookRequest11.getRequester();
        int int23 = bookRequest11.getPriority();
        int int24 = bookRequest11.getPriority();
        int int25 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str26 = bookRequest11.getRequester();
        java.lang.String str27 = bookRequest11.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        java.lang.String str13 = bookRequest9.getBookTitle();
        int int14 = bookRequest9.getPriority();
        java.lang.String str15 = bookRequest9.getBookTitle();
        java.lang.String str16 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) '#');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getBookTitle();
        int int24 = bookRequest20.getPriority();
        int int25 = bookRequest9.compareTo(bookRequest20);
        java.lang.String str26 = bookRequest20.getBookTitle();
        int int27 = bookRequest3.compareTo(bookRequest20);
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        java.lang.String str14 = bookRequest9.getBookTitle();
        java.lang.String str15 = bookRequest9.getBookTitle();
        int int16 = bookRequest9.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getBookTitle();
        int int23 = bookRequest20.getPriority();
        int int24 = bookRequest9.compareTo(bookRequest20);
        int int25 = bookRequest3.compareTo(bookRequest9);
        int int26 = bookRequest9.getPriority();
        java.lang.Class<?> wildcardClass27 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        java.lang.String str19 = bookRequest3.getRequester();
        int int20 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        java.lang.String str27 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass28 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest14.getPriority();
        java.lang.String str17 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "hi!", 100);
        int int22 = bookRequest14.compareTo(bookRequest21);
        int int23 = bookRequest3.compareTo(bookRequest14);
        int int24 = bookRequest14.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        java.lang.String str19 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", 10);
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getBookTitle();
        int int17 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str18 = bookRequest14.getRequester();
        int int19 = bookRequest14.getPriority();
        java.lang.Class<?> wildcardClass20 = bookRequest14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 100);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        int int28 = bookRequest3.getPriority();
        java.lang.String str29 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        java.lang.String str21 = bookRequest3.getRequester();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        java.lang.String str13 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 52);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest3.getBookTitle();
        int int13 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 10);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest8.getPriority();
        java.lang.String str13 = bookRequest8.getBookTitle();
        int int14 = bookRequest8.getPriority();
        java.lang.String str15 = bookRequest8.getBookTitle();
        int int16 = bookRequest8.getPriority();
        java.lang.String str17 = bookRequest8.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", 1);
        java.lang.String str22 = bookRequest21.getRequester();
        int int23 = bookRequest8.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest8.getBookTitle();
        int int25 = bookRequest8.getPriority();
        int int26 = bookRequest3.compareTo(bookRequest8);
        java.lang.Class<?> wildcardClass27 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        java.lang.String str30 = bookRequest28.getRequester();
        int int31 = bookRequest28.getPriority();
        int int32 = bookRequest28.getPriority();
        java.lang.String str33 = bookRequest28.getBookTitle();
        int int34 = bookRequest28.getPriority();
        java.lang.String str35 = bookRequest28.getBookTitle();
        int int36 = bookRequest28.getPriority();
        java.lang.String str37 = bookRequest28.getRequester();
        int int38 = bookRequest28.getPriority();
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) '4');
        int int43 = bookRequest28.compareTo(bookRequest42);
        request.BookRequest bookRequest47 = new request.BookRequest("", "hi!", 10);
        int int48 = bookRequest28.compareTo(bookRequest47);
        int int49 = bookRequest9.compareTo(bookRequest47);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getRequester();
        java.lang.String str14 = bookRequest7.getRequester();
        java.lang.String str15 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass16 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getRequester();
        java.lang.String str14 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass15 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        int int27 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 32);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getBookTitle();
        int int14 = bookRequest10.getPriority();
        int int15 = bookRequest10.getPriority();
        java.lang.String str16 = bookRequest10.getRequester();
        int int17 = bookRequest10.getPriority();
        java.lang.String str18 = bookRequest10.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest10);
        int int20 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getRequester();
        java.lang.String str15 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass16 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) '4');
        int int15 = bookRequest3.compareTo(bookRequest14);
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        java.lang.String str27 = bookRequest23.getRequester();
        java.lang.String str28 = bookRequest23.getBookTitle();
        int int29 = bookRequest23.getPriority();
        java.lang.String str30 = bookRequest23.getBookTitle();
        int int31 = bookRequest19.compareTo(bookRequest23);
        int int32 = bookRequest14.compareTo(bookRequest23);
        java.lang.Class<?> wildcardClass33 = bookRequest14.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        java.lang.String str35 = bookRequest3.getRequester();
        request.BookRequest bookRequest36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = bookRequest3.compareTo(bookRequest36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.lang.String str16 = bookRequest9.getRequester();
        java.lang.String str17 = bookRequest9.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str22 = bookRequest21.getBookTitle();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        int int25 = bookRequest9.compareTo(bookRequest21);
        request.BookRequest bookRequest26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = bookRequest21.compareTo(bookRequest26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass10 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str9 = bookRequest8.getBookTitle();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str17 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str13 = bookRequest12.getRequester();
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getRequester();
        int int17 = bookRequest12.getPriority();
        java.lang.String str18 = bookRequest12.getBookTitle();
        int int19 = bookRequest12.getPriority();
        int int20 = bookRequest12.getPriority();
        int int21 = bookRequest8.compareTo(bookRequest12);
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (byte) 10);
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest12.compareTo(bookRequest25);
        java.lang.String str28 = bookRequest25.getRequester();
        int int29 = bookRequest25.getPriority();
        java.lang.String str30 = bookRequest25.getBookTitle();
        int int31 = bookRequest3.compareTo(bookRequest25);
        java.lang.String str32 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass33 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) -1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        java.lang.String str19 = bookRequest16.getRequester();
        java.lang.String str20 = bookRequest16.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        int int19 = bookRequest15.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) -1);
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest15.compareTo(bookRequest23);
        java.lang.Class<?> wildcardClass26 = bookRequest15.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        java.lang.String str21 = bookRequest12.getRequester();
        java.lang.String str22 = bookRequest12.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        java.lang.String str24 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass25 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 97);
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) ' ');
        int int17 = bookRequest11.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        int int19 = bookRequest3.compareTo(bookRequest16);
        int int20 = bookRequest16.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", (int) '#');
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (short) 10);
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest24.compareTo(bookRequest28);
        java.lang.String str31 = bookRequest28.getBookTitle();
        int int32 = bookRequest16.compareTo(bookRequest28);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        int int19 = bookRequest16.getPriority();
        java.lang.String str20 = bookRequest16.getRequester();
        int int21 = bookRequest11.compareTo(bookRequest16);
        java.lang.String str22 = bookRequest11.getRequester();
        int int23 = bookRequest11.getPriority();
        int int24 = bookRequest11.getPriority();
        int int25 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str26 = bookRequest11.getRequester();
        java.lang.Class<?> wildcardClass27 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookRequest3.compareTo(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        java.lang.String str29 = bookRequest7.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        java.lang.Class<?> wildcardClass27 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        int int19 = bookRequest3.getPriority();
        java.lang.String str20 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        java.lang.String str24 = bookRequest3.getBookTitle();
        java.lang.String str25 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass26 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest19 = new request.BookRequest("", "", 1);
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getBookTitle();
        java.lang.String str22 = bookRequest19.getRequester();
        int int23 = bookRequest15.compareTo(bookRequest19);
        int int24 = bookRequest19.getPriority();
        int int25 = bookRequest3.compareTo(bookRequest19);
        int int26 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass27 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getRequester();
        int int13 = bookRequest10.getPriority();
        int int14 = bookRequest10.getPriority();
        int int15 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str16 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) '#');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) ' ');
        int int33 = bookRequest26.compareTo(bookRequest32);
        java.lang.String str34 = bookRequest26.getRequester();
        int int35 = bookRequest20.compareTo(bookRequest26);
        int int36 = bookRequest20.getPriority();
        java.lang.String str37 = bookRequest20.getRequester();
        int int38 = bookRequest20.getPriority();
        int int39 = bookRequest10.compareTo(bookRequest20);
        java.lang.String str40 = bookRequest10.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) ' ');
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        java.lang.Class<?> wildcardClass23 = bookRequest18.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        java.lang.String str20 = bookRequest12.getBookTitle();
        int int21 = bookRequest12.getPriority();
        java.lang.String str22 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass23 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bookRequest3.compareTo(bookRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        java.lang.String str20 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest12.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        java.lang.String str21 = bookRequest14.getBookTitle();
        java.lang.Class<?> wildcardClass22 = bookRequest14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str18 = bookRequest17.getBookTitle();
        java.lang.String str19 = bookRequest17.getBookTitle();
        int int20 = bookRequest17.getPriority();
        java.lang.String str21 = bookRequest17.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", 0);
        java.lang.String str26 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        java.lang.String str34 = bookRequest30.getBookTitle();
        int int35 = bookRequest25.compareTo(bookRequest30);
        java.lang.String str36 = bookRequest25.getRequester();
        java.lang.String str37 = bookRequest25.getRequester();
        int int38 = bookRequest17.compareTo(bookRequest25);
        int int39 = bookRequest3.compareTo(bookRequest25);
        java.lang.Class<?> wildcardClass40 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getBookTitle();
        int int12 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (byte) 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        java.lang.Class<?> wildcardClass17 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        int int13 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest3.getBookTitle();
        int int15 = bookRequest3.getPriority();
        int int16 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        java.lang.String str20 = bookRequest12.getBookTitle();
        int int21 = bookRequest12.getPriority();
        java.lang.String str22 = bookRequest12.getBookTitle();
        java.lang.String str23 = bookRequest12.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        java.lang.String str20 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        int int22 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) '4');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getBookTitle();
        java.lang.String str12 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", 0);
        java.lang.String str17 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getBookTitle();
        int int26 = bookRequest16.compareTo(bookRequest21);
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (byte) 10);
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest16.compareTo(bookRequest30);
        int int33 = bookRequest9.compareTo(bookRequest16);
        java.lang.String str34 = bookRequest9.getRequester();
        int int35 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass36 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (byte) 0);
        java.lang.String str4 = bookRequest3.getRequester();
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
        int int22 = bookRequest3.compareTo(bookRequest17);
        java.lang.String str23 = bookRequest17.getRequester();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest9);
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        int int20 = bookRequest11.getPriority();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str14 = bookRequest13.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getRequester();
        int int23 = bookRequest13.compareTo(bookRequest18);
        java.lang.String str24 = bookRequest18.getBookTitle();
        int int25 = bookRequest3.compareTo(bookRequest18);
        int int26 = bookRequest18.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str17 = bookRequest16.getRequester();
        java.lang.String str18 = bookRequest16.getBookTitle();
        int int19 = bookRequest12.compareTo(bookRequest16);
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.String str21 = bookRequest12.getBookTitle();
        java.lang.String str22 = bookRequest12.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str24 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass25 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        java.lang.String str17 = bookRequest3.getBookTitle();
        java.lang.String str18 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        int int16 = bookRequest3.getPriority();
        java.lang.String str17 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", 35);
        int int12 = bookRequest3.compareTo(bookRequest11);
        int int13 = bookRequest11.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str18 = bookRequest17.getBookTitle();
        java.lang.String str19 = bookRequest17.getRequester();
        int int20 = bookRequest11.compareTo(bookRequest17);
        java.lang.Class<?> wildcardClass21 = bookRequest11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        int int35 = bookRequest21.getPriority();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) (byte) 0);
        java.lang.String str22 = bookRequest21.getRequester();
        int int23 = bookRequest11.compareTo(bookRequest21);
        java.lang.Class<?> wildcardClass24 = bookRequest11.getClass();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        java.lang.String str30 = bookRequest23.getBookTitle();
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
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 32);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", 97);
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest9.compareTo(bookRequest13);
        int int17 = bookRequest13.getPriority();
        java.lang.String str18 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "hi!", (int) (byte) 1);
        int int23 = bookRequest13.compareTo(bookRequest22);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str28 = bookRequest27.getBookTitle();
        int int29 = bookRequest13.compareTo(bookRequest27);
        int int30 = bookRequest3.compareTo(bookRequest27);
        java.lang.Class<?> wildcardClass31 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        java.lang.String str22 = bookRequest9.getRequester();
        java.lang.String str23 = bookRequest9.getRequester();
        java.lang.Class<?> wildcardClass24 = bookRequest9.getClass();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (byte) 10);
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str15 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getBookTitle();
        int int22 = bookRequest11.compareTo(bookRequest19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        int int26 = bookRequest7.getPriority();
        int int27 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass28 = bookRequest7.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        java.lang.String str17 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bookRequest3.compareTo(bookRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        java.lang.Class<?> wildcardClass27 = bookRequest12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass6 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        int int22 = bookRequest16.getPriority();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 10);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        int int17 = bookRequest12.getPriority();
        int int18 = bookRequest12.getPriority();
        int int19 = bookRequest12.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getRequester();
        int int17 = bookRequest3.compareTo(bookRequest12);
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        java.lang.String str21 = bookRequest17.getBookTitle();
        java.lang.String str22 = bookRequest17.getRequester();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest17.getPriority();
        int int23 = bookRequest17.getPriority();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int28 = bookRequest17.compareTo(bookRequest27);
        java.lang.String str29 = bookRequest27.getRequester();
        java.lang.String str30 = bookRequest27.getRequester();
        java.lang.String str31 = bookRequest27.getRequester();
        request.BookRequest bookRequest35 = new request.BookRequest("", "hi!", (int) '4');
        int int36 = bookRequest35.getPriority();
        int int37 = bookRequest27.compareTo(bookRequest35);
        java.lang.String str38 = bookRequest35.getBookTitle();
        int int39 = bookRequest35.getPriority();
        int int40 = bookRequest3.compareTo(bookRequest35);
        request.BookRequest bookRequest41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = bookRequest35.compareTo(bookRequest41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.String str20 = bookRequest3.getRequester();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 32);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass12 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        java.lang.Class<?> wildcardClass35 = bookRequest27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 35);
        int int4 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        java.lang.String str23 = bookRequest7.getRequester();
        int int24 = bookRequest7.getPriority();
        int int25 = bookRequest7.getPriority();
        request.BookRequest bookRequest26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = bookRequest7.compareTo(bookRequest26);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getBookTitle();
        int int26 = bookRequest22.getPriority();
        int int27 = bookRequest15.compareTo(bookRequest22);
        java.lang.String str28 = bookRequest22.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) '#');
        int int33 = bookRequest32.getPriority();
        java.lang.String str34 = bookRequest32.getBookTitle();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) ' ');
        int int39 = bookRequest32.compareTo(bookRequest38);
        java.lang.String str40 = bookRequest38.getBookTitle();
        java.lang.String str41 = bookRequest38.getBookTitle();
        int int42 = bookRequest22.compareTo(bookRequest38);
        java.lang.String str43 = bookRequest38.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 0);
        int int18 = bookRequest13.compareTo(bookRequest17);
        java.lang.String str19 = bookRequest13.getRequester();
        int int20 = bookRequest3.compareTo(bookRequest13);
        java.lang.Class<?> wildcardClass21 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        request.BookRequest bookRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bookRequest12.compareTo(bookRequest17);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        int int16 = bookRequest7.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", 35);
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str29 = bookRequest28.getBookTitle();
        java.lang.String str30 = bookRequest28.getRequester();
        int int31 = bookRequest28.getPriority();
        java.lang.String str32 = bookRequest28.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str37 = bookRequest36.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest45 = new request.BookRequest("", "", (int) (short) 0);
        int int46 = bookRequest41.compareTo(bookRequest45);
        int int47 = bookRequest36.compareTo(bookRequest45);
        int int48 = bookRequest36.getPriority();
        int int49 = bookRequest36.getPriority();
        java.lang.String str50 = bookRequest36.getRequester();
        int int51 = bookRequest28.compareTo(bookRequest36);
        java.lang.String str52 = bookRequest28.getRequester();
        int int53 = bookRequest20.compareTo(bookRequest28);
        int int54 = bookRequest20.getPriority();
        int int55 = bookRequest7.compareTo(bookRequest20);
        java.lang.Class<?> wildcardClass56 = bookRequest20.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "hi!", (int) '#');
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getBookTitle();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        int int15 = bookRequest3.compareTo(bookRequest7);
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        java.lang.String str20 = bookRequest12.getBookTitle();
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
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        int int16 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 100);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        int int18 = bookRequest15.getPriority();
        int int19 = bookRequest15.getPriority();
        java.lang.String str20 = bookRequest15.getBookTitle();
        int int21 = bookRequest15.getPriority();
        java.lang.String str22 = bookRequest15.getBookTitle();
        int int23 = bookRequest15.getPriority();
        java.lang.String str24 = bookRequest15.getRequester();
        int int25 = bookRequest15.getPriority();
        int int26 = bookRequest11.compareTo(bookRequest15);
        java.lang.String str27 = bookRequest11.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str29 = bookRequest11.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        int int32 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.lang.String str37 = bookRequest26.getRequester();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        int int23 = bookRequest3.getPriority();
        java.lang.String str24 = bookRequest3.getRequester();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        java.lang.Class<?> wildcardClass39 = bookRequest7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        java.lang.String str34 = bookRequest29.getRequester();
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
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest14.getPriority();
        java.lang.String str17 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "hi!", 100);
        int int22 = bookRequest14.compareTo(bookRequest21);
        int int23 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str24 = bookRequest14.getBookTitle();
        java.lang.Class<?> wildcardClass25 = bookRequest14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 0);
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest13);
        int int17 = bookRequest3.getPriority();
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", 52);
        int int13 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str14 = bookRequest12.getBookTitle();
        java.lang.String str15 = bookRequest12.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        int int21 = bookRequest15.getPriority();
        request.BookRequest bookRequest22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = bookRequest15.compareTo(bookRequest22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"priority\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        java.lang.String str17 = bookRequest3.getBookTitle();
        java.lang.String str18 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        java.lang.String str16 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getBookTitle();
        int int23 = bookRequest20.getPriority();
        java.lang.String str24 = bookRequest20.getBookTitle();
        java.lang.String str25 = bookRequest20.getRequester();
        int int26 = bookRequest13.compareTo(bookRequest20);
        java.lang.String str27 = bookRequest20.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        java.lang.String str28 = bookRequest3.getBookTitle();
        java.lang.String str29 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass30 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", 1);
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getBookTitle();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getRequester();
        int int25 = bookRequest8.compareTo(bookRequest20);
        java.lang.String str26 = bookRequest8.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        java.lang.String str23 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", 10);
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getBookTitle();
        int int17 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str18 = bookRequest14.getBookTitle();
        java.lang.String str19 = bookRequest14.getBookTitle();
        int int20 = bookRequest14.getPriority();
        java.lang.String str21 = bookRequest14.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str15 = bookRequest11.getBookTitle();
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
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest8.getPriority();
        java.lang.String str14 = bookRequest8.getBookTitle();
        java.lang.String str15 = bookRequest8.getBookTitle();
        int int16 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str17 = bookRequest8.getBookTitle();
        java.lang.String str18 = bookRequest8.getBookTitle();
        java.lang.Class<?> wildcardClass19 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        java.lang.Class<?> wildcardClass36 = bookRequest21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        java.lang.String str24 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass25 = bookRequest7.getClass();
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
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getBookTitle();
        int int13 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest13);
        java.lang.Class<?> wildcardClass16 = bookRequest13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        int int22 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest8.getRequester();
        java.lang.String str15 = bookRequest8.getRequester();
        java.lang.Class<?> wildcardClass16 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        java.lang.Class<?> wildcardClass14 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass10 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getRequester();
        java.lang.String str12 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int17 = bookRequest9.compareTo(bookRequest16);
        int int18 = bookRequest9.getPriority();
        java.lang.String str19 = bookRequest9.getRequester();
        int int20 = bookRequest9.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str22 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass23 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        int int20 = bookRequest3.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        int int27 = bookRequest24.getPriority();
        int int28 = bookRequest24.getPriority();
        java.lang.String str29 = bookRequest24.getBookTitle();
        int int30 = bookRequest24.getPriority();
        java.lang.String str31 = bookRequest24.getBookTitle();
        int int32 = bookRequest3.compareTo(bookRequest24);
        java.lang.String str33 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass34 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        java.lang.Class<?> wildcardClass45 = bookRequest7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        int int26 = bookRequest20.getPriority();
        java.lang.Class<?> wildcardClass27 = bookRequest20.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        java.lang.String str16 = bookRequest11.getRequester();
        java.lang.Class<?> wildcardClass17 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        java.lang.String str38 = bookRequest28.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) (short) 100);
        int int17 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass20 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass10 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        java.lang.Class<?> wildcardClass16 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        java.lang.String str19 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int13 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str14 = bookRequest12.getRequester();
        java.lang.String str15 = bookRequest12.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        int int23 = bookRequest18.getPriority();
        int int24 = bookRequest18.getPriority();
        int int25 = bookRequest18.getPriority();
        int int26 = bookRequest18.getPriority();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        java.lang.Class<?> wildcardClass20 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        java.lang.String str27 = bookRequest3.getRequester();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        int int20 = bookRequest3.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        int int27 = bookRequest24.getPriority();
        int int28 = bookRequest24.getPriority();
        java.lang.String str29 = bookRequest24.getBookTitle();
        int int30 = bookRequest24.getPriority();
        java.lang.String str31 = bookRequest24.getBookTitle();
        int int32 = bookRequest3.compareTo(bookRequest24);
        java.lang.Class<?> wildcardClass33 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) (short) 100);
        int int17 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass19 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getBookTitle();
        int int12 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass13 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        java.lang.Class<?> wildcardClass41 = bookRequest34.getClass();
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
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        int int17 = bookRequest13.getPriority();
        int int18 = bookRequest13.getPriority();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) ' ');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest18.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 1);
        java.lang.String str25 = bookRequest24.getBookTitle();
        int int26 = bookRequest18.compareTo(bookRequest24);
        java.lang.String str27 = bookRequest24.getRequester();
        int int28 = bookRequest12.compareTo(bookRequest24);
        java.lang.String str29 = bookRequest24.getRequester();
        int int30 = bookRequest3.compareTo(bookRequest24);
        java.lang.String str31 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass32 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) '4');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getBookTitle();
        java.lang.String str12 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", 0);
        java.lang.String str17 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getBookTitle();
        int int26 = bookRequest16.compareTo(bookRequest21);
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (byte) 10);
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest16.compareTo(bookRequest30);
        int int33 = bookRequest9.compareTo(bookRequest16);
        java.lang.String str34 = bookRequest9.getRequester();
        int int35 = bookRequest3.compareTo(bookRequest9);
        java.lang.Class<?> wildcardClass36 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        int int21 = bookRequest17.getPriority();
        java.lang.String str22 = bookRequest17.getBookTitle();
        int int23 = bookRequest3.compareTo(bookRequest17);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        int int18 = bookRequest3.getPriority();
        int int19 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.lang.String str36 = bookRequest3.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) '4');
        int int15 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        int int34 = bookRequest17.getPriority();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        java.lang.Class<?> wildcardClass14 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest9.getBookTitle();
        java.lang.Class<?> wildcardClass12 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        java.lang.Class<?> wildcardClass18 = bookRequest3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        request.BookRequest bookRequest33 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest37 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int38 = bookRequest33.compareTo(bookRequest37);
        int int39 = bookRequest33.getPriority();
        java.lang.String str40 = bookRequest33.getBookTitle();
        int int41 = bookRequest23.compareTo(bookRequest33);
        java.lang.String str42 = bookRequest23.getBookTitle();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (byte) 0);
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        java.lang.Class<?> wildcardClass15 = bookRequest11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getBookTitle();
        int int24 = bookRequest20.getPriority();
        int int25 = bookRequest20.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", 52);
        int int30 = bookRequest20.compareTo(bookRequest29);
        int int31 = bookRequest29.getPriority();
        int int32 = bookRequest16.compareTo(bookRequest29);
        java.lang.String str33 = bookRequest16.getBookTitle();
        int int34 = bookRequest16.getPriority();
        int int35 = bookRequest16.getPriority();
        java.lang.String str36 = bookRequest16.getRequester();
        int int37 = bookRequest3.compareTo(bookRequest16);
        java.lang.Class<?> wildcardClass38 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest13);
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        int int27 = bookRequest24.getPriority();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        int int15 = bookRequest3.getPriority();
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        int int16 = bookRequest3.getPriority();
        int int17 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", 1);
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getBookTitle();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str15 = bookRequest10.getRequester();
        int int16 = bookRequest10.getPriority();
        java.lang.Class<?> wildcardClass17 = bookRequest10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        java.lang.String str21 = bookRequest3.getRequester();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 100);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass5 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getRequester();
        java.lang.String str14 = bookRequest7.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest17.compareTo(bookRequest21);
        int int23 = bookRequest21.getPriority();
        int int24 = bookRequest21.getPriority();
        int int25 = bookRequest21.getPriority();
        int int26 = bookRequest7.compareTo(bookRequest21);
        java.lang.Class<?> wildcardClass27 = bookRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", 10);
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getBookTitle();
        int int17 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str18 = bookRequest14.getBookTitle();
        java.lang.String str19 = bookRequest14.getBookTitle();
        java.lang.String str20 = bookRequest14.getBookTitle();
        int int21 = bookRequest14.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (byte) 100);
        int int15 = bookRequest14.getPriority();
        int int16 = bookRequest14.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        java.lang.String str27 = bookRequest24.getRequester();
        java.lang.String str28 = bookRequest24.getRequester();
        int int29 = bookRequest20.compareTo(bookRequest24);
        int int30 = bookRequest20.getPriority();
        int int31 = bookRequest14.compareTo(bookRequest20);
        java.lang.String str32 = bookRequest20.getBookTitle();
        java.lang.String str33 = bookRequest20.getRequester();
        int int34 = bookRequest20.getPriority();
        int int35 = bookRequest20.getPriority();
        int int36 = bookRequest3.compareTo(bookRequest20);
        java.lang.String str37 = bookRequest3.getRequester();
        java.lang.String str38 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass11 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        int int21 = bookRequest7.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getBookTitle();
        int int28 = bookRequest7.compareTo(bookRequest25);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass15 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        java.lang.String str16 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        java.lang.String str20 = bookRequest7.getBookTitle();
        java.lang.String str21 = bookRequest7.getRequester();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        int int16 = bookRequest3.getPriority();
        int int17 = bookRequest3.getPriority();
        int int18 = bookRequest3.getPriority();
        java.lang.String str19 = bookRequest3.getBookTitle();
        int int20 = bookRequest3.getPriority();
        java.lang.String str21 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        int int25 = bookRequest3.getPriority();
        java.lang.String str26 = bookRequest3.getRequester();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        int int26 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass27 = bookRequest7.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str15 = bookRequest3.getBookTitle();
        java.lang.String str16 = bookRequest3.getBookTitle();
        java.lang.String str17 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        int int19 = bookRequest15.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) -1);
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest15.compareTo(bookRequest23);
        java.lang.Class<?> wildcardClass26 = bookRequest23.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        java.lang.String str28 = bookRequest7.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        java.lang.String str45 = bookRequest3.getRequester();
        java.lang.String str46 = bookRequest3.getRequester();
        java.lang.String str47 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass48 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        java.lang.String str24 = bookRequest7.getRequester();
        int int25 = bookRequest7.getPriority();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str17 = bookRequest16.getRequester();
        java.lang.String str18 = bookRequest16.getBookTitle();
        int int19 = bookRequest12.compareTo(bookRequest16);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        java.lang.String str27 = bookRequest23.getBookTitle();
        java.lang.String str28 = bookRequest23.getBookTitle();
        int int29 = bookRequest12.compareTo(bookRequest23);
        java.lang.String str30 = bookRequest12.getRequester();
        int int31 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest9.getPriority();
        java.lang.String str15 = bookRequest9.getBookTitle();
        int int16 = bookRequest9.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        java.lang.String str20 = bookRequest3.getBookTitle();
        int int21 = bookRequest3.getPriority();
        int int22 = bookRequest3.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int27 = bookRequest26.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 100);
        java.lang.String str32 = bookRequest31.getBookTitle();
        int int33 = bookRequest26.compareTo(bookRequest31);
        int int34 = bookRequest3.compareTo(bookRequest31);
        java.lang.Class<?> wildcardClass35 = bookRequest31.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.Class<?> wildcardClass12 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        int int19 = bookRequest12.getPriority();
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.String str21 = bookRequest12.getBookTitle();
        java.lang.Class<?> wildcardClass22 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 32);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str9 = bookRequest8.getBookTitle();
        java.lang.String str10 = bookRequest8.getBookTitle();
        java.lang.String str11 = bookRequest8.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        int int16 = bookRequest11.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        java.lang.Class<?> wildcardClass16 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 100);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        int int18 = bookRequest15.getPriority();
        int int19 = bookRequest15.getPriority();
        java.lang.String str20 = bookRequest15.getBookTitle();
        int int21 = bookRequest15.getPriority();
        java.lang.String str22 = bookRequest15.getBookTitle();
        int int23 = bookRequest15.getPriority();
        java.lang.String str24 = bookRequest15.getRequester();
        int int25 = bookRequest15.getPriority();
        int int26 = bookRequest11.compareTo(bookRequest15);
        java.lang.String str27 = bookRequest11.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str29 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass30 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        java.lang.Class<?> wildcardClass30 = bookRequest12.getClass();
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
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.Class<?> wildcardClass12 = bookRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", 10);
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getBookTitle();
        int int17 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str18 = bookRequest14.getBookTitle();
        java.lang.String str19 = bookRequest14.getBookTitle();
        int int20 = bookRequest14.getPriority();
        java.lang.String str21 = bookRequest14.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getRequester();
        int int15 = bookRequest7.getPriority();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        int int35 = bookRequest23.getPriority();
        int int36 = bookRequest23.getPriority();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getRequester();
        int int25 = bookRequest3.compareTo(bookRequest20);
        java.lang.String str26 = bookRequest3.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str9 = bookRequest8.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getRequester();
        java.lang.String str22 = bookRequest17.getBookTitle();
        int int23 = bookRequest17.getPriority();
        java.lang.String str24 = bookRequest17.getBookTitle();
        int int25 = bookRequest13.compareTo(bookRequest17);
        java.lang.String str26 = bookRequest13.getBookTitle();
        int int27 = bookRequest8.compareTo(bookRequest13);
        java.lang.String str28 = bookRequest13.getRequester();
        java.lang.String str29 = bookRequest13.getBookTitle();
        int int30 = bookRequest13.getPriority();
        int int31 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        java.lang.String str27 = bookRequest17.getBookTitle();
        java.lang.Class<?> wildcardClass28 = bookRequest17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        java.lang.String str23 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass24 = bookRequest3.getClass();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        java.lang.String str17 = bookRequest10.getRequester();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.lang.String str23 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass24 = bookRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        java.lang.String str24 = bookRequest13.getBookTitle();
        java.lang.Class<?> wildcardClass25 = bookRequest13.getClass();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        java.lang.String str31 = bookRequest7.getBookTitle();
        java.lang.String str32 = bookRequest7.getRequester();
        int int33 = bookRequest7.getPriority();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        int int35 = bookRequest7.getPriority();
        int int36 = bookRequest7.getPriority();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 10);
        int int15 = bookRequest3.compareTo(bookRequest14);
        java.lang.Class<?> wildcardClass16 = bookRequest14.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        int int22 = bookRequest12.getPriority();
        java.lang.String str23 = bookRequest12.getRequester();
        java.lang.Class<?> wildcardClass24 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        java.lang.Class<?> wildcardClass26 = bookRequest15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest9.getRequester();
        java.lang.String str13 = bookRequest9.getBookTitle();
        java.lang.String str14 = bookRequest9.getBookTitle();
        int int15 = bookRequest9.getPriority();
        java.lang.Class<?> wildcardClass16 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.Class<?> wildcardClass7 = bookRequest3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest9);
        int int13 = bookRequest3.getPriority();
        int int14 = bookRequest3.getPriority();
        java.lang.String str15 = bookRequest3.getRequester();
        int int16 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        java.lang.String str20 = bookRequest12.getRequester();
        java.lang.String str21 = bookRequest12.getBookTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.String str15 = bookRequest3.getRequester();
        int int16 = bookRequest3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str17 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str22 = bookRequest21.getRequester();
        java.lang.String str23 = bookRequest21.getBookTitle();
        int int24 = bookRequest21.getPriority();
        int int25 = bookRequest16.compareTo(bookRequest21);
        java.lang.String str26 = bookRequest16.getRequester();
        java.lang.String str27 = bookRequest16.getRequester();
        java.lang.String str28 = bookRequest16.getBookTitle();
        int int29 = bookRequest16.getPriority();
        int int30 = bookRequest3.compareTo(bookRequest16);
        java.lang.String str31 = bookRequest16.getRequester();
        int int32 = bookRequest16.getPriority();
        java.lang.Class<?> wildcardClass33 = bookRequest16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        java.lang.String str39 = bookRequest7.getRequester();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        int int21 = bookRequest9.getPriority();
        java.lang.String str22 = bookRequest9.getBookTitle();
        java.lang.String str23 = bookRequest9.getBookTitle();
        java.lang.Class<?> wildcardClass24 = bookRequest9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 100);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        int int20 = bookRequest13.getPriority();
        java.lang.String str21 = bookRequest13.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        java.lang.String str24 = bookRequest7.getRequester();
        int int25 = bookRequest7.getPriority();
        java.lang.Class<?> wildcardClass26 = bookRequest7.getClass();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        java.lang.String str22 = bookRequest15.getBookTitle();
        java.lang.String str23 = bookRequest15.getRequester();
        java.lang.String str24 = bookRequest15.getBookTitle();
        java.lang.String str25 = bookRequest15.getRequester();
        java.lang.String str26 = bookRequest15.getBookTitle();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        int int18 = bookRequest13.getPriority();
        java.lang.String str19 = bookRequest13.getRequester();
        java.lang.String str20 = bookRequest13.getRequester();
        java.lang.String str21 = bookRequest13.getBookTitle();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.String str18 = bookRequest3.getRequester();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }
}

