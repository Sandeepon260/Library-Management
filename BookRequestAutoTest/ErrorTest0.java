package BookRequestAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest9", (bookRequest3.compareTo(bookRequest9) == 0) == bookRequest3.equals(bookRequest9));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest9", (bookRequest3.compareTo(bookRequest9) == 0) == bookRequest3.equals(bookRequest9));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        java.lang.String str15 = bookRequest12.getRequester();
        int int16 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getBookTitle();
        java.lang.String str14 = bookRequest10.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getRequester();
        int int12 = bookRequest8.getPriority();
        java.lang.String str13 = bookRequest8.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest8", (bookRequest3.compareTo(bookRequest8) == 0) == bookRequest3.equals(bookRequest8));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str11 = bookRequest10.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        int int17 = bookRequest12.compareTo(bookRequest16);
        java.lang.String str18 = bookRequest16.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str13 = bookRequest12.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (short) 0);
        int int22 = bookRequest17.compareTo(bookRequest21);
        int int23 = bookRequest12.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest21.getBookTitle();
        int int25 = bookRequest21.getPriority();
        int int26 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        java.lang.String str15 = bookRequest12.getRequester();
        java.lang.String str16 = bookRequest12.getBookTitle();
        int int17 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getRequester();
        int int17 = bookRequest7.compareTo(bookRequest12);
        int int18 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        int int19 = bookRequest12.compareTo(bookRequest16);
        int int20 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        int int19 = bookRequest12.compareTo(bookRequest16);
        int int20 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        int int21 = bookRequest16.compareTo(bookRequest20);
        int int22 = bookRequest11.compareTo(bookRequest20);
        java.lang.String str23 = bookRequest20.getBookTitle();
        int int24 = bookRequest20.getPriority();
        int int25 = bookRequest20.getPriority();
        int int26 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        int int23 = bookRequest19.getPriority();
        int int24 = bookRequest19.getPriority();
        java.lang.String str25 = bookRequest19.getRequester();
        int int26 = bookRequest12.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest19", (bookRequest8.compareTo(bookRequest19) == 0) == bookRequest8.equals(bookRequest19));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str13 = bookRequest12.getRequester();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        int int17 = bookRequest12.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        java.lang.String str19 = bookRequest16.getBookTitle();
        int int20 = bookRequest16.getPriority();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        int int29 = bookRequest12.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str13 = bookRequest12.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (short) 0);
        int int22 = bookRequest17.compareTo(bookRequest21);
        int int23 = bookRequest12.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        int int17 = bookRequest12.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        java.lang.String str19 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        int int26 = bookRequest16.compareTo(bookRequest23);
        int int27 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        int int21 = bookRequest16.compareTo(bookRequest20);
        int int22 = bookRequest11.compareTo(bookRequest20);
        java.lang.String str23 = bookRequest20.getBookTitle();
        int int24 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str13 = bookRequest12.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getBookTitle();
        int int23 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        int int16 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str23 = bookRequest22.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (short) 0);
        int int32 = bookRequest27.compareTo(bookRequest31);
        int int33 = bookRequest22.compareTo(bookRequest31);
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest31.getPriority();
        int int36 = bookRequest18.compareTo(bookRequest31);
        int int37 = bookRequest13.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str20 = bookRequest19.getRequester();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        java.lang.String str23 = bookRequest19.getRequester();
        int int24 = bookRequest19.getPriority();
        int int25 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getRequester();
        int int15 = bookRequest11.getPriority();
        java.lang.String str16 = bookRequest11.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) '#');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) ' ');
        int int27 = bookRequest20.compareTo(bookRequest26);
        int int28 = bookRequest11.compareTo(bookRequest20);
        java.lang.String str29 = bookRequest11.getRequester();
        int int30 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
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
        int int19 = bookRequest3.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest23.getPriority();
        java.lang.String str29 = bookRequest23.getRequester();
        java.lang.String str30 = bookRequest23.getRequester();
        int int31 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest23", (bookRequest10.compareTo(bookRequest23) == 0) == bookRequest10.equals(bookRequest23));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getBookTitle();
        int int17 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) '#');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) ' ');
        int int14 = bookRequest7.compareTo(bookRequest13);
        java.lang.String str15 = bookRequest7.getBookTitle();
        int int16 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
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
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest14.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest24", (bookRequest7.compareTo(bookRequest24) == 0) == bookRequest7.equals(bookRequest24));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getBookTitle();
        java.lang.String str15 = bookRequest11.getRequester();
        java.lang.String str16 = bookRequest11.getBookTitle();
        int int17 = bookRequest11.getPriority();
        java.lang.String str18 = bookRequest11.getBookTitle();
        int int19 = bookRequest7.compareTo(bookRequest11);
        java.lang.String str20 = bookRequest7.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str14 = bookRequest13.getRequester();
        int int15 = bookRequest7.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest13", (bookRequest7.compareTo(bookRequest13) == 0) == bookRequest7.equals(bookRequest13));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getRequester();
        java.lang.String str25 = bookRequest22.getRequester();
        int int26 = bookRequest22.getPriority();
        int int27 = bookRequest9.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str11 = bookRequest10.getRequester();
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest7.compareTo(bookRequest11);
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        java.lang.String str23 = bookRequest19.getBookTitle();
        java.lang.String str24 = bookRequest19.getRequester();
        int int25 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest19", (bookRequest8.compareTo(bookRequest19) == 0) == bookRequest8.equals(bookRequest19));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getBookTitle();
        java.lang.String str15 = bookRequest11.getRequester();
        int int16 = bookRequest11.getPriority();
        int int17 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest13);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getRequester();
        int int24 = bookRequest20.getPriority();
        java.lang.String str25 = bookRequest20.getRequester();
        int int26 = bookRequest13.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest20", (bookRequest7.compareTo(bookRequest20) == 0) == bookRequest7.equals(bookRequest20));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getBookTitle();
        int int28 = bookRequest24.getPriority();
        int int29 = bookRequest24.getPriority();
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", 52);
        int int34 = bookRequest24.compareTo(bookRequest33);
        int int35 = bookRequest9.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest24", (bookRequest9.compareTo(bookRequest24) == 0) == bookRequest9.equals(bookRequest24));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str13 = bookRequest12.getRequester();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getBookTitle();
        java.lang.String str15 = bookRequest11.getBookTitle();
        int int16 = bookRequest11.getPriority();
        int int17 = bookRequest11.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int22 = bookRequest11.compareTo(bookRequest21);
        int int23 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getRequester();
        int int23 = bookRequest18.getPriority();
        java.lang.String str24 = bookRequest18.getBookTitle();
        int int25 = bookRequest18.getPriority();
        int int26 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest18", (bookRequest8.compareTo(bookRequest18) == 0) == bookRequest8.equals(bookRequest18));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str14 = bookRequest13.getRequester();
        int int15 = bookRequest13.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        int int23 = bookRequest19.getPriority();
        int int24 = bookRequest19.getPriority();
        int int25 = bookRequest13.compareTo(bookRequest19);
        int int26 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str11 = bookRequest10.getRequester();
        java.lang.String str12 = bookRequest10.getRequester();
        int int13 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", 1);
        java.lang.String str18 = bookRequest17.getBookTitle();
        int int19 = bookRequest11.compareTo(bookRequest17);
        int int20 = bookRequest7.compareTo(bookRequest17);
        int int21 = bookRequest17.getPriority();
        int int22 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest8.getPriority();
        int int13 = bookRequest8.getPriority();
        java.lang.String str14 = bookRequest8.getRequester();
        java.lang.String str15 = bookRequest8.getRequester();
        int int16 = bookRequest3.compareTo(bookRequest8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest8", (bookRequest3.compareTo(bookRequest8) == 0) == bookRequest3.equals(bookRequest8));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", 52);
        int int13 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getRequester();
        int int21 = bookRequest17.getPriority();
        java.lang.String str22 = bookRequest17.getBookTitle();
        int int23 = bookRequest12.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest10.getPriority();
        int int13 = bookRequest10.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", 1);
        java.lang.String str18 = bookRequest17.getBookTitle();
        int int19 = bookRequest10.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest17", (bookRequest10.compareTo(bookRequest17) == 0) == bookRequest10.equals(bookRequest17));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str16 = bookRequest15.getRequester();
        java.lang.String str17 = bookRequest15.getBookTitle();
        int int18 = bookRequest15.getPriority();
        java.lang.String str19 = bookRequest15.getBookTitle();
        java.lang.String str20 = bookRequest15.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest15", (bookRequest9.compareTo(bookRequest15) == 0) == bookRequest9.equals(bookRequest15));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getRequester();
        java.lang.String str27 = bookRequest24.getRequester();
        java.lang.String str28 = bookRequest24.getBookTitle();
        int int29 = bookRequest19.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest24", (bookRequest9.compareTo(bookRequest24) == 0) == bookRequest9.equals(bookRequest24));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", 97);
        int int20 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest19", (bookRequest8.compareTo(bookRequest19) == 0) == bookRequest8.equals(bookRequest19));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getRequester();
        java.lang.String str12 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int17 = bookRequest9.compareTo(bookRequest16);
        int int18 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", 0);
        int int13 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        java.lang.String str19 = bookRequest17.getRequester();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest12.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str22 = bookRequest21.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 0);
        int int31 = bookRequest26.compareTo(bookRequest30);
        int int32 = bookRequest21.compareTo(bookRequest30);
        java.lang.String str33 = bookRequest21.getBookTitle();
        int int34 = bookRequest12.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str19 = bookRequest18.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 0);
        int int28 = bookRequest23.compareTo(bookRequest27);
        int int29 = bookRequest18.compareTo(bookRequest27);
        java.lang.String str30 = bookRequest27.getBookTitle();
        int int31 = bookRequest27.getPriority();
        int int32 = bookRequest14.compareTo(bookRequest27);
        int int33 = bookRequest7.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest23", (bookRequest7.compareTo(bookRequest23) == 0) == bookRequest7.equals(bookRequest23));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 0);
        int int24 = bookRequest19.compareTo(bookRequest23);
        java.lang.String str25 = bookRequest23.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest19", (bookRequest8.compareTo(bookRequest19) == 0) == bookRequest8.equals(bookRequest19));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", 97);
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getBookTitle();
        int int15 = bookRequest8.compareTo(bookRequest12);
        int int16 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) '#');
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getRequester();
        java.lang.String str26 = bookRequest21.getRequester();
        java.lang.String str27 = bookRequest21.getBookTitle();
        int int28 = bookRequest17.compareTo(bookRequest21);
        int int29 = bookRequest8.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest21", (bookRequest8.compareTo(bookRequest21) == 0) == bookRequest8.equals(bookRequest21));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str14 = bookRequest13.getRequester();
        int int15 = bookRequest13.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        int int23 = bookRequest19.getPriority();
        int int24 = bookRequest19.getPriority();
        int int25 = bookRequest13.compareTo(bookRequest19);
        java.lang.String str26 = bookRequest13.getBookTitle();
        int int27 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str20 = bookRequest19.getRequester();
        java.lang.String str21 = bookRequest19.getBookTitle();
        int int22 = bookRequest15.compareTo(bookRequest19);
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getBookTitle();
        java.lang.String str31 = bookRequest26.getBookTitle();
        int int32 = bookRequest15.compareTo(bookRequest26);
        int int33 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getBookTitle();
        java.lang.String str17 = bookRequest12.getRequester();
        java.lang.String str18 = bookRequest12.getRequester();
        int int19 = bookRequest12.getPriority();
        int int20 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str24 = bookRequest23.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (short) 0);
        int int33 = bookRequest28.compareTo(bookRequest32);
        int int34 = bookRequest23.compareTo(bookRequest32);
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getBookTitle();
        java.lang.String str37 = bookRequest32.getBookTitle();
        java.lang.String str38 = bookRequest32.getRequester();
        int int39 = bookRequest15.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getRequester();
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
        request.BookRequest bookRequest28 = new request.BookRequest("", "", 1);
        java.lang.String str29 = bookRequest28.getRequester();
        int int30 = bookRequest15.compareTo(bookRequest28);
        java.lang.String str31 = bookRequest15.getRequester();
        int int32 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str21 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getRequester();
        int int28 = bookRequest25.getPriority();
        java.lang.String str29 = bookRequest25.getBookTitle();
        java.lang.String str30 = bookRequest25.getRequester();
        java.lang.String str31 = bookRequest25.getRequester();
        int int32 = bookRequest20.compareTo(bookRequest25);
        int int33 = bookRequest25.getPriority();
        int int34 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest25", (bookRequest8.compareTo(bookRequest25) == 0) == bookRequest8.equals(bookRequest25));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
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
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest20.getPriority();
        int int23 = bookRequest16.compareTo(bookRequest20);
        int int24 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str26 = bookRequest25.getRequester();
        java.lang.String str27 = bookRequest25.getBookTitle();
        int int28 = bookRequest25.getPriority();
        java.lang.String str29 = bookRequest25.getRequester();
        int int30 = bookRequest19.compareTo(bookRequest25);
        java.lang.String str31 = bookRequest19.getRequester();
        java.lang.String str32 = bookRequest19.getBookTitle();
        java.lang.String str33 = bookRequest19.getRequester();
        int int34 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest19", (bookRequest8.compareTo(bookRequest19) == 0) == bookRequest8.equals(bookRequest19));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
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
        java.lang.String str25 = bookRequest12.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", 1);
        java.lang.String str16 = bookRequest15.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getRequester();
        int int25 = bookRequest20.getPriority();
        int int26 = bookRequest15.compareTo(bookRequest20);
        int int27 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "hi!", 0);
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest19.getPriority();
        int int22 = bookRequest19.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", 1);
        java.lang.String str27 = bookRequest26.getBookTitle();
        java.lang.String str28 = bookRequest26.getBookTitle();
        java.lang.String str29 = bookRequest26.getRequester();
        int int30 = bookRequest19.compareTo(bookRequest26);
        int int31 = bookRequest19.getPriority();
        int int32 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        java.lang.String str18 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) '#');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) ' ');
        int int29 = bookRequest22.compareTo(bookRequest28);
        java.lang.String str30 = bookRequest22.getRequester();
        int int31 = bookRequest16.compareTo(bookRequest22);
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "hi!", 0);
        int int36 = bookRequest22.compareTo(bookRequest35);
        int int37 = bookRequest9.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        int int15 = bookRequest14.getPriority();
        int int16 = bookRequest14.getPriority();
        java.lang.String str17 = bookRequest14.getRequester();
        int int18 = bookRequest14.getPriority();
        java.lang.String str19 = bookRequest14.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) '#');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) ' ');
        int int30 = bookRequest23.compareTo(bookRequest29);
        int int31 = bookRequest14.compareTo(bookRequest23);
        int int32 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest9", (bookRequest3.compareTo(bookRequest9) == 0) == bookRequest3.equals(bookRequest9));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        int int18 = bookRequest15.getPriority();
        java.lang.String str19 = bookRequest15.getBookTitle();
        int int20 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str20 = bookRequest19.getRequester();
        java.lang.String str21 = bookRequest19.getRequester();
        java.lang.String str22 = bookRequest19.getBookTitle();
        int int23 = bookRequest19.getPriority();
        int int24 = bookRequest8.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest19", (bookRequest8.compareTo(bookRequest19) == 0) == bookRequest8.equals(bookRequest19));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        int int19 = bookRequest12.compareTo(bookRequest18);
        java.lang.String str20 = bookRequest12.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str25 = bookRequest24.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (short) 0);
        int int34 = bookRequest29.compareTo(bookRequest33);
        int int35 = bookRequest24.compareTo(bookRequest33);
        java.lang.String str36 = bookRequest33.getBookTitle();
        java.lang.String str37 = bookRequest33.getBookTitle();
        java.lang.String str38 = bookRequest33.getBookTitle();
        java.lang.String str39 = bookRequest33.getRequester();
        int int40 = bookRequest12.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) '#');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) ' ');
        int int26 = bookRequest19.compareTo(bookRequest25);
        java.lang.String str27 = bookRequest19.getRequester();
        int int28 = bookRequest13.compareTo(bookRequest19);
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "hi!", 0);
        int int33 = bookRequest19.compareTo(bookRequest32);
        int int34 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
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
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getRequester();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest31.getPriority();
        int int36 = bookRequest31.getPriority();
        int int37 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest31", (bookRequest15.compareTo(bookRequest31) == 0) == bookRequest15.equals(bookRequest31));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
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
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", 0);
        java.lang.String str32 = bookRequest31.getBookTitle();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) 'a');
        int int37 = bookRequest36.getPriority();
        int int38 = bookRequest36.getPriority();
        java.lang.String str39 = bookRequest36.getBookTitle();
        java.lang.String str40 = bookRequest36.getBookTitle();
        int int41 = bookRequest31.compareTo(bookRequest36);
        request.BookRequest bookRequest45 = new request.BookRequest("", "", (int) (byte) 10);
        int int46 = bookRequest45.getPriority();
        int int47 = bookRequest31.compareTo(bookRequest45);
        int int48 = bookRequest10.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest31", (bookRequest10.compareTo(bookRequest31) == 0) == bookRequest10.equals(bookRequest31));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest13);
        int int17 = bookRequest3.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getRequester();
        java.lang.String str28 = bookRequest25.getRequester();
        java.lang.String str29 = bookRequest25.getRequester();
        int int30 = bookRequest21.compareTo(bookRequest25);
        int int31 = bookRequest21.getPriority();
        int int32 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest25", (bookRequest7.compareTo(bookRequest25) == 0) == bookRequest7.equals(bookRequest25));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str17 = bookRequest16.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (short) 0);
        int int26 = bookRequest21.compareTo(bookRequest25);
        int int27 = bookRequest16.compareTo(bookRequest25);
        java.lang.String str28 = bookRequest25.getBookTitle();
        int int29 = bookRequest25.getPriority();
        int int30 = bookRequest12.compareTo(bookRequest25);
        java.lang.String str31 = bookRequest12.getRequester();
        int int32 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        java.lang.String str23 = bookRequest19.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        int int30 = bookRequest27.getPriority();
        java.lang.String str31 = bookRequest27.getRequester();
        java.lang.String str32 = bookRequest27.getBookTitle();
        int int33 = bookRequest27.getPriority();
        java.lang.String str34 = bookRequest27.getRequester();
        java.lang.String str35 = bookRequest27.getBookTitle();
        int int36 = bookRequest19.compareTo(bookRequest27);
        int int37 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest27", (bookRequest8.compareTo(bookRequest27) == 0) == bookRequest8.equals(bookRequest27));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest16 = new request.BookRequest("", "", 1);
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest7.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        int int16 = bookRequest3.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getBookTitle();
        int int25 = bookRequest20.getPriority();
        java.lang.String str26 = bookRequest20.getRequester();
        int int27 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest20", (bookRequest8.compareTo(bookRequest20) == 0) == bookRequest8.equals(bookRequest20));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
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
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) '#');
        int int35 = bookRequest34.getPriority();
        java.lang.String str36 = bookRequest34.getBookTitle();
        request.BookRequest bookRequest40 = new request.BookRequest("", "", (int) ' ');
        int int41 = bookRequest34.compareTo(bookRequest40);
        java.lang.String str42 = bookRequest34.getBookTitle();
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest50 = new request.BookRequest("", "", 1);
        java.lang.String str51 = bookRequest50.getBookTitle();
        java.lang.String str52 = bookRequest50.getBookTitle();
        java.lang.String str53 = bookRequest50.getRequester();
        int int54 = bookRequest46.compareTo(bookRequest50);
        int int55 = bookRequest50.getPriority();
        int int56 = bookRequest34.compareTo(bookRequest50);
        int int57 = bookRequest10.compareTo(bookRequest50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest46", (bookRequest3.compareTo(bookRequest46) == 0) == bookRequest3.equals(bookRequest46));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getRequester();
        java.lang.String str29 = bookRequest25.getRequester();
        java.lang.String str30 = bookRequest25.getRequester();
        int int31 = bookRequest12.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
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
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str28 = bookRequest27.getBookTitle();
        int int29 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest27", (bookRequest12.compareTo(bookRequest27) == 0) == bookRequest12.equals(bookRequest27));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 10);
        int int15 = bookRequest3.compareTo(bookRequest14);
        request.BookRequest bookRequest19 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", 97);
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getBookTitle();
        int int26 = bookRequest19.compareTo(bookRequest23);
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 10);
        int int31 = bookRequest19.compareTo(bookRequest30);
        int int32 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest7.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str23 = bookRequest22.getRequester();
        int int24 = bookRequest18.compareTo(bookRequest22);
        int int25 = bookRequest7.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 35);
        int int8 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str20 = bookRequest19.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (short) 0);
        int int29 = bookRequest24.compareTo(bookRequest28);
        int int30 = bookRequest19.compareTo(bookRequest28);
        int int31 = bookRequest19.getPriority();
        int int32 = bookRequest19.getPriority();
        java.lang.String str33 = bookRequest19.getRequester();
        java.lang.String str34 = bookRequest19.getBookTitle();
        java.lang.String str35 = bookRequest19.getBookTitle();
        int int36 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest24", (bookRequest9.compareTo(bookRequest24) == 0) == bookRequest9.equals(bookRequest24));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getBookTitle();
        java.lang.String str23 = bookRequest18.getRequester();
        java.lang.String str24 = bookRequest18.getRequester();
        int int25 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest18", (bookRequest7.compareTo(bookRequest18) == 0) == bookRequest7.equals(bookRequest18));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
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
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", 97);
        int int23 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        int int15 = bookRequest13.getPriority();
        java.lang.String str16 = bookRequest13.getBookTitle();
        java.lang.String str17 = bookRequest13.getRequester();
        java.lang.String str18 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int27 = bookRequest22.compareTo(bookRequest26);
        java.lang.String str28 = bookRequest22.getBookTitle();
        int int29 = bookRequest13.compareTo(bookRequest22);
        int int30 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        java.lang.String str23 = bookRequest19.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        int int30 = bookRequest19.compareTo(bookRequest27);
        java.lang.String str31 = bookRequest19.getRequester();
        int int32 = bookRequest12.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest19", (bookRequest8.compareTo(bookRequest19) == 0) == bookRequest8.equals(bookRequest19));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        int int29 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest26", (bookRequest12.compareTo(bookRequest26) == 0) == bookRequest12.equals(bookRequest26));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
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
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 0);
        int int23 = bookRequest12.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest22", (bookRequest12.compareTo(bookRequest22) == 0) == bookRequest12.equals(bookRequest22));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str27 = bookRequest26.getRequester();
        java.lang.String str28 = bookRequest26.getRequester();
        int int29 = bookRequest26.getPriority();
        int int30 = bookRequest19.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest26", (bookRequest8.compareTo(bookRequest26) == 0) == bookRequest8.equals(bookRequest26));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getBookTitle();
        int int23 = bookRequest18.getPriority();
        int int24 = bookRequest18.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int29 = bookRequest18.compareTo(bookRequest28);
        java.lang.String str30 = bookRequest18.getRequester();
        java.lang.String str31 = bookRequest18.getBookTitle();
        int int32 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
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
        int int24 = bookRequest16.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int29 = bookRequest16.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest28", (bookRequest16.compareTo(bookRequest28) == 0) == bookRequest16.equals(bookRequest28));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
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
        int int30 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str21 = bookRequest20.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (short) 0);
        int int30 = bookRequest25.compareTo(bookRequest29);
        int int31 = bookRequest20.compareTo(bookRequest29);
        java.lang.String str32 = bookRequest29.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) (byte) 100);
        int int37 = bookRequest36.getPriority();
        int int38 = bookRequest29.compareTo(bookRequest36);
        java.lang.String str39 = bookRequest36.getRequester();
        int int40 = bookRequest36.getPriority();
        int int41 = bookRequest12.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
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
        java.lang.String str20 = bookRequest3.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", 0);
        java.lang.String str25 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        java.lang.String str33 = bookRequest29.getBookTitle();
        int int34 = bookRequest24.compareTo(bookRequest29);
        int int35 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
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
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str27 = bookRequest26.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) (short) 0);
        int int36 = bookRequest31.compareTo(bookRequest35);
        int int37 = bookRequest26.compareTo(bookRequest35);
        java.lang.String str38 = bookRequest35.getBookTitle();
        int int39 = bookRequest35.getPriority();
        int int40 = bookRequest35.getPriority();
        int int41 = bookRequest15.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest31", (bookRequest15.compareTo(bookRequest31) == 0) == bookRequest15.equals(bookRequest31));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
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
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (byte) 1);
        int int23 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest22", (bookRequest9.compareTo(bookRequest22) == 0) == bookRequest9.equals(bookRequest22));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        java.lang.String str12 = bookRequest10.getRequester();
        int int13 = bookRequest10.getPriority();
        java.lang.String str14 = bookRequest10.getRequester();
        java.lang.String str15 = bookRequest10.getBookTitle();
        java.lang.String str16 = bookRequest10.getRequester();
        int int17 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
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
        request.BookRequest bookRequest28 = new request.BookRequest("", "", 1);
        java.lang.String str29 = bookRequest28.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str34 = bookRequest33.getRequester();
        int int35 = bookRequest33.getPriority();
        java.lang.String str36 = bookRequest33.getBookTitle();
        java.lang.String str37 = bookRequest33.getRequester();
        int int38 = bookRequest33.getPriority();
        int int39 = bookRequest28.compareTo(bookRequest33);
        int int40 = bookRequest28.getPriority();
        int int41 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest33", (bookRequest13.compareTo(bookRequest33) == 0) == bookRequest13.equals(bookRequest33));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        java.lang.String str19 = bookRequest17.getRequester();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest13.compareTo(bookRequest17);
        java.lang.String str23 = bookRequest17.getBookTitle();
        int int24 = bookRequest17.getPriority();
        int int25 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        int int30 = bookRequest27.getPriority();
        int int31 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest27", (bookRequest16.compareTo(bookRequest27) == 0) == bookRequest16.equals(bookRequest27));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest3.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 0);
        int int27 = bookRequest22.compareTo(bookRequest26);
        int int28 = bookRequest17.compareTo(bookRequest26);
        request.BookRequest bookRequest32 = new request.BookRequest("", "", 1);
        int int33 = bookRequest26.compareTo(bookRequest32);
        java.lang.String str34 = bookRequest26.getRequester();
        int int35 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str25 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str30 = bookRequest29.getRequester();
        java.lang.String str31 = bookRequest29.getBookTitle();
        int int32 = bookRequest29.getPriority();
        int int33 = bookRequest24.compareTo(bookRequest29);
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str38 = bookRequest37.getRequester();
        int int39 = bookRequest37.getPriority();
        java.lang.String str40 = bookRequest37.getBookTitle();
        java.lang.String str41 = bookRequest37.getRequester();
        int int42 = bookRequest37.getPriority();
        java.lang.String str43 = bookRequest37.getBookTitle();
        int int44 = bookRequest37.getPriority();
        int int45 = bookRequest37.getPriority();
        java.lang.String str46 = bookRequest37.getRequester();
        java.lang.String str47 = bookRequest37.getBookTitle();
        int int48 = bookRequest29.compareTo(bookRequest37);
        int int49 = bookRequest9.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest37", (bookRequest3.compareTo(bookRequest37) == 0) == bookRequest3.equals(bookRequest37));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getBookTitle();
        int int33 = bookRequest30.getPriority();
        java.lang.String str34 = bookRequest30.getRequester();
        int int35 = bookRequest24.compareTo(bookRequest30);
        java.lang.String str36 = bookRequest24.getRequester();
        java.lang.String str37 = bookRequest24.getBookTitle();
        java.lang.String str38 = bookRequest24.getRequester();
        java.lang.String str39 = bookRequest24.getRequester();
        int int40 = bookRequest9.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        java.lang.String str19 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int24 = bookRequest16.compareTo(bookRequest23);
        int int25 = bookRequest23.getPriority();
        int int26 = bookRequest23.getPriority();
        int int27 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getBookTitle();
        int int14 = bookRequest10.getPriority();
        int int15 = bookRequest10.getPriority();
        int int16 = bookRequest10.getPriority();
        int int17 = bookRequest10.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str11 = bookRequest10.getRequester();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getBookTitle();
        java.lang.String str14 = bookRequest10.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", 52);
        int int19 = bookRequest10.compareTo(bookRequest18);
        int int20 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        int int17 = bookRequest12.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 1);
        int int23 = bookRequest16.compareTo(bookRequest22);
        int int24 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        java.lang.String str23 = bookRequest19.getBookTitle();
        int int24 = bookRequest19.getPriority();
        java.lang.String str25 = bookRequest19.getBookTitle();
        java.lang.String str26 = bookRequest19.getBookTitle();
        java.lang.String str27 = bookRequest19.getRequester();
        int int28 = bookRequest19.getPriority();
        int int29 = bookRequest9.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest19", (bookRequest9.compareTo(bookRequest19) == 0) == bookRequest9.equals(bookRequest19));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "", 1);
        java.lang.String str24 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str29 = bookRequest28.getRequester();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        java.lang.String str32 = bookRequest28.getRequester();
        int int33 = bookRequest28.getPriority();
        int int34 = bookRequest23.compareTo(bookRequest28);
        int int35 = bookRequest16.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest28", (bookRequest7.compareTo(bookRequest28) == 0) == bookRequest7.equals(bookRequest28));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getRequester();
        int int34 = bookRequest27.compareTo(bookRequest31);
        int int35 = bookRequest27.getPriority();
        java.lang.String str36 = bookRequest27.getRequester();
        int int37 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest31", (bookRequest16.compareTo(bookRequest31) == 0) == bookRequest16.equals(bookRequest31));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
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
        int int23 = bookRequest19.getPriority();
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str28 = bookRequest27.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) (short) 0);
        int int37 = bookRequest32.compareTo(bookRequest36);
        int int38 = bookRequest27.compareTo(bookRequest36);
        int int39 = bookRequest27.getPriority();
        java.lang.String str40 = bookRequest27.getRequester();
        int int41 = bookRequest19.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str17 = bookRequest16.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (short) 0);
        int int26 = bookRequest21.compareTo(bookRequest25);
        int int27 = bookRequest16.compareTo(bookRequest25);
        int int28 = bookRequest16.getPriority();
        int int29 = bookRequest7.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest21", (bookRequest7.compareTo(bookRequest21) == 0) == bookRequest7.equals(bookRequest21));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest13.getPriority();
        java.lang.String str17 = bookRequest13.getRequester();
        java.lang.String str18 = bookRequest13.getBookTitle();
        int int19 = bookRequest13.getPriority();
        java.lang.String str20 = bookRequest13.getRequester();
        java.lang.String str21 = bookRequest13.getBookTitle();
        int int22 = bookRequest13.getPriority();
        int int23 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "", 1);
        java.lang.String str24 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str29 = bookRequest28.getRequester();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        java.lang.String str32 = bookRequest28.getRequester();
        int int33 = bookRequest28.getPriority();
        int int34 = bookRequest23.compareTo(bookRequest28);
        java.lang.String str35 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest39 = new request.BookRequest("", "hi!", 52);
        int int40 = bookRequest23.compareTo(bookRequest39);
        int int41 = bookRequest15.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest28", (bookRequest9.compareTo(bookRequest28) == 0) == bookRequest9.equals(bookRequest28));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest8.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", 10);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getRequester();
        int int25 = bookRequest21.getPriority();
        java.lang.String str26 = bookRequest21.getBookTitle();
        int int27 = bookRequest21.getPriority();
        int int28 = bookRequest17.compareTo(bookRequest21);
        int int29 = bookRequest8.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest21", (bookRequest8.compareTo(bookRequest21) == 0) == bookRequest8.equals(bookRequest21));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        java.lang.String str25 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) '#');
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getBookTitle();
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) ' ');
        int int36 = bookRequest29.compareTo(bookRequest35);
        java.lang.String str37 = bookRequest29.getRequester();
        int int38 = bookRequest23.compareTo(bookRequest29);
        java.lang.String str39 = bookRequest29.getBookTitle();
        int int40 = bookRequest17.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        java.lang.String str18 = bookRequest15.getRequester();
        int int19 = bookRequest15.getPriority();
        java.lang.String str20 = bookRequest15.getBookTitle();
        int int21 = bookRequest15.getPriority();
        int int22 = bookRequest15.getPriority();
        int int23 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) '#');
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getRequester();
        java.lang.String str20 = bookRequest15.getRequester();
        java.lang.String str21 = bookRequest15.getBookTitle();
        int int22 = bookRequest11.compareTo(bookRequest15);
        int int23 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest13);
        int int17 = bookRequest3.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str22 = bookRequest21.getRequester();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getRequester();
        int int26 = bookRequest21.getPriority();
        java.lang.String str27 = bookRequest21.getBookTitle();
        int int28 = bookRequest21.getPriority();
        int int29 = bookRequest21.getPriority();
        int int30 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest21", (bookRequest7.compareTo(bookRequest21) == 0) == bookRequest7.equals(bookRequest21));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str15 = bookRequest14.getRequester();
        java.lang.String str16 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) '#');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) ' ');
        int int27 = bookRequest20.compareTo(bookRequest26);
        java.lang.String str28 = bookRequest20.getRequester();
        int int29 = bookRequest14.compareTo(bookRequest20);
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "hi!", 0);
        int int34 = bookRequest20.compareTo(bookRequest33);
        java.lang.String str35 = bookRequest20.getRequester();
        int int36 = bookRequest7.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str21 = bookRequest20.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getRequester();
        int int28 = bookRequest25.getPriority();
        java.lang.String str29 = bookRequest25.getRequester();
        int int30 = bookRequest20.compareTo(bookRequest25);
        java.lang.String str31 = bookRequest20.getRequester();
        int int32 = bookRequest20.getPriority();
        int int33 = bookRequest12.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", 97);
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        java.lang.String str19 = bookRequest16.getRequester();
        int int20 = bookRequest16.getPriority();
        java.lang.String str21 = bookRequest16.getBookTitle();
        int int22 = bookRequest16.getPriority();
        int int23 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest16", (bookRequest9.compareTo(bookRequest16) == 0) == bookRequest9.equals(bookRequest16));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getBookTitle();
        int int32 = bookRequest27.getPriority();
        int int33 = bookRequest27.getPriority();
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int38 = bookRequest27.compareTo(bookRequest37);
        java.lang.String str39 = bookRequest37.getRequester();
        java.lang.String str40 = bookRequest37.getRequester();
        java.lang.String str41 = bookRequest37.getRequester();
        request.BookRequest bookRequest45 = new request.BookRequest("", "hi!", (int) '4');
        int int46 = bookRequest45.getPriority();
        int int47 = bookRequest37.compareTo(bookRequest45);
        int int48 = bookRequest7.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest27", (bookRequest14.compareTo(bookRequest27) == 0) == bookRequest14.equals(bookRequest27));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getBookTitle();
        int int34 = bookRequest31.getPriority();
        java.lang.String str35 = bookRequest31.getRequester();
        int int36 = bookRequest25.compareTo(bookRequest31);
        int int37 = bookRequest9.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str23 = bookRequest22.getRequester();
        int int24 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest22", (bookRequest9.compareTo(bookRequest22) == 0) == bookRequest9.equals(bookRequest22));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest7.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str15 = bookRequest14.getRequester();
        java.lang.String str16 = bookRequest14.getBookTitle();
        int int17 = bookRequest7.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        java.lang.String str32 = bookRequest28.getRequester();
        java.lang.String str33 = bookRequest28.getRequester();
        java.lang.String str34 = bookRequest28.getBookTitle();
        int int35 = bookRequest28.getPriority();
        int int36 = bookRequest17.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest17 and bookRequest28", (bookRequest17.compareTo(bookRequest28) == 0) == bookRequest17.equals(bookRequest28));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str35 = bookRequest34.getRequester();
        java.lang.String str36 = bookRequest34.getBookTitle();
        int int37 = bookRequest30.compareTo(bookRequest34);
        java.lang.String str38 = bookRequest30.getRequester();
        java.lang.String str39 = bookRequest30.getRequester();
        java.lang.String str40 = bookRequest30.getBookTitle();
        int int41 = bookRequest24.compareTo(bookRequest30);
        java.lang.String str42 = bookRequest30.getRequester();
        int int43 = bookRequest19.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest24", (bookRequest9.compareTo(bookRequest24) == 0) == bookRequest9.equals(bookRequest24));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", 0);
        java.lang.String str23 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getBookTitle();
        int int32 = bookRequest22.compareTo(bookRequest27);
        int int33 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) '#');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) ' ');
        int int15 = bookRequest8.compareTo(bookRequest14);
        int int16 = bookRequest3.compareTo(bookRequest14);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str25 = bookRequest24.getRequester();
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getBookTitle();
        java.lang.String str28 = bookRequest24.getRequester();
        int int29 = bookRequest24.getPriority();
        java.lang.String str30 = bookRequest24.getBookTitle();
        int int31 = bookRequest24.getPriority();
        int int32 = bookRequest24.getPriority();
        int int33 = bookRequest20.compareTo(bookRequest24);
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) (byte) 10);
        int int38 = bookRequest37.getPriority();
        int int39 = bookRequest24.compareTo(bookRequest37);
        int int40 = bookRequest24.getPriority();
        int int41 = bookRequest14.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest20", (bookRequest8.compareTo(bookRequest20) == 0) == bookRequest8.equals(bookRequest20));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        int int27 = bookRequest24.getPriority();
        java.lang.String str28 = bookRequest24.getRequester();
        java.lang.String str29 = bookRequest24.getBookTitle();
        java.lang.String str30 = bookRequest24.getBookTitle();
        java.lang.String str31 = bookRequest24.getRequester();
        int int32 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest24", (bookRequest11.compareTo(bookRequest24) == 0) == bookRequest11.equals(bookRequest24));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
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
        request.BookRequest bookRequest31 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        int int36 = bookRequest35.getPriority();
        int int37 = bookRequest35.getPriority();
        java.lang.String str38 = bookRequest35.getBookTitle();
        java.lang.String str39 = bookRequest35.getRequester();
        java.lang.String str40 = bookRequest35.getBookTitle();
        int int41 = bookRequest35.getPriority();
        java.lang.String str42 = bookRequest35.getBookTitle();
        int int43 = bookRequest31.compareTo(bookRequest35);
        java.lang.String str44 = bookRequest31.getBookTitle();
        java.lang.String str45 = bookRequest31.getRequester();
        int int46 = bookRequest10.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest35", (bookRequest15.compareTo(bookRequest35) == 0) == bookRequest15.equals(bookRequest35));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        int int31 = bookRequest24.compareTo(bookRequest28);
        int int32 = bookRequest17.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (byte) -1);
        int int30 = bookRequest24.compareTo(bookRequest29);
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) '#');
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        int int39 = bookRequest38.getPriority();
        int int40 = bookRequest38.getPriority();
        java.lang.String str41 = bookRequest38.getBookTitle();
        java.lang.String str42 = bookRequest38.getRequester();
        java.lang.String str43 = bookRequest38.getRequester();
        java.lang.String str44 = bookRequest38.getBookTitle();
        int int45 = bookRequest34.compareTo(bookRequest38);
        int int46 = bookRequest29.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest38", (bookRequest3.compareTo(bookRequest38) == 0) == bookRequest3.equals(bookRequest38));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        java.lang.String str19 = bookRequest17.getRequester();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest13.compareTo(bookRequest17);
        java.lang.String str23 = bookRequest17.getBookTitle();
        int int24 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        java.lang.String str30 = bookRequest28.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str35 = bookRequest34.getRequester();
        java.lang.String str36 = bookRequest34.getBookTitle();
        int int37 = bookRequest34.getPriority();
        java.lang.String str38 = bookRequest34.getRequester();
        int int39 = bookRequest28.compareTo(bookRequest34);
        java.lang.String str40 = bookRequest28.getRequester();
        java.lang.String str41 = bookRequest28.getRequester();
        java.lang.String str42 = bookRequest28.getBookTitle();
        int int43 = bookRequest20.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest28", (bookRequest7.compareTo(bookRequest28) == 0) == bookRequest7.equals(bookRequest28));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest12.getPriority();
        java.lang.String str17 = bookRequest12.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) '#');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) ' ');
        int int28 = bookRequest21.compareTo(bookRequest27);
        int int29 = bookRequest12.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) ' ');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str34 = bookRequest33.getRequester();
        int int35 = bookRequest33.getPriority();
        request.BookRequest bookRequest39 = new request.BookRequest("", "", 1);
        java.lang.String str40 = bookRequest39.getBookTitle();
        int int41 = bookRequest33.compareTo(bookRequest39);
        java.lang.String str42 = bookRequest39.getRequester();
        int int43 = bookRequest27.compareTo(bookRequest39);
        int int44 = bookRequest7.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest39", (bookRequest7.compareTo(bookRequest39) == 0) == bookRequest7.equals(bookRequest39));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        java.lang.String str27 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int32 = bookRequest24.compareTo(bookRequest31);
        int int33 = bookRequest24.getPriority();
        java.lang.String str34 = bookRequest24.getRequester();
        java.lang.String str35 = bookRequest24.getBookTitle();
        int int36 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest24", (bookRequest8.compareTo(bookRequest24) == 0) == bookRequest8.equals(bookRequest24));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str13 = bookRequest12.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (short) 0);
        int int22 = bookRequest17.compareTo(bookRequest21);
        int int23 = bookRequest12.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest21.getBookTitle();
        int int25 = bookRequest21.getPriority();
        int int26 = bookRequest8.compareTo(bookRequest21);
        java.lang.String str27 = bookRequest8.getBookTitle();
        int int28 = bookRequest8.getPriority();
        int int29 = bookRequest3.compareTo(bookRequest8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest8", (bookRequest3.compareTo(bookRequest8) == 0) == bookRequest3.equals(bookRequest8));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
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
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str22 = bookRequest21.getRequester();
        java.lang.String str23 = bookRequest21.getRequester();
        int int24 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest21", (bookRequest7.compareTo(bookRequest21) == 0) == bookRequest7.equals(bookRequest21));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (byte) 100);
        int int22 = bookRequest21.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str27 = bookRequest26.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) (short) 0);
        int int36 = bookRequest31.compareTo(bookRequest35);
        int int37 = bookRequest26.compareTo(bookRequest35);
        java.lang.String str38 = bookRequest35.getBookTitle();
        int int39 = bookRequest35.getPriority();
        int int40 = bookRequest35.getPriority();
        java.lang.String str41 = bookRequest35.getRequester();
        int int42 = bookRequest21.compareTo(bookRequest35);
        int int43 = bookRequest13.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getRequester();
        int int24 = bookRequest20.getPriority();
        java.lang.String str25 = bookRequest20.getRequester();
        java.lang.String str26 = bookRequest20.getBookTitle();
        int int27 = bookRequest10.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest20", (bookRequest10.compareTo(bookRequest20) == 0) == bookRequest10.equals(bookRequest20));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
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
        java.lang.String str19 = bookRequest12.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest23.getPriority();
        java.lang.String str29 = bookRequest23.getRequester();
        java.lang.String str30 = bookRequest23.getRequester();
        java.lang.String str31 = bookRequest23.getRequester();
        java.lang.String str32 = bookRequest23.getBookTitle();
        int int33 = bookRequest12.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str26 = bookRequest25.getRequester();
        java.lang.String str27 = bookRequest25.getRequester();
        java.lang.String str28 = bookRequest25.getRequester();
        int int29 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getRequester();
        java.lang.String str16 = bookRequest13.getRequester();
        java.lang.String str17 = bookRequest13.getBookTitle();
        int int18 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str16 = bookRequest15.getRequester();
        int int17 = bookRequest15.getPriority();
        int int18 = bookRequest7.compareTo(bookRequest15);
        int int19 = bookRequest15.getPriority();
        int int20 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest7);
        int int14 = bookRequest7.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getRequester();
        java.lang.String str23 = bookRequest18.getRequester();
        java.lang.String str24 = bookRequest18.getBookTitle();
        int int25 = bookRequest18.getPriority();
        int int26 = bookRequest7.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest18", (bookRequest7.compareTo(bookRequest18) == 0) == bookRequest7.equals(bookRequest18));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str14 = bookRequest13.getBookTitle();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest13.getPriority();
        java.lang.String str17 = bookRequest13.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str22 = bookRequest21.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 0);
        int int31 = bookRequest26.compareTo(bookRequest30);
        int int32 = bookRequest21.compareTo(bookRequest30);
        int int33 = bookRequest21.getPriority();
        int int34 = bookRequest21.getPriority();
        java.lang.String str35 = bookRequest21.getRequester();
        int int36 = bookRequest13.compareTo(bookRequest21);
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) '#');
        int int41 = bookRequest40.getPriority();
        java.lang.String str42 = bookRequest40.getRequester();
        java.lang.String str43 = bookRequest40.getBookTitle();
        int int44 = bookRequest40.getPriority();
        int int45 = bookRequest21.compareTo(bookRequest40);
        int int46 = bookRequest3.compareTo(bookRequest40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest40", (bookRequest3.compareTo(bookRequest40) == 0) == bookRequest3.equals(bookRequest40));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest10.getPriority();
        int int13 = bookRequest10.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest17.compareTo(bookRequest21);
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int27 = bookRequest17.compareTo(bookRequest26);
        int int28 = bookRequest17.getPriority();
        int int29 = bookRequest10.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 10);
        int int15 = bookRequest3.compareTo(bookRequest14);
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) '#');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        java.lang.String str23 = bookRequest19.getRequester();
        java.lang.String str24 = bookRequest19.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str29 = bookRequest28.getRequester();
        int int30 = bookRequest28.getPriority();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) 'a');
        int int35 = bookRequest34.getPriority();
        int int36 = bookRequest34.getPriority();
        java.lang.String str37 = bookRequest34.getBookTitle();
        int int38 = bookRequest34.getPriority();
        int int39 = bookRequest34.getPriority();
        int int40 = bookRequest28.compareTo(bookRequest34);
        request.BookRequest bookRequest44 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int45 = bookRequest34.compareTo(bookRequest44);
        int int46 = bookRequest19.compareTo(bookRequest34);
        int int47 = bookRequest34.getPriority();
        int int48 = bookRequest14.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest44", (bookRequest3.compareTo(bookRequest44) == 0) == bookRequest3.equals(bookRequest44));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str22 = bookRequest21.getRequester();
        java.lang.String str23 = bookRequest21.getBookTitle();
        int int24 = bookRequest17.compareTo(bookRequest21);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        java.lang.String str32 = bookRequest28.getBookTitle();
        java.lang.String str33 = bookRequest28.getBookTitle();
        int int34 = bookRequest17.compareTo(bookRequest28);
        java.lang.String str35 = bookRequest28.getRequester();
        int int36 = bookRequest7.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest28", (bookRequest7.compareTo(bookRequest28) == 0) == bookRequest7.equals(bookRequest28));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        int int15 = bookRequest13.getPriority();
        java.lang.String str16 = bookRequest13.getRequester();
        int int17 = bookRequest13.getPriority();
        java.lang.String str18 = bookRequest13.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) '#');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) ' ');
        int int29 = bookRequest22.compareTo(bookRequest28);
        int int30 = bookRequest13.compareTo(bookRequest22);
        java.lang.String str31 = bookRequest22.getRequester();
        java.lang.String str32 = bookRequest22.getRequester();
        int int33 = bookRequest22.getPriority();
        java.lang.String str34 = bookRequest22.getBookTitle();
        int int35 = bookRequest22.getPriority();
        int int36 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.String str15 = bookRequest3.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", 0);
        int int20 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getBookTitle();
        java.lang.String str30 = bookRequest25.getBookTitle();
        java.lang.String str31 = bookRequest25.getRequester();
        int int32 = bookRequest12.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int12 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str24 = bookRequest23.getBookTitle();
        java.lang.String str25 = bookRequest23.getRequester();
        int int26 = bookRequest23.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int31 = bookRequest23.compareTo(bookRequest30);
        int int32 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest30", (bookRequest16.compareTo(bookRequest30) == 0) == bookRequest16.equals(bookRequest30));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getBookTitle();
        int int33 = bookRequest30.getPriority();
        java.lang.String str34 = bookRequest30.getRequester();
        int int35 = bookRequest24.compareTo(bookRequest30);
        java.lang.String str36 = bookRequest24.getRequester();
        request.BookRequest bookRequest40 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int41 = bookRequest24.compareTo(bookRequest40);
        request.BookRequest bookRequest45 = new request.BookRequest("", "", 32);
        int int46 = bookRequest24.compareTo(bookRequest45);
        request.BookRequest bookRequest50 = new request.BookRequest("", "", (int) (byte) -1);
        int int51 = bookRequest45.compareTo(bookRequest50);
        int int52 = bookRequest3.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest30", (bookRequest7.compareTo(bookRequest30) == 0) == bookRequest7.equals(bookRequest30));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 0);
        int int27 = bookRequest22.compareTo(bookRequest26);
        java.lang.String str28 = bookRequest22.getRequester();
        java.lang.String str29 = bookRequest22.getBookTitle();
        int int30 = bookRequest12.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest22", (bookRequest8.compareTo(bookRequest22) == 0) == bookRequest8.equals(bookRequest22));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        java.lang.String str12 = bookRequest10.getRequester();
        int int13 = bookRequest10.getPriority();
        java.lang.String str14 = bookRequest10.getBookTitle();
        java.lang.String str15 = bookRequest10.getRequester();
        java.lang.String str16 = bookRequest10.getRequester();
        int int17 = bookRequest10.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.getBookTitle();
        java.lang.String str24 = bookRequest21.getRequester();
        int int25 = bookRequest10.compareTo(bookRequest21);
        int int26 = bookRequest21.getPriority();
        int int27 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.getRequester();
        java.lang.String str15 = bookRequest12.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str20 = bookRequest19.getRequester();
        java.lang.String str21 = bookRequest19.getRequester();
        java.lang.String str22 = bookRequest19.getBookTitle();
        int int23 = bookRequest19.getPriority();
        java.lang.String str24 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", 0);
        int int29 = bookRequest19.compareTo(bookRequest28);
        int int30 = bookRequest12.compareTo(bookRequest28);
        int int31 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        int int16 = bookRequest12.getPriority();
        java.lang.String str17 = bookRequest12.getBookTitle();
        int int18 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
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
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (byte) -1);
        java.lang.String str34 = bookRequest33.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        int int39 = bookRequest38.getPriority();
        java.lang.String str40 = bookRequest38.getRequester();
        java.lang.String str41 = bookRequest38.getBookTitle();
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int46 = bookRequest38.compareTo(bookRequest45);
        int int47 = bookRequest45.getPriority();
        int int48 = bookRequest45.getPriority();
        int int49 = bookRequest33.compareTo(bookRequest45);
        request.BookRequest bookRequest53 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str54 = bookRequest53.getBookTitle();
        java.lang.String str55 = bookRequest53.getRequester();
        java.lang.String str56 = bookRequest53.getRequester();
        java.lang.String str57 = bookRequest53.getRequester();
        request.BookRequest bookRequest61 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str62 = bookRequest61.getBookTitle();
        java.lang.String str63 = bookRequest61.getBookTitle();
        int int64 = bookRequest53.compareTo(bookRequest61);
        int int65 = bookRequest45.compareTo(bookRequest53);
        int int66 = bookRequest3.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest61", (bookRequest3.compareTo(bookRequest61) == 0) == bookRequest3.equals(bookRequest61));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 0);
        int int28 = bookRequest23.compareTo(bookRequest27);
        java.lang.String str29 = bookRequest27.getRequester();
        int int30 = bookRequest27.getPriority();
        java.lang.String str31 = bookRequest27.getBookTitle();
        int int32 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getRequester();
        int int26 = bookRequest22.getPriority();
        int int27 = bookRequest17.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getRequester();
        java.lang.String str14 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int19 = bookRequest11.compareTo(bookRequest18);
        int int20 = bookRequest11.getPriority();
        java.lang.String str21 = bookRequest11.getRequester();
        int int22 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest24.getPriority();
        java.lang.String str28 = bookRequest24.getRequester();
        int int29 = bookRequest18.compareTo(bookRequest24);
        java.lang.String str30 = bookRequest18.getBookTitle();
        int int31 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest18", (bookRequest8.compareTo(bookRequest18) == 0) == bookRequest8.equals(bookRequest18));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", 0);
        java.lang.String str11 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getBookTitle();
        int int20 = bookRequest10.compareTo(bookRequest15);
        java.lang.String str21 = bookRequest15.getBookTitle();
        int int22 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
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
        java.lang.String str25 = bookRequest22.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getRequester();
        java.lang.String str33 = bookRequest29.getRequester();
        java.lang.String str34 = bookRequest29.getBookTitle();
        int int35 = bookRequest22.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest29", (bookRequest8.compareTo(bookRequest29) == 0) == bookRequest8.equals(bookRequest29));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        int int21 = bookRequest16.compareTo(bookRequest20);
        java.lang.String str22 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str27 = bookRequest26.getRequester();
        java.lang.String str28 = bookRequest26.getRequester();
        java.lang.String str29 = bookRequest26.getBookTitle();
        int int30 = bookRequest20.compareTo(bookRequest26);
        int int31 = bookRequest7.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
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
        int int19 = bookRequest17.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        java.lang.String str27 = bookRequest23.getBookTitle();
        int int28 = bookRequest23.getPriority();
        java.lang.String str29 = bookRequest23.getBookTitle();
        java.lang.String str30 = bookRequest23.getRequester();
        java.lang.String str31 = bookRequest23.getBookTitle();
        int int32 = bookRequest23.getPriority();
        int int33 = bookRequest17.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        int int19 = bookRequest16.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) '#');
        int int24 = bookRequest16.compareTo(bookRequest23);
        int int25 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        int int13 = bookRequest7.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getBookTitle();
        java.lang.String str22 = bookRequest17.getBookTitle();
        java.lang.String str23 = bookRequest17.getRequester();
        java.lang.String str24 = bookRequest17.getBookTitle();
        int int25 = bookRequest7.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest17", (bookRequest7.compareTo(bookRequest17) == 0) == bookRequest7.equals(bookRequest17));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
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
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str29 = bookRequest28.getRequester();
        java.lang.String str30 = bookRequest28.getRequester();
        java.lang.String str31 = bookRequest28.getBookTitle();
        int int32 = bookRequest24.compareTo(bookRequest28);
        int int33 = bookRequest17.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest28", (bookRequest8.compareTo(bookRequest28) == 0) == bookRequest8.equals(bookRequest28));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getRequester();
        java.lang.String str26 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int31 = bookRequest23.compareTo(bookRequest30);
        int int32 = bookRequest23.getPriority();
        java.lang.String str33 = bookRequest23.getRequester();
        java.lang.String str34 = bookRequest23.getBookTitle();
        int int35 = bookRequest23.getPriority();
        int int36 = bookRequest12.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
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
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str27 = bookRequest26.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        java.lang.String str33 = bookRequest31.getRequester();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest26.compareTo(bookRequest31);
        int int36 = bookRequest19.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
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
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (-1));
        int int39 = bookRequest38.getPriority();
        int int40 = bookRequest21.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest38", (bookRequest8.compareTo(bookRequest38) == 0) == bookRequest8.equals(bookRequest38));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (byte) 10);
        int int15 = bookRequest14.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", 1);
        java.lang.String str20 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str25 = bookRequest24.getRequester();
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getBookTitle();
        java.lang.String str28 = bookRequest24.getRequester();
        int int29 = bookRequest24.getPriority();
        int int30 = bookRequest19.compareTo(bookRequest24);
        int int31 = bookRequest14.compareTo(bookRequest19);
        int int32 = bookRequest7.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest19", (bookRequest7.compareTo(bookRequest19) == 0) == bookRequest7.equals(bookRequest19));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        int int17 = bookRequest12.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str22 = bookRequest21.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 0);
        int int31 = bookRequest26.compareTo(bookRequest30);
        int int32 = bookRequest21.compareTo(bookRequest30);
        java.lang.String str33 = bookRequest30.getBookTitle();
        int int34 = bookRequest30.getPriority();
        java.lang.String str35 = bookRequest30.getRequester();
        int int36 = bookRequest12.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str22 = bookRequest21.getRequester();
        int int23 = bookRequest21.getPriority();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        int int31 = bookRequest27.getPriority();
        int int32 = bookRequest27.getPriority();
        int int33 = bookRequest21.compareTo(bookRequest27);
        request.BookRequest bookRequest37 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int38 = bookRequest27.compareTo(bookRequest37);
        java.lang.String str39 = bookRequest27.getRequester();
        int int40 = bookRequest11.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", 0);
        java.lang.String str24 = bookRequest23.getBookTitle();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest23", (bookRequest12.compareTo(bookRequest23) == 0) == bookRequest12.equals(bookRequest23));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (byte) 10);
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str32 = bookRequest31.getRequester();
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        java.lang.String str35 = bookRequest31.getRequester();
        int int36 = bookRequest31.getPriority();
        int int37 = bookRequest25.compareTo(bookRequest31);
        int int38 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getRequester();
        int int28 = bookRequest25.getPriority();
        int int29 = bookRequest25.getPriority();
        java.lang.String str30 = bookRequest25.getBookTitle();
        int int31 = bookRequest25.getPriority();
        int int32 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest25", (bookRequest14.compareTo(bookRequest25) == 0) == bookRequest14.equals(bookRequest25));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 32);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) '#');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) ' ');
        int int14 = bookRequest7.compareTo(bookRequest13);
        int int15 = bookRequest13.getPriority();
        java.lang.String str16 = bookRequest13.getRequester();
        int int17 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getBookTitle();
        int int25 = bookRequest20.getPriority();
        int int26 = bookRequest20.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int31 = bookRequest20.compareTo(bookRequest30);
        java.lang.String str32 = bookRequest30.getRequester();
        java.lang.String str33 = bookRequest30.getRequester();
        java.lang.String str34 = bookRequest30.getRequester();
        java.lang.String str35 = bookRequest30.getRequester();
        int int36 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest13);
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str21 = bookRequest20.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (short) 0);
        int int30 = bookRequest25.compareTo(bookRequest29);
        int int31 = bookRequest20.compareTo(bookRequest29);
        int int32 = bookRequest20.getPriority();
        int int33 = bookRequest20.getPriority();
        int int34 = bookRequest20.getPriority();
        java.lang.String str35 = bookRequest20.getRequester();
        int int36 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest25", (bookRequest7.compareTo(bookRequest25) == 0) == bookRequest7.equals(bookRequest25));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 32);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) '#');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) ' ');
        int int20 = bookRequest13.compareTo(bookRequest19);
        java.lang.String str21 = bookRequest13.getRequester();
        int int22 = bookRequest7.compareTo(bookRequest13);
        int int23 = bookRequest7.getPriority();
        java.lang.String str24 = bookRequest7.getRequester();
        java.lang.String str25 = bookRequest7.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
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
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", 10);
        java.lang.String str27 = bookRequest26.getRequester();
        java.lang.String str28 = bookRequest26.getBookTitle();
        int int29 = bookRequest3.compareTo(bookRequest26);
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str38 = bookRequest37.getRequester();
        int int39 = bookRequest37.getPriority();
        request.BookRequest bookRequest43 = new request.BookRequest("", "", 1);
        java.lang.String str44 = bookRequest43.getBookTitle();
        int int45 = bookRequest37.compareTo(bookRequest43);
        int int46 = bookRequest33.compareTo(bookRequest43);
        int int47 = bookRequest3.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest43", (bookRequest3.compareTo(bookRequest43) == 0) == bookRequest3.equals(bookRequest43));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest11.compareTo(bookRequest15);
        int int17 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        java.lang.String str24 = bookRequest21.getRequester();
        int int25 = bookRequest21.getPriority();
        java.lang.String str26 = bookRequest21.getBookTitle();
        int int27 = bookRequest21.getPriority();
        int int28 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest21", (bookRequest15.compareTo(bookRequest21) == 0) == bookRequest15.equals(bookRequest21));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", 0);
        java.lang.String str13 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest12.compareTo(bookRequest17);
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (byte) 10);
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest12.compareTo(bookRequest26);
        int int29 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", 97);
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        int int18 = bookRequest15.getPriority();
        java.lang.String str19 = bookRequest15.getBookTitle();
        java.lang.String str20 = bookRequest15.getRequester();
        java.lang.String str21 = bookRequest15.getRequester();
        int int22 = bookRequest9.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest15", (bookRequest9.compareTo(bookRequest15) == 0) == bookRequest9.equals(bookRequest15));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str16 = bookRequest15.getBookTitle();
        java.lang.String str17 = bookRequest15.getRequester();
        java.lang.String str18 = bookRequest15.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getRequester();
        java.lang.String str25 = bookRequest22.getBookTitle();
        int int26 = bookRequest22.getPriority();
        java.lang.String str27 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", 0);
        int int32 = bookRequest22.compareTo(bookRequest31);
        int int33 = bookRequest15.compareTo(bookRequest31);
        int int34 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str21 = bookRequest20.getBookTitle();
        java.lang.String str22 = bookRequest20.getRequester();
        int int23 = bookRequest20.getPriority();
        java.lang.String str24 = bookRequest20.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str29 = bookRequest28.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) (short) 0);
        int int38 = bookRequest33.compareTo(bookRequest37);
        int int39 = bookRequest28.compareTo(bookRequest37);
        int int40 = bookRequest28.getPriority();
        int int41 = bookRequest28.getPriority();
        java.lang.String str42 = bookRequest28.getRequester();
        int int43 = bookRequest20.compareTo(bookRequest28);
        request.BookRequest bookRequest47 = new request.BookRequest("hi!", "", (int) '#');
        int int48 = bookRequest47.getPriority();
        java.lang.String str49 = bookRequest47.getRequester();
        java.lang.String str50 = bookRequest47.getBookTitle();
        int int51 = bookRequest47.getPriority();
        int int52 = bookRequest28.compareTo(bookRequest47);
        int int53 = bookRequest8.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest33", (bookRequest8.compareTo(bookRequest33) == 0) == bookRequest8.equals(bookRequest33));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", 0);
        java.lang.String str15 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        java.lang.String str23 = bookRequest19.getBookTitle();
        int int24 = bookRequest14.compareTo(bookRequest19);
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (byte) 10);
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest14.compareTo(bookRequest28);
        int int31 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getRequester();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getBookTitle();
        int int23 = bookRequest16.getPriority();
        int int24 = bookRequest16.getPriority();
        int int25 = bookRequest12.compareTo(bookRequest16);
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (byte) 10);
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest16.compareTo(bookRequest29);
        java.lang.String str32 = bookRequest29.getRequester();
        int int33 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) ' ');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getRequester();
        java.lang.String str29 = bookRequest26.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        int int34 = bookRequest33.getPriority();
        int int35 = bookRequest33.getPriority();
        java.lang.String str36 = bookRequest33.getBookTitle();
        java.lang.String str37 = bookRequest33.getBookTitle();
        int int38 = bookRequest33.getPriority();
        int int39 = bookRequest33.getPriority();
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int44 = bookRequest33.compareTo(bookRequest43);
        java.lang.String str45 = bookRequest33.getRequester();
        int int46 = bookRequest33.getPriority();
        java.lang.String str47 = bookRequest33.getBookTitle();
        int int48 = bookRequest26.compareTo(bookRequest33);
        int int49 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest26", (bookRequest7.compareTo(bookRequest26) == 0) == bookRequest7.equals(bookRequest26));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
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
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getRequester();
        java.lang.String str24 = bookRequest20.getRequester();
        int int25 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) ' ');
        int int13 = bookRequest7.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getRequester();
        java.lang.String str23 = bookRequest18.getBookTitle();
        int int24 = bookRequest18.getPriority();
        int int25 = bookRequest18.getPriority();
        int int26 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest18", (bookRequest7.compareTo(bookRequest18) == 0) == bookRequest7.equals(bookRequest18));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        int int15 = bookRequest13.getPriority();
        java.lang.String str16 = bookRequest13.getBookTitle();
        java.lang.String str17 = bookRequest13.getBookTitle();
        int int18 = bookRequest13.getPriority();
        int int19 = bookRequest13.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int24 = bookRequest13.compareTo(bookRequest23);
        java.lang.String str25 = bookRequest23.getRequester();
        java.lang.String str26 = bookRequest23.getRequester();
        java.lang.String str27 = bookRequest23.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("", "hi!", 10);
        int int32 = bookRequest23.compareTo(bookRequest31);
        int int33 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
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
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getBookTitle();
        int int33 = bookRequest30.getPriority();
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) 'a');
        int int38 = bookRequest37.getPriority();
        java.lang.String str39 = bookRequest37.getRequester();
        int int40 = bookRequest37.getPriority();
        java.lang.String str41 = bookRequest37.getRequester();
        java.lang.String str42 = bookRequest37.getBookTitle();
        int int43 = bookRequest37.getPriority();
        java.lang.String str44 = bookRequest37.getRequester();
        java.lang.String str45 = bookRequest37.getBookTitle();
        java.lang.String str46 = bookRequest37.getBookTitle();
        int int47 = bookRequest37.getPriority();
        int int48 = bookRequest30.compareTo(bookRequest37);
        int int49 = bookRequest3.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest37", (bookRequest3.compareTo(bookRequest37) == 0) == bookRequest3.equals(bookRequest37));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
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
        java.lang.String str19 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "hi!", 52);
        int int28 = bookRequest23.compareTo(bookRequest27);
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        java.lang.String str34 = bookRequest32.getRequester();
        int int35 = bookRequest32.getPriority();
        java.lang.String str36 = bookRequest32.getBookTitle();
        java.lang.String str37 = bookRequest32.getRequester();
        int int38 = bookRequest23.compareTo(bookRequest32);
        int int39 = bookRequest32.getPriority();
        int int40 = bookRequest9.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest32", (bookRequest3.compareTo(bookRequest32) == 0) == bookRequest3.equals(bookRequest32));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "", 100);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str38 = bookRequest37.getRequester();
        java.lang.String str39 = bookRequest37.getBookTitle();
        int int40 = bookRequest33.compareTo(bookRequest37);
        java.lang.String str41 = bookRequest33.getRequester();
        java.lang.String str42 = bookRequest33.getRequester();
        java.lang.String str43 = bookRequest33.getBookTitle();
        int int44 = bookRequest27.compareTo(bookRequest33);
        int int45 = bookRequest21.compareTo(bookRequest27);
        int int46 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
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
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str28 = bookRequest27.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        java.lang.String str34 = bookRequest32.getRequester();
        int int35 = bookRequest32.getPriority();
        java.lang.String str36 = bookRequest32.getRequester();
        int int37 = bookRequest27.compareTo(bookRequest32);
        request.BookRequest bookRequest41 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str46 = bookRequest45.getRequester();
        java.lang.String str47 = bookRequest45.getBookTitle();
        int int48 = bookRequest41.compareTo(bookRequest45);
        java.lang.String str49 = bookRequest41.getRequester();
        java.lang.String str50 = bookRequest41.getRequester();
        int int51 = bookRequest41.getPriority();
        int int52 = bookRequest27.compareTo(bookRequest41);
        int int53 = bookRequest3.compareTo(bookRequest41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        java.lang.String str19 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int24 = bookRequest16.compareTo(bookRequest23);
        int int25 = bookRequest16.getPriority();
        java.lang.String str26 = bookRequest16.getRequester();
        int int27 = bookRequest12.compareTo(bookRequest16);
        int int28 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
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
        int int19 = bookRequest12.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getRequester();
        int int32 = bookRequest27.getPriority();
        java.lang.String str33 = bookRequest27.getBookTitle();
        int int34 = bookRequest27.getPriority();
        int int35 = bookRequest27.getPriority();
        int int36 = bookRequest23.compareTo(bookRequest27);
        request.BookRequest bookRequest40 = new request.BookRequest("", "", (int) (byte) 10);
        int int41 = bookRequest40.getPriority();
        int int42 = bookRequest27.compareTo(bookRequest40);
        int int43 = bookRequest12.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest27", (bookRequest12.compareTo(bookRequest27) == 0) == bookRequest12.equals(bookRequest27));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str20 = bookRequest19.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (short) 0);
        int int29 = bookRequest24.compareTo(bookRequest28);
        int int30 = bookRequest19.compareTo(bookRequest28);
        java.lang.String str31 = bookRequest28.getRequester();
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) (byte) 100);
        int int36 = bookRequest35.getPriority();
        int int37 = bookRequest28.compareTo(bookRequest35);
        java.lang.String str38 = bookRequest35.getRequester();
        int int39 = bookRequest35.getPriority();
        java.lang.String str40 = bookRequest35.getBookTitle();
        int int41 = bookRequest8.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("", "hi!", 100);
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        int int23 = bookRequest19.getPriority();
        java.lang.String str24 = bookRequest19.getBookTitle();
        int int25 = bookRequest19.getPriority();
        java.lang.String str26 = bookRequest19.getBookTitle();
        int int27 = bookRequest19.getPriority();
        java.lang.String str28 = bookRequest19.getRequester();
        int int29 = bookRequest19.getPriority();
        int int30 = bookRequest15.compareTo(bookRequest19);
        java.lang.String str31 = bookRequest15.getBookTitle();
        int int32 = bookRequest7.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (-1));
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str13 = bookRequest12.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (short) 0);
        int int22 = bookRequest17.compareTo(bookRequest21);
        int int23 = bookRequest12.compareTo(bookRequest21);
        int int24 = bookRequest12.getPriority();
        int int25 = bookRequest12.getPriority();
        java.lang.String str26 = bookRequest12.getRequester();
        java.lang.String str27 = bookRequest12.getBookTitle();
        java.lang.String str28 = bookRequest12.getBookTitle();
        int int29 = bookRequest12.getPriority();
        int int30 = bookRequest12.getPriority();
        int int31 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int13 = bookRequest3.compareTo(bookRequest12);
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str20 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest24.getPriority();
        int int28 = bookRequest19.compareTo(bookRequest24);
        int int29 = bookRequest12.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 1);
        java.lang.String str23 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getRequester();
        int int32 = bookRequest27.getPriority();
        int int33 = bookRequest22.compareTo(bookRequest27);
        int int34 = bookRequest22.getPriority();
        java.lang.String str35 = bookRequest22.getRequester();
        java.lang.String str36 = bookRequest22.getRequester();
        java.lang.String str37 = bookRequest22.getRequester();
        int int38 = bookRequest18.compareTo(bookRequest22);
        int int39 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
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
        int int25 = bookRequest12.getPriority();
        java.lang.String str26 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str31 = bookRequest30.getRequester();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        java.lang.String str34 = bookRequest30.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("", "hi!", 52);
        int int39 = bookRequest30.compareTo(bookRequest38);
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) (short) 100);
        int int44 = bookRequest38.compareTo(bookRequest43);
        int int45 = bookRequest12.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest30", (bookRequest3.compareTo(bookRequest30) == 0) == bookRequest3.equals(bookRequest30));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest20.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getRequester();
        java.lang.String str30 = bookRequest26.getBookTitle();
        int int31 = bookRequest26.getPriority();
        java.lang.String str32 = bookRequest26.getBookTitle();
        int int33 = bookRequest26.getPriority();
        int int34 = bookRequest20.compareTo(bookRequest26);
        int int35 = bookRequest12.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getRequester();
        java.lang.String str30 = bookRequest25.getBookTitle();
        int int31 = bookRequest25.getPriority();
        java.lang.String str32 = bookRequest25.getBookTitle();
        int int33 = bookRequest21.compareTo(bookRequest25);
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str38 = bookRequest37.getBookTitle();
        java.lang.String str39 = bookRequest37.getRequester();
        java.lang.String str40 = bookRequest37.getRequester();
        int int41 = bookRequest21.compareTo(bookRequest37);
        java.lang.String str42 = bookRequest37.getRequester();
        int int43 = bookRequest3.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getBookTitle();
        java.lang.String str13 = bookRequest8.getRequester();
        java.lang.String str14 = bookRequest8.getBookTitle();
        java.lang.String str15 = bookRequest8.getRequester();
        java.lang.String str16 = bookRequest8.getBookTitle();
        java.lang.String str17 = bookRequest8.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        int int25 = bookRequest21.getPriority();
        int int26 = bookRequest21.getPriority();
        java.lang.String str27 = bookRequest21.getRequester();
        int int28 = bookRequest8.compareTo(bookRequest21);
        int int29 = bookRequest3.compareTo(bookRequest8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 0);
        java.lang.String str4 = bookRequest3.getRequester();
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
        java.lang.String str27 = bookRequest19.getBookTitle();
        int int28 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest8.getBookTitle();
        int int15 = bookRequest8.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", 0);
        java.lang.String str20 = bookRequest19.getBookTitle();
        int int21 = bookRequest19.getPriority();
        int int22 = bookRequest8.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
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
        java.lang.String str20 = bookRequest12.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest24.compareTo(bookRequest28);
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int34 = bookRequest24.compareTo(bookRequest33);
        java.lang.String str35 = bookRequest33.getRequester();
        int int36 = bookRequest12.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest28", (bookRequest8.compareTo(bookRequest28) == 0) == bookRequest8.equals(bookRequest28));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
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
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest27.compareTo(bookRequest31);
        java.lang.String str33 = bookRequest27.getRequester();
        int int34 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest31", (bookRequest15.compareTo(bookRequest31) == 0) == bookRequest15.equals(bookRequest31));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", 1);
        java.lang.String str13 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest17.getPriority();
        int int23 = bookRequest12.compareTo(bookRequest17);
        int int24 = bookRequest12.getPriority();
        java.lang.String str25 = bookRequest12.getRequester();
        java.lang.String str26 = bookRequest12.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str31 = bookRequest30.getBookTitle();
        java.lang.String str32 = bookRequest30.getRequester();
        java.lang.String str33 = bookRequest30.getRequester();
        int int34 = bookRequest12.compareTo(bookRequest30);
        int int35 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 52);
        int int12 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 100);
        int int17 = bookRequest11.compareTo(bookRequest16);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        int int24 = bookRequest21.getPriority();
        java.lang.String str25 = bookRequest21.getRequester();
        java.lang.String str26 = bookRequest21.getBookTitle();
        java.lang.String str27 = bookRequest21.getRequester();
        int int28 = bookRequest11.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getRequester();
        int int23 = bookRequest19.getPriority();
        java.lang.String str24 = bookRequest19.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str29 = bookRequest28.getBookTitle();
        int int30 = bookRequest19.compareTo(bookRequest28);
        java.lang.String str31 = bookRequest19.getRequester();
        java.lang.String str32 = bookRequest19.getRequester();
        int int33 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str11 = bookRequest10.getRequester();
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", 100);
        int int18 = bookRequest10.compareTo(bookRequest17);
        int int19 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        int int13 = bookRequest7.getPriority();
        java.lang.String str14 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 0);
        int int23 = bookRequest18.compareTo(bookRequest22);
        java.lang.String str24 = bookRequest18.getBookTitle();
        int int25 = bookRequest18.getPriority();
        int int26 = bookRequest7.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest18", (bookRequest7.compareTo(bookRequest18) == 0) == bookRequest7.equals(bookRequest18));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", 52);
        int int13 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str14 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str19 = bookRequest18.getRequester();
        java.lang.String str20 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) '#');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) ' ');
        int int31 = bookRequest24.compareTo(bookRequest30);
        java.lang.String str32 = bookRequest24.getRequester();
        int int33 = bookRequest18.compareTo(bookRequest24);
        int int34 = bookRequest24.getPriority();
        java.lang.String str35 = bookRequest24.getRequester();
        int int36 = bookRequest12.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.String str17 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        int int25 = bookRequest21.getPriority();
        int int26 = bookRequest21.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", 52);
        int int31 = bookRequest21.compareTo(bookRequest30);
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        java.lang.String str34 = bookRequest30.getBookTitle();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str39 = bookRequest38.getBookTitle();
        java.lang.String str40 = bookRequest38.getRequester();
        java.lang.String str41 = bookRequest38.getRequester();
        java.lang.String str42 = bookRequest38.getRequester();
        java.lang.String str43 = bookRequest38.getRequester();
        int int44 = bookRequest38.getPriority();
        int int45 = bookRequest30.compareTo(bookRequest38);
        int int46 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest21", (bookRequest8.compareTo(bookRequest21) == 0) == bookRequest8.equals(bookRequest21));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest14.getPriority();
        int int17 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 100);
        int int12 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str17 = bookRequest16.getBookTitle();
        java.lang.String str18 = bookRequest16.getRequester();
        java.lang.String str19 = bookRequest16.getRequester();
        java.lang.String str20 = bookRequest16.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str25 = bookRequest24.getBookTitle();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest16.compareTo(bookRequest24);
        java.lang.String str28 = bookRequest24.getRequester();
        int int29 = bookRequest11.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        java.lang.String str30 = bookRequest28.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str35 = bookRequest34.getRequester();
        java.lang.String str36 = bookRequest34.getBookTitle();
        int int37 = bookRequest34.getPriority();
        java.lang.String str38 = bookRequest34.getRequester();
        int int39 = bookRequest28.compareTo(bookRequest34);
        java.lang.String str40 = bookRequest28.getRequester();
        request.BookRequest bookRequest44 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int45 = bookRequest28.compareTo(bookRequest44);
        request.BookRequest bookRequest49 = new request.BookRequest("", "", 32);
        int int50 = bookRequest28.compareTo(bookRequest49);
        int int51 = bookRequest7.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest34", (bookRequest3.compareTo(bookRequest34) == 0) == bookRequest3.equals(bookRequest34));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
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
        java.lang.String str17 = bookRequest3.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getRequester();
        java.lang.String str30 = bookRequest25.getBookTitle();
        int int31 = bookRequest25.getPriority();
        java.lang.String str32 = bookRequest25.getBookTitle();
        int int33 = bookRequest21.compareTo(bookRequest25);
        int int34 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest25", (bookRequest9.compareTo(bookRequest25) == 0) == bookRequest9.equals(bookRequest25));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '4');
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getRequester();
        java.lang.String str14 = bookRequest11.getRequester();
        java.lang.String str15 = bookRequest11.getRequester();
        int int16 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", 0);
        java.lang.String str13 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest12.compareTo(bookRequest17);
        java.lang.String str23 = bookRequest12.getBookTitle();
        int int24 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest12", (bookRequest7.compareTo(bookRequest12) == 0) == bookRequest7.equals(bookRequest12));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str21 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str26 = bookRequest25.getRequester();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", 52);
        int int34 = bookRequest25.compareTo(bookRequest33);
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) (short) 100);
        int int39 = bookRequest33.compareTo(bookRequest38);
        int int40 = bookRequest20.compareTo(bookRequest38);
        int int41 = bookRequest12.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        int int32 = bookRequest28.getPriority();
        int int33 = bookRequest28.getPriority();
        request.BookRequest bookRequest37 = new request.BookRequest("", "hi!", 52);
        int int38 = bookRequest28.compareTo(bookRequest37);
        int int39 = bookRequest37.getPriority();
        java.lang.String str40 = bookRequest37.getBookTitle();
        java.lang.String str41 = bookRequest37.getBookTitle();
        request.BookRequest bookRequest45 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str46 = bookRequest45.getBookTitle();
        java.lang.String str47 = bookRequest45.getRequester();
        java.lang.String str48 = bookRequest45.getRequester();
        java.lang.String str49 = bookRequest45.getRequester();
        java.lang.String str50 = bookRequest45.getRequester();
        int int51 = bookRequest45.getPriority();
        int int52 = bookRequest37.compareTo(bookRequest45);
        int int53 = bookRequest7.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest28", (bookRequest7.compareTo(bookRequest28) == 0) == bookRequest7.equals(bookRequest28));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str14 = bookRequest13.getBookTitle();
        java.lang.String str15 = bookRequest13.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", 97);
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest13.compareTo(bookRequest19);
        int int22 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getBookTitle();
        int int30 = bookRequest25.getPriority();
        int int31 = bookRequest25.getPriority();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int36 = bookRequest25.compareTo(bookRequest35);
        java.lang.String str37 = bookRequest35.getRequester();
        java.lang.String str38 = bookRequest35.getRequester();
        java.lang.String str39 = bookRequest35.getRequester();
        request.BookRequest bookRequest43 = new request.BookRequest("", "hi!", 10);
        int int44 = bookRequest35.compareTo(bookRequest43);
        int int45 = bookRequest3.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest25", (bookRequest15.compareTo(bookRequest25) == 0) == bookRequest15.equals(bookRequest25));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest7.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        int int15 = bookRequest14.getPriority();
        int int16 = bookRequest14.getPriority();
        java.lang.String str17 = bookRequest14.getRequester();
        int int18 = bookRequest14.getPriority();
        java.lang.String str19 = bookRequest14.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) '#');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) ' ');
        int int30 = bookRequest23.compareTo(bookRequest29);
        int int31 = bookRequest14.compareTo(bookRequest23);
        java.lang.String str32 = bookRequest23.getRequester();
        java.lang.String str33 = bookRequest23.getRequester();
        int int34 = bookRequest23.getPriority();
        int int35 = bookRequest7.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest14", (bookRequest7.compareTo(bookRequest14) == 0) == bookRequest7.equals(bookRequest14));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
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
        int int38 = bookRequest24.getPriority();
        java.lang.String str39 = bookRequest24.getBookTitle();
        java.lang.String str40 = bookRequest24.getRequester();
        java.lang.String str41 = bookRequest24.getBookTitle();
        int int42 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest28", (bookRequest7.compareTo(bookRequest28) == 0) == bookRequest7.equals(bookRequest28));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest18.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 1);
        java.lang.String str25 = bookRequest24.getBookTitle();
        int int26 = bookRequest18.compareTo(bookRequest24);
        int int27 = bookRequest14.compareTo(bookRequest24);
        java.lang.String str28 = bookRequest14.getRequester();
        int int29 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
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
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", 97);
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getBookTitle();
        int int29 = bookRequest22.compareTo(bookRequest26);
        java.lang.String str30 = bookRequest22.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", (int) (byte) 0);
        java.lang.String str35 = bookRequest34.getBookTitle();
        int int36 = bookRequest22.compareTo(bookRequest34);
        int int37 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest26", (bookRequest8.compareTo(bookRequest26) == 0) == bookRequest8.equals(bookRequest26));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str13 = bookRequest12.getRequester();
        java.lang.String str14 = bookRequest12.getBookTitle();
        int int15 = bookRequest8.compareTo(bookRequest12);
        java.lang.String str16 = bookRequest8.getRequester();
        java.lang.String str17 = bookRequest8.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str22 = bookRequest21.getRequester();
        int int23 = bookRequest21.getPriority();
        int int24 = bookRequest8.compareTo(bookRequest21);
        int int25 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "", 100);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str38 = bookRequest37.getRequester();
        java.lang.String str39 = bookRequest37.getBookTitle();
        int int40 = bookRequest33.compareTo(bookRequest37);
        java.lang.String str41 = bookRequest33.getRequester();
        java.lang.String str42 = bookRequest33.getRequester();
        java.lang.String str43 = bookRequest33.getBookTitle();
        int int44 = bookRequest27.compareTo(bookRequest33);
        int int45 = bookRequest21.compareTo(bookRequest27);
        java.lang.String str46 = bookRequest27.getBookTitle();
        int int47 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest37", (bookRequest10.compareTo(bookRequest37) == 0) == bookRequest10.equals(bookRequest37));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str22 = bookRequest21.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 0);
        int int31 = bookRequest26.compareTo(bookRequest30);
        int int32 = bookRequest21.compareTo(bookRequest30);
        java.lang.String str33 = bookRequest30.getBookTitle();
        java.lang.String str34 = bookRequest30.getBookTitle();
        java.lang.String str35 = bookRequest30.getBookTitle();
        java.lang.String str36 = bookRequest30.getRequester();
        int int37 = bookRequest30.getPriority();
        java.lang.String str38 = bookRequest30.getRequester();
        int int39 = bookRequest13.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        int int15 = bookRequest13.getPriority();
        java.lang.String str16 = bookRequest13.getRequester();
        java.lang.String str17 = bookRequest13.getRequester();
        int int18 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest13", (bookRequest7.compareTo(bookRequest13) == 0) == bookRequest7.equals(bookRequest13));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 100);
        java.lang.String str19 = bookRequest18.getBookTitle();
        java.lang.String str20 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str35 = bookRequest34.getRequester();
        java.lang.String str36 = bookRequest34.getBookTitle();
        int int37 = bookRequest30.compareTo(bookRequest34);
        java.lang.String str38 = bookRequest30.getRequester();
        java.lang.String str39 = bookRequest30.getRequester();
        java.lang.String str40 = bookRequest30.getBookTitle();
        int int41 = bookRequest24.compareTo(bookRequest30);
        int int42 = bookRequest18.compareTo(bookRequest24);
        int int43 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest34", (bookRequest8.compareTo(bookRequest34) == 0) == bookRequest8.equals(bookRequest34));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getBookTitle();
        int int12 = bookRequest3.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        java.lang.String str18 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) '#');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) ' ');
        int int29 = bookRequest22.compareTo(bookRequest28);
        java.lang.String str30 = bookRequest22.getRequester();
        int int31 = bookRequest16.compareTo(bookRequest22);
        int int32 = bookRequest22.getPriority();
        int int33 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
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
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest31 = new request.BookRequest("", "hi!", 0);
        int int32 = bookRequest27.compareTo(bookRequest31);
        request.BookRequest bookRequest36 = new request.BookRequest("", "", 1);
        java.lang.String str37 = bookRequest36.getBookTitle();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str42 = bookRequest41.getRequester();
        int int43 = bookRequest41.getPriority();
        java.lang.String str44 = bookRequest41.getBookTitle();
        java.lang.String str45 = bookRequest41.getRequester();
        int int46 = bookRequest41.getPriority();
        int int47 = bookRequest36.compareTo(bookRequest41);
        int int48 = bookRequest31.compareTo(bookRequest41);
        int int49 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest27", (bookRequest9.compareTo(bookRequest27) == 0) == bookRequest9.equals(bookRequest27));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
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
        java.lang.String str24 = bookRequest9.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        int int32 = bookRequest28.getPriority();
        int int33 = bookRequest9.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
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
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        java.lang.String str19 = bookRequest17.getRequester();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getBookTitle();
        java.lang.String str22 = bookRequest17.getRequester();
        java.lang.String str23 = bookRequest17.getRequester();
        int int24 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
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
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getRequester();
        java.lang.String str32 = bookRequest29.getRequester();
        int int33 = bookRequest29.getPriority();
        java.lang.String str34 = bookRequest29.getBookTitle();
        java.lang.String str35 = bookRequest29.getBookTitle();
        int int36 = bookRequest20.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", 97);
        java.lang.String str17 = bookRequest16.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) ' ');
        int int22 = bookRequest16.compareTo(bookRequest21);
        int int23 = bookRequest12.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest12.getRequester();
        java.lang.String str25 = bookRequest12.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", 1);
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.String str13 = bookRequest10.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
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
        int int27 = bookRequest3.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest35 = new request.BookRequest("", "hi!", 97);
        int int36 = bookRequest35.getPriority();
        java.lang.String str37 = bookRequest35.getBookTitle();
        int int38 = bookRequest31.compareTo(bookRequest35);
        java.lang.String str39 = bookRequest31.getRequester();
        request.BookRequest bookRequest43 = new request.BookRequest("", "hi!", (int) (byte) 0);
        java.lang.String str44 = bookRequest43.getBookTitle();
        int int45 = bookRequest31.compareTo(bookRequest43);
        int int46 = bookRequest3.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest35", (bookRequest16.compareTo(bookRequest35) == 0) == bookRequest16.equals(bookRequest35));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getRequester();
        int int17 = bookRequest14.getPriority();
        java.lang.String str18 = bookRequest14.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str23 = bookRequest22.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (short) 0);
        int int32 = bookRequest27.compareTo(bookRequest31);
        int int33 = bookRequest22.compareTo(bookRequest31);
        int int34 = bookRequest22.getPriority();
        int int35 = bookRequest22.getPriority();
        java.lang.String str36 = bookRequest22.getRequester();
        int int37 = bookRequest14.compareTo(bookRequest22);
        java.lang.String str38 = bookRequest14.getRequester();
        int int39 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str9 = bookRequest8.getRequester();
        int int10 = bookRequest8.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", 1);
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest8.compareTo(bookRequest14);
        int int17 = bookRequest3.compareTo(bookRequest14);
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int22 = bookRequest21.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str31 = bookRequest30.getBookTitle();
        java.lang.String str32 = bookRequest30.getRequester();
        int int33 = bookRequest30.getPriority();
        int int34 = bookRequest26.compareTo(bookRequest30);
        int int35 = bookRequest21.compareTo(bookRequest30);
        java.lang.String str36 = bookRequest30.getBookTitle();
        int int37 = bookRequest14.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest21", (bookRequest14.compareTo(bookRequest21) == 0) == bookRequest14.equals(bookRequest21));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) '#');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        int int18 = bookRequest15.getPriority();
        java.lang.String str19 = bookRequest15.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        request.BookRequest bookRequest33 = new request.BookRequest("", "", 1);
        java.lang.String str34 = bookRequest33.getBookTitle();
        int int35 = bookRequest27.compareTo(bookRequest33);
        int int36 = bookRequest23.compareTo(bookRequest33);
        int int37 = bookRequest15.compareTo(bookRequest23);
        int int38 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) ' ');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        int int17 = bookRequest12.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        java.lang.String str19 = bookRequest16.getRequester();
        java.lang.String str20 = bookRequest16.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest9.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str17 = bookRequest16.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (short) 0);
        int int26 = bookRequest21.compareTo(bookRequest25);
        int int27 = bookRequest16.compareTo(bookRequest25);
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getBookTitle();
        java.lang.String str30 = bookRequest25.getBookTitle();
        java.lang.String str31 = bookRequest25.getRequester();
        java.lang.String str32 = bookRequest25.getBookTitle();
        java.lang.String str33 = bookRequest25.getRequester();
        java.lang.String str34 = bookRequest25.getBookTitle();
        int int35 = bookRequest9.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 1);
        java.lang.String str23 = bookRequest22.getBookTitle();
        int int24 = bookRequest16.compareTo(bookRequest22);
        int int25 = bookRequest12.compareTo(bookRequest22);
        int int26 = bookRequest22.getPriority();
        java.lang.String str27 = bookRequest22.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest22", (bookRequest7.compareTo(bookRequest22) == 0) == bookRequest7.equals(bookRequest22));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
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
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        int int24 = bookRequest21.getPriority();
        java.lang.String str25 = bookRequest21.getBookTitle();
        java.lang.String str26 = bookRequest21.getRequester();
        java.lang.String str27 = bookRequest21.getRequester();
        int int28 = bookRequest21.getPriority();
        int int29 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest21", (bookRequest9.compareTo(bookRequest21) == 0) == bookRequest9.equals(bookRequest21));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str9 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest13.getPriority();
        int int17 = bookRequest8.compareTo(bookRequest13);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str22 = bookRequest21.getRequester();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getRequester();
        int int26 = bookRequest21.getPriority();
        java.lang.String str27 = bookRequest21.getBookTitle();
        int int28 = bookRequest21.getPriority();
        int int29 = bookRequest21.getPriority();
        java.lang.String str30 = bookRequest21.getRequester();
        java.lang.String str31 = bookRequest21.getBookTitle();
        int int32 = bookRequest13.compareTo(bookRequest21);
        int int33 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", 0);
        java.lang.String str23 = bookRequest22.getBookTitle();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getRequester();
        int int26 = bookRequest12.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest22", (bookRequest12.compareTo(bookRequest22) == 0) == bookRequest12.equals(bookRequest22));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
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
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        java.lang.String str24 = bookRequest21.getRequester();
        java.lang.String str25 = bookRequest21.getBookTitle();
        int int26 = bookRequest21.getPriority();
        java.lang.String str27 = bookRequest21.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str16 = bookRequest15.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getBookTitle();
        int int24 = bookRequest15.compareTo(bookRequest20);
        java.lang.String str25 = bookRequest15.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getRequester();
        java.lang.String str14 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int19 = bookRequest11.compareTo(bookRequest18);
        int int20 = bookRequest11.getPriority();
        java.lang.String str21 = bookRequest11.getRequester();
        java.lang.String str22 = bookRequest11.getBookTitle();
        int int23 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getBookTitle();
        java.lang.String str22 = bookRequest17.getBookTitle();
        java.lang.String str23 = bookRequest17.getBookTitle();
        java.lang.String str24 = bookRequest17.getRequester();
        int int25 = bookRequest17.getPriority();
        java.lang.String str26 = bookRequest17.getBookTitle();
        int int27 = bookRequest17.getPriority();
        int int28 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest17", (bookRequest7.compareTo(bookRequest17) == 0) == bookRequest7.equals(bookRequest17));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
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
        java.lang.String str22 = bookRequest3.getBookTitle();
        int int23 = bookRequest3.getPriority();
        request.BookRequest bookRequest27 = new request.BookRequest("", "", 1);
        java.lang.String str28 = bookRequest27.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str33 = bookRequest32.getRequester();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getRequester();
        int int37 = bookRequest32.getPriority();
        int int38 = bookRequest27.compareTo(bookRequest32);
        int int39 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest32", (bookRequest3.compareTo(bookRequest32) == 0) == bookRequest3.equals(bookRequest32));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
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
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.getRequester();
        java.lang.String str35 = bookRequest32.getRequester();
        java.lang.String str36 = bookRequest32.getRequester();
        request.BookRequest bookRequest40 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str41 = bookRequest40.getBookTitle();
        java.lang.String str42 = bookRequest40.getBookTitle();
        int int43 = bookRequest32.compareTo(bookRequest40);
        int int44 = bookRequest9.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest40", (bookRequest15.compareTo(bookRequest40) == 0) == bookRequest15.equals(bookRequest40));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        java.lang.String str32 = bookRequest28.getBookTitle();
        int int33 = bookRequest28.getPriority();
        java.lang.String str34 = bookRequest28.getBookTitle();
        int int35 = bookRequest28.getPriority();
        int int36 = bookRequest13.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
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
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getBookTitle();
        int int33 = bookRequest26.compareTo(bookRequest30);
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) 'a');
        int int38 = bookRequest37.getPriority();
        java.lang.String str39 = bookRequest37.getRequester();
        java.lang.String str40 = bookRequest37.getRequester();
        java.lang.String str41 = bookRequest37.getBookTitle();
        java.lang.String str42 = bookRequest37.getBookTitle();
        java.lang.String str43 = bookRequest37.getRequester();
        int int44 = bookRequest37.getPriority();
        java.lang.String str45 = bookRequest37.getBookTitle();
        int int46 = bookRequest30.compareTo(bookRequest37);
        java.lang.String str47 = bookRequest37.getBookTitle();
        int int48 = bookRequest17.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest37", (bookRequest7.compareTo(bookRequest37) == 0) == bookRequest7.equals(bookRequest37));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str21 = bookRequest20.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (short) 0);
        int int30 = bookRequest25.compareTo(bookRequest29);
        int int31 = bookRequest20.compareTo(bookRequest29);
        int int32 = bookRequest20.getPriority();
        java.lang.String str33 = bookRequest20.getRequester();
        int int34 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest8.getRequester();
        int int15 = bookRequest8.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", 10);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getRequester();
        int int27 = bookRequest23.getPriority();
        java.lang.String str28 = bookRequest23.getBookTitle();
        int int29 = bookRequest23.getPriority();
        int int30 = bookRequest19.compareTo(bookRequest23);
        int int31 = bookRequest23.getPriority();
        int int32 = bookRequest8.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest19.compareTo(bookRequest23);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int29 = bookRequest19.compareTo(bookRequest28);
        int int30 = bookRequest19.getPriority();
        java.lang.String str31 = bookRequest19.getRequester();
        java.lang.String str32 = bookRequest19.getRequester();
        int int33 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str26 = bookRequest25.getRequester();
        java.lang.String str27 = bookRequest25.getBookTitle();
        int int28 = bookRequest25.getPriority();
        java.lang.String str29 = bookRequest25.getRequester();
        int int30 = bookRequest19.compareTo(bookRequest25);
        java.lang.String str31 = bookRequest19.getRequester();
        java.lang.String str32 = bookRequest19.getRequester();
        java.lang.String str33 = bookRequest19.getBookTitle();
        int int34 = bookRequest19.getPriority();
        int int35 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest25", (bookRequest10.compareTo(bookRequest25) == 0) == bookRequest10.equals(bookRequest25));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
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
        java.lang.String str21 = bookRequest3.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getRequester();
        java.lang.String str32 = bookRequest29.getBookTitle();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int37 = bookRequest29.compareTo(bookRequest36);
        int int38 = bookRequest29.getPriority();
        java.lang.String str39 = bookRequest29.getRequester();
        int int40 = bookRequest25.compareTo(bookRequest29);
        int int41 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "hi!", (int) (byte) 0);
        int int16 = bookRequest15.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest24.getPriority();
        java.lang.String str28 = bookRequest24.getBookTitle();
        java.lang.String str29 = bookRequest24.getRequester();
        java.lang.String str30 = bookRequest24.getBookTitle();
        java.lang.String str31 = bookRequest24.getRequester();
        java.lang.String str32 = bookRequest24.getBookTitle();
        java.lang.String str33 = bookRequest24.getRequester();
        int int34 = bookRequest20.compareTo(bookRequest24);
        int int35 = bookRequest15.compareTo(bookRequest24);
        int int36 = bookRequest7.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        java.lang.String str22 = bookRequest19.getRequester();
        java.lang.String str23 = bookRequest19.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("", "", 35);
        int int28 = bookRequest19.compareTo(bookRequest27);
        int int29 = bookRequest27.getPriority();
        int int30 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str26 = bookRequest25.getBookTitle();
        java.lang.String str27 = bookRequest25.getRequester();
        java.lang.String str28 = bookRequest25.getRequester();
        java.lang.String str29 = bookRequest25.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str34 = bookRequest33.getBookTitle();
        java.lang.String str35 = bookRequest33.getBookTitle();
        int int36 = bookRequest25.compareTo(bookRequest33);
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str41 = bookRequest40.getRequester();
        java.lang.String str42 = bookRequest40.getBookTitle();
        int int43 = bookRequest40.getPriority();
        java.lang.String str44 = bookRequest40.getBookTitle();
        java.lang.String str45 = bookRequest40.getRequester();
        java.lang.String str46 = bookRequest40.getBookTitle();
        java.lang.String str47 = bookRequest40.getRequester();
        java.lang.String str48 = bookRequest40.getBookTitle();
        java.lang.String str49 = bookRequest40.getRequester();
        request.BookRequest bookRequest53 = new request.BookRequest("hi!", "", (int) 'a');
        int int54 = bookRequest53.getPriority();
        int int55 = bookRequest53.getPriority();
        java.lang.String str56 = bookRequest53.getBookTitle();
        int int57 = bookRequest53.getPriority();
        int int58 = bookRequest53.getPriority();
        java.lang.String str59 = bookRequest53.getRequester();
        int int60 = bookRequest40.compareTo(bookRequest53);
        int int61 = bookRequest25.compareTo(bookRequest40);
        java.lang.String str62 = bookRequest40.getBookTitle();
        int int63 = bookRequest17.compareTo(bookRequest40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest53", (bookRequest12.compareTo(bookRequest53) == 0) == bookRequest12.equals(bookRequest53));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
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
        java.lang.String str24 = bookRequest9.getRequester();
        java.lang.String str25 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str30 = bookRequest29.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str35 = bookRequest34.getRequester();
        java.lang.String str36 = bookRequest34.getBookTitle();
        int int37 = bookRequest34.getPriority();
        int int38 = bookRequest29.compareTo(bookRequest34);
        int int39 = bookRequest9.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest22 and bookRequest29", (bookRequest22.compareTo(bookRequest29) == 0) == bookRequest22.equals(bookRequest29));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
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
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str29 = bookRequest28.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) 'a');
        int int38 = bookRequest37.getPriority();
        int int39 = bookRequest37.getPriority();
        java.lang.String str40 = bookRequest37.getBookTitle();
        java.lang.String str41 = bookRequest37.getRequester();
        java.lang.String str42 = bookRequest37.getBookTitle();
        int int43 = bookRequest37.getPriority();
        java.lang.String str44 = bookRequest37.getBookTitle();
        int int45 = bookRequest33.compareTo(bookRequest37);
        java.lang.String str46 = bookRequest33.getBookTitle();
        int int47 = bookRequest28.compareTo(bookRequest33);
        java.lang.String str48 = bookRequest28.getRequester();
        java.lang.String str49 = bookRequest28.getRequester();
        int int50 = bookRequest12.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 100);
        java.lang.String str30 = bookRequest29.getBookTitle();
        java.lang.String str31 = bookRequest29.getBookTitle();
        java.lang.String str32 = bookRequest29.getRequester();
        int int33 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest19 and bookRequest29", (bookRequest19.compareTo(bookRequest29) == 0) == bookRequest19.equals(bookRequest29));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
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
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", 0);
        java.lang.String str39 = bookRequest38.getBookTitle();
        int int40 = bookRequest21.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest21 and bookRequest38", (bookRequest21.compareTo(bookRequest38) == 0) == bookRequest21.equals(bookRequest38));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
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
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str33 = bookRequest32.getRequester();
        java.lang.String str34 = bookRequest32.getBookTitle();
        int int35 = bookRequest28.compareTo(bookRequest32);
        java.lang.String str36 = bookRequest28.getRequester();
        java.lang.String str37 = bookRequest28.getRequester();
        java.lang.String str38 = bookRequest28.getBookTitle();
        java.lang.String str39 = bookRequest28.getRequester();
        int int40 = bookRequest28.getPriority();
        int int41 = bookRequest28.getPriority();
        java.lang.String str42 = bookRequest28.getRequester();
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "", 0);
        java.lang.String str47 = bookRequest46.getBookTitle();
        request.BookRequest bookRequest51 = new request.BookRequest("hi!", "", (int) 'a');
        int int52 = bookRequest51.getPriority();
        int int53 = bookRequest51.getPriority();
        java.lang.String str54 = bookRequest51.getBookTitle();
        java.lang.String str55 = bookRequest51.getBookTitle();
        int int56 = bookRequest46.compareTo(bookRequest51);
        java.lang.String str57 = bookRequest46.getBookTitle();
        java.lang.String str58 = bookRequest46.getBookTitle();
        int int59 = bookRequest28.compareTo(bookRequest46);
        int int60 = bookRequest3.compareTo(bookRequest46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest51", (bookRequest13.compareTo(bookRequest51) == 0) == bookRequest13.equals(bookRequest51));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 52);
        int int12 = bookRequest3.compareTo(bookRequest11);
        int int13 = bookRequest3.getPriority();
        int int14 = bookRequest3.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", 100);
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getRequester();
        int int25 = bookRequest22.getPriority();
        int int26 = bookRequest22.getPriority();
        java.lang.String str27 = bookRequest22.getBookTitle();
        int int28 = bookRequest22.getPriority();
        java.lang.String str29 = bookRequest22.getBookTitle();
        int int30 = bookRequest22.getPriority();
        java.lang.String str31 = bookRequest22.getRequester();
        int int32 = bookRequest22.getPriority();
        int int33 = bookRequest18.compareTo(bookRequest22);
        int int34 = bookRequest18.getPriority();
        java.lang.String str35 = bookRequest18.getRequester();
        int int36 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) '4');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str8 = bookRequest7.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 0);
        int int17 = bookRequest12.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        java.lang.String str19 = bookRequest16.getBookTitle();
        int int20 = bookRequest16.getPriority();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest16);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        int int30 = bookRequest27.getPriority();
        java.lang.String str31 = bookRequest27.getRequester();
        java.lang.String str32 = bookRequest27.getBookTitle();
        int int33 = bookRequest27.getPriority();
        java.lang.String str34 = bookRequest27.getRequester();
        java.lang.String str35 = bookRequest27.getBookTitle();
        int int36 = bookRequest27.getPriority();
        int int37 = bookRequest27.getPriority();
        int int38 = bookRequest27.getPriority();
        int int39 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest27", (bookRequest12.compareTo(bookRequest27) == 0) == bookRequest12.equals(bookRequest27));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str13 = bookRequest3.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str22 = bookRequest21.getRequester();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getRequester();
        int int26 = bookRequest21.getPriority();
        java.lang.String str27 = bookRequest21.getBookTitle();
        int int28 = bookRequest21.getPriority();
        int int29 = bookRequest21.getPriority();
        int int30 = bookRequest17.compareTo(bookRequest21);
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) (byte) 10);
        int int35 = bookRequest34.getPriority();
        int int36 = bookRequest21.compareTo(bookRequest34);
        java.lang.String str37 = bookRequest21.getRequester();
        int int38 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
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
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 1);
        java.lang.String str25 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        java.lang.String str33 = bookRequest29.getRequester();
        int int34 = bookRequest29.getPriority();
        int int35 = bookRequest24.compareTo(bookRequest29);
        java.lang.String str36 = bookRequest29.getBookTitle();
        int int37 = bookRequest29.getPriority();
        int int38 = bookRequest12.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest29", (bookRequest8.compareTo(bookRequest29) == 0) == bookRequest8.equals(bookRequest29));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str26 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        java.lang.String str32 = bookRequest30.getRequester();
        int int33 = bookRequest30.getPriority();
        java.lang.String str34 = bookRequest30.getBookTitle();
        java.lang.String str35 = bookRequest30.getRequester();
        java.lang.String str36 = bookRequest30.getRequester();
        int int37 = bookRequest25.compareTo(bookRequest30);
        java.lang.String str38 = bookRequest25.getRequester();
        java.lang.String str39 = bookRequest25.getBookTitle();
        java.lang.String str40 = bookRequest25.getBookTitle();
        int int41 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest30", (bookRequest3.compareTo(bookRequest30) == 0) == bookRequest3.equals(bookRequest30));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", 97);
        java.lang.String str26 = bookRequest25.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) ' ');
        int int31 = bookRequest25.compareTo(bookRequest30);
        int int32 = bookRequest9.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str26 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getBookTitle();
        int int33 = bookRequest30.getPriority();
        int int34 = bookRequest25.compareTo(bookRequest30);
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str39 = bookRequest38.getRequester();
        int int40 = bookRequest38.getPriority();
        java.lang.String str41 = bookRequest38.getBookTitle();
        java.lang.String str42 = bookRequest38.getRequester();
        int int43 = bookRequest38.getPriority();
        java.lang.String str44 = bookRequest38.getBookTitle();
        int int45 = bookRequest38.getPriority();
        int int46 = bookRequest38.getPriority();
        java.lang.String str47 = bookRequest38.getRequester();
        java.lang.String str48 = bookRequest38.getBookTitle();
        int int49 = bookRequest30.compareTo(bookRequest38);
        int int50 = bookRequest30.getPriority();
        int int51 = bookRequest19.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest38", (bookRequest9.compareTo(bookRequest38) == 0) == bookRequest9.equals(bookRequest38));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", 97);
        java.lang.String str17 = bookRequest16.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) ' ');
        int int22 = bookRequest16.compareTo(bookRequest21);
        int int23 = bookRequest7.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
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
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest18.getPriority();
        int int22 = bookRequest18.getPriority();
        int int23 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
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
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "hi!", 0);
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        int int33 = bookRequest30.getPriority();
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str38 = bookRequest37.getRequester();
        java.lang.String str39 = bookRequest37.getBookTitle();
        int int40 = bookRequest37.getPriority();
        java.lang.String str41 = bookRequest37.getBookTitle();
        java.lang.String str42 = bookRequest37.getRequester();
        int int43 = bookRequest30.compareTo(bookRequest37);
        request.BookRequest bookRequest47 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str48 = bookRequest47.getBookTitle();
        int int49 = bookRequest47.getPriority();
        java.lang.String str50 = bookRequest47.getBookTitle();
        java.lang.String str51 = bookRequest47.getBookTitle();
        int int52 = bookRequest30.compareTo(bookRequest47);
        java.lang.String str53 = bookRequest30.getRequester();
        int int54 = bookRequest24.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest37", (bookRequest9.compareTo(bookRequest37) == 0) == bookRequest9.equals(bookRequest37));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
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
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", (int) '4');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getBookTitle();
        java.lang.String str30 = bookRequest27.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", 0);
        java.lang.String str35 = bookRequest34.getBookTitle();
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", (int) 'a');
        int int40 = bookRequest39.getPriority();
        int int41 = bookRequest39.getPriority();
        java.lang.String str42 = bookRequest39.getBookTitle();
        java.lang.String str43 = bookRequest39.getBookTitle();
        int int44 = bookRequest34.compareTo(bookRequest39);
        request.BookRequest bookRequest48 = new request.BookRequest("", "", (int) (byte) 10);
        int int49 = bookRequest48.getPriority();
        int int50 = bookRequest34.compareTo(bookRequest48);
        int int51 = bookRequest27.compareTo(bookRequest34);
        java.lang.String str52 = bookRequest27.getRequester();
        java.lang.String str53 = bookRequest27.getBookTitle();
        int int54 = bookRequest7.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest39", (bookRequest7.compareTo(bookRequest39) == 0) == bookRequest7.equals(bookRequest39));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '4');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 100);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        java.lang.String str14 = bookRequest7.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", 100);
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getRequester();
        int int25 = bookRequest22.getPriority();
        int int26 = bookRequest22.getPriority();
        java.lang.String str27 = bookRequest22.getBookTitle();
        int int28 = bookRequest22.getPriority();
        java.lang.String str29 = bookRequest22.getBookTitle();
        int int30 = bookRequest22.getPriority();
        java.lang.String str31 = bookRequest22.getRequester();
        int int32 = bookRequest22.getPriority();
        int int33 = bookRequest18.compareTo(bookRequest22);
        java.lang.String str34 = bookRequest18.getBookTitle();
        int int35 = bookRequest7.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest18", (bookRequest7.compareTo(bookRequest18) == 0) == bookRequest7.equals(bookRequest18));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        int int30 = bookRequest27.getPriority();
        int int31 = bookRequest27.getPriority();
        java.lang.String str32 = bookRequest27.getBookTitle();
        int int33 = bookRequest27.getPriority();
        java.lang.String str34 = bookRequest27.getBookTitle();
        int int35 = bookRequest27.getPriority();
        java.lang.String str36 = bookRequest27.getRequester();
        int int37 = bookRequest27.getPriority();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) '4');
        int int42 = bookRequest27.compareTo(bookRequest41);
        java.lang.String str43 = bookRequest41.getRequester();
        int int44 = bookRequest41.getPriority();
        int int45 = bookRequest17.compareTo(bookRequest41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest41", (bookRequest3.compareTo(bookRequest41) == 0) == bookRequest3.equals(bookRequest41));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getBookTitle();
        java.lang.String str26 = bookRequest22.getBookTitle();
        int int27 = bookRequest22.getPriority();
        int int28 = bookRequest22.getPriority();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int33 = bookRequest22.compareTo(bookRequest32);
        java.lang.String str34 = bookRequest22.getRequester();
        int int35 = bookRequest22.getPriority();
        java.lang.String str36 = bookRequest22.getBookTitle();
        int int37 = bookRequest9.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
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
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str31 = bookRequest30.getBookTitle();
        java.lang.String str32 = bookRequest30.getRequester();
        int int33 = bookRequest30.getPriority();
        java.lang.String str34 = bookRequest30.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        int int39 = bookRequest38.getPriority();
        java.lang.String str40 = bookRequest38.getRequester();
        int int41 = bookRequest38.getPriority();
        java.lang.String str42 = bookRequest38.getRequester();
        java.lang.String str43 = bookRequest38.getBookTitle();
        int int44 = bookRequest38.getPriority();
        java.lang.String str45 = bookRequest38.getRequester();
        java.lang.String str46 = bookRequest38.getBookTitle();
        int int47 = bookRequest30.compareTo(bookRequest38);
        request.BookRequest bookRequest51 = new request.BookRequest("hi!", "hi!", 52);
        int int52 = bookRequest30.compareTo(bookRequest51);
        int int53 = bookRequest11.compareTo(bookRequest51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest38", (bookRequest3.compareTo(bookRequest38) == 0) == bookRequest3.equals(bookRequest38));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) ' ');
        int int14 = bookRequest13.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest18.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 1);
        java.lang.String str25 = bookRequest24.getBookTitle();
        int int26 = bookRequest18.compareTo(bookRequest24);
        int int27 = bookRequest13.compareTo(bookRequest24);
        java.lang.String str28 = bookRequest13.getRequester();
        java.lang.String str29 = bookRequest13.getBookTitle();
        int int30 = bookRequest13.getPriority();
        int int31 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
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
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        int int34 = bookRequest32.getPriority();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str39 = bookRequest38.getRequester();
        java.lang.String str40 = bookRequest38.getRequester();
        int int41 = bookRequest32.compareTo(bookRequest38);
        java.lang.String str42 = bookRequest32.getRequester();
        int int43 = bookRequest10.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest32", (bookRequest15.compareTo(bookRequest32) == 0) == bookRequest15.equals(bookRequest32));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        int int21 = bookRequest16.compareTo(bookRequest20);
        int int22 = bookRequest11.compareTo(bookRequest20);
        request.BookRequest bookRequest26 = new request.BookRequest("", "", 1);
        int int27 = bookRequest20.compareTo(bookRequest26);
        java.lang.String str28 = bookRequest20.getRequester();
        java.lang.String str29 = bookRequest20.getRequester();
        java.lang.String str30 = bookRequest20.getBookTitle();
        int int31 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) '#');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getRequester();
        java.lang.String str16 = bookRequest13.getBookTitle();
        int int17 = bookRequest13.getPriority();
        int int18 = bookRequest13.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getBookTitle();
        java.lang.String str26 = bookRequest22.getBookTitle();
        int int27 = bookRequest22.getPriority();
        java.lang.String str28 = bookRequest22.getBookTitle();
        java.lang.String str29 = bookRequest22.getBookTitle();
        java.lang.String str30 = bookRequest22.getRequester();
        int int31 = bookRequest22.getPriority();
        int int32 = bookRequest13.compareTo(bookRequest22);
        int int33 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest22", (bookRequest7.compareTo(bookRequest22) == 0) == bookRequest7.equals(bookRequest22));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
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
        java.lang.String str21 = bookRequest3.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getBookTitle();
        int int30 = bookRequest25.getPriority();
        java.lang.String str31 = bookRequest25.getBookTitle();
        java.lang.String str32 = bookRequest25.getRequester();
        int int33 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "hi!", (int) (byte) 0);
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest8", (bookRequest3.compareTo(bookRequest8) == 0) == bookRequest3.equals(bookRequest8));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
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
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (byte) 100);
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        request.BookRequest bookRequest36 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) 'a');
        int int41 = bookRequest40.getPriority();
        java.lang.String str42 = bookRequest40.getRequester();
        java.lang.String str43 = bookRequest40.getRequester();
        java.lang.String str44 = bookRequest40.getRequester();
        int int45 = bookRequest36.compareTo(bookRequest40);
        int int46 = bookRequest36.getPriority();
        int int47 = bookRequest30.compareTo(bookRequest36);
        java.lang.String str48 = bookRequest36.getBookTitle();
        int int49 = bookRequest3.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest40", (bookRequest11.compareTo(bookRequest40) == 0) == bookRequest11.equals(bookRequest40));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        java.lang.String str19 = bookRequest16.getRequester();
        int int20 = bookRequest16.getPriority();
        java.lang.String str21 = bookRequest16.getBookTitle();
        int int22 = bookRequest16.getPriority();
        int int23 = bookRequest9.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        int int16 = bookRequest3.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", 97);
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getBookTitle();
        int int23 = bookRequest20.getPriority();
        int int24 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest20", (bookRequest8.compareTo(bookRequest20) == 0) == bookRequest8.equals(bookRequest20));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest13);
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int21 = bookRequest20.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (byte) 10);
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest20.compareTo(bookRequest25);
        int int28 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str26 = bookRequest25.getRequester();
        java.lang.String str27 = bookRequest25.getRequester();
        java.lang.String str28 = bookRequest25.getBookTitle();
        int int29 = bookRequest25.getPriority();
        java.lang.String str30 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", 0);
        int int35 = bookRequest25.compareTo(bookRequest34);
        int int36 = bookRequest19.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest25", (bookRequest8.compareTo(bookRequest25) == 0) == bookRequest8.equals(bookRequest25));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
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
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", 0);
        java.lang.String str40 = bookRequest39.getBookTitle();
        int int41 = bookRequest39.getPriority();
        java.lang.String str42 = bookRequest39.getBookTitle();
        java.lang.String str43 = bookRequest39.getRequester();
        java.lang.String str44 = bookRequest39.getBookTitle();
        request.BookRequest bookRequest48 = new request.BookRequest("hi!", "", 100);
        int int49 = bookRequest39.compareTo(bookRequest48);
        int int50 = bookRequest11.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest20 and bookRequest39", (bookRequest20.compareTo(bookRequest39) == 0) == bookRequest20.equals(bookRequest39));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
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
        int int24 = bookRequest16.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", 1);
        java.lang.String str29 = bookRequest28.getBookTitle();
        java.lang.String str30 = bookRequest28.getBookTitle();
        java.lang.String str31 = bookRequest28.getRequester();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str36 = bookRequest35.getRequester();
        int int37 = bookRequest35.getPriority();
        java.lang.String str38 = bookRequest35.getBookTitle();
        java.lang.String str39 = bookRequest35.getRequester();
        int int40 = bookRequest35.getPriority();
        java.lang.String str41 = bookRequest35.getBookTitle();
        int int42 = bookRequest35.getPriority();
        int int43 = bookRequest28.compareTo(bookRequest35);
        int int44 = bookRequest28.getPriority();
        int int45 = bookRequest16.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest28", (bookRequest8.compareTo(bookRequest28) == 0) == bookRequest8.equals(bookRequest28));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
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
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest17.getPriority();
        int int23 = bookRequest17.getPriority();
        int int24 = bookRequest17.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str29 = bookRequest28.getRequester();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "hi!", 100);
        int int36 = bookRequest28.compareTo(bookRequest35);
        int int37 = bookRequest17.compareTo(bookRequest28);
        java.lang.String str38 = bookRequest28.getBookTitle();
        int int39 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        int int16 = bookRequest8.compareTo(bookRequest12);
        int int17 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest21 = new request.BookRequest("", "", 1);
        java.lang.String str22 = bookRequest21.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str27 = bookRequest26.getRequester();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getRequester();
        int int31 = bookRequest26.getPriority();
        int int32 = bookRequest21.compareTo(bookRequest26);
        int int33 = bookRequest21.getPriority();
        java.lang.String str34 = bookRequest21.getRequester();
        java.lang.String str35 = bookRequest21.getBookTitle();
        java.lang.String str36 = bookRequest21.getBookTitle();
        int int37 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getRequester();
        java.lang.String str16 = bookRequest13.getBookTitle();
        java.lang.String str17 = bookRequest13.getBookTitle();
        int int18 = bookRequest13.getPriority();
        java.lang.String str19 = bookRequest13.getRequester();
        int int20 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest23.compareTo(bookRequest27);
        int int29 = bookRequest27.getPriority();
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str34 = bookRequest33.getBookTitle();
        int int35 = bookRequest27.compareTo(bookRequest33);
        int int36 = bookRequest3.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest27", (bookRequest7.compareTo(bookRequest27) == 0) == bookRequest7.equals(bookRequest27));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str23 = bookRequest22.getRequester();
        int int24 = bookRequest18.compareTo(bookRequest22);
        java.lang.String str25 = bookRequest22.getBookTitle();
        java.lang.String str26 = bookRequest22.getRequester();
        java.lang.String str27 = bookRequest22.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) '#');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest13.getPriority();
        java.lang.String str17 = bookRequest13.getRequester();
        java.lang.String str18 = bookRequest13.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str23 = bookRequest22.getRequester();
        int int24 = bookRequest22.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        int int32 = bookRequest28.getPriority();
        int int33 = bookRequest28.getPriority();
        int int34 = bookRequest22.compareTo(bookRequest28);
        request.BookRequest bookRequest38 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int39 = bookRequest28.compareTo(bookRequest38);
        int int40 = bookRequest13.compareTo(bookRequest28);
        java.lang.String str41 = bookRequest28.getBookTitle();
        int int42 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
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
        java.lang.String str22 = bookRequest3.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getRequester();
        int int29 = bookRequest26.getPriority();
        java.lang.String str30 = bookRequest26.getRequester();
        java.lang.String str31 = bookRequest26.getBookTitle();
        int int32 = bookRequest26.getPriority();
        java.lang.String str33 = bookRequest26.getRequester();
        java.lang.String str34 = bookRequest26.getBookTitle();
        int int35 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest26", (bookRequest14.compareTo(bookRequest26) == 0) == bookRequest14.equals(bookRequest26));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getRequester();
        int int24 = bookRequest20.getPriority();
        java.lang.String str25 = bookRequest20.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest20", (bookRequest8.compareTo(bookRequest20) == 0) == bookRequest8.equals(bookRequest20));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
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
        java.lang.String str27 = bookRequest3.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "hi!", (int) '4');
        java.lang.String str32 = bookRequest31.getBookTitle();
        int int33 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest22 and bookRequest31", (bookRequest22.compareTo(bookRequest31) == 0) == bookRequest22.equals(bookRequest31));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
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
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        java.lang.String str23 = bookRequest19.getBookTitle();
        java.lang.String str24 = bookRequest19.getRequester();
        java.lang.String str25 = bookRequest19.getRequester();
        int int26 = bookRequest19.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str31 = bookRequest30.getBookTitle();
        java.lang.String str32 = bookRequest30.getBookTitle();
        java.lang.String str33 = bookRequest30.getRequester();
        int int34 = bookRequest19.compareTo(bookRequest30);
        int int35 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest19", (bookRequest7.compareTo(bookRequest19) == 0) == bookRequest7.equals(bookRequest19));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 52);
        int int12 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest20.getPriority();
        int int23 = bookRequest16.compareTo(bookRequest20);
        java.lang.String str24 = bookRequest20.getRequester();
        java.lang.String str25 = bookRequest20.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getRequester();
        java.lang.String str26 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int31 = bookRequest23.compareTo(bookRequest30);
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        int int34 = bookRequest15.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getBookTitle();
        java.lang.String str28 = bookRequest24.getBookTitle();
        int int29 = bookRequest24.getPriority();
        int int30 = bookRequest24.getPriority();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int35 = bookRequest24.compareTo(bookRequest34);
        int int36 = bookRequest24.getPriority();
        java.lang.String str37 = bookRequest24.getRequester();
        int int38 = bookRequest16.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest24", (bookRequest7.compareTo(bookRequest24) == 0) == bookRequest7.equals(bookRequest24));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str33 = bookRequest32.getRequester();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getRequester();
        int int37 = bookRequest32.getPriority();
        java.lang.String str38 = bookRequest32.getBookTitle();
        int int39 = bookRequest32.getPriority();
        int int40 = bookRequest32.getPriority();
        int int41 = bookRequest28.compareTo(bookRequest32);
        request.BookRequest bookRequest45 = new request.BookRequest("", "", (int) (byte) 10);
        int int46 = bookRequest45.getPriority();
        int int47 = bookRequest32.compareTo(bookRequest45);
        java.lang.String str48 = bookRequest32.getRequester();
        int int49 = bookRequest32.getPriority();
        int int50 = bookRequest32.getPriority();
        int int51 = bookRequest17.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest45", (bookRequest3.compareTo(bookRequest45) == 0) == bookRequest3.equals(bookRequest45));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        java.lang.String str19 = bookRequest17.getRequester();
        int int20 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
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
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str38 = bookRequest37.getBookTitle();
        int int39 = bookRequest37.getPriority();
        java.lang.String str40 = bookRequest37.getBookTitle();
        int int41 = bookRequest18.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest18 and bookRequest37", (bookRequest18.compareTo(bookRequest37) == 0) == bookRequest18.equals(bookRequest37));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str13 = bookRequest12.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", 52);
        int int27 = bookRequest18.compareTo(bookRequest26);
        int int28 = bookRequest18.getPriority();
        int int29 = bookRequest18.getPriority();
        int int30 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest10.getPriority();
        int int13 = bookRequest10.getPriority();
        java.lang.String str14 = bookRequest10.getBookTitle();
        int int15 = bookRequest10.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 1);
        java.lang.String str30 = bookRequest29.getBookTitle();
        int int31 = bookRequest23.compareTo(bookRequest29);
        int int32 = bookRequest19.compareTo(bookRequest29);
        int int33 = bookRequest19.getPriority();
        int int34 = bookRequest10.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getRequester();
        java.lang.String str30 = bookRequest25.getBookTitle();
        int int31 = bookRequest21.compareTo(bookRequest25);
        int int32 = bookRequest11.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        java.lang.String str21 = bookRequest18.getRequester();
        java.lang.String str22 = bookRequest18.getRequester();
        int int23 = bookRequest14.compareTo(bookRequest18);
        int int24 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
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
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str23 = bookRequest22.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (short) 0);
        int int32 = bookRequest27.compareTo(bookRequest31);
        int int33 = bookRequest22.compareTo(bookRequest31);
        java.lang.String str34 = bookRequest31.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) (byte) 100);
        int int39 = bookRequest38.getPriority();
        int int40 = bookRequest31.compareTo(bookRequest38);
        int int41 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
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
        java.lang.String str23 = bookRequest3.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", 100);
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        java.lang.String str33 = bookRequest31.getRequester();
        int int34 = bookRequest31.getPriority();
        int int35 = bookRequest31.getPriority();
        java.lang.String str36 = bookRequest31.getBookTitle();
        int int37 = bookRequest31.getPriority();
        java.lang.String str38 = bookRequest31.getBookTitle();
        int int39 = bookRequest31.getPriority();
        java.lang.String str40 = bookRequest31.getRequester();
        int int41 = bookRequest31.getPriority();
        int int42 = bookRequest27.compareTo(bookRequest31);
        int int43 = bookRequest27.getPriority();
        java.lang.String str44 = bookRequest27.getRequester();
        int int45 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest31", (bookRequest7.compareTo(bookRequest31) == 0) == bookRequest7.equals(bookRequest31));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
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
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str34 = bookRequest33.getBookTitle();
        java.lang.String str35 = bookRequest33.getBookTitle();
        java.lang.String str36 = bookRequest33.getBookTitle();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) 'a');
        int int41 = bookRequest40.getPriority();
        int int42 = bookRequest40.getPriority();
        java.lang.String str43 = bookRequest40.getRequester();
        int int44 = bookRequest40.getPriority();
        java.lang.String str45 = bookRequest40.getRequester();
        int int46 = bookRequest33.compareTo(bookRequest40);
        request.BookRequest bookRequest50 = new request.BookRequest("hi!", "", (int) '#');
        int int51 = bookRequest50.getPriority();
        java.lang.String str52 = bookRequest50.getBookTitle();
        request.BookRequest bookRequest56 = new request.BookRequest("", "", (int) ' ');
        int int57 = bookRequest50.compareTo(bookRequest56);
        java.lang.String str58 = bookRequest50.getBookTitle();
        request.BookRequest bookRequest62 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest66 = new request.BookRequest("", "", 1);
        java.lang.String str67 = bookRequest66.getBookTitle();
        java.lang.String str68 = bookRequest66.getBookTitle();
        java.lang.String str69 = bookRequest66.getRequester();
        int int70 = bookRequest62.compareTo(bookRequest66);
        int int71 = bookRequest66.getPriority();
        int int72 = bookRequest50.compareTo(bookRequest66);
        int int73 = bookRequest66.getPriority();
        int int74 = bookRequest33.compareTo(bookRequest66);
        int int75 = bookRequest21.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest50", (bookRequest3.compareTo(bookRequest50) == 0) == bookRequest3.equals(bookRequest50));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str17 = bookRequest16.getBookTitle();
        java.lang.String str18 = bookRequest16.getRequester();
        int int19 = bookRequest16.getPriority();
        java.lang.String str20 = bookRequest16.getRequester();
        java.lang.String str21 = bookRequest16.getRequester();
        java.lang.String str22 = bookRequest16.getRequester();
        int int23 = bookRequest16.getPriority();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "hi!", 52);
        int int28 = bookRequest16.compareTo(bookRequest27);
        int int29 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest16", (bookRequest7.compareTo(bookRequest16) == 0) == bookRequest7.equals(bookRequest16));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest14.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("", "", 1);
        java.lang.String str21 = bookRequest20.getBookTitle();
        int int22 = bookRequest14.compareTo(bookRequest20);
        java.lang.String str23 = bookRequest20.getRequester();
        java.lang.String str24 = bookRequest20.getRequester();
        int int25 = bookRequest20.getPriority();
        int int26 = bookRequest7.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest14", (bookRequest7.compareTo(bookRequest14) == 0) == bookRequest7.equals(bookRequest14));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest8.getRequester();
        int int15 = bookRequest8.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        java.lang.String str22 = bookRequest19.getRequester();
        java.lang.String str23 = bookRequest19.getBookTitle();
        java.lang.String str24 = bookRequest19.getBookTitle();
        int int25 = bookRequest8.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest19", (bookRequest8.compareTo(bookRequest19) == 0) == bookRequest8.equals(bookRequest19));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        int int14 = bookRequest3.getPriority();
        java.lang.String str15 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str24 = bookRequest23.getRequester();
        java.lang.String str25 = bookRequest23.getBookTitle();
        int int26 = bookRequest19.compareTo(bookRequest23);
        java.lang.String str27 = bookRequest23.getBookTitle();
        int int28 = bookRequest23.getPriority();
        java.lang.String str29 = bookRequest23.getRequester();
        int int30 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
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
        request.BookRequest bookRequest40 = new request.BookRequest("", "", 97);
        int int41 = bookRequest26.compareTo(bookRequest40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest40", (bookRequest7.compareTo(bookRequest40) == 0) == bookRequest7.equals(bookRequest40));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
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
        int int24 = bookRequest3.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str29 = bookRequest28.getRequester();
        java.lang.String str30 = bookRequest28.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) '#');
        int int35 = bookRequest34.getPriority();
        java.lang.String str36 = bookRequest34.getBookTitle();
        request.BookRequest bookRequest40 = new request.BookRequest("", "", (int) ' ');
        int int41 = bookRequest34.compareTo(bookRequest40);
        java.lang.String str42 = bookRequest34.getRequester();
        int int43 = bookRequest28.compareTo(bookRequest34);
        request.BookRequest bookRequest47 = new request.BookRequest("hi!", "hi!", 0);
        int int48 = bookRequest34.compareTo(bookRequest47);
        int int49 = bookRequest47.getPriority();
        int int50 = bookRequest3.compareTo(bookRequest47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest47", (bookRequest3.compareTo(bookRequest47) == 0) == bookRequest3.equals(bookRequest47));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 10);
        int int15 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str16 = bookRequest14.getBookTitle();
        java.lang.String str17 = bookRequest14.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getRequester();
        java.lang.String str25 = bookRequest21.getBookTitle();
        int int26 = bookRequest21.getPriority();
        java.lang.String str27 = bookRequest21.getBookTitle();
        java.lang.String str28 = bookRequest21.getBookTitle();
        java.lang.String str29 = bookRequest21.getRequester();
        int int30 = bookRequest14.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest21", (bookRequest7.compareTo(bookRequest21) == 0) == bookRequest7.equals(bookRequest21));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
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
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str27 = bookRequest26.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        java.lang.String str33 = bookRequest31.getRequester();
        int int34 = bookRequest31.getPriority();
        java.lang.String str35 = bookRequest31.getRequester();
        int int36 = bookRequest26.compareTo(bookRequest31);
        java.lang.String str37 = bookRequest26.getRequester();
        java.lang.String str38 = bookRequest26.getRequester();
        int int39 = bookRequest13.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str13 = bookRequest12.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getBookTitle();
        int int23 = bookRequest18.getPriority();
        java.lang.String str24 = bookRequest18.getBookTitle();
        java.lang.String str25 = bookRequest18.getRequester();
        java.lang.String str26 = bookRequest18.getBookTitle();
        java.lang.String str27 = bookRequest18.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) '4');
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getBookTitle();
        java.lang.String str17 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", 0);
        java.lang.String str22 = bookRequest21.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getBookTitle();
        int int31 = bookRequest21.compareTo(bookRequest26);
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) (byte) 10);
        int int36 = bookRequest35.getPriority();
        int int37 = bookRequest21.compareTo(bookRequest35);
        int int38 = bookRequest14.compareTo(bookRequest21);
        java.lang.String str39 = bookRequest14.getRequester();
        java.lang.String str40 = bookRequest14.getRequester();
        int int41 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest26", (bookRequest7.compareTo(bookRequest26) == 0) == bookRequest7.equals(bookRequest26));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) -1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "hi!", 0);
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", 97);
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) ' ');
        int int23 = bookRequest17.compareTo(bookRequest22);
        int int24 = bookRequest13.compareTo(bookRequest22);
        int int25 = bookRequest9.compareTo(bookRequest22);
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (-1));
        java.lang.String str30 = bookRequest29.getBookTitle();
        int int31 = bookRequest22.compareTo(bookRequest29);
        int int32 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getBookTitle();
        int int19 = bookRequest16.getPriority();
        int int20 = bookRequest16.getPriority();
        int int21 = bookRequest7.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
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
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str17 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str22 = bookRequest21.getRequester();
        java.lang.String str23 = bookRequest21.getBookTitle();
        int int24 = bookRequest21.getPriority();
        int int25 = bookRequest16.compareTo(bookRequest21);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        java.lang.String str33 = bookRequest29.getRequester();
        int int34 = bookRequest29.getPriority();
        java.lang.String str35 = bookRequest29.getBookTitle();
        int int36 = bookRequest29.getPriority();
        int int37 = bookRequest29.getPriority();
        java.lang.String str38 = bookRequest29.getRequester();
        java.lang.String str39 = bookRequest29.getBookTitle();
        int int40 = bookRequest21.compareTo(bookRequest29);
        int int41 = bookRequest29.getPriority();
        int int42 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getRequester();
        int int25 = bookRequest22.getPriority();
        int int26 = bookRequest22.getPriority();
        java.lang.String str27 = bookRequest22.getBookTitle();
        int int28 = bookRequest22.getPriority();
        java.lang.String str29 = bookRequest22.getBookTitle();
        int int30 = bookRequest22.getPriority();
        java.lang.String str31 = bookRequest22.getRequester();
        int int32 = bookRequest22.getPriority();
        java.lang.String str33 = bookRequest22.getRequester();
        int int34 = bookRequest22.getPriority();
        int int35 = bookRequest22.getPriority();
        int int36 = bookRequest13.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
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
        int int31 = bookRequest12.getPriority();
        int int32 = bookRequest12.getPriority();
        request.BookRequest bookRequest36 = new request.BookRequest("", "hi!", (int) '4');
        int int37 = bookRequest36.getPriority();
        java.lang.String str38 = bookRequest36.getBookTitle();
        java.lang.String str39 = bookRequest36.getBookTitle();
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int44 = bookRequest36.compareTo(bookRequest43);
        request.BookRequest bookRequest48 = new request.BookRequest("hi!", "", (int) ' ');
        int int49 = bookRequest48.getPriority();
        request.BookRequest bookRequest53 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str54 = bookRequest53.getRequester();
        int int55 = bookRequest53.getPriority();
        request.BookRequest bookRequest59 = new request.BookRequest("", "", 1);
        java.lang.String str60 = bookRequest59.getBookTitle();
        int int61 = bookRequest53.compareTo(bookRequest59);
        int int62 = bookRequest48.compareTo(bookRequest59);
        int int63 = bookRequest43.compareTo(bookRequest59);
        int int64 = bookRequest43.getPriority();
        int int65 = bookRequest12.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest48", (bookRequest3.compareTo(bookRequest48) == 0) == bookRequest3.equals(bookRequest48));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getRequester();
        int int34 = bookRequest27.compareTo(bookRequest31);
        int int35 = bookRequest27.getPriority();
        java.lang.String str36 = bookRequest27.getRequester();
        int int37 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
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
        int int20 = bookRequest15.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str25 = bookRequest24.getBookTitle();
        java.lang.String str26 = bookRequest24.getBookTitle();
        java.lang.String str27 = bookRequest24.getRequester();
        int int28 = bookRequest15.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest24", (bookRequest15.compareTo(bookRequest24) == 0) == bookRequest15.equals(bookRequest24));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str24 = bookRequest23.getRequester();
        java.lang.String str25 = bookRequest23.getBookTitle();
        int int26 = bookRequest19.compareTo(bookRequest23);
        java.lang.String str27 = bookRequest19.getRequester();
        java.lang.String str28 = bookRequest19.getRequester();
        java.lang.String str29 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (byte) 100);
        int int34 = bookRequest33.getPriority();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str39 = bookRequest38.getRequester();
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest47 = new request.BookRequest("", "", (int) (short) 0);
        int int48 = bookRequest43.compareTo(bookRequest47);
        int int49 = bookRequest38.compareTo(bookRequest47);
        java.lang.String str50 = bookRequest47.getBookTitle();
        int int51 = bookRequest47.getPriority();
        int int52 = bookRequest47.getPriority();
        java.lang.String str53 = bookRequest47.getRequester();
        int int54 = bookRequest33.compareTo(bookRequest47);
        int int55 = bookRequest19.compareTo(bookRequest33);
        int int56 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getRequester();
        int int23 = bookRequest19.getPriority();
        java.lang.String str24 = bookRequest19.getBookTitle();
        int int25 = bookRequest19.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 1);
        java.lang.String str30 = bookRequest29.getRequester();
        java.lang.String str31 = bookRequest29.getBookTitle();
        java.lang.String str32 = bookRequest29.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "hi!", 52);
        int int41 = bookRequest36.compareTo(bookRequest40);
        int int42 = bookRequest36.getPriority();
        int int43 = bookRequest29.compareTo(bookRequest36);
        int int44 = bookRequest19.compareTo(bookRequest36);
        java.lang.String str45 = bookRequest36.getRequester();
        int int46 = bookRequest3.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getRequester();
        java.lang.String str16 = bookRequest12.getBookTitle();
        int int17 = bookRequest12.getPriority();
        java.lang.String str18 = bookRequest12.getBookTitle();
        java.lang.String str19 = bookRequest12.getBookTitle();
        java.lang.String str20 = bookRequest12.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest9.compareTo(bookRequest13);
        int int15 = bookRequest9.getPriority();
        int int16 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
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
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", 100);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        int int23 = bookRequest20.getPriority();
        int int24 = bookRequest20.getPriority();
        java.lang.String str25 = bookRequest20.getBookTitle();
        int int26 = bookRequest20.getPriority();
        java.lang.String str27 = bookRequest20.getBookTitle();
        int int28 = bookRequest20.getPriority();
        java.lang.String str29 = bookRequest20.getRequester();
        int int30 = bookRequest20.getPriority();
        int int31 = bookRequest16.compareTo(bookRequest20);
        int int32 = bookRequest16.getPriority();
        int int33 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest14.getPriority();
        java.lang.String str17 = bookRequest14.getBookTitle();
        java.lang.String str18 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str23 = bookRequest22.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (short) 0);
        int int32 = bookRequest27.compareTo(bookRequest31);
        int int33 = bookRequest22.compareTo(bookRequest31);
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest31.getPriority();
        java.lang.String str36 = bookRequest31.getRequester();
        int int37 = bookRequest14.compareTo(bookRequest31);
        int int38 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str26 = bookRequest25.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) (short) 0);
        int int35 = bookRequest30.compareTo(bookRequest34);
        int int36 = bookRequest25.compareTo(bookRequest34);
        java.lang.String str37 = bookRequest34.getBookTitle();
        int int38 = bookRequest34.getPriority();
        int int39 = bookRequest12.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 1);
        java.lang.String str30 = bookRequest29.getBookTitle();
        int int31 = bookRequest23.compareTo(bookRequest29);
        int int32 = bookRequest19.compareTo(bookRequest29);
        int int33 = bookRequest19.getPriority();
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int38 = bookRequest19.compareTo(bookRequest37);
        java.lang.String str39 = bookRequest37.getRequester();
        java.lang.String str40 = bookRequest37.getBookTitle();
        int int41 = bookRequest7.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest23", (bookRequest7.compareTo(bookRequest23) == 0) == bookRequest7.equals(bookRequest23));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "", 1);
        java.lang.String str24 = bookRequest23.getRequester();
        java.lang.String str25 = bookRequest23.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest23", (bookRequest16.compareTo(bookRequest23) == 0) == bookRequest16.equals(bookRequest23));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
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
        request.BookRequest bookRequest37 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str42 = bookRequest41.getRequester();
        java.lang.String str43 = bookRequest41.getBookTitle();
        int int44 = bookRequest37.compareTo(bookRequest41);
        java.lang.String str45 = bookRequest37.getRequester();
        java.lang.String str46 = bookRequest37.getRequester();
        request.BookRequest bookRequest50 = new request.BookRequest("", "hi!", (int) (short) 100);
        int int51 = bookRequest37.compareTo(bookRequest50);
        int int52 = bookRequest18.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest37", (bookRequest3.compareTo(bookRequest37) == 0) == bookRequest3.equals(bookRequest37));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getRequester();
        int int29 = bookRequest26.getPriority();
        java.lang.String str30 = bookRequest26.getBookTitle();
        java.lang.String str31 = bookRequest26.getRequester();
        java.lang.String str32 = bookRequest26.getBookTitle();
        int int33 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest26", (bookRequest15.compareTo(bookRequest26) == 0) == bookRequest15.equals(bookRequest26));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest3.getPriority();
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
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
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
        java.lang.String str25 = bookRequest22.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str34 = bookRequest33.getRequester();
        int int35 = bookRequest33.getPriority();
        request.BookRequest bookRequest39 = new request.BookRequest("", "", 1);
        java.lang.String str40 = bookRequest39.getBookTitle();
        int int41 = bookRequest33.compareTo(bookRequest39);
        int int42 = bookRequest29.compareTo(bookRequest39);
        java.lang.String str43 = bookRequest29.getRequester();
        java.lang.String str44 = bookRequest29.getRequester();
        int int45 = bookRequest22.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest39", (bookRequest3.compareTo(bookRequest39) == 0) == bookRequest3.equals(bookRequest39));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", 52);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getRequester();
        int int16 = bookRequest12.getPriority();
        java.lang.String str17 = bookRequest12.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str22 = bookRequest21.getBookTitle();
        int int23 = bookRequest12.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest12.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        java.lang.String str29 = bookRequest28.getBookTitle();
        int int30 = bookRequest12.compareTo(bookRequest28);
        int int31 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest21", (bookRequest7.compareTo(bookRequest21) == 0) == bookRequest7.equals(bookRequest21));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
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
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest32 = new request.BookRequest("", "", 1);
        java.lang.String str33 = bookRequest32.getBookTitle();
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str38 = bookRequest37.getRequester();
        int int39 = bookRequest37.getPriority();
        java.lang.String str40 = bookRequest37.getBookTitle();
        java.lang.String str41 = bookRequest37.getRequester();
        int int42 = bookRequest37.getPriority();
        int int43 = bookRequest32.compareTo(bookRequest37);
        int int44 = bookRequest32.getPriority();
        java.lang.String str45 = bookRequest32.getRequester();
        java.lang.String str46 = bookRequest32.getRequester();
        java.lang.String str47 = bookRequest32.getRequester();
        int int48 = bookRequest28.compareTo(bookRequest32);
        int int49 = bookRequest7.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest32", (bookRequest7.compareTo(bookRequest32) == 0) == bookRequest7.equals(bookRequest32));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
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
        request.BookRequest bookRequest44 = new request.BookRequest("hi!", "", 35);
        java.lang.String str45 = bookRequest44.getRequester();
        int int46 = bookRequest44.getPriority();
        java.lang.String str47 = bookRequest44.getBookTitle();
        request.BookRequest bookRequest51 = new request.BookRequest("hi!", "", (int) 'a');
        int int52 = bookRequest51.getPriority();
        java.lang.String str53 = bookRequest51.getRequester();
        java.lang.String str54 = bookRequest51.getRequester();
        int int55 = bookRequest51.getPriority();
        int int56 = bookRequest51.getPriority();
        java.lang.String str57 = bookRequest51.getRequester();
        int int58 = bookRequest44.compareTo(bookRequest51);
        int int59 = bookRequest18.compareTo(bookRequest51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest44", (bookRequest11.compareTo(bookRequest44) == 0) == bookRequest11.equals(bookRequest44));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
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
        java.lang.String str19 = bookRequest14.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 0);
        int int28 = bookRequest23.compareTo(bookRequest27);
        java.lang.String str29 = bookRequest23.getRequester();
        int int30 = bookRequest14.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest23", (bookRequest14.compareTo(bookRequest23) == 0) == bookRequest14.equals(bookRequest23));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", 52);
        int int15 = bookRequest10.compareTo(bookRequest14);
        int int16 = bookRequest10.getPriority();
        int int17 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str28 = bookRequest27.getRequester();
        java.lang.String str29 = bookRequest27.getBookTitle();
        int int30 = bookRequest27.getPriority();
        java.lang.String str31 = bookRequest27.getRequester();
        int int32 = bookRequest21.compareTo(bookRequest27);
        java.lang.String str33 = bookRequest21.getRequester();
        java.lang.String str34 = bookRequest21.getRequester();
        int int35 = bookRequest21.getPriority();
        java.lang.String str36 = bookRequest21.getRequester();
        java.lang.String str37 = bookRequest21.getBookTitle();
        int int38 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
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
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", (int) '4');
        int int35 = bookRequest34.getPriority();
        java.lang.String str36 = bookRequest34.getBookTitle();
        java.lang.String str37 = bookRequest34.getBookTitle();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int42 = bookRequest34.compareTo(bookRequest41);
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "", (int) ' ');
        int int47 = bookRequest46.getPriority();
        request.BookRequest bookRequest51 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str52 = bookRequest51.getRequester();
        int int53 = bookRequest51.getPriority();
        request.BookRequest bookRequest57 = new request.BookRequest("", "", 1);
        java.lang.String str58 = bookRequest57.getBookTitle();
        int int59 = bookRequest51.compareTo(bookRequest57);
        int int60 = bookRequest46.compareTo(bookRequest57);
        int int61 = bookRequest41.compareTo(bookRequest57);
        int int62 = bookRequest26.compareTo(bookRequest57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest46", (bookRequest3.compareTo(bookRequest46) == 0) == bookRequest3.equals(bookRequest46));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        java.lang.String str19 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int24 = bookRequest16.compareTo(bookRequest23);
        int int25 = bookRequest23.getPriority();
        int int26 = bookRequest23.getPriority();
        java.lang.String str27 = bookRequest23.getBookTitle();
        java.lang.String str28 = bookRequest23.getRequester();
        int int29 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        java.lang.String str14 = bookRequest9.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest18.getPriority();
        int int21 = bookRequest18.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", (int) '#');
        int int26 = bookRequest18.compareTo(bookRequest25);
        int int27 = bookRequest18.getPriority();
        int int28 = bookRequest9.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) ' ');
        int int12 = bookRequest11.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 1);
        java.lang.String str23 = bookRequest22.getBookTitle();
        int int24 = bookRequest16.compareTo(bookRequest22);
        int int25 = bookRequest11.compareTo(bookRequest22);
        java.lang.String str26 = bookRequest11.getRequester();
        java.lang.String str27 = bookRequest11.getBookTitle();
        int int28 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getBookTitle();
        int int9 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest13.getPriority();
        java.lang.String str17 = bookRequest13.getBookTitle();
        java.lang.String str18 = bookRequest13.getRequester();
        java.lang.String str19 = bookRequest13.getBookTitle();
        java.lang.String str20 = bookRequest13.getRequester();
        java.lang.String str21 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getRequester();
        java.lang.String str28 = bookRequest25.getRequester();
        int int29 = bookRequest25.getPriority();
        int int30 = bookRequest25.getPriority();
        java.lang.String str31 = bookRequest25.getRequester();
        int int32 = bookRequest13.compareTo(bookRequest25);
        int int33 = bookRequest25.getPriority();
        java.lang.String str34 = bookRequest25.getRequester();
        int int35 = bookRequest25.getPriority();
        int int36 = bookRequest7.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) '#');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        java.lang.String str13 = bookRequest8.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest23.getPriority();
        int int29 = bookRequest17.compareTo(bookRequest23);
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int34 = bookRequest23.compareTo(bookRequest33);
        int int35 = bookRequest8.compareTo(bookRequest23);
        java.lang.String str36 = bookRequest23.getBookTitle();
        int int37 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str22 = bookRequest21.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        java.lang.String str34 = bookRequest30.getRequester();
        java.lang.String str35 = bookRequest30.getBookTitle();
        int int36 = bookRequest30.getPriority();
        java.lang.String str37 = bookRequest30.getBookTitle();
        int int38 = bookRequest26.compareTo(bookRequest30);
        java.lang.String str39 = bookRequest26.getBookTitle();
        int int40 = bookRequest21.compareTo(bookRequest26);
        int int41 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest30", (bookRequest9.compareTo(bookRequest30) == 0) == bookRequest9.equals(bookRequest30));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getRequester();
        java.lang.String str11 = bookRequest7.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str13 = bookRequest3.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getRequester();
        java.lang.String str26 = bookRequest21.getBookTitle();
        int int27 = bookRequest21.getPriority();
        java.lang.String str28 = bookRequest21.getBookTitle();
        int int29 = bookRequest17.compareTo(bookRequest21);
        int int30 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest21", (bookRequest7.compareTo(bookRequest21) == 0) == bookRequest7.equals(bookRequest21));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
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
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getRequester();
        int int22 = bookRequest18.getPriority();
        java.lang.String str23 = bookRequest18.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str28 = bookRequest27.getBookTitle();
        int int29 = bookRequest18.compareTo(bookRequest27);
        java.lang.String str30 = bookRequest27.getRequester();
        int int31 = bookRequest27.getPriority();
        java.lang.String str32 = bookRequest27.getBookTitle();
        java.lang.String str33 = bookRequest27.getBookTitle();
        int int34 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest3.getBookTitle();
        int int16 = bookRequest3.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        int int23 = bookRequest20.getPriority();
        int int24 = bookRequest20.getPriority();
        java.lang.String str25 = bookRequest20.getBookTitle();
        int int26 = bookRequest20.getPriority();
        java.lang.String str27 = bookRequest20.getBookTitle();
        int int28 = bookRequest20.getPriority();
        java.lang.String str29 = bookRequest20.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("", "", 1);
        java.lang.String str34 = bookRequest33.getRequester();
        int int35 = bookRequest20.compareTo(bookRequest33);
        java.lang.String str36 = bookRequest20.getBookTitle();
        int int37 = bookRequest20.getPriority();
        int int38 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest20", (bookRequest8.compareTo(bookRequest20) == 0) == bookRequest8.equals(bookRequest20));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
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
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", 97);
        java.lang.String str34 = bookRequest33.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest42 = new request.BookRequest("", "", (int) (byte) 1);
        int int43 = bookRequest38.compareTo(bookRequest42);
        java.lang.String str44 = bookRequest38.getBookTitle();
        java.lang.String str45 = bookRequest38.getBookTitle();
        java.lang.String str46 = bookRequest38.getBookTitle();
        int int47 = bookRequest33.compareTo(bookRequest38);
        int int48 = bookRequest9.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest33", (bookRequest9.compareTo(bookRequest33) == 0) == bookRequest9.equals(bookRequest33));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) '#');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) ' ');
        int int16 = bookRequest9.compareTo(bookRequest15);
        java.lang.String str17 = bookRequest9.getRequester();
        java.lang.String str18 = bookRequest9.getRequester();
        int int19 = bookRequest9.getPriority();
        int int20 = bookRequest9.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest9.compareTo(bookRequest24);
        int int28 = bookRequest24.getPriority();
        int int29 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getRequester();
        int int16 = bookRequest12.getPriority();
        java.lang.String str17 = bookRequest12.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str22 = bookRequest21.getBookTitle();
        int int23 = bookRequest12.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest21.getRequester();
        java.lang.String str25 = bookRequest21.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getRequester();
        int int30 = bookRequest26.getPriority();
        java.lang.String str31 = bookRequest26.getRequester();
        request.BookRequest bookRequest35 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str36 = bookRequest35.getBookTitle();
        int int37 = bookRequest26.compareTo(bookRequest35);
        int int38 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest35", (bookRequest3.compareTo(bookRequest35) == 0) == bookRequest3.equals(bookRequest35));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
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
        java.lang.String str18 = bookRequest3.getBookTitle();
        java.lang.String str19 = bookRequest3.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str24 = bookRequest23.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (short) 0);
        int int33 = bookRequest28.compareTo(bookRequest32);
        int int34 = bookRequest23.compareTo(bookRequest32);
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getBookTitle();
        java.lang.String str37 = bookRequest32.getBookTitle();
        java.lang.String str38 = bookRequest32.getRequester();
        java.lang.String str39 = bookRequest32.getBookTitle();
        java.lang.String str40 = bookRequest32.getBookTitle();
        int int41 = bookRequest32.getPriority();
        int int42 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest28", (bookRequest8.compareTo(bookRequest28) == 0) == bookRequest8.equals(bookRequest28));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        java.lang.String str14 = bookRequest9.getBookTitle();
        int int15 = bookRequest9.getPriority();
        java.lang.String str16 = bookRequest9.getRequester();
        java.lang.String str17 = bookRequest9.getBookTitle();
        int int18 = bookRequest9.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest9", (bookRequest3.compareTo(bookRequest9) == 0) == bookRequest3.equals(bookRequest9));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", 0);
        int int18 = bookRequest17.getPriority();
        java.lang.String str19 = bookRequest17.getRequester();
        java.lang.String str20 = bookRequest17.getRequester();
        int int21 = bookRequest9.compareTo(bookRequest17);
        int int22 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest9", (bookRequest3.compareTo(bookRequest9) == 0) == bookRequest3.equals(bookRequest9));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getRequester();
        java.lang.String str23 = bookRequest18.getBookTitle();
        int int24 = bookRequest18.getPriority();
        int int25 = bookRequest18.getPriority();
        int int26 = bookRequest3.compareTo(bookRequest18);
        int int27 = bookRequest3.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest35 = new request.BookRequest("", "", 1);
        java.lang.String str36 = bookRequest35.getBookTitle();
        java.lang.String str37 = bookRequest35.getBookTitle();
        java.lang.String str38 = bookRequest35.getRequester();
        int int39 = bookRequest31.compareTo(bookRequest35);
        java.lang.String str40 = bookRequest31.getRequester();
        java.lang.String str41 = bookRequest31.getBookTitle();
        int int42 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest35", (bookRequest7.compareTo(bookRequest35) == 0) == bookRequest7.equals(bookRequest35));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str28 = bookRequest27.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) (short) 0);
        int int37 = bookRequest32.compareTo(bookRequest36);
        int int38 = bookRequest27.compareTo(bookRequest36);
        java.lang.String str39 = bookRequest36.getBookTitle();
        int int40 = bookRequest36.getPriority();
        int int41 = bookRequest23.compareTo(bookRequest36);
        java.lang.String str42 = bookRequest23.getRequester();
        int int43 = bookRequest23.getPriority();
        java.lang.String str44 = bookRequest23.getRequester();
        int int45 = bookRequest7.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest32", (bookRequest7.compareTo(bookRequest32) == 0) == bookRequest7.equals(bookRequest32));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest3.getPriority();
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        java.lang.String str21 = bookRequest18.getRequester();
        java.lang.String str22 = bookRequest18.getBookTitle();
        java.lang.String str23 = bookRequest18.getBookTitle();
        java.lang.String str24 = bookRequest18.getRequester();
        int int25 = bookRequest18.getPriority();
        java.lang.String str26 = bookRequest18.getBookTitle();
        java.lang.String str27 = bookRequest18.getBookTitle();
        int int28 = bookRequest18.getPriority();
        java.lang.String str29 = bookRequest18.getRequester();
        int int30 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getRequester();
        int int25 = bookRequest22.getPriority();
        java.lang.String str26 = bookRequest22.getRequester();
        java.lang.String str27 = bookRequest22.getBookTitle();
        int int28 = bookRequest22.getPriority();
        java.lang.String str29 = bookRequest22.getRequester();
        java.lang.String str30 = bookRequest22.getBookTitle();
        int int31 = bookRequest22.getPriority();
        int int32 = bookRequest22.getPriority();
        java.lang.String str33 = bookRequest22.getRequester();
        java.lang.String str34 = bookRequest22.getRequester();
        int int35 = bookRequest12.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest22", (bookRequest8.compareTo(bookRequest22) == 0) == bookRequest8.equals(bookRequest22));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
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
        int int19 = bookRequest3.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest23.compareTo(bookRequest27);
        int int30 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) '4');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getBookTitle();
        java.lang.String str26 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int31 = bookRequest23.compareTo(bookRequest30);
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) (byte) 10);
        int int36 = bookRequest35.getPriority();
        int int37 = bookRequest35.getPriority();
        int int38 = bookRequest23.compareTo(bookRequest35);
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) 'a');
        int int43 = bookRequest42.getPriority();
        int int44 = bookRequest42.getPriority();
        java.lang.String str45 = bookRequest42.getBookTitle();
        int int46 = bookRequest42.getPriority();
        int int47 = bookRequest35.compareTo(bookRequest42);
        int int48 = bookRequest3.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest23", (bookRequest7.compareTo(bookRequest23) == 0) == bookRequest7.equals(bookRequest23));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) '#');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        java.lang.String str23 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest27.compareTo(bookRequest31);
        int int33 = bookRequest19.compareTo(bookRequest27);
        int int34 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest31", (bookRequest8.compareTo(bookRequest31) == 0) == bookRequest8.equals(bookRequest31));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        int int13 = bookRequest7.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest17.getPriority();
        int int23 = bookRequest17.getPriority();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int28 = bookRequest17.compareTo(bookRequest27);
        java.lang.String str29 = bookRequest17.getRequester();
        java.lang.String str30 = bookRequest17.getBookTitle();
        int int31 = bookRequest7.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest17", (bookRequest7.compareTo(bookRequest17) == 0) == bookRequest7.equals(bookRequest17));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
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
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", (int) 'a');
        int int40 = bookRequest39.getPriority();
        java.lang.String str41 = bookRequest39.getRequester();
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str46 = bookRequest45.getRequester();
        java.lang.String str47 = bookRequest45.getBookTitle();
        int int48 = bookRequest45.getPriority();
        java.lang.String str49 = bookRequest45.getRequester();
        int int50 = bookRequest39.compareTo(bookRequest45);
        java.lang.String str51 = bookRequest39.getRequester();
        java.lang.String str52 = bookRequest39.getBookTitle();
        java.lang.String str53 = bookRequest39.getRequester();
        int int54 = bookRequest11.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest39", (bookRequest16.compareTo(bookRequest39) == 0) == bookRequest16.equals(bookRequest39));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str24 = bookRequest23.getRequester();
        java.lang.String str25 = bookRequest23.getBookTitle();
        int int26 = bookRequest19.compareTo(bookRequest23);
        java.lang.String str27 = bookRequest19.getRequester();
        java.lang.String str28 = bookRequest19.getRequester();
        java.lang.String str29 = bookRequest19.getBookTitle();
        int int30 = bookRequest9.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest23", (bookRequest9.compareTo(bookRequest23) == 0) == bookRequest9.equals(bookRequest23));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
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
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str27 = bookRequest26.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) (short) 0);
        int int36 = bookRequest31.compareTo(bookRequest35);
        int int37 = bookRequest26.compareTo(bookRequest35);
        request.BookRequest bookRequest41 = new request.BookRequest("", "", 1);
        int int42 = bookRequest35.compareTo(bookRequest41);
        java.lang.String str43 = bookRequest35.getRequester();
        int int44 = bookRequest35.getPriority();
        java.lang.String str45 = bookRequest35.getRequester();
        int int46 = bookRequest3.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest31", (bookRequest8.compareTo(bookRequest31) == 0) == bookRequest8.equals(bookRequest31));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str17 = bookRequest16.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        java.lang.String str24 = bookRequest21.getBookTitle();
        int int25 = bookRequest16.compareTo(bookRequest21);
        java.lang.String str26 = bookRequest21.getRequester();
        int int27 = bookRequest21.getPriority();
        int int28 = bookRequest9.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) '#');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) ' ');
        int int16 = bookRequest9.compareTo(bookRequest15);
        java.lang.String str17 = bookRequest9.getRequester();
        java.lang.String str18 = bookRequest9.getRequester();
        int int19 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getRequester();
        java.lang.String str30 = bookRequest26.getBookTitle();
        java.lang.String str31 = bookRequest26.getBookTitle();
        java.lang.String str32 = bookRequest26.getBookTitle();
        java.lang.String str33 = bookRequest26.getBookTitle();
        java.lang.String str34 = bookRequest26.getBookTitle();
        int int35 = bookRequest20.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest26", (bookRequest7.compareTo(bookRequest26) == 0) == bookRequest7.equals(bookRequest26));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (byte) 100);
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        int int34 = bookRequest33.getPriority();
        java.lang.String str35 = bookRequest33.getRequester();
        java.lang.String str36 = bookRequest33.getRequester();
        java.lang.String str37 = bookRequest33.getRequester();
        int int38 = bookRequest29.compareTo(bookRequest33);
        int int39 = bookRequest29.getPriority();
        int int40 = bookRequest23.compareTo(bookRequest29);
        java.lang.String str41 = bookRequest29.getBookTitle();
        int int42 = bookRequest29.getPriority();
        int int43 = bookRequest13.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest33", (bookRequest7.compareTo(bookRequest33) == 0) == bookRequest7.equals(bookRequest33));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str13 = bookRequest12.getRequester();
        java.lang.String str14 = bookRequest12.getRequester();
        java.lang.String str15 = bookRequest12.getBookTitle();
        int int16 = bookRequest8.compareTo(bookRequest12);
        int int17 = bookRequest12.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest8", (bookRequest3.compareTo(bookRequest8) == 0) == bookRequest3.equals(bookRequest8));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        int int22 = bookRequest20.getPriority();
        java.lang.String str23 = bookRequest20.getRequester();
        int int24 = bookRequest20.getPriority();
        java.lang.String str25 = bookRequest20.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str30 = bookRequest29.getBookTitle();
        int int31 = bookRequest20.compareTo(bookRequest29);
        java.lang.String str32 = bookRequest29.getRequester();
        int int33 = bookRequest29.getPriority();
        java.lang.String str34 = bookRequest29.getBookTitle();
        int int35 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest20", (bookRequest8.compareTo(bookRequest20) == 0) == bookRequest8.equals(bookRequest20));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (byte) -1);
        java.lang.String str13 = bookRequest12.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        java.lang.String str19 = bookRequest17.getRequester();
        java.lang.String str20 = bookRequest17.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int25 = bookRequest17.compareTo(bookRequest24);
        int int26 = bookRequest24.getPriority();
        int int27 = bookRequest24.getPriority();
        int int28 = bookRequest12.compareTo(bookRequest24);
        int int29 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", 97);
        java.lang.String str30 = bookRequest29.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) ' ');
        int int35 = bookRequest29.compareTo(bookRequest34);
        java.lang.String str36 = bookRequest34.getRequester();
        java.lang.String str37 = bookRequest34.getRequester();
        int int38 = bookRequest34.getPriority();
        int int39 = bookRequest7.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest29", (bookRequest7.compareTo(bookRequest29) == 0) == bookRequest7.equals(bookRequest29));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
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
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) '#');
        int int34 = bookRequest33.getPriority();
        java.lang.String str35 = bookRequest33.getBookTitle();
        request.BookRequest bookRequest39 = new request.BookRequest("", "", (int) ' ');
        int int40 = bookRequest33.compareTo(bookRequest39);
        request.BookRequest bookRequest44 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str45 = bookRequest44.getBookTitle();
        int int46 = bookRequest33.compareTo(bookRequest44);
        int int47 = bookRequest3.compareTo(bookRequest44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest44", (bookRequest15.compareTo(bookRequest44) == 0) == bookRequest15.equals(bookRequest44));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getRequester();
        java.lang.String str14 = bookRequest11.getRequester();
        java.lang.String str15 = bookRequest11.getRequester();
        int int16 = bookRequest7.compareTo(bookRequest11);
        java.lang.String str17 = bookRequest11.getBookTitle();
        int int18 = bookRequest11.getPriority();
        java.lang.String str19 = bookRequest11.getBookTitle();
        int int20 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
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
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        int int36 = bookRequest35.getPriority();
        int int37 = bookRequest35.getPriority();
        java.lang.String str38 = bookRequest35.getBookTitle();
        java.lang.String str39 = bookRequest35.getBookTitle();
        int int40 = bookRequest35.getPriority();
        int int41 = bookRequest35.getPriority();
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int46 = bookRequest35.compareTo(bookRequest45);
        java.lang.String str47 = bookRequest45.getRequester();
        java.lang.String str48 = bookRequest45.getBookTitle();
        int int49 = bookRequest18.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest18 and bookRequest35", (bookRequest18.compareTo(bookRequest35) == 0) == bookRequest18.equals(bookRequest35));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
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
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str30 = bookRequest29.getRequester();
        java.lang.String str31 = bookRequest29.getBookTitle();
        int int32 = bookRequest29.getPriority();
        java.lang.String str33 = bookRequest29.getBookTitle();
        java.lang.String str34 = bookRequest29.getRequester();
        java.lang.String str35 = bookRequest29.getBookTitle();
        java.lang.String str36 = bookRequest29.getRequester();
        int int37 = bookRequest9.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest20 and bookRequest29", (bookRequest20.compareTo(bookRequest29) == 0) == bookRequest20.equals(bookRequest29));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getRequester();
        int int32 = bookRequest28.getPriority();
        java.lang.String str33 = bookRequest28.getRequester();
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) '#');
        int int38 = bookRequest37.getPriority();
        java.lang.String str39 = bookRequest37.getBookTitle();
        request.BookRequest bookRequest43 = new request.BookRequest("", "", (int) ' ');
        int int44 = bookRequest37.compareTo(bookRequest43);
        int int45 = bookRequest28.compareTo(bookRequest37);
        java.lang.String str46 = bookRequest37.getRequester();
        java.lang.String str47 = bookRequest37.getRequester();
        int int48 = bookRequest37.getPriority();
        java.lang.String str49 = bookRequest37.getBookTitle();
        int int50 = bookRequest7.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest20 and bookRequest28", (bookRequest20.compareTo(bookRequest28) == 0) == bookRequest20.equals(bookRequest28));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str23 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        int int30 = bookRequest27.getPriority();
        java.lang.String str31 = bookRequest27.getBookTitle();
        java.lang.String str32 = bookRequest27.getRequester();
        java.lang.String str33 = bookRequest27.getRequester();
        int int34 = bookRequest22.compareTo(bookRequest27);
        java.lang.String str35 = bookRequest22.getRequester();
        java.lang.String str36 = bookRequest22.getBookTitle();
        java.lang.String str37 = bookRequest22.getBookTitle();
        int int38 = bookRequest13.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest27", (bookRequest7.compareTo(bookRequest27) == 0) == bookRequest7.equals(bookRequest27));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
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
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str42 = bookRequest41.getRequester();
        java.lang.String str43 = bookRequest41.getRequester();
        java.lang.String str44 = bookRequest41.getBookTitle();
        int int45 = bookRequest41.getPriority();
        java.lang.String str46 = bookRequest41.getBookTitle();
        request.BookRequest bookRequest50 = new request.BookRequest("hi!", "", 0);
        int int51 = bookRequest41.compareTo(bookRequest50);
        java.lang.String str52 = bookRequest50.getBookTitle();
        int int53 = bookRequest30.compareTo(bookRequest50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest41", (bookRequest16.compareTo(bookRequest41) == 0) == bookRequest16.equals(bookRequest41));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "hi!", 97);
        java.lang.String str24 = bookRequest23.getRequester();
        java.lang.String str25 = bookRequest23.getBookTitle();
        java.lang.String str26 = bookRequest23.getRequester();
        java.lang.String str27 = bookRequest23.getBookTitle();
        int int28 = bookRequest17.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
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
        request.BookRequest bookRequest44 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest48 = new request.BookRequest("hi!", "", (int) 'a');
        int int49 = bookRequest48.getPriority();
        int int50 = bookRequest48.getPriority();
        java.lang.String str51 = bookRequest48.getBookTitle();
        java.lang.String str52 = bookRequest48.getRequester();
        java.lang.String str53 = bookRequest48.getBookTitle();
        int int54 = bookRequest48.getPriority();
        java.lang.String str55 = bookRequest48.getBookTitle();
        int int56 = bookRequest44.compareTo(bookRequest48);
        request.BookRequest bookRequest60 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str61 = bookRequest60.getBookTitle();
        java.lang.String str62 = bookRequest60.getRequester();
        java.lang.String str63 = bookRequest60.getRequester();
        int int64 = bookRequest44.compareTo(bookRequest60);
        java.lang.String str65 = bookRequest60.getRequester();
        int int66 = bookRequest3.compareTo(bookRequest60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest60", (bookRequest3.compareTo(bookRequest60) == 0) == bookRequest3.equals(bookRequest60));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) 'a');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getRequester();
        java.lang.String str12 = bookRequest9.getRequester();
        java.lang.String str13 = bookRequest9.getBookTitle();
        java.lang.String str14 = bookRequest9.getBookTitle();
        java.lang.String str15 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        int int23 = bookRequest9.compareTo(bookRequest19);
        int int24 = bookRequest19.getPriority();
        java.lang.String str25 = bookRequest19.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        java.lang.String str15 = bookRequest13.getBookTitle();
        java.lang.String str16 = bookRequest13.getRequester();
        int int17 = bookRequest9.compareTo(bookRequest13);
        int int18 = bookRequest13.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest13);
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str28 = bookRequest27.getRequester();
        java.lang.String str29 = bookRequest27.getBookTitle();
        int int30 = bookRequest23.compareTo(bookRequest27);
        java.lang.String str31 = bookRequest23.getRequester();
        java.lang.String str32 = bookRequest23.getRequester();
        java.lang.String str33 = bookRequest23.getBookTitle();
        java.lang.String str34 = bookRequest23.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        int int39 = bookRequest38.getPriority();
        java.lang.String str40 = bookRequest38.getRequester();
        int int41 = bookRequest38.getPriority();
        java.lang.String str42 = bookRequest38.getRequester();
        java.lang.String str43 = bookRequest38.getBookTitle();
        int int44 = bookRequest38.getPriority();
        int int45 = bookRequest38.getPriority();
        int int46 = bookRequest23.compareTo(bookRequest38);
        int int47 = bookRequest13.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest27", (bookRequest13.compareTo(bookRequest27) == 0) == bookRequest13.equals(bookRequest27));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest18.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getRequester();
        java.lang.String str28 = bookRequest24.getBookTitle();
        int int29 = bookRequest24.getPriority();
        java.lang.String str30 = bookRequest24.getBookTitle();
        int int31 = bookRequest24.getPriority();
        int int32 = bookRequest18.compareTo(bookRequest24);
        int int33 = bookRequest12.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest24", (bookRequest8.compareTo(bookRequest24) == 0) == bookRequest8.equals(bookRequest24));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
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
        int int23 = bookRequest19.getPriority();
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getRequester();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest27.compareTo(bookRequest31);
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", (int) '#');
        int int40 = bookRequest39.getPriority();
        java.lang.String str41 = bookRequest39.getRequester();
        java.lang.String str42 = bookRequest39.getBookTitle();
        int int43 = bookRequest39.getPriority();
        int int44 = bookRequest27.compareTo(bookRequest39);
        request.BookRequest bookRequest48 = new request.BookRequest("hi!", "hi!", 10);
        int int49 = bookRequest27.compareTo(bookRequest48);
        int int50 = bookRequest19.compareTo(bookRequest48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest48", (bookRequest3.compareTo(bookRequest48) == 0) == bookRequest3.equals(bookRequest48));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        int int33 = bookRequest29.getPriority();
        int int34 = bookRequest29.getPriority();
        request.BookRequest bookRequest38 = new request.BookRequest("", "hi!", 52);
        int int39 = bookRequest29.compareTo(bookRequest38);
        int int40 = bookRequest38.getPriority();
        int int41 = bookRequest25.compareTo(bookRequest38);
        java.lang.String str42 = bookRequest38.getRequester();
        java.lang.String str43 = bookRequest38.getBookTitle();
        request.BookRequest bookRequest47 = new request.BookRequest("", "", 35);
        int int48 = bookRequest47.getPriority();
        int int49 = bookRequest47.getPriority();
        int int50 = bookRequest38.compareTo(bookRequest47);
        int int51 = bookRequest3.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest29", (bookRequest8.compareTo(bookRequest29) == 0) == bookRequest8.equals(bookRequest29));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest7.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getRequester();
        int int23 = bookRequest18.getPriority();
        java.lang.String str24 = bookRequest18.getBookTitle();
        int int25 = bookRequest18.getPriority();
        int int26 = bookRequest18.getPriority();
        int int27 = bookRequest14.compareTo(bookRequest18);
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (byte) 10);
        int int32 = bookRequest31.getPriority();
        int int33 = bookRequest18.compareTo(bookRequest31);
        int int34 = bookRequest31.getPriority();
        java.lang.String str35 = bookRequest31.getBookTitle();
        int int36 = bookRequest31.getPriority();
        int int37 = bookRequest7.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
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
        java.lang.String str25 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        int int34 = bookRequest33.getPriority();
        int int35 = bookRequest33.getPriority();
        int int36 = bookRequest29.compareTo(bookRequest33);
        java.lang.String str37 = bookRequest33.getRequester();
        java.lang.String str38 = bookRequest33.getBookTitle();
        int int39 = bookRequest22.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest18.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getBookTitle();
        int int28 = bookRequest24.getPriority();
        int int29 = bookRequest24.getPriority();
        int int30 = bookRequest18.compareTo(bookRequest24);
        java.lang.String str31 = bookRequest18.getBookTitle();
        int int32 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest24", (bookRequest8.compareTo(bookRequest24) == 0) == bookRequest8.equals(bookRequest24));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
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
        request.BookRequest bookRequest48 = new request.BookRequest("hi!", "", (int) 'a');
        int int49 = bookRequest48.getPriority();
        java.lang.String str50 = bookRequest48.getRequester();
        request.BookRequest bookRequest54 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str55 = bookRequest54.getRequester();
        java.lang.String str56 = bookRequest54.getBookTitle();
        int int57 = bookRequest54.getPriority();
        java.lang.String str58 = bookRequest54.getRequester();
        int int59 = bookRequest48.compareTo(bookRequest54);
        java.lang.String str60 = bookRequest48.getRequester();
        request.BookRequest bookRequest64 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int65 = bookRequest48.compareTo(bookRequest64);
        java.lang.String str66 = bookRequest48.getBookTitle();
        int int67 = bookRequest3.compareTo(bookRequest48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest48", (bookRequest10.compareTo(bookRequest48) == 0) == bookRequest10.equals(bookRequest48));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest23.getPriority();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", 52);
        int int33 = bookRequest23.compareTo(bookRequest32);
        int int34 = bookRequest32.getPriority();
        int int35 = bookRequest19.compareTo(bookRequest32);
        int int36 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest19.getPriority();
        int int22 = bookRequest15.compareTo(bookRequest19);
        int int23 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
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
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getRequester();
        int int32 = bookRequest29.getPriority();
        int int33 = bookRequest29.getPriority();
        java.lang.String str34 = bookRequest29.getBookTitle();
        int int35 = bookRequest29.getPriority();
        java.lang.String str36 = bookRequest29.getRequester();
        int int37 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest29", (bookRequest7.compareTo(bookRequest29) == 0) == bookRequest7.equals(bookRequest29));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest24.getPriority();
        java.lang.String str28 = bookRequest24.getRequester();
        int int29 = bookRequest18.compareTo(bookRequest24);
        java.lang.String str30 = bookRequest18.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int35 = bookRequest18.compareTo(bookRequest34);
        request.BookRequest bookRequest39 = new request.BookRequest("", "", 32);
        int int40 = bookRequest18.compareTo(bookRequest39);
        int int41 = bookRequest13.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 0);
        int int27 = bookRequest22.compareTo(bookRequest26);
        int int28 = bookRequest17.compareTo(bookRequest26);
        java.lang.String str29 = bookRequest26.getBookTitle();
        int int30 = bookRequest26.getPriority();
        int int31 = bookRequest7.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest22", (bookRequest7.compareTo(bookRequest22) == 0) == bookRequest7.equals(bookRequest22));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
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
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest39 = new request.BookRequest("", "", (int) (short) 0);
        int int40 = bookRequest35.compareTo(bookRequest39);
        java.lang.String str41 = bookRequest39.getBookTitle();
        java.lang.String str42 = bookRequest39.getBookTitle();
        int int43 = bookRequest26.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest39", (bookRequest3.compareTo(bookRequest39) == 0) == bookRequest3.equals(bookRequest39));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str15 = bookRequest14.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 0);
        int int24 = bookRequest19.compareTo(bookRequest23);
        int int25 = bookRequest14.compareTo(bookRequest23);
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 1);
        int int30 = bookRequest23.compareTo(bookRequest29);
        java.lang.String str31 = bookRequest23.getRequester();
        int int32 = bookRequest23.getPriority();
        java.lang.String str33 = bookRequest23.getRequester();
        int int34 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        int int15 = bookRequest7.compareTo(bookRequest13);
        int int16 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str17 = bookRequest3.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str26 = bookRequest25.getRequester();
        java.lang.String str27 = bookRequest25.getBookTitle();
        int int28 = bookRequest21.compareTo(bookRequest25);
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        java.lang.String str34 = bookRequest32.getRequester();
        java.lang.String str35 = bookRequest32.getRequester();
        java.lang.String str36 = bookRequest32.getBookTitle();
        java.lang.String str37 = bookRequest32.getBookTitle();
        java.lang.String str38 = bookRequest32.getRequester();
        int int39 = bookRequest32.getPriority();
        java.lang.String str40 = bookRequest32.getBookTitle();
        int int41 = bookRequest25.compareTo(bookRequest32);
        java.lang.String str42 = bookRequest32.getBookTitle();
        int int43 = bookRequest32.getPriority();
        int int44 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest32", (bookRequest7.compareTo(bookRequest32) == 0) == bookRequest7.equals(bookRequest32));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
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
        request.BookRequest bookRequest34 = new request.BookRequest("", "", 1);
        java.lang.String str35 = bookRequest34.getBookTitle();
        java.lang.String str36 = bookRequest34.getBookTitle();
        java.lang.String str37 = bookRequest34.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str42 = bookRequest41.getRequester();
        int int43 = bookRequest41.getPriority();
        java.lang.String str44 = bookRequest41.getBookTitle();
        java.lang.String str45 = bookRequest41.getRequester();
        int int46 = bookRequest41.getPriority();
        java.lang.String str47 = bookRequest41.getBookTitle();
        int int48 = bookRequest41.getPriority();
        int int49 = bookRequest34.compareTo(bookRequest41);
        java.lang.String str50 = bookRequest41.getBookTitle();
        java.lang.String str51 = bookRequest41.getRequester();
        java.lang.String str52 = bookRequest41.getBookTitle();
        int int53 = bookRequest24.compareTo(bookRequest41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest41", (bookRequest7.compareTo(bookRequest41) == 0) == bookRequest7.equals(bookRequest41));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
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
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) '4');
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str35 = bookRequest34.getRequester();
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest43 = new request.BookRequest("", "", (int) (short) 0);
        int int44 = bookRequest39.compareTo(bookRequest43);
        int int45 = bookRequest34.compareTo(bookRequest43);
        java.lang.String str46 = bookRequest43.getBookTitle();
        int int47 = bookRequest43.getPriority();
        int int48 = bookRequest43.getPriority();
        java.lang.String str49 = bookRequest43.getRequester();
        int int50 = bookRequest30.compareTo(bookRequest43);
        int int51 = bookRequest9.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest39", (bookRequest3.compareTo(bookRequest39) == 0) == bookRequest3.equals(bookRequest39));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str11 = bookRequest10.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (short) 0);
        int int20 = bookRequest15.compareTo(bookRequest19);
        int int21 = bookRequest10.compareTo(bookRequest19);
        java.lang.String str22 = bookRequest19.getBookTitle();
        int int23 = bookRequest19.getPriority();
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getBookTitle();
        int int34 = bookRequest27.compareTo(bookRequest31);
        java.lang.String str35 = bookRequest27.getRequester();
        java.lang.String str36 = bookRequest27.getBookTitle();
        int int37 = bookRequest19.compareTo(bookRequest27);
        int int38 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int29 = bookRequest24.compareTo(bookRequest28);
        int int30 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest24", (bookRequest16.compareTo(bookRequest24) == 0) == bookRequest16.equals(bookRequest24));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
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
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str31 = bookRequest30.getBookTitle();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str36 = bookRequest35.getRequester();
        java.lang.String str37 = bookRequest35.getBookTitle();
        int int38 = bookRequest35.getPriority();
        int int39 = bookRequest30.compareTo(bookRequest35);
        java.lang.String str40 = bookRequest30.getRequester();
        java.lang.String str41 = bookRequest30.getRequester();
        int int42 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest21 and bookRequest35", (bookRequest21.compareTo(bookRequest35) == 0) == bookRequest21.equals(bookRequest35));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str25 = bookRequest24.getRequester();
        int int26 = bookRequest24.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("", "", 1);
        java.lang.String str31 = bookRequest30.getBookTitle();
        int int32 = bookRequest24.compareTo(bookRequest30);
        int int33 = bookRequest20.compareTo(bookRequest30);
        int int34 = bookRequest30.getPriority();
        int int35 = bookRequest30.getPriority();
        java.lang.String str36 = bookRequest30.getBookTitle();
        int int37 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
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
        java.lang.String str26 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (byte) 10);
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        int int33 = bookRequest30.getPriority();
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) 'a');
        int int42 = bookRequest41.getPriority();
        int int43 = bookRequest41.getPriority();
        int int44 = bookRequest37.compareTo(bookRequest41);
        int int45 = bookRequest30.compareTo(bookRequest41);
        int int46 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest37", (bookRequest3.compareTo(bookRequest37) == 0) == bookRequest3.equals(bookRequest37));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", 52);
        int int15 = bookRequest10.compareTo(bookRequest14);
        int int16 = bookRequest10.getPriority();
        int int17 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str26 = bookRequest25.getRequester();
        java.lang.String str27 = bookRequest25.getBookTitle();
        int int28 = bookRequest21.compareTo(bookRequest25);
        java.lang.String str29 = bookRequest25.getBookTitle();
        java.lang.String str30 = bookRequest25.getRequester();
        int int31 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getRequester();
        java.lang.String str22 = bookRequest19.getBookTitle();
        int int23 = bookRequest8.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest23 = new request.BookRequest("", "", 1);
        java.lang.String str24 = bookRequest23.getBookTitle();
        java.lang.String str25 = bookRequest23.getBookTitle();
        java.lang.String str26 = bookRequest23.getRequester();
        int int27 = bookRequest19.compareTo(bookRequest23);
        java.lang.String str28 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) 'a');
        int int37 = bookRequest36.getPriority();
        int int38 = bookRequest36.getPriority();
        java.lang.String str39 = bookRequest36.getBookTitle();
        java.lang.String str40 = bookRequest36.getRequester();
        java.lang.String str41 = bookRequest36.getBookTitle();
        int int42 = bookRequest36.getPriority();
        java.lang.String str43 = bookRequest36.getBookTitle();
        int int44 = bookRequest32.compareTo(bookRequest36);
        request.BookRequest bookRequest48 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str49 = bookRequest48.getBookTitle();
        java.lang.String str50 = bookRequest48.getRequester();
        java.lang.String str51 = bookRequest48.getRequester();
        int int52 = bookRequest32.compareTo(bookRequest48);
        int int53 = bookRequest32.getPriority();
        int int54 = bookRequest23.compareTo(bookRequest32);
        java.lang.String str55 = bookRequest32.getBookTitle();
        int int56 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest48", (bookRequest3.compareTo(bookRequest48) == 0) == bookRequest3.equals(bookRequest48));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", 97);
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getBookTitle();
        int int26 = bookRequest19.compareTo(bookRequest23);
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest23.getPriority();
        java.lang.String str29 = bookRequest23.getBookTitle();
        int int30 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest23", (bookRequest12.compareTo(bookRequest23) == 0) == bookRequest12.equals(bookRequest23));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
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
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getRequester();
        java.lang.String str32 = bookRequest29.getRequester();
        java.lang.String str33 = bookRequest29.getRequester();
        request.BookRequest bookRequest37 = new request.BookRequest("", "", 35);
        int int38 = bookRequest29.compareTo(bookRequest37);
        int int39 = bookRequest24.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        java.lang.String str18 = bookRequest15.getRequester();
        int int19 = bookRequest15.getPriority();
        java.lang.String str20 = bookRequest15.getBookTitle();
        int int21 = bookRequest15.getPriority();
        int int22 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        int int14 = bookRequest12.getPriority();
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        int int17 = bookRequest12.getPriority();
        java.lang.String str18 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (byte) 100);
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getRequester();
        int int26 = bookRequest12.compareTo(bookRequest22);
        int int27 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest12", (bookRequest3.compareTo(bookRequest12) == 0) == bookRequest3.equals(bookRequest12));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
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
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str26 = bookRequest25.getBookTitle();
        java.lang.String str27 = bookRequest25.getRequester();
        int int28 = bookRequest25.getPriority();
        int int29 = bookRequest21.compareTo(bookRequest25);
        java.lang.String str30 = bookRequest21.getRequester();
        int int31 = bookRequest13.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest21", (bookRequest13.compareTo(bookRequest21) == 0) == bookRequest13.equals(bookRequest21));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
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
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) 'a');
        int int35 = bookRequest34.getPriority();
        java.lang.String str36 = bookRequest34.getRequester();
        java.lang.String str37 = bookRequest34.getRequester();
        java.lang.String str38 = bookRequest34.getBookTitle();
        java.lang.String str39 = bookRequest34.getBookTitle();
        java.lang.String str40 = bookRequest34.getBookTitle();
        request.BookRequest bookRequest44 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str45 = bookRequest44.getBookTitle();
        java.lang.String str46 = bookRequest44.getRequester();
        int int47 = bookRequest44.getPriority();
        int int48 = bookRequest34.compareTo(bookRequest44);
        int int49 = bookRequest28.compareTo(bookRequest44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest34", (bookRequest15.compareTo(bookRequest34) == 0) == bookRequest15.equals(bookRequest34));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) '4');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str23 = bookRequest22.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (short) 0);
        int int32 = bookRequest27.compareTo(bookRequest31);
        int int33 = bookRequest22.compareTo(bookRequest31);
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest16.compareTo(bookRequest31);
        java.lang.String str36 = bookRequest16.getRequester();
        int int37 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest27", (bookRequest7.compareTo(bookRequest27) == 0) == bookRequest7.equals(bookRequest27));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
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
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", 100);
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        java.lang.String str34 = bookRequest32.getRequester();
        int int35 = bookRequest32.getPriority();
        int int36 = bookRequest32.getPriority();
        java.lang.String str37 = bookRequest32.getBookTitle();
        int int38 = bookRequest32.getPriority();
        java.lang.String str39 = bookRequest32.getBookTitle();
        int int40 = bookRequest32.getPriority();
        java.lang.String str41 = bookRequest32.getRequester();
        int int42 = bookRequest32.getPriority();
        int int43 = bookRequest28.compareTo(bookRequest32);
        java.lang.String str44 = bookRequest32.getRequester();
        int int45 = bookRequest32.getPriority();
        request.BookRequest bookRequest49 = new request.BookRequest("hi!", "", 0);
        java.lang.String str50 = bookRequest49.getBookTitle();
        int int51 = bookRequest49.getPriority();
        java.lang.String str52 = bookRequest49.getBookTitle();
        java.lang.String str53 = bookRequest49.getBookTitle();
        int int54 = bookRequest49.getPriority();
        int int55 = bookRequest32.compareTo(bookRequest49);
        int int56 = bookRequest23.compareTo(bookRequest49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest32", (bookRequest8.compareTo(bookRequest32) == 0) == bookRequest8.equals(bookRequest32));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest15 = new request.BookRequest("", "hi!", (int) (short) -1);
        java.lang.String str16 = bookRequest15.getBookTitle();
        int int17 = bookRequest10.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest15", (bookRequest10.compareTo(bookRequest15) == 0) == bookRequest10.equals(bookRequest15));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
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
        java.lang.String str20 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) '#');
        int int31 = bookRequest30.getPriority();
        java.lang.String str32 = bookRequest30.getBookTitle();
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) ' ');
        int int37 = bookRequest30.compareTo(bookRequest36);
        java.lang.String str38 = bookRequest30.getRequester();
        int int39 = bookRequest24.compareTo(bookRequest30);
        int int40 = bookRequest24.getPriority();
        java.lang.String str41 = bookRequest24.getRequester();
        int int42 = bookRequest24.getPriority();
        int int43 = bookRequest24.getPriority();
        int int44 = bookRequest13.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest24", (bookRequest7.compareTo(bookRequest24) == 0) == bookRequest7.equals(bookRequest24));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
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
        java.lang.String str18 = bookRequest12.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str27 = bookRequest26.getRequester();
        java.lang.String str28 = bookRequest26.getBookTitle();
        int int29 = bookRequest22.compareTo(bookRequest26);
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        int int34 = bookRequest33.getPriority();
        int int35 = bookRequest33.getPriority();
        java.lang.String str36 = bookRequest33.getBookTitle();
        java.lang.String str37 = bookRequest33.getBookTitle();
        java.lang.String str38 = bookRequest33.getBookTitle();
        int int39 = bookRequest22.compareTo(bookRequest33);
        int int40 = bookRequest12.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest33", (bookRequest3.compareTo(bookRequest33) == 0) == bookRequest3.equals(bookRequest33));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getRequester();
        int int32 = bookRequest27.getPriority();
        java.lang.String str33 = bookRequest27.getBookTitle();
        int int34 = bookRequest15.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest27", (bookRequest7.compareTo(bookRequest27) == 0) == bookRequest7.equals(bookRequest27));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", 35);
        int int11 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (short) 0);
        int int20 = bookRequest15.compareTo(bookRequest19);
        java.lang.String str21 = bookRequest15.getBookTitle();
        int int22 = bookRequest15.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getBookTitle();
        int int33 = bookRequest26.compareTo(bookRequest30);
        java.lang.String str34 = bookRequest30.getBookTitle();
        int int35 = bookRequest15.compareTo(bookRequest30);
        int int36 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest30", (bookRequest3.compareTo(bookRequest30) == 0) == bookRequest3.equals(bookRequest30));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str29 = bookRequest28.getRequester();
        java.lang.String str30 = bookRequest28.getBookTitle();
        int int31 = bookRequest28.getPriority();
        java.lang.String str32 = bookRequest28.getBookTitle();
        java.lang.String str33 = bookRequest28.getRequester();
        java.lang.String str34 = bookRequest28.getBookTitle();
        java.lang.String str35 = bookRequest28.getRequester();
        java.lang.String str36 = bookRequest28.getBookTitle();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) 'a');
        int int41 = bookRequest40.getPriority();
        java.lang.String str42 = bookRequest40.getRequester();
        java.lang.String str43 = bookRequest40.getRequester();
        int int44 = bookRequest40.getPriority();
        int int45 = bookRequest40.getPriority();
        java.lang.String str46 = bookRequest40.getRequester();
        int int47 = bookRequest28.compareTo(bookRequest40);
        request.BookRequest bookRequest51 = new request.BookRequest("", "hi!", 10);
        java.lang.String str52 = bookRequest51.getRequester();
        java.lang.String str53 = bookRequest51.getBookTitle();
        int int54 = bookRequest28.compareTo(bookRequest51);
        java.lang.String str55 = bookRequest28.getBookTitle();
        int int56 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest51", (bookRequest9.compareTo(bookRequest51) == 0) == bookRequest9.equals(bookRequest51));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getBookTitle();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getBookTitle();
        java.lang.String str23 = bookRequest16.getBookTitle();
        int int24 = bookRequest11.compareTo(bookRequest16);
        java.lang.String str25 = bookRequest16.getRequester();
        int int26 = bookRequest16.getPriority();
        int int27 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) (short) 100);
        int int17 = bookRequest3.compareTo(bookRequest16);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getBookTitle();
        int int26 = bookRequest21.getPriority();
        java.lang.String str27 = bookRequest21.getBookTitle();
        java.lang.String str28 = bookRequest21.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) '#');
        int int33 = bookRequest32.getPriority();
        java.lang.String str34 = bookRequest32.getRequester();
        java.lang.String str35 = bookRequest32.getBookTitle();
        int int36 = bookRequest32.getPriority();
        int int37 = bookRequest21.compareTo(bookRequest32);
        int int38 = bookRequest21.getPriority();
        int int39 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest32", (bookRequest3.compareTo(bookRequest32) == 0) == bookRequest3.equals(bookRequest32));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
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
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getRequester();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getBookTitle();
        int int23 = bookRequest16.getPriority();
        int int24 = bookRequest16.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str29 = bookRequest28.getBookTitle();
        java.lang.String str30 = bookRequest28.getBookTitle();
        java.lang.String str31 = bookRequest28.getRequester();
        int int32 = bookRequest16.compareTo(bookRequest28);
        int int33 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (byte) 10);
        int int10 = bookRequest9.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", 1);
        java.lang.String str15 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str20 = bookRequest19.getRequester();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        java.lang.String str23 = bookRequest19.getRequester();
        int int24 = bookRequest19.getPriority();
        int int25 = bookRequest14.compareTo(bookRequest19);
        int int26 = bookRequest9.compareTo(bookRequest14);
        int int27 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int14 = bookRequest3.compareTo(bookRequest13);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getRequester();
        int int25 = bookRequest18.compareTo(bookRequest22);
        java.lang.String str26 = bookRequest18.getRequester();
        java.lang.String str27 = bookRequest18.getBookTitle();
        java.lang.String str28 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getBookTitle();
        int int37 = bookRequest32.getPriority();
        int int38 = bookRequest32.getPriority();
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int43 = bookRequest32.compareTo(bookRequest42);
        java.lang.String str44 = bookRequest42.getRequester();
        java.lang.String str45 = bookRequest42.getRequester();
        java.lang.String str46 = bookRequest42.getRequester();
        request.BookRequest bookRequest50 = new request.BookRequest("", "hi!", (int) '4');
        int int51 = bookRequest50.getPriority();
        int int52 = bookRequest42.compareTo(bookRequest50);
        java.lang.String str53 = bookRequest50.getBookTitle();
        int int54 = bookRequest50.getPriority();
        int int55 = bookRequest18.compareTo(bookRequest50);
        int int56 = bookRequest13.compareTo(bookRequest50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest32", (bookRequest3.compareTo(bookRequest32) == 0) == bookRequest3.equals(bookRequest32));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        java.lang.String str19 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        java.lang.String str27 = bookRequest23.getRequester();
        int int28 = bookRequest23.getPriority();
        int int29 = bookRequest18.compareTo(bookRequest23);
        int int30 = bookRequest18.getPriority();
        java.lang.String str31 = bookRequest18.getRequester();
        java.lang.String str32 = bookRequest18.getRequester();
        java.lang.String str33 = bookRequest18.getRequester();
        int int34 = bookRequest14.compareTo(bookRequest18);
        int int35 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) -1);
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getBookTitle();
        java.lang.String str26 = bookRequest23.getRequester();
        int int27 = bookRequest13.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest23", (bookRequest13.compareTo(bookRequest23) == 0) == bookRequest13.equals(bookRequest23));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str11 = bookRequest10.getBookTitle();
        int int12 = bookRequest10.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", 52);
        int int17 = bookRequest10.compareTo(bookRequest16);
        int int18 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
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
        int int19 = bookRequest3.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        java.lang.String str27 = bookRequest23.getRequester();
        int int28 = bookRequest23.getPriority();
        int int29 = bookRequest23.getPriority();
        int int30 = bookRequest23.getPriority();
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str35 = bookRequest34.getRequester();
        int int36 = bookRequest34.getPriority();
        java.lang.String str37 = bookRequest34.getBookTitle();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "hi!", 100);
        int int42 = bookRequest34.compareTo(bookRequest41);
        int int43 = bookRequest23.compareTo(bookRequest34);
        java.lang.String str44 = bookRequest34.getBookTitle();
        int int45 = bookRequest3.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest34", (bookRequest3.compareTo(bookRequest34) == 0) == bookRequest3.equals(bookRequest34));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
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
        java.lang.String str17 = bookRequest3.getRequester();
        java.lang.String str18 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 100);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getBookTitle();
        int int25 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        java.lang.String str19 = bookRequest17.getRequester();
        java.lang.String str20 = bookRequest17.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int25 = bookRequest17.compareTo(bookRequest24);
        int int26 = bookRequest17.getPriority();
        java.lang.String str27 = bookRequest17.getRequester();
        int int28 = bookRequest13.compareTo(bookRequest17);
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str33 = bookRequest32.getRequester();
        int int34 = bookRequest32.getPriority();
        int int35 = bookRequest32.getPriority();
        java.lang.String str36 = bookRequest32.getBookTitle();
        int int37 = bookRequest17.compareTo(bookRequest32);
        int int38 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest9.getRequester();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest9.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        java.lang.String str19 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        java.lang.String str27 = bookRequest23.getRequester();
        int int28 = bookRequest23.getPriority();
        int int29 = bookRequest18.compareTo(bookRequest23);
        int int30 = bookRequest18.getPriority();
        java.lang.String str31 = bookRequest18.getRequester();
        java.lang.String str32 = bookRequest18.getBookTitle();
        java.lang.String str33 = bookRequest18.getBookTitle();
        int int34 = bookRequest9.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
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
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getRequester();
        java.lang.String str33 = bookRequest29.getBookTitle();
        int int34 = bookRequest29.getPriority();
        int int35 = bookRequest29.getPriority();
        int int36 = bookRequest7.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest29", (bookRequest7.compareTo(bookRequest29) == 0) == bookRequest7.equals(bookRequest29));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
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
        java.lang.String str25 = bookRequest3.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", 97);
        int int34 = bookRequest33.getPriority();
        java.lang.String str35 = bookRequest33.getBookTitle();
        int int36 = bookRequest29.compareTo(bookRequest33);
        request.BookRequest bookRequest40 = new request.BookRequest("", "", (int) (short) 10);
        int int41 = bookRequest29.compareTo(bookRequest40);
        java.lang.String str42 = bookRequest40.getBookTitle();
        int int43 = bookRequest40.getPriority();
        int int44 = bookRequest40.getPriority();
        int int45 = bookRequest3.compareTo(bookRequest40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest40", (bookRequest3.compareTo(bookRequest40) == 0) == bookRequest3.equals(bookRequest40));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
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
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 1);
        java.lang.String str23 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getRequester();
        int int32 = bookRequest27.getPriority();
        int int33 = bookRequest22.compareTo(bookRequest27);
        int int34 = bookRequest22.getPriority();
        java.lang.String str35 = bookRequest22.getRequester();
        java.lang.String str36 = bookRequest22.getRequester();
        int int37 = bookRequest14.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str20 = bookRequest19.getRequester();
        java.lang.String str21 = bookRequest19.getBookTitle();
        int int22 = bookRequest19.getPriority();
        java.lang.String str23 = bookRequest19.getBookTitle();
        java.lang.String str24 = bookRequest19.getRequester();
        java.lang.String str25 = bookRequest19.getBookTitle();
        java.lang.String str26 = bookRequest19.getRequester();
        java.lang.String str27 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        java.lang.String str33 = bookRequest31.getRequester();
        java.lang.String str34 = bookRequest31.getRequester();
        int int35 = bookRequest31.getPriority();
        int int36 = bookRequest31.getPriority();
        java.lang.String str37 = bookRequest31.getRequester();
        int int38 = bookRequest19.compareTo(bookRequest31);
        int int39 = bookRequest19.getPriority();
        request.BookRequest bookRequest43 = new request.BookRequest("", "", (-1));
        java.lang.String str44 = bookRequest43.getBookTitle();
        java.lang.String str45 = bookRequest43.getBookTitle();
        java.lang.String str46 = bookRequest43.getBookTitle();
        java.lang.String str47 = bookRequest43.getBookTitle();
        java.lang.String str48 = bookRequest43.getRequester();
        java.lang.String str49 = bookRequest43.getRequester();
        int int50 = bookRequest19.compareTo(bookRequest43);
        int int51 = bookRequest11.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
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
        java.lang.String str26 = bookRequest3.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) (short) 0);
        int int35 = bookRequest30.compareTo(bookRequest34);
        java.lang.String str36 = bookRequest34.getRequester();
        int int37 = bookRequest34.getPriority();
        java.lang.String str38 = bookRequest34.getBookTitle();
        int int39 = bookRequest3.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest30", (bookRequest7.compareTo(bookRequest30) == 0) == bookRequest7.equals(bookRequest30));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) '#');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) ' ');
        int int16 = bookRequest9.compareTo(bookRequest15);
        java.lang.String str17 = bookRequest9.getRequester();
        java.lang.String str18 = bookRequest9.getRequester();
        int int19 = bookRequest9.getPriority();
        int int20 = bookRequest9.getPriority();
        java.lang.String str21 = bookRequest9.getBookTitle();
        int int22 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (byte) 1);
        int int31 = bookRequest26.compareTo(bookRequest30);
        int int32 = bookRequest9.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest26", (bookRequest9.compareTo(bookRequest26) == 0) == bookRequest9.equals(bookRequest26));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        java.lang.String str30 = bookRequest28.getRequester();
        java.lang.String str31 = bookRequest28.getRequester();
        java.lang.String str32 = bookRequest28.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("", "", 35);
        int int37 = bookRequest28.compareTo(bookRequest36);
        java.lang.String str38 = bookRequest36.getBookTitle();
        request.BookRequest bookRequest42 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str43 = bookRequest42.getBookTitle();
        java.lang.String str44 = bookRequest42.getRequester();
        int int45 = bookRequest36.compareTo(bookRequest42);
        java.lang.String str46 = bookRequest42.getRequester();
        int int47 = bookRequest42.getPriority();
        int int48 = bookRequest16.compareTo(bookRequest42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest42", (bookRequest16.compareTo(bookRequest42) == 0) == bookRequest16.equals(bookRequest42));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getRequester();
        java.lang.String str24 = bookRequest20.getBookTitle();
        java.lang.String str25 = bookRequest20.getBookTitle();
        java.lang.String str26 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str31 = bookRequest30.getBookTitle();
        java.lang.String str32 = bookRequest30.getRequester();
        int int33 = bookRequest30.getPriority();
        int int34 = bookRequest20.compareTo(bookRequest30);
        java.lang.String str35 = bookRequest30.getBookTitle();
        int int36 = bookRequest8.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest20", (bookRequest8.compareTo(bookRequest20) == 0) == bookRequest8.equals(bookRequest20));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", 35);
        java.lang.String str14 = bookRequest13.getRequester();
        int int15 = bookRequest13.getPriority();
        java.lang.String str16 = bookRequest13.getBookTitle();
        java.lang.String str17 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.getRequester();
        int int24 = bookRequest21.getPriority();
        java.lang.String str25 = bookRequest21.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str30 = bookRequest29.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) (short) 0);
        int int39 = bookRequest34.compareTo(bookRequest38);
        int int40 = bookRequest29.compareTo(bookRequest38);
        int int41 = bookRequest29.getPriority();
        int int42 = bookRequest29.getPriority();
        java.lang.String str43 = bookRequest29.getRequester();
        int int44 = bookRequest21.compareTo(bookRequest29);
        java.lang.String str45 = bookRequest21.getRequester();
        int int46 = bookRequest13.compareTo(bookRequest21);
        int int47 = bookRequest21.getPriority();
        int int48 = bookRequest21.getPriority();
        int int49 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (byte) 1);
        int int16 = bookRequest11.compareTo(bookRequest15);
        java.lang.String str17 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (short) 0);
        int int26 = bookRequest21.compareTo(bookRequest25);
        java.lang.String str27 = bookRequest21.getRequester();
        int int28 = bookRequest11.compareTo(bookRequest21);
        int int29 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
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
        int int21 = bookRequest3.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str26 = bookRequest25.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) (short) 0);
        int int35 = bookRequest30.compareTo(bookRequest34);
        int int36 = bookRequest25.compareTo(bookRequest34);
        java.lang.String str37 = bookRequest34.getBookTitle();
        request.BookRequest bookRequest41 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str42 = bookRequest41.getRequester();
        int int43 = bookRequest41.getPriority();
        int int44 = bookRequest34.compareTo(bookRequest41);
        request.BookRequest bookRequest48 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str49 = bookRequest48.getBookTitle();
        int int50 = bookRequest48.getPriority();
        java.lang.String str51 = bookRequest48.getRequester();
        int int52 = bookRequest41.compareTo(bookRequest48);
        int int53 = bookRequest3.compareTo(bookRequest48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "hi!", (int) (byte) 10);
        java.lang.String str11 = bookRequest10.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getBookTitle();
        int int23 = bookRequest20.getPriority();
        java.lang.String str24 = bookRequest20.getRequester();
        int int25 = bookRequest14.compareTo(bookRequest20);
        java.lang.String str26 = bookRequest20.getBookTitle();
        int int27 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        int int34 = bookRequest33.getPriority();
        int int35 = bookRequest33.getPriority();
        java.lang.String str36 = bookRequest33.getBookTitle();
        java.lang.String str37 = bookRequest33.getBookTitle();
        java.lang.String str38 = bookRequest33.getBookTitle();
        java.lang.String str39 = bookRequest33.getRequester();
        int int40 = bookRequest27.compareTo(bookRequest33);
        java.lang.String str41 = bookRequest27.getRequester();
        java.lang.String str42 = bookRequest27.getRequester();
        int int43 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest33", (bookRequest3.compareTo(bookRequest33) == 0) == bookRequest3.equals(bookRequest33));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str13 = bookRequest12.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "hi!", 52);
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str29 = bookRequest28.getRequester();
        java.lang.String str30 = bookRequest28.getRequester();
        int int31 = bookRequest24.compareTo(bookRequest28);
        int int32 = bookRequest28.getPriority();
        int int33 = bookRequest18.compareTo(bookRequest28);
        int int34 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest18", (bookRequest12.compareTo(bookRequest18) == 0) == bookRequest12.equals(bookRequest18));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", 97);
        java.lang.String str14 = bookRequest13.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) ' ');
        int int19 = bookRequest13.compareTo(bookRequest18);
        int int20 = bookRequest9.compareTo(bookRequest18);
        int int21 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "hi!", 52);
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest9.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        int int23 = bookRequest15.compareTo(bookRequest19);
        int int24 = bookRequest15.getPriority();
        int int25 = bookRequest9.compareTo(bookRequest15);
        int int26 = bookRequest9.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        java.lang.String str32 = bookRequest30.getRequester();
        int int33 = bookRequest30.getPriority();
        int int34 = bookRequest30.getPriority();
        java.lang.String str35 = bookRequest30.getBookTitle();
        int int36 = bookRequest30.getPriority();
        java.lang.String str37 = bookRequest30.getBookTitle();
        int int38 = bookRequest9.compareTo(bookRequest30);
        int int39 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest30", (bookRequest3.compareTo(bookRequest30) == 0) == bookRequest3.equals(bookRequest30));
    }
}

