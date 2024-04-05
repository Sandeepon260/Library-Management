package BookRequestAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
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
        java.lang.String str17 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getRequester();
        java.lang.String str28 = bookRequest25.getRequester();
        java.lang.String str29 = bookRequest25.getRequester();
        int int30 = bookRequest21.compareTo(bookRequest25);
        java.lang.String str31 = bookRequest25.getBookTitle();
        int int32 = bookRequest25.getPriority();
        java.lang.String str33 = bookRequest25.getBookTitle();
        int int34 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest21", (bookRequest10.compareTo(bookRequest21) == 0) == bookRequest10.equals(bookRequest21));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
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
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", 97);
        java.lang.String str28 = bookRequest27.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) (byte) 1);
        int int37 = bookRequest32.compareTo(bookRequest36);
        java.lang.String str38 = bookRequest32.getBookTitle();
        java.lang.String str39 = bookRequest32.getBookTitle();
        java.lang.String str40 = bookRequest32.getBookTitle();
        int int41 = bookRequest27.compareTo(bookRequest32);
        int int42 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "hi!", 0);
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", 97);
        java.lang.String str24 = bookRequest23.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) ' ');
        int int29 = bookRequest23.compareTo(bookRequest28);
        int int30 = bookRequest19.compareTo(bookRequest28);
        int int31 = bookRequest15.compareTo(bookRequest28);
        int int32 = bookRequest8.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getRequester();
        java.lang.String str32 = bookRequest27.getBookTitle();
        int int33 = bookRequest27.getPriority();
        java.lang.String str34 = bookRequest27.getBookTitle();
        int int35 = bookRequest23.compareTo(bookRequest27);
        java.lang.String str36 = bookRequest23.getBookTitle();
        int int37 = bookRequest23.getPriority();
        java.lang.String str38 = bookRequest23.getBookTitle();
        java.lang.String str39 = bookRequest23.getBookTitle();
        int int40 = bookRequest14.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest27", (bookRequest14.compareTo(bookRequest27) == 0) == bookRequest14.equals(bookRequest27));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
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
        java.lang.String str19 = bookRequest3.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        java.lang.String str27 = bookRequest23.getBookTitle();
        int int28 = bookRequest23.getPriority();
        int int29 = bookRequest23.getPriority();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int34 = bookRequest23.compareTo(bookRequest33);
        int int35 = bookRequest23.getPriority();
        java.lang.String str36 = bookRequest23.getRequester();
        java.lang.String str37 = bookRequest23.getBookTitle();
        int int38 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", 97);
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getBookTitle();
        int int19 = bookRequest12.compareTo(bookRequest16);
        java.lang.String str20 = bookRequest12.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) (byte) 0);
        java.lang.String str25 = bookRequest24.getBookTitle();
        int int26 = bookRequest12.compareTo(bookRequest24);
        int int27 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
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
        java.lang.String str32 = bookRequest22.getRequester();
        int int33 = bookRequest22.getPriority();
        int int34 = bookRequest7.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest16", (bookRequest7.compareTo(bookRequest16) == 0) == bookRequest7.equals(bookRequest16));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
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
        int int17 = bookRequest3.getPriority();
        java.lang.String str18 = bookRequest3.getRequester();
        int int19 = bookRequest3.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getRequester();
        java.lang.String str33 = bookRequest29.getBookTitle();
        int int34 = bookRequest29.getPriority();
        java.lang.String str35 = bookRequest29.getBookTitle();
        int int36 = bookRequest29.getPriority();
        int int37 = bookRequest23.compareTo(bookRequest29);
        int int38 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) -1);
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
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", 10);
        int int26 = bookRequest17.compareTo(bookRequest25);
        java.lang.String str27 = bookRequest17.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) ' ');
        int int10 = bookRequest9.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest14.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("", "", 1);
        java.lang.String str21 = bookRequest20.getBookTitle();
        int int22 = bookRequest14.compareTo(bookRequest20);
        int int23 = bookRequest9.compareTo(bookRequest20);
        int int24 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest9", (bookRequest3.compareTo(bookRequest9) == 0) == bookRequest3.equals(bookRequest9));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
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
        java.lang.String str22 = bookRequest13.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", 0);
        java.lang.String str27 = bookRequest26.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        java.lang.String str35 = bookRequest31.getBookTitle();
        int int36 = bookRequest26.compareTo(bookRequest31);
        request.BookRequest bookRequest40 = new request.BookRequest("", "", (int) (byte) 10);
        int int41 = bookRequest40.getPriority();
        int int42 = bookRequest26.compareTo(bookRequest40);
        java.lang.String str43 = bookRequest40.getBookTitle();
        java.lang.String str44 = bookRequest40.getRequester();
        int int45 = bookRequest13.compareTo(bookRequest40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getRequester();
        int int29 = bookRequest26.getPriority();
        java.lang.String str30 = bookRequest26.getRequester();
        java.lang.String str31 = bookRequest26.getBookTitle();
        int int32 = bookRequest26.getPriority();
        java.lang.String str33 = bookRequest26.getRequester();
        int int34 = bookRequest26.getPriority();
        int int35 = bookRequest13.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str14 = bookRequest13.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 0);
        int int23 = bookRequest18.compareTo(bookRequest22);
        int int24 = bookRequest13.compareTo(bookRequest22);
        int int25 = bookRequest13.getPriority();
        int int26 = bookRequest13.getPriority();
        java.lang.String str27 = bookRequest13.getRequester();
        java.lang.String str28 = bookRequest13.getBookTitle();
        java.lang.String str29 = bookRequest13.getBookTitle();
        int int30 = bookRequest13.getPriority();
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str35 = bookRequest34.getRequester();
        java.lang.String str36 = bookRequest34.getBookTitle();
        int int37 = bookRequest34.getPriority();
        int int38 = bookRequest13.compareTo(bookRequest34);
        java.lang.String str39 = bookRequest34.getRequester();
        int int40 = bookRequest34.getPriority();
        int int41 = bookRequest3.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
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
        int int24 = bookRequest21.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", 97);
        int int33 = bookRequest32.getPriority();
        java.lang.String str34 = bookRequest32.getBookTitle();
        int int35 = bookRequest28.compareTo(bookRequest32);
        int int36 = bookRequest21.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest32", (bookRequest7.compareTo(bookRequest32) == 0) == bookRequest7.equals(bookRequest32));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "hi!", 52);
        int int19 = bookRequest14.compareTo(bookRequest18);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getRequester();
        int int26 = bookRequest23.getPriority();
        java.lang.String str27 = bookRequest23.getBookTitle();
        java.lang.String str28 = bookRequest23.getRequester();
        int int29 = bookRequest14.compareTo(bookRequest23);
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) (short) 100);
        java.lang.String str34 = bookRequest33.getBookTitle();
        int int35 = bookRequest23.compareTo(bookRequest33);
        int int36 = bookRequest3.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str34 = bookRequest33.getRequester();
        int int35 = bookRequest33.getPriority();
        request.BookRequest bookRequest39 = new request.BookRequest("", "", 1);
        java.lang.String str40 = bookRequest39.getBookTitle();
        int int41 = bookRequest33.compareTo(bookRequest39);
        int int42 = bookRequest29.compareTo(bookRequest39);
        int int43 = bookRequest29.getPriority();
        java.lang.String str44 = bookRequest29.getRequester();
        int int45 = bookRequest17.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest33", (bookRequest9.compareTo(bookRequest33) == 0) == bookRequest9.equals(bookRequest33));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 0);
        int int27 = bookRequest22.compareTo(bookRequest26);
        int int28 = bookRequest17.compareTo(bookRequest26);
        java.lang.String str29 = bookRequest26.getBookTitle();
        int int30 = bookRequest26.getPriority();
        java.lang.String str31 = bookRequest26.getRequester();
        int int32 = bookRequest26.getPriority();
        request.BookRequest bookRequest36 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str41 = bookRequest40.getRequester();
        java.lang.String str42 = bookRequest40.getBookTitle();
        int int43 = bookRequest36.compareTo(bookRequest40);
        java.lang.String str44 = bookRequest40.getBookTitle();
        java.lang.String str45 = bookRequest40.getRequester();
        int int46 = bookRequest26.compareTo(bookRequest40);
        int int47 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (byte) 100);
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getRequester();
        int int22 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
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
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str33 = bookRequest32.getBookTitle();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getBookTitle();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) 'a');
        int int41 = bookRequest40.getPriority();
        int int42 = bookRequest40.getPriority();
        java.lang.String str43 = bookRequest40.getBookTitle();
        int int44 = bookRequest40.getPriority();
        int int45 = bookRequest40.getPriority();
        int int46 = bookRequest40.getPriority();
        int int47 = bookRequest40.getPriority();
        int int48 = bookRequest40.getPriority();
        request.BookRequest bookRequest52 = new request.BookRequest("", "hi!", (int) '4');
        int int53 = bookRequest52.getPriority();
        java.lang.String str54 = bookRequest52.getBookTitle();
        java.lang.String str55 = bookRequest52.getBookTitle();
        int int56 = bookRequest52.getPriority();
        int int57 = bookRequest52.getPriority();
        int int58 = bookRequest52.getPriority();
        int int59 = bookRequest40.compareTo(bookRequest52);
        int int60 = bookRequest32.compareTo(bookRequest52);
        int int61 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest40", (bookRequest8.compareTo(bookRequest40) == 0) == bookRequest8.equals(bookRequest40));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
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
        java.lang.String str13 = bookRequest3.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", 100);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        int int24 = bookRequest21.getPriority();
        int int25 = bookRequest21.getPriority();
        java.lang.String str26 = bookRequest21.getBookTitle();
        int int27 = bookRequest21.getPriority();
        java.lang.String str28 = bookRequest21.getBookTitle();
        int int29 = bookRequest21.getPriority();
        java.lang.String str30 = bookRequest21.getRequester();
        int int31 = bookRequest21.getPriority();
        int int32 = bookRequest17.compareTo(bookRequest21);
        request.BookRequest bookRequest36 = new request.BookRequest("", "", 1);
        java.lang.String str37 = bookRequest36.getRequester();
        java.lang.String str38 = bookRequest36.getBookTitle();
        int int39 = bookRequest21.compareTo(bookRequest36);
        java.lang.String str40 = bookRequest21.getBookTitle();
        int int41 = bookRequest21.getPriority();
        int int42 = bookRequest21.getPriority();
        int int43 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) ' ');
        int int11 = bookRequest10.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str16 = bookRequest15.getRequester();
        int int17 = bookRequest15.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", 1);
        java.lang.String str22 = bookRequest21.getBookTitle();
        int int23 = bookRequest15.compareTo(bookRequest21);
        int int24 = bookRequest10.compareTo(bookRequest21);
        java.lang.String str25 = bookRequest10.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest16 = new request.BookRequest("", "", 1);
        int int17 = bookRequest8.compareTo(bookRequest16);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str22 = bookRequest21.getRequester();
        java.lang.String str23 = bookRequest21.getRequester();
        int int24 = bookRequest21.getPriority();
        java.lang.String str25 = bookRequest21.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "hi!", 0);
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getRequester();
        java.lang.String str32 = bookRequest29.getRequester();
        int int33 = bookRequest21.compareTo(bookRequest29);
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) (byte) 10);
        int int38 = bookRequest21.compareTo(bookRequest37);
        int int39 = bookRequest16.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest21", (bookRequest8.compareTo(bookRequest21) == 0) == bookRequest8.equals(bookRequest21));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest29.getPriority();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        int int36 = bookRequest35.getPriority();
        java.lang.String str37 = bookRequest35.getRequester();
        java.lang.String str38 = bookRequest35.getBookTitle();
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int43 = bookRequest35.compareTo(bookRequest42);
        int int44 = bookRequest35.getPriority();
        java.lang.String str45 = bookRequest35.getRequester();
        int int46 = bookRequest35.getPriority();
        int int47 = bookRequest29.compareTo(bookRequest35);
        java.lang.String str48 = bookRequest35.getRequester();
        int int49 = bookRequest3.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest35", (bookRequest8.compareTo(bookRequest35) == 0) == bookRequest8.equals(bookRequest35));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
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
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getBookTitle();
        int int34 = bookRequest31.getPriority();
        java.lang.String str35 = bookRequest31.getBookTitle();
        java.lang.String str36 = bookRequest31.getRequester();
        java.lang.String str37 = bookRequest31.getBookTitle();
        java.lang.String str38 = bookRequest31.getRequester();
        java.lang.String str39 = bookRequest31.getBookTitle();
        int int40 = bookRequest7.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest31", (bookRequest14.compareTo(bookRequest31) == 0) == bookRequest14.equals(bookRequest31));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", 1);
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getBookTitle();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest10);
        int int15 = bookRequest10.getPriority();
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
        request.BookRequest bookRequest32 = new request.BookRequest("", "", 1);
        java.lang.String str33 = bookRequest32.getRequester();
        int int34 = bookRequest19.compareTo(bookRequest32);
        java.lang.String str35 = bookRequest32.getBookTitle();
        int int36 = bookRequest10.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest32", (bookRequest10.compareTo(bookRequest32) == 0) == bookRequest10.equals(bookRequest32));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", 97);
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getBookTitle();
        int int22 = bookRequest15.compareTo(bookRequest19);
        java.lang.String str23 = bookRequest19.getBookTitle();
        java.lang.String str24 = bookRequest19.getRequester();
        java.lang.String str25 = bookRequest19.getBookTitle();
        java.lang.String str26 = bookRequest19.getRequester();
        java.lang.String str27 = bookRequest19.getBookTitle();
        java.lang.String str28 = bookRequest19.getRequester();
        int int29 = bookRequest7.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 0);
        int int27 = bookRequest22.compareTo(bookRequest26);
        int int28 = bookRequest17.compareTo(bookRequest26);
        java.lang.String str29 = bookRequest26.getBookTitle();
        int int30 = bookRequest26.getPriority();
        int int31 = bookRequest26.getPriority();
        int int32 = bookRequest26.getPriority();
        java.lang.String str33 = bookRequest26.getBookTitle();
        int int34 = bookRequest7.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest22", (bookRequest7.compareTo(bookRequest22) == 0) == bookRequest7.equals(bookRequest22));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", 0);
        int int13 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str14 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getBookTitle();
        int int23 = bookRequest18.getPriority();
        int int24 = bookRequest18.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int29 = bookRequest18.compareTo(bookRequest28);
        int int30 = bookRequest12.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
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
        int int22 = bookRequest3.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str37 = bookRequest36.getRequester();
        java.lang.String str38 = bookRequest36.getBookTitle();
        int int39 = bookRequest32.compareTo(bookRequest36);
        java.lang.String str40 = bookRequest32.getRequester();
        java.lang.String str41 = bookRequest32.getRequester();
        java.lang.String str42 = bookRequest32.getBookTitle();
        int int43 = bookRequest26.compareTo(bookRequest32);
        java.lang.String str44 = bookRequest26.getRequester();
        request.BookRequest bookRequest48 = new request.BookRequest("hi!", "", 0);
        java.lang.String str49 = bookRequest48.getBookTitle();
        int int50 = bookRequest48.getPriority();
        java.lang.String str51 = bookRequest48.getBookTitle();
        java.lang.String str52 = bookRequest48.getRequester();
        int int53 = bookRequest26.compareTo(bookRequest48);
        int int54 = bookRequest3.compareTo(bookRequest48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest32", (bookRequest3.compareTo(bookRequest32) == 0) == bookRequest3.equals(bookRequest32));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) '4');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getBookTitle();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest8.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest16.compareTo(bookRequest20);
        int int22 = bookRequest20.getPriority();
        int int23 = bookRequest20.getPriority();
        int int24 = bookRequest8.compareTo(bookRequest20);
        java.lang.String str25 = bookRequest8.getBookTitle();
        int int26 = bookRequest8.getPriority();
        int int27 = bookRequest3.compareTo(bookRequest8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.getBookTitle();
        java.lang.String str12 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getRequester();
        int int20 = bookRequest16.getPriority();
        java.lang.String str21 = bookRequest16.getRequester();
        int int22 = bookRequest9.compareTo(bookRequest16);
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) '#');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) ' ');
        int int33 = bookRequest26.compareTo(bookRequest32);
        java.lang.String str34 = bookRequest26.getBookTitle();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest42 = new request.BookRequest("", "", 1);
        java.lang.String str43 = bookRequest42.getBookTitle();
        java.lang.String str44 = bookRequest42.getBookTitle();
        java.lang.String str45 = bookRequest42.getRequester();
        int int46 = bookRequest38.compareTo(bookRequest42);
        int int47 = bookRequest42.getPriority();
        int int48 = bookRequest26.compareTo(bookRequest42);
        int int49 = bookRequest42.getPriority();
        int int50 = bookRequest9.compareTo(bookRequest42);
        java.lang.String str51 = bookRequest9.getRequester();
        java.lang.String str52 = bookRequest9.getRequester();
        int int53 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest9", (bookRequest3.compareTo(bookRequest9) == 0) == bookRequest3.equals(bookRequest9));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest3.getBookTitle();
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getBookTitle();
        java.lang.String str15 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str20 = bookRequest19.getRequester();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        java.lang.String str23 = bookRequest19.getRequester();
        int int24 = bookRequest19.getPriority();
        java.lang.String str25 = bookRequest19.getBookTitle();
        int int26 = bookRequest19.getPriority();
        int int27 = bookRequest19.getPriority();
        java.lang.String str28 = bookRequest19.getRequester();
        int int29 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest19", (bookRequest7.compareTo(bookRequest19) == 0) == bookRequest7.equals(bookRequest19));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
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
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str33 = bookRequest32.getBookTitle();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getBookTitle();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) 'a');
        int int41 = bookRequest40.getPriority();
        int int42 = bookRequest40.getPriority();
        java.lang.String str43 = bookRequest40.getBookTitle();
        int int44 = bookRequest40.getPriority();
        int int45 = bookRequest40.getPriority();
        int int46 = bookRequest40.getPriority();
        int int47 = bookRequest40.getPriority();
        int int48 = bookRequest40.getPriority();
        request.BookRequest bookRequest52 = new request.BookRequest("", "hi!", (int) '4');
        int int53 = bookRequest52.getPriority();
        java.lang.String str54 = bookRequest52.getBookTitle();
        java.lang.String str55 = bookRequest52.getBookTitle();
        int int56 = bookRequest52.getPriority();
        int int57 = bookRequest52.getPriority();
        int int58 = bookRequest52.getPriority();
        int int59 = bookRequest40.compareTo(bookRequest52);
        int int60 = bookRequest32.compareTo(bookRequest52);
        int int61 = bookRequest3.compareTo(bookRequest52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest40", (bookRequest15.compareTo(bookRequest40) == 0) == bookRequest15.equals(bookRequest40));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) '4');
        java.lang.String str21 = bookRequest20.getBookTitle();
        int int22 = bookRequest11.compareTo(bookRequest20);
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", (int) '4');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getRequester();
        java.lang.String str29 = bookRequest26.getRequester();
        int int30 = bookRequest26.getPriority();
        int int31 = bookRequest20.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest20 and bookRequest26", (bookRequest20.compareTo(bookRequest26) == 0) == bookRequest20.equals(bookRequest26));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
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
        java.lang.String str27 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        java.lang.String str33 = bookRequest31.getRequester();
        java.lang.String str34 = bookRequest31.getRequester();
        java.lang.String str35 = bookRequest31.getBookTitle();
        java.lang.String str36 = bookRequest31.getBookTitle();
        java.lang.String str37 = bookRequest31.getRequester();
        java.lang.String str38 = bookRequest31.getRequester();
        int int39 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest31", (bookRequest8.compareTo(bookRequest31) == 0) == bookRequest8.equals(bookRequest31));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest13.getPriority();
        java.lang.String str17 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "hi!", 0);
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        java.lang.String str24 = bookRequest21.getRequester();
        int int25 = bookRequest13.compareTo(bookRequest21);
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (byte) 10);
        int int30 = bookRequest13.compareTo(bookRequest29);
        int int31 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
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
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str35 = bookRequest34.getRequester();
        java.lang.String str36 = bookRequest34.getBookTitle();
        int int37 = bookRequest30.compareTo(bookRequest34);
        java.lang.String str38 = bookRequest30.getRequester();
        java.lang.String str39 = bookRequest30.getRequester();
        java.lang.String str40 = bookRequest30.getBookTitle();
        int int41 = bookRequest24.compareTo(bookRequest30);
        java.lang.String str42 = bookRequest24.getRequester();
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "", 0);
        java.lang.String str47 = bookRequest46.getBookTitle();
        int int48 = bookRequest46.getPriority();
        java.lang.String str49 = bookRequest46.getBookTitle();
        java.lang.String str50 = bookRequest46.getRequester();
        int int51 = bookRequest24.compareTo(bookRequest46);
        int int52 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest24", (bookRequest11.compareTo(bookRequest24) == 0) == bookRequest11.equals(bookRequest24));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
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
        java.lang.String str26 = bookRequest20.getRequester();
        java.lang.String str27 = bookRequest20.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getBookTitle();
        int int34 = bookRequest31.getPriority();
        java.lang.String str35 = bookRequest31.getBookTitle();
        java.lang.String str36 = bookRequest31.getRequester();
        java.lang.String str37 = bookRequest31.getBookTitle();
        java.lang.String str38 = bookRequest31.getRequester();
        java.lang.String str39 = bookRequest31.getBookTitle();
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) 'a');
        int int44 = bookRequest43.getPriority();
        java.lang.String str45 = bookRequest43.getRequester();
        java.lang.String str46 = bookRequest43.getRequester();
        int int47 = bookRequest43.getPriority();
        int int48 = bookRequest43.getPriority();
        java.lang.String str49 = bookRequest43.getRequester();
        int int50 = bookRequest31.compareTo(bookRequest43);
        int int51 = bookRequest31.getPriority();
        request.BookRequest bookRequest55 = new request.BookRequest("", "", (-1));
        java.lang.String str56 = bookRequest55.getBookTitle();
        java.lang.String str57 = bookRequest55.getBookTitle();
        java.lang.String str58 = bookRequest55.getBookTitle();
        java.lang.String str59 = bookRequest55.getBookTitle();
        java.lang.String str60 = bookRequest55.getRequester();
        java.lang.String str61 = bookRequest55.getRequester();
        int int62 = bookRequest31.compareTo(bookRequest55);
        int int63 = bookRequest20.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest43", (bookRequest7.compareTo(bookRequest43) == 0) == bookRequest7.equals(bookRequest43));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest7.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getBookTitle();
        int int20 = bookRequest15.getPriority();
        int int21 = bookRequest15.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int26 = bookRequest15.compareTo(bookRequest25);
        java.lang.String str27 = bookRequest15.getRequester();
        java.lang.String str28 = bookRequest15.getBookTitle();
        int int29 = bookRequest7.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest15", (bookRequest7.compareTo(bookRequest15) == 0) == bookRequest7.equals(bookRequest15));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
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
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str27 = bookRequest26.getRequester();
        java.lang.String str28 = bookRequest26.getBookTitle();
        int int29 = bookRequest22.compareTo(bookRequest26);
        java.lang.String str30 = bookRequest22.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str35 = bookRequest34.getBookTitle();
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", (int) 'a');
        int int40 = bookRequest39.getPriority();
        java.lang.String str41 = bookRequest39.getRequester();
        int int42 = bookRequest39.getPriority();
        java.lang.String str43 = bookRequest39.getBookTitle();
        java.lang.String str44 = bookRequest39.getRequester();
        java.lang.String str45 = bookRequest39.getRequester();
        int int46 = bookRequest34.compareTo(bookRequest39);
        int int47 = bookRequest39.getPriority();
        int int48 = bookRequest22.compareTo(bookRequest39);
        int int49 = bookRequest12.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest39", (bookRequest8.compareTo(bookRequest39) == 0) == bookRequest8.equals(bookRequest39));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (short) 0);
        int int33 = bookRequest28.compareTo(bookRequest32);
        java.lang.String str34 = bookRequest28.getRequester();
        java.lang.String str35 = bookRequest28.getBookTitle();
        int int36 = bookRequest18.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest28", (bookRequest8.compareTo(bookRequest28) == 0) == bookRequest8.equals(bookRequest28));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        java.lang.String str18 = bookRequest16.getRequester();
        java.lang.String str19 = bookRequest16.getRequester();
        java.lang.String str20 = bookRequest16.getBookTitle();
        java.lang.String str21 = bookRequest16.getRequester();
        int int22 = bookRequest16.getPriority();
        int int23 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest16", (bookRequest7.compareTo(bookRequest16) == 0) == bookRequest7.equals(bookRequest16));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "", 10);
        java.lang.String str20 = bookRequest19.getRequester();
        int int21 = bookRequest19.getPriority();
        int int22 = bookRequest19.getPriority();
        int int23 = bookRequest8.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
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
        request.BookRequest bookRequest38 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) 'a');
        int int43 = bookRequest42.getPriority();
        int int44 = bookRequest42.getPriority();
        java.lang.String str45 = bookRequest42.getBookTitle();
        java.lang.String str46 = bookRequest42.getRequester();
        java.lang.String str47 = bookRequest42.getBookTitle();
        int int48 = bookRequest42.getPriority();
        java.lang.String str49 = bookRequest42.getBookTitle();
        int int50 = bookRequest38.compareTo(bookRequest42);
        java.lang.String str51 = bookRequest38.getBookTitle();
        java.lang.String str52 = bookRequest38.getRequester();
        int int53 = bookRequest38.getPriority();
        int int54 = bookRequest21.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest26 and bookRequest42", (bookRequest26.compareTo(bookRequest42) == 0) == bookRequest26.equals(bookRequest42));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str12 = bookRequest11.getRequester();
        java.lang.String str13 = bookRequest11.getRequester();
        java.lang.String str14 = bookRequest11.getBookTitle();
        int int15 = bookRequest11.getPriority();
        java.lang.String str16 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", 0);
        int int21 = bookRequest11.compareTo(bookRequest20);
        java.lang.String str22 = bookRequest20.getBookTitle();
        int int23 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str28 = bookRequest27.getRequester();
        java.lang.String str29 = bookRequest27.getBookTitle();
        int int30 = bookRequest23.compareTo(bookRequest27);
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) 'a');
        int int35 = bookRequest34.getPriority();
        java.lang.String str36 = bookRequest34.getRequester();
        java.lang.String str37 = bookRequest34.getRequester();
        java.lang.String str38 = bookRequest34.getBookTitle();
        java.lang.String str39 = bookRequest34.getBookTitle();
        java.lang.String str40 = bookRequest34.getRequester();
        int int41 = bookRequest34.getPriority();
        java.lang.String str42 = bookRequest34.getBookTitle();
        int int43 = bookRequest27.compareTo(bookRequest34);
        java.lang.String str44 = bookRequest27.getBookTitle();
        int int45 = bookRequest9.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest34", (bookRequest3.compareTo(bookRequest34) == 0) == bookRequest3.equals(bookRequest34));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getBookTitle();
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
        int int35 = bookRequest23.getPriority();
        java.lang.String str36 = bookRequest23.getRequester();
        int int37 = bookRequest7.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest17", (bookRequest7.compareTo(bookRequest17) == 0) == bookRequest7.equals(bookRequest17));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (byte) 10);
        int int20 = bookRequest3.compareTo(bookRequest19);
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        int int27 = bookRequest24.getPriority();
        java.lang.String str28 = bookRequest24.getRequester();
        java.lang.String str29 = bookRequest24.getBookTitle();
        int int30 = bookRequest24.getPriority();
        java.lang.String str31 = bookRequest24.getRequester();
        java.lang.String str32 = bookRequest24.getRequester();
        java.lang.String str33 = bookRequest24.getBookTitle();
        java.lang.String str34 = bookRequest24.getBookTitle();
        int int35 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
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
        java.lang.String str20 = bookRequest19.getRequester();
        java.lang.String str21 = bookRequest19.getRequester();
        java.lang.String str22 = bookRequest19.getBookTitle();
        java.lang.String str23 = bookRequest19.getBookTitle();
        java.lang.String str24 = bookRequest19.getRequester();
        java.lang.String str25 = bookRequest19.getBookTitle();
        java.lang.String str26 = bookRequest19.getBookTitle();
        java.lang.String str27 = bookRequest19.getBookTitle();
        int int28 = bookRequest8.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest19", (bookRequest8.compareTo(bookRequest19) == 0) == bookRequest8.equals(bookRequest19));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
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
        java.lang.String str28 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) '4');
        int int33 = bookRequest32.getPriority();
        int int34 = bookRequest25.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest25 and bookRequest32", (bookRequest25.compareTo(bookRequest32) == 0) == bookRequest25.equals(bookRequest32));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
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
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) (byte) 1);
        java.lang.String str35 = bookRequest34.getBookTitle();
        int int36 = bookRequest34.getPriority();
        java.lang.String str37 = bookRequest34.getBookTitle();
        int int38 = bookRequest34.getPriority();
        int int39 = bookRequest24.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest34", (bookRequest9.compareTo(bookRequest34) == 0) == bookRequest9.equals(bookRequest34));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) (short) 100);
        java.lang.String str23 = bookRequest22.getBookTitle();
        int int24 = bookRequest12.compareTo(bookRequest22);
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str33 = bookRequest32.getRequester();
        java.lang.String str34 = bookRequest32.getBookTitle();
        int int35 = bookRequest28.compareTo(bookRequest32);
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", (int) 'a');
        int int40 = bookRequest39.getPriority();
        java.lang.String str41 = bookRequest39.getRequester();
        java.lang.String str42 = bookRequest39.getRequester();
        java.lang.String str43 = bookRequest39.getBookTitle();
        java.lang.String str44 = bookRequest39.getBookTitle();
        java.lang.String str45 = bookRequest39.getRequester();
        int int46 = bookRequest39.getPriority();
        java.lang.String str47 = bookRequest39.getBookTitle();
        int int48 = bookRequest32.compareTo(bookRequest39);
        int int49 = bookRequest32.getPriority();
        int int50 = bookRequest12.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest39", (bookRequest12.compareTo(bookRequest39) == 0) == bookRequest12.equals(bookRequest39));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (byte) 1);
        int int21 = bookRequest16.compareTo(bookRequest20);
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "hi!", 52);
        int int30 = bookRequest25.compareTo(bookRequest29);
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) 'a');
        int int35 = bookRequest34.getPriority();
        java.lang.String str36 = bookRequest34.getRequester();
        int int37 = bookRequest34.getPriority();
        java.lang.String str38 = bookRequest34.getBookTitle();
        java.lang.String str39 = bookRequest34.getRequester();
        int int40 = bookRequest25.compareTo(bookRequest34);
        int int41 = bookRequest34.getPriority();
        int int42 = bookRequest16.compareTo(bookRequest34);
        int int43 = bookRequest34.getPriority();
        java.lang.String str44 = bookRequest34.getRequester();
        int int45 = bookRequest7.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
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
        int int25 = bookRequest3.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        int int33 = bookRequest29.getPriority();
        int int34 = bookRequest29.getPriority();
        java.lang.String str35 = bookRequest29.getRequester();
        int int36 = bookRequest29.getPriority();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest44 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int45 = bookRequest40.compareTo(bookRequest44);
        java.lang.String str46 = bookRequest40.getRequester();
        int int47 = bookRequest29.compareTo(bookRequest40);
        int int48 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest29", (bookRequest7.compareTo(bookRequest29) == 0) == bookRequest7.equals(bookRequest29));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 100);
        java.lang.String str9 = bookRequest8.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", 35);
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest14.getPriority();
        java.lang.String str17 = bookRequest14.getBookTitle();
        java.lang.String str18 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getRequester();
        int int25 = bookRequest22.getPriority();
        java.lang.String str26 = bookRequest22.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str31 = bookRequest30.getRequester();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest39 = new request.BookRequest("", "", (int) (short) 0);
        int int40 = bookRequest35.compareTo(bookRequest39);
        int int41 = bookRequest30.compareTo(bookRequest39);
        int int42 = bookRequest30.getPriority();
        int int43 = bookRequest30.getPriority();
        java.lang.String str44 = bookRequest30.getRequester();
        int int45 = bookRequest22.compareTo(bookRequest30);
        java.lang.String str46 = bookRequest22.getRequester();
        int int47 = bookRequest14.compareTo(bookRequest22);
        int int48 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest39", (bookRequest3.compareTo(bookRequest39) == 0) == bookRequest3.equals(bookRequest39));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str26 = bookRequest25.getBookTitle();
        java.lang.String str27 = bookRequest25.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        java.lang.String str35 = bookRequest31.getRequester();
        java.lang.String str36 = bookRequest31.getBookTitle();
        int int37 = bookRequest31.getPriority();
        java.lang.String str38 = bookRequest31.getBookTitle();
        java.lang.String str39 = bookRequest31.getRequester();
        java.lang.String str40 = bookRequest31.getBookTitle();
        int int41 = bookRequest25.compareTo(bookRequest31);
        int int42 = bookRequest17.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest31", (bookRequest12.compareTo(bookRequest31) == 0) == bookRequest12.equals(bookRequest31));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        int int15 = bookRequest13.getPriority();
        java.lang.String str16 = bookRequest13.getBookTitle();
        java.lang.String str17 = bookRequest13.getRequester();
        java.lang.String str18 = bookRequest13.getBookTitle();
        int int19 = bookRequest13.getPriority();
        java.lang.String str20 = bookRequest13.getBookTitle();
        int int21 = bookRequest7.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
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
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", 97);
        java.lang.String str35 = bookRequest34.getRequester();
        java.lang.String str36 = bookRequest34.getBookTitle();
        int int37 = bookRequest7.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest34", (bookRequest12.compareTo(bookRequest34) == 0) == bookRequest12.equals(bookRequest34));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        int int19 = bookRequest12.compareTo(bookRequest18);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest23.compareTo(bookRequest27);
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getRequester();
        int int32 = bookRequest12.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest18 and bookRequest27", (bookRequest18.compareTo(bookRequest27) == 0) == bookRequest18.equals(bookRequest27));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
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
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getBookTitle();
        int int34 = bookRequest27.compareTo(bookRequest31);
        java.lang.String str35 = bookRequest31.getRequester();
        int int36 = bookRequest18.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest18 and bookRequest31", (bookRequest18.compareTo(bookRequest31) == 0) == bookRequest18.equals(bookRequest31));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
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
        java.lang.String str16 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getBookTitle();
        int int25 = bookRequest20.getPriority();
        java.lang.String str26 = bookRequest20.getRequester();
        java.lang.String str27 = bookRequest20.getRequester();
        int int28 = bookRequest20.getPriority();
        java.lang.String str29 = bookRequest20.getRequester();
        int int30 = bookRequest8.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest20", (bookRequest8.compareTo(bookRequest20) == 0) == bookRequest8.equals(bookRequest20));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str20 = bookRequest19.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (short) 0);
        int int29 = bookRequest24.compareTo(bookRequest28);
        int int30 = bookRequest19.compareTo(bookRequest28);
        java.lang.String str31 = bookRequest28.getBookTitle();
        int int32 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str16 = bookRequest15.getRequester();
        int int17 = bookRequest7.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest15", (bookRequest7.compareTo(bookRequest15) == 0) == bookRequest7.equals(bookRequest15));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
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
        request.BookRequest bookRequest40 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest44 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str45 = bookRequest44.getRequester();
        java.lang.String str46 = bookRequest44.getBookTitle();
        int int47 = bookRequest40.compareTo(bookRequest44);
        request.BookRequest bookRequest51 = new request.BookRequest("hi!", "", (int) 'a');
        int int52 = bookRequest51.getPriority();
        int int53 = bookRequest51.getPriority();
        java.lang.String str54 = bookRequest51.getBookTitle();
        java.lang.String str55 = bookRequest51.getBookTitle();
        java.lang.String str56 = bookRequest51.getBookTitle();
        int int57 = bookRequest40.compareTo(bookRequest51);
        int int58 = bookRequest40.getPriority();
        int int59 = bookRequest20.compareTo(bookRequest40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest20 and bookRequest44", (bookRequest20.compareTo(bookRequest44) == 0) == bookRequest20.equals(bookRequest44));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        request.BookRequest bookRequest33 = new request.BookRequest("", "", 1);
        java.lang.String str34 = bookRequest33.getBookTitle();
        int int35 = bookRequest27.compareTo(bookRequest33);
        int int36 = bookRequest23.compareTo(bookRequest33);
        int int37 = bookRequest33.getPriority();
        int int38 = bookRequest33.getPriority();
        java.lang.String str39 = bookRequest33.getBookTitle();
        int int40 = bookRequest3.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest33", (bookRequest3.compareTo(bookRequest33) == 0) == bookRequest3.equals(bookRequest33));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest14.compareTo(bookRequest18);
        int int21 = bookRequest14.getPriority();
        java.lang.String str22 = bookRequest14.getRequester();
        java.lang.String str23 = bookRequest14.getRequester();
        int int24 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str26 = bookRequest25.getRequester();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str34 = bookRequest33.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest42 = new request.BookRequest("", "", (int) (short) 0);
        int int43 = bookRequest38.compareTo(bookRequest42);
        int int44 = bookRequest33.compareTo(bookRequest42);
        java.lang.String str45 = bookRequest42.getBookTitle();
        int int46 = bookRequest42.getPriority();
        java.lang.String str47 = bookRequest42.getRequester();
        int int48 = bookRequest25.compareTo(bookRequest42);
        int int49 = bookRequest13.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest38", (bookRequest13.compareTo(bookRequest38) == 0) == bookRequest13.equals(bookRequest38));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str9 = bookRequest8.getBookTitle();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getRequester();
        java.lang.String str12 = bookRequest8.getBookTitle();
        java.lang.String str13 = bookRequest8.getBookTitle();
        java.lang.String str14 = bookRequest8.getRequester();
        java.lang.String str15 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (byte) 100);
        int int20 = bookRequest19.getPriority();
        int int21 = bookRequest19.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getRequester();
        java.lang.String str32 = bookRequest29.getRequester();
        java.lang.String str33 = bookRequest29.getRequester();
        int int34 = bookRequest25.compareTo(bookRequest29);
        int int35 = bookRequest25.getPriority();
        int int36 = bookRequest19.compareTo(bookRequest25);
        java.lang.String str37 = bookRequest25.getBookTitle();
        java.lang.String str38 = bookRequest25.getRequester();
        int int39 = bookRequest25.getPriority();
        int int40 = bookRequest25.getPriority();
        int int41 = bookRequest8.compareTo(bookRequest25);
        int int42 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
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
        java.lang.String str25 = bookRequest23.getRequester();
        int int26 = bookRequest23.getPriority();
        java.lang.String str27 = bookRequest23.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str32 = bookRequest31.getRequester();
        int int33 = bookRequest31.getPriority();
        int int34 = bookRequest23.compareTo(bookRequest31);
        java.lang.String str35 = bookRequest23.getBookTitle();
        int int36 = bookRequest12.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
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
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", 10);
        java.lang.String str24 = bookRequest23.getRequester();
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
        request.BookRequest bookRequest41 = new request.BookRequest("", "", 1);
        java.lang.String str42 = bookRequest41.getRequester();
        int int43 = bookRequest28.compareTo(bookRequest41);
        java.lang.String str44 = bookRequest28.getBookTitle();
        int int45 = bookRequest28.getPriority();
        int int46 = bookRequest23.compareTo(bookRequest28);
        java.lang.String str47 = bookRequest23.getRequester();
        int int48 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
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
        java.lang.String str18 = bookRequest9.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getRequester();
        java.lang.String str25 = bookRequest22.getRequester();
        java.lang.String str26 = bookRequest22.getRequester();
        int int27 = bookRequest22.getPriority();
        int int28 = bookRequest22.getPriority();
        int int29 = bookRequest9.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        java.lang.String str24 = bookRequest21.getRequester();
        java.lang.String str25 = bookRequest21.getRequester();
        int int26 = bookRequest17.compareTo(bookRequest21);
        int int27 = bookRequest17.getPriority();
        int int28 = bookRequest7.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest21", (bookRequest7.compareTo(bookRequest21) == 0) == bookRequest7.equals(bookRequest21));
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
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
        int int23 = bookRequest3.getPriority();
        int int24 = bookRequest3.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str29 = bookRequest28.getBookTitle();
        java.lang.String str30 = bookRequest28.getBookTitle();
        java.lang.String str31 = bookRequest28.getBookTitle();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        int int36 = bookRequest35.getPriority();
        int int37 = bookRequest35.getPriority();
        java.lang.String str38 = bookRequest35.getRequester();
        int int39 = bookRequest35.getPriority();
        java.lang.String str40 = bookRequest35.getRequester();
        int int41 = bookRequest28.compareTo(bookRequest35);
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "", (int) '#');
        int int46 = bookRequest45.getPriority();
        java.lang.String str47 = bookRequest45.getBookTitle();
        request.BookRequest bookRequest51 = new request.BookRequest("", "", (int) ' ');
        int int52 = bookRequest45.compareTo(bookRequest51);
        java.lang.String str53 = bookRequest45.getBookTitle();
        request.BookRequest bookRequest57 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest61 = new request.BookRequest("", "", 1);
        java.lang.String str62 = bookRequest61.getBookTitle();
        java.lang.String str63 = bookRequest61.getBookTitle();
        java.lang.String str64 = bookRequest61.getRequester();
        int int65 = bookRequest57.compareTo(bookRequest61);
        int int66 = bookRequest61.getPriority();
        int int67 = bookRequest45.compareTo(bookRequest61);
        int int68 = bookRequest61.getPriority();
        int int69 = bookRequest28.compareTo(bookRequest61);
        java.lang.String str70 = bookRequest61.getRequester();
        int int71 = bookRequest3.compareTo(bookRequest61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str26 = bookRequest25.getRequester();
        int int27 = bookRequest25.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", 1);
        java.lang.String str32 = bookRequest31.getBookTitle();
        int int33 = bookRequest25.compareTo(bookRequest31);
        int int34 = bookRequest21.compareTo(bookRequest31);
        int int35 = bookRequest21.getPriority();
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int40 = bookRequest21.compareTo(bookRequest39);
        java.lang.String str41 = bookRequest39.getRequester();
        java.lang.String str42 = bookRequest39.getBookTitle();
        java.lang.String str43 = bookRequest39.getBookTitle();
        int int44 = bookRequest3.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest25", (bookRequest7.compareTo(bookRequest25) == 0) == bookRequest7.equals(bookRequest25));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
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
        int int26 = bookRequest16.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", 0);
        java.lang.String str31 = bookRequest30.getBookTitle();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getRequester();
        int int34 = bookRequest30.getPriority();
        request.BookRequest bookRequest38 = new request.BookRequest("", "hi!", (int) '#');
        int int39 = bookRequest30.compareTo(bookRequest38);
        java.lang.String str40 = bookRequest30.getBookTitle();
        java.lang.String str41 = bookRequest30.getRequester();
        java.lang.String str42 = bookRequest30.getRequester();
        int int43 = bookRequest16.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest30", (bookRequest16.compareTo(bookRequest30) == 0) == bookRequest16.equals(bookRequest30));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
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
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "hi!", 52);
        int int38 = bookRequest33.compareTo(bookRequest37);
        request.BookRequest bookRequest42 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str47 = bookRequest46.getRequester();
        java.lang.String str48 = bookRequest46.getRequester();
        java.lang.String str49 = bookRequest46.getBookTitle();
        int int50 = bookRequest42.compareTo(bookRequest46);
        java.lang.String str51 = bookRequest42.getBookTitle();
        int int52 = bookRequest42.getPriority();
        java.lang.String str53 = bookRequest42.getBookTitle();
        int int54 = bookRequest37.compareTo(bookRequest42);
        int int55 = bookRequest16.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest46", (bookRequest7.compareTo(bookRequest46) == 0) == bookRequest7.equals(bookRequest46));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
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
        java.lang.String str21 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        int int32 = bookRequest25.compareTo(bookRequest29);
        java.lang.String str33 = bookRequest29.getBookTitle();
        java.lang.String str34 = bookRequest29.getBookTitle();
        int int35 = bookRequest14.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest25", (bookRequest14.compareTo(bookRequest25) == 0) == bookRequest14.equals(bookRequest25));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        int int9 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", 97);
        java.lang.String str18 = bookRequest17.getRequester();
        java.lang.String str19 = bookRequest17.getBookTitle();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getBookTitle();
        int int22 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest14.compareTo(bookRequest18);
        int int20 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
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
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", (int) (byte) 0);
        java.lang.String str31 = bookRequest30.getBookTitle();
        java.lang.String str32 = bookRequest30.getBookTitle();
        java.lang.String str33 = bookRequest30.getBookTitle();
        int int34 = bookRequest16.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest30", (bookRequest16.compareTo(bookRequest30) == 0) == bookRequest16.equals(bookRequest30));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
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
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", 52);
        int int40 = bookRequest10.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest32 and bookRequest39", (bookRequest32.compareTo(bookRequest39) == 0) == bookRequest32.equals(bookRequest39));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "hi!", 0);
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest31 = new request.BookRequest("", "hi!", 97);
        java.lang.String str32 = bookRequest31.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) ' ');
        int int37 = bookRequest31.compareTo(bookRequest36);
        int int38 = bookRequest27.compareTo(bookRequest36);
        int int39 = bookRequest23.compareTo(bookRequest36);
        request.BookRequest bookRequest43 = new request.BookRequest("", "", (-1));
        java.lang.String str44 = bookRequest43.getBookTitle();
        int int45 = bookRequest36.compareTo(bookRequest43);
        int int46 = bookRequest43.getPriority();
        int int47 = bookRequest17.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
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
        int int14 = bookRequest3.getPriority();
        java.lang.String str15 = bookRequest3.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        java.lang.String str23 = bookRequest19.getRequester();
        java.lang.String str24 = bookRequest19.getBookTitle();
        int int25 = bookRequest19.getPriority();
        java.lang.String str26 = bookRequest19.getRequester();
        int int27 = bookRequest19.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getBookTitle();
        int int34 = bookRequest31.getPriority();
        java.lang.String str35 = bookRequest31.getBookTitle();
        java.lang.String str36 = bookRequest31.getRequester();
        java.lang.String str37 = bookRequest31.getBookTitle();
        java.lang.String str38 = bookRequest31.getRequester();
        java.lang.String str39 = bookRequest31.getBookTitle();
        java.lang.String str40 = bookRequest31.getRequester();
        int int41 = bookRequest19.compareTo(bookRequest31);
        int int42 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) ' ');
        int int21 = bookRequest20.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", 35);
        int int26 = bookRequest20.compareTo(bookRequest25);
        int int27 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) ' ');
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", 35);
        int int9 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 0);
        int int27 = bookRequest22.compareTo(bookRequest26);
        int int28 = bookRequest17.compareTo(bookRequest26);
        java.lang.String str29 = bookRequest26.getBookTitle();
        int int30 = bookRequest26.getPriority();
        int int31 = bookRequest13.compareTo(bookRequest26);
        java.lang.String str32 = bookRequest26.getBookTitle();
        int int33 = bookRequest8.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", 1);
        java.lang.String str27 = bookRequest26.getRequester();
        int int28 = bookRequest26.getPriority();
        int int29 = bookRequest12.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest18 and bookRequest26", (bookRequest18.compareTo(bookRequest26) == 0) == bookRequest18.equals(bookRequest26));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getBookTitle();
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest17.getPriority();
        int int23 = bookRequest17.getPriority();
        int int24 = bookRequest17.getPriority();
        java.lang.String str25 = bookRequest17.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest10.getPriority();
        int int13 = bookRequest10.getPriority();
        java.lang.String str14 = bookRequest10.getBookTitle();
        java.lang.String str15 = bookRequest10.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str20 = bookRequest19.getRequester();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        java.lang.String str23 = bookRequest19.getRequester();
        int int24 = bookRequest19.getPriority();
        int int25 = bookRequest19.getPriority();
        java.lang.String str26 = bookRequest19.getRequester();
        int int27 = bookRequest10.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest9.getPriority();
        java.lang.String str12 = bookRequest9.getRequester();
        int int13 = bookRequest9.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (byte) -1);
        java.lang.String str18 = bookRequest17.getRequester();
        java.lang.String str19 = bookRequest17.getBookTitle();
        java.lang.String str20 = bookRequest17.getBookTitle();
        int int21 = bookRequest9.compareTo(bookRequest17);
        int int22 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        int int33 = bookRequest26.compareTo(bookRequest30);
        java.lang.String str34 = bookRequest30.getBookTitle();
        java.lang.String str35 = bookRequest30.getRequester();
        int int36 = bookRequest12.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest26", (bookRequest8.compareTo(bookRequest26) == 0) == bookRequest8.equals(bookRequest26));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "hi!", (int) (short) -1);
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) ' ');
        int int32 = bookRequest31.getPriority();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str37 = bookRequest36.getRequester();
        int int38 = bookRequest36.getPriority();
        request.BookRequest bookRequest42 = new request.BookRequest("", "", 1);
        java.lang.String str43 = bookRequest42.getBookTitle();
        int int44 = bookRequest36.compareTo(bookRequest42);
        int int45 = bookRequest31.compareTo(bookRequest42);
        java.lang.String str46 = bookRequest31.getBookTitle();
        request.BookRequest bookRequest50 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int51 = bookRequest50.getPriority();
        int int52 = bookRequest50.getPriority();
        int int53 = bookRequest31.compareTo(bookRequest50);
        int int54 = bookRequest27.compareTo(bookRequest31);
        int int55 = bookRequest31.getPriority();
        java.lang.String str56 = bookRequest31.getRequester();
        int int57 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest50", (bookRequest3.compareTo(bookRequest50) == 0) == bookRequest3.equals(bookRequest50));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
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
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest35 = new request.BookRequest("", "", 1);
        java.lang.String str36 = bookRequest35.getBookTitle();
        java.lang.String str37 = bookRequest35.getBookTitle();
        java.lang.String str38 = bookRequest35.getRequester();
        int int39 = bookRequest31.compareTo(bookRequest35);
        int int40 = bookRequest35.getPriority();
        request.BookRequest bookRequest44 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest48 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str49 = bookRequest48.getRequester();
        int int50 = bookRequest44.compareTo(bookRequest48);
        int int51 = bookRequest44.getPriority();
        int int52 = bookRequest35.compareTo(bookRequest44);
        int int53 = bookRequest14.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest35", (bookRequest7.compareTo(bookRequest35) == 0) == bookRequest7.equals(bookRequest35));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
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
        java.lang.String str23 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str32 = bookRequest31.getRequester();
        int int33 = bookRequest27.compareTo(bookRequest31);
        java.lang.String str34 = bookRequest27.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("", "hi!", (int) '4');
        int int39 = bookRequest27.compareTo(bookRequest38);
        java.lang.String str40 = bookRequest38.getBookTitle();
        int int41 = bookRequest9.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (byte) 0);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", 0);
        int int15 = bookRequest14.getPriority();
        int int16 = bookRequest14.getPriority();
        int int17 = bookRequest14.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str22 = bookRequest21.getRequester();
        java.lang.String str23 = bookRequest21.getBookTitle();
        int int24 = bookRequest21.getPriority();
        java.lang.String str25 = bookRequest21.getBookTitle();
        java.lang.String str26 = bookRequest21.getRequester();
        int int27 = bookRequest14.compareTo(bookRequest21);
        request.BookRequest bookRequest31 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str32 = bookRequest31.getBookTitle();
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        java.lang.String str35 = bookRequest31.getBookTitle();
        int int36 = bookRequest14.compareTo(bookRequest31);
        java.lang.String str37 = bookRequest14.getRequester();
        int int38 = bookRequest14.getPriority();
        int int39 = bookRequest7.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest14", (bookRequest7.compareTo(bookRequest14) == 0) == bookRequest7.equals(bookRequest14));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", 97);
        java.lang.String str26 = bookRequest25.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) ' ');
        int int31 = bookRequest25.compareTo(bookRequest30);
        int int32 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest25", (bookRequest13.compareTo(bookRequest25) == 0) == bookRequest13.equals(bookRequest25));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
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
        request.BookRequest bookRequest54 = new request.BookRequest("hi!", "", 35);
        java.lang.String str55 = bookRequest54.getRequester();
        int int56 = bookRequest54.getPriority();
        java.lang.String str57 = bookRequest54.getBookTitle();
        java.lang.String str58 = bookRequest54.getBookTitle();
        request.BookRequest bookRequest62 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str63 = bookRequest62.getBookTitle();
        java.lang.String str64 = bookRequest62.getRequester();
        int int65 = bookRequest62.getPriority();
        java.lang.String str66 = bookRequest62.getRequester();
        request.BookRequest bookRequest70 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str71 = bookRequest70.getRequester();
        request.BookRequest bookRequest75 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest79 = new request.BookRequest("", "", (int) (short) 0);
        int int80 = bookRequest75.compareTo(bookRequest79);
        int int81 = bookRequest70.compareTo(bookRequest79);
        int int82 = bookRequest70.getPriority();
        int int83 = bookRequest70.getPriority();
        java.lang.String str84 = bookRequest70.getRequester();
        int int85 = bookRequest62.compareTo(bookRequest70);
        java.lang.String str86 = bookRequest62.getRequester();
        int int87 = bookRequest54.compareTo(bookRequest62);
        int int88 = bookRequest37.compareTo(bookRequest62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest23 and bookRequest54", (bookRequest23.compareTo(bookRequest54) == 0) == bookRequest23.equals(bookRequest54));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
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
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        java.lang.String str24 = bookRequest21.getRequester();
        java.lang.String str25 = bookRequest21.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 35);
        int int30 = bookRequest21.compareTo(bookRequest29);
        int int31 = bookRequest13.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", 0);
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        int int20 = bookRequest17.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 1);
        java.lang.String str25 = bookRequest24.getBookTitle();
        java.lang.String str26 = bookRequest24.getBookTitle();
        java.lang.String str27 = bookRequest24.getRequester();
        int int28 = bookRequest17.compareTo(bookRequest24);
        java.lang.String str29 = bookRequest17.getBookTitle();
        java.lang.String str30 = bookRequest17.getRequester();
        int int31 = bookRequest17.getPriority();
        int int32 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str11 = bookRequest10.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (short) 0);
        int int20 = bookRequest15.compareTo(bookRequest19);
        int int21 = bookRequest10.compareTo(bookRequest19);
        request.BookRequest bookRequest25 = new request.BookRequest("", "", 1);
        int int26 = bookRequest19.compareTo(bookRequest25);
        java.lang.String str27 = bookRequest19.getRequester();
        java.lang.String str28 = bookRequest19.getRequester();
        java.lang.String str29 = bookRequest19.getBookTitle();
        int int30 = bookRequest19.getPriority();
        int int31 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
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
        int int30 = bookRequest7.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getBookTitle();
        java.lang.String str31 = bookRequest26.getBookTitle();
        java.lang.String str32 = bookRequest26.getRequester();
        int int33 = bookRequest20.compareTo(bookRequest26);
        java.lang.String str34 = bookRequest20.getRequester();
        int int35 = bookRequest8.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest26", (bookRequest8.compareTo(bookRequest26) == 0) == bookRequest8.equals(bookRequest26));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
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
        java.lang.String str22 = bookRequest3.getRequester();
        java.lang.String str23 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 100);
        java.lang.String str28 = bookRequest27.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) (short) 0);
        int int37 = bookRequest32.compareTo(bookRequest36);
        java.lang.String str38 = bookRequest36.getRequester();
        request.BookRequest bookRequest42 = new request.BookRequest("", "", 1);
        java.lang.String str43 = bookRequest42.getBookTitle();
        java.lang.String str44 = bookRequest42.getBookTitle();
        int int45 = bookRequest36.compareTo(bookRequest42);
        int int46 = bookRequest27.compareTo(bookRequest36);
        java.lang.String str47 = bookRequest36.getBookTitle();
        request.BookRequest bookRequest51 = new request.BookRequest("", "hi!", (int) (short) -1);
        java.lang.String str52 = bookRequest51.getRequester();
        java.lang.String str53 = bookRequest51.getBookTitle();
        int int54 = bookRequest36.compareTo(bookRequest51);
        int int55 = bookRequest3.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest32", (bookRequest3.compareTo(bookRequest32) == 0) == bookRequest3.equals(bookRequest32));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
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
        request.BookRequest bookRequest43 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest47 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str48 = bookRequest47.getRequester();
        java.lang.String str49 = bookRequest47.getRequester();
        java.lang.String str50 = bookRequest47.getBookTitle();
        int int51 = bookRequest43.compareTo(bookRequest47);
        request.BookRequest bookRequest55 = new request.BookRequest("hi!", "", (int) '#');
        int int56 = bookRequest55.getPriority();
        java.lang.String str57 = bookRequest55.getRequester();
        java.lang.String str58 = bookRequest55.getBookTitle();
        int int59 = bookRequest55.getPriority();
        int int60 = bookRequest43.compareTo(bookRequest55);
        request.BookRequest bookRequest64 = new request.BookRequest("hi!", "hi!", 10);
        int int65 = bookRequest43.compareTo(bookRequest64);
        int int66 = bookRequest43.getPriority();
        int int67 = bookRequest3.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest55", (bookRequest3.compareTo(bookRequest55) == 0) == bookRequest3.equals(bookRequest55));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
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
        int int20 = bookRequest3.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str25 = bookRequest24.getRequester();
        int int26 = bookRequest24.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("", "", 1);
        java.lang.String str31 = bookRequest30.getBookTitle();
        int int32 = bookRequest24.compareTo(bookRequest30);
        java.lang.String str33 = bookRequest30.getRequester();
        java.lang.String str34 = bookRequest30.getBookTitle();
        java.lang.String str35 = bookRequest30.getBookTitle();
        java.lang.String str36 = bookRequest30.getBookTitle();
        int int37 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str15 = bookRequest14.getRequester();
        java.lang.String str16 = bookRequest14.getBookTitle();
        int int17 = bookRequest14.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest14);
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str23 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str28 = bookRequest27.getRequester();
        java.lang.String str29 = bookRequest27.getBookTitle();
        int int30 = bookRequest27.getPriority();
        int int31 = bookRequest22.compareTo(bookRequest27);
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        int int36 = bookRequest35.getPriority();
        int int37 = bookRequest35.getPriority();
        java.lang.String str38 = bookRequest35.getBookTitle();
        int int39 = bookRequest35.getPriority();
        int int40 = bookRequest35.getPriority();
        java.lang.String str41 = bookRequest35.getBookTitle();
        int int42 = bookRequest22.compareTo(bookRequest35);
        int int43 = bookRequest35.getPriority();
        int int44 = bookRequest14.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest35", (bookRequest3.compareTo(bookRequest35) == 0) == bookRequest3.equals(bookRequest35));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
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
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        java.lang.String str34 = bookRequest30.getBookTitle();
        int int35 = bookRequest30.getPriority();
        int int36 = bookRequest30.getPriority();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int41 = bookRequest30.compareTo(bookRequest40);
        java.lang.String str42 = bookRequest40.getRequester();
        java.lang.String str43 = bookRequest40.getRequester();
        java.lang.String str44 = bookRequest40.getRequester();
        request.BookRequest bookRequest48 = new request.BookRequest("", "hi!", 10);
        int int49 = bookRequest40.compareTo(bookRequest48);
        int int50 = bookRequest48.getPriority();
        int int51 = bookRequest3.compareTo(bookRequest48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest48", (bookRequest3.compareTo(bookRequest48) == 0) == bookRequest3.equals(bookRequest48));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        java.lang.String str11 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str16 = bookRequest15.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        int int23 = bookRequest20.getPriority();
        java.lang.String str24 = bookRequest20.getRequester();
        int int25 = bookRequest15.compareTo(bookRequest20);
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str34 = bookRequest33.getRequester();
        java.lang.String str35 = bookRequest33.getBookTitle();
        int int36 = bookRequest29.compareTo(bookRequest33);
        java.lang.String str37 = bookRequest29.getRequester();
        java.lang.String str38 = bookRequest29.getRequester();
        int int39 = bookRequest29.getPriority();
        int int40 = bookRequest15.compareTo(bookRequest29);
        java.lang.String str41 = bookRequest15.getBookTitle();
        int int42 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 52);
        int int12 = bookRequest3.compareTo(bookRequest11);
        int int13 = bookRequest11.getPriority();
        int int14 = bookRequest11.getPriority();
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
        java.lang.String str28 = bookRequest18.getRequester();
        int int29 = bookRequest11.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
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
        int int39 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest28", (bookRequest14.compareTo(bookRequest28) == 0) == bookRequest14.equals(bookRequest28));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
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
        java.lang.String str31 = bookRequest26.getRequester();
        java.lang.String str32 = bookRequest26.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "hi!", 0);
        int int37 = bookRequest36.getPriority();
        int int38 = bookRequest36.getPriority();
        int int39 = bookRequest36.getPriority();
        request.BookRequest bookRequest43 = new request.BookRequest("", "", 1);
        java.lang.String str44 = bookRequest43.getBookTitle();
        java.lang.String str45 = bookRequest43.getBookTitle();
        java.lang.String str46 = bookRequest43.getRequester();
        int int47 = bookRequest36.compareTo(bookRequest43);
        java.lang.String str48 = bookRequest36.getBookTitle();
        int int49 = bookRequest36.getPriority();
        java.lang.String str50 = bookRequest36.getBookTitle();
        int int51 = bookRequest26.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest36", (bookRequest12.compareTo(bookRequest36) == 0) == bookRequest12.equals(bookRequest36));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", 35);
        java.lang.String str12 = bookRequest11.getRequester();
        java.lang.String str13 = bookRequest11.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
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
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str19 = bookRequest18.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 0);
        int int28 = bookRequest23.compareTo(bookRequest27);
        int int29 = bookRequest18.compareTo(bookRequest27);
        java.lang.String str30 = bookRequest27.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) (byte) 100);
        int int35 = bookRequest34.getPriority();
        int int36 = bookRequest27.compareTo(bookRequest34);
        java.lang.String str37 = bookRequest34.getRequester();
        int int38 = bookRequest3.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest3.compareTo(bookRequest14);
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getBookTitle();
        int int23 = bookRequest20.getPriority();
        int int24 = bookRequest20.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (byte) 10);
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str35 = bookRequest34.getRequester();
        int int36 = bookRequest34.getPriority();
        java.lang.String str37 = bookRequest34.getBookTitle();
        java.lang.String str38 = bookRequest34.getRequester();
        int int39 = bookRequest34.getPriority();
        int int40 = bookRequest28.compareTo(bookRequest34);
        java.lang.String str41 = bookRequest34.getRequester();
        java.lang.String str42 = bookRequest34.getRequester();
        int int43 = bookRequest20.compareTo(bookRequest34);
        int int44 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest34", (bookRequest14.compareTo(bookRequest34) == 0) == bookRequest14.equals(bookRequest34));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str31 = bookRequest30.getRequester();
        int int32 = bookRequest26.compareTo(bookRequest30);
        java.lang.String str33 = bookRequest26.getRequester();
        request.BookRequest bookRequest37 = new request.BookRequest("", "hi!", (int) '4');
        int int38 = bookRequest26.compareTo(bookRequest37);
        java.lang.String str39 = bookRequest37.getBookTitle();
        int int40 = bookRequest3.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest17 and bookRequest37", (bookRequest17.compareTo(bookRequest37) == 0) == bookRequest17.equals(bookRequest37));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        java.lang.String str30 = bookRequest28.getRequester();
        java.lang.String str31 = bookRequest28.getRequester();
        java.lang.String str32 = bookRequest28.getBookTitle();
        java.lang.String str33 = bookRequest28.getBookTitle();
        java.lang.String str34 = bookRequest28.getBookTitle();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str39 = bookRequest38.getBookTitle();
        java.lang.String str40 = bookRequest38.getRequester();
        int int41 = bookRequest38.getPriority();
        int int42 = bookRequest28.compareTo(bookRequest38);
        int int43 = bookRequest38.getPriority();
        int int44 = bookRequest3.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest28", (bookRequest16.compareTo(bookRequest28) == 0) == bookRequest16.equals(bookRequest28));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) '4');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        java.lang.String str24 = bookRequest21.getRequester();
        java.lang.String str25 = bookRequest21.getRequester();
        int int26 = bookRequest3.compareTo(bookRequest21);
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "hi!", 52);
        int int35 = bookRequest30.compareTo(bookRequest34);
        int int36 = bookRequest34.getPriority();
        java.lang.String str37 = bookRequest34.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) '#');
        int int42 = bookRequest41.getPriority();
        java.lang.String str43 = bookRequest41.getRequester();
        int int44 = bookRequest41.getPriority();
        int int45 = bookRequest34.compareTo(bookRequest41);
        java.lang.String str46 = bookRequest41.getBookTitle();
        int int47 = bookRequest3.compareTo(bookRequest41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest21 and bookRequest34", (bookRequest21.compareTo(bookRequest34) == 0) == bookRequest21.equals(bookRequest34));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "hi!", 35);
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
        request.BookRequest bookRequest32 = new request.BookRequest("", "", 1);
        java.lang.String str33 = bookRequest32.getRequester();
        int int34 = bookRequest19.compareTo(bookRequest32);
        int int35 = bookRequest15.compareTo(bookRequest32);
        java.lang.String str36 = bookRequest15.getRequester();
        int int37 = bookRequest15.getPriority();
        int int38 = bookRequest7.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest19", (bookRequest7.compareTo(bookRequest19) == 0) == bookRequest7.equals(bookRequest19));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
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
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getBookTitle();
        int int23 = bookRequest18.getPriority();
        java.lang.String str24 = bookRequest18.getBookTitle();
        java.lang.String str25 = bookRequest18.getBookTitle();
        java.lang.String str26 = bookRequest18.getRequester();
        java.lang.String str27 = bookRequest18.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
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
        java.lang.String str40 = bookRequest24.getRequester();
        int int41 = bookRequest8.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str11 = bookRequest10.getRequester();
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.String str13 = bookRequest10.getBookTitle();
        java.lang.String str14 = bookRequest10.getBookTitle();
        int int15 = bookRequest10.getPriority();
        java.lang.String str16 = bookRequest10.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest10.compareTo(bookRequest20);
        int int23 = bookRequest10.getPriority();
        int int24 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        int int21 = bookRequest16.compareTo(bookRequest20);
        int int22 = bookRequest11.compareTo(bookRequest20);
        java.lang.String str23 = bookRequest20.getBookTitle();
        int int24 = bookRequest20.getPriority();
        int int25 = bookRequest20.getPriority();
        int int26 = bookRequest20.getPriority();
        java.lang.String str27 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", 1);
        int int32 = bookRequest20.compareTo(bookRequest31);
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) (byte) -1);
        int int37 = bookRequest20.compareTo(bookRequest36);
        java.lang.String str38 = bookRequest20.getBookTitle();
        int int39 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
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
        int int18 = bookRequest3.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) '#');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getRequester();
        int int25 = bookRequest22.getPriority();
        java.lang.String str26 = bookRequest22.getRequester();
        int int27 = bookRequest22.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (byte) 10);
        int int32 = bookRequest31.getPriority();
        int int33 = bookRequest31.getPriority();
        int int34 = bookRequest31.getPriority();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) 'a');
        int int43 = bookRequest42.getPriority();
        int int44 = bookRequest42.getPriority();
        int int45 = bookRequest38.compareTo(bookRequest42);
        int int46 = bookRequest31.compareTo(bookRequest42);
        int int47 = bookRequest22.compareTo(bookRequest42);
        int int48 = bookRequest3.compareTo(bookRequest42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest42", (bookRequest7.compareTo(bookRequest42) == 0) == bookRequest7.equals(bookRequest42));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", 97);
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest9.compareTo(bookRequest13);
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 10);
        int int21 = bookRequest9.compareTo(bookRequest20);
        java.lang.String str22 = bookRequest20.getBookTitle();
        java.lang.String str23 = bookRequest20.getRequester();
        java.lang.String str24 = bookRequest20.getRequester();
        int int25 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest9", (bookRequest3.compareTo(bookRequest9) == 0) == bookRequest3.equals(bookRequest9));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
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
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        int int36 = bookRequest35.getPriority();
        java.lang.String str37 = bookRequest35.getRequester();
        int int38 = bookRequest35.getPriority();
        java.lang.String str39 = bookRequest35.getBookTitle();
        java.lang.String str40 = bookRequest35.getRequester();
        java.lang.String str41 = bookRequest35.getRequester();
        int int42 = bookRequest35.getPriority();
        java.lang.String str43 = bookRequest35.getRequester();
        int int44 = bookRequest35.getPriority();
        int int45 = bookRequest29.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest35", (bookRequest7.compareTo(bookRequest35) == 0) == bookRequest7.equals(bookRequest35));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str14 = bookRequest3.getRequester();
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
        int int31 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest24", (bookRequest7.compareTo(bookRequest24) == 0) == bookRequest7.equals(bookRequest24));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", 97);
        java.lang.String str20 = bookRequest19.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) ' ');
        int int25 = bookRequest19.compareTo(bookRequest24);
        int int26 = bookRequest15.compareTo(bookRequest24);
        java.lang.String str27 = bookRequest15.getRequester();
        java.lang.String str28 = bookRequest15.getBookTitle();
        int int29 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) '#');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) ' ');
        int int20 = bookRequest13.compareTo(bookRequest19);
        java.lang.String str21 = bookRequest19.getBookTitle();
        java.lang.String str22 = bookRequest19.getBookTitle();
        java.lang.String str23 = bookRequest19.getRequester();
        int int24 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
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
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        int int24 = bookRequest21.getPriority();
        java.lang.String str25 = bookRequest21.getBookTitle();
        java.lang.String str26 = bookRequest21.getRequester();
        java.lang.String str27 = bookRequest21.getRequester();
        int int28 = bookRequest21.getPriority();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.getBookTitle();
        java.lang.String str35 = bookRequest32.getRequester();
        int int36 = bookRequest21.compareTo(bookRequest32);
        int int37 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest32", (bookRequest10.compareTo(bookRequest32) == 0) == bookRequest10.equals(bookRequest32));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", 52);
        int int13 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str14 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int19 = bookRequest18.getPriority();
        int int20 = bookRequest12.compareTo(bookRequest18);
        java.lang.String str21 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str26 = bookRequest25.getRequester();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        int int29 = bookRequest25.getPriority();
        java.lang.String str30 = bookRequest25.getBookTitle();
        int int31 = bookRequest18.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest18 and bookRequest25", (bookRequest18.compareTo(bookRequest25) == 0) == bookRequest18.equals(bookRequest25));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", 52);
        int int15 = bookRequest3.compareTo(bookRequest14);
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) ' ');
        int int20 = bookRequest19.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str25 = bookRequest24.getRequester();
        int int26 = bookRequest24.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("", "", 1);
        java.lang.String str31 = bookRequest30.getBookTitle();
        int int32 = bookRequest24.compareTo(bookRequest30);
        int int33 = bookRequest19.compareTo(bookRequest30);
        java.lang.String str34 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int39 = bookRequest38.getPriority();
        int int40 = bookRequest38.getPriority();
        int int41 = bookRequest19.compareTo(bookRequest38);
        int int42 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest38", (bookRequest3.compareTo(bookRequest38) == 0) == bookRequest3.equals(bookRequest38));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
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
        int int20 = bookRequest3.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int29 = bookRequest24.compareTo(bookRequest28);
        int int30 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str19 = bookRequest18.getRequester();
        java.lang.String str20 = bookRequest18.getBookTitle();
        int int21 = bookRequest14.compareTo(bookRequest18);
        java.lang.String str22 = bookRequest14.getRequester();
        java.lang.String str23 = bookRequest14.getRequester();
        java.lang.String str24 = bookRequest14.getBookTitle();
        int int25 = bookRequest8.compareTo(bookRequest14);
        int int26 = bookRequest8.getPriority();
        int int27 = bookRequest3.compareTo(bookRequest8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
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
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        java.lang.String str33 = bookRequest31.getRequester();
        request.BookRequest bookRequest37 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str42 = bookRequest41.getRequester();
        java.lang.String str43 = bookRequest41.getBookTitle();
        int int44 = bookRequest37.compareTo(bookRequest41);
        java.lang.String str45 = bookRequest37.getRequester();
        java.lang.String str46 = bookRequest37.getRequester();
        java.lang.String str47 = bookRequest37.getBookTitle();
        int int48 = bookRequest31.compareTo(bookRequest37);
        java.lang.String str49 = bookRequest31.getRequester();
        request.BookRequest bookRequest53 = new request.BookRequest("hi!", "", 0);
        java.lang.String str54 = bookRequest53.getBookTitle();
        int int55 = bookRequest53.getPriority();
        java.lang.String str56 = bookRequest53.getBookTitle();
        java.lang.String str57 = bookRequest53.getRequester();
        int int58 = bookRequest31.compareTo(bookRequest53);
        int int59 = bookRequest23.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest53", (bookRequest3.compareTo(bookRequest53) == 0) == bookRequest3.equals(bookRequest53));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 10);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int15 = bookRequest10.compareTo(bookRequest14);
        java.lang.String str16 = bookRequest10.getBookTitle();
        int int17 = bookRequest10.getPriority();
        int int18 = bookRequest10.getPriority();
        int int19 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        int int33 = bookRequest26.compareTo(bookRequest30);
        java.lang.String str34 = bookRequest30.getBookTitle();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str39 = bookRequest38.getBookTitle();
        java.lang.String str40 = bookRequest38.getRequester();
        java.lang.String str41 = bookRequest38.getRequester();
        java.lang.String str42 = bookRequest38.getRequester();
        java.lang.String str43 = bookRequest38.getRequester();
        int int44 = bookRequest38.getPriority();
        java.lang.String str45 = bookRequest38.getRequester();
        int int46 = bookRequest30.compareTo(bookRequest38);
        int int47 = bookRequest30.getPriority();
        int int48 = bookRequest12.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest30", (bookRequest3.compareTo(bookRequest30) == 0) == bookRequest3.equals(bookRequest30));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
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
        request.BookRequest bookRequest41 = new request.BookRequest("", "hi!", 97);
        java.lang.String str42 = bookRequest41.getRequester();
        request.BookRequest bookRequest46 = new request.BookRequest("", "", (int) ' ');
        int int47 = bookRequest41.compareTo(bookRequest46);
        int int48 = bookRequest46.getPriority();
        int int49 = bookRequest46.getPriority();
        int int50 = bookRequest46.getPriority();
        int int51 = bookRequest30.compareTo(bookRequest46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest46", (bookRequest11.compareTo(bookRequest46) == 0) == bookRequest11.equals(bookRequest46));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
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
        java.lang.String str31 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest35 = new request.BookRequest("", "hi!", (int) '4');
        int int36 = bookRequest35.getPriority();
        java.lang.String str37 = bookRequest35.getBookTitle();
        java.lang.String str38 = bookRequest35.getBookTitle();
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", 0);
        java.lang.String str43 = bookRequest42.getBookTitle();
        request.BookRequest bookRequest47 = new request.BookRequest("hi!", "", (int) 'a');
        int int48 = bookRequest47.getPriority();
        int int49 = bookRequest47.getPriority();
        java.lang.String str50 = bookRequest47.getBookTitle();
        java.lang.String str51 = bookRequest47.getBookTitle();
        int int52 = bookRequest42.compareTo(bookRequest47);
        request.BookRequest bookRequest56 = new request.BookRequest("", "", (int) (byte) 10);
        int int57 = bookRequest56.getPriority();
        int int58 = bookRequest42.compareTo(bookRequest56);
        int int59 = bookRequest35.compareTo(bookRequest42);
        java.lang.String str60 = bookRequest42.getRequester();
        int int61 = bookRequest3.compareTo(bookRequest42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest47", (bookRequest7.compareTo(bookRequest47) == 0) == bookRequest7.equals(bookRequest47));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 0);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        int int27 = bookRequest24.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getBookTitle();
        int int34 = bookRequest31.getPriority();
        java.lang.String str35 = bookRequest31.getBookTitle();
        java.lang.String str36 = bookRequest31.getRequester();
        int int37 = bookRequest24.compareTo(bookRequest31);
        request.BookRequest bookRequest41 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str42 = bookRequest41.getBookTitle();
        int int43 = bookRequest41.getPriority();
        java.lang.String str44 = bookRequest41.getBookTitle();
        java.lang.String str45 = bookRequest41.getBookTitle();
        int int46 = bookRequest24.compareTo(bookRequest41);
        java.lang.String str47 = bookRequest24.getRequester();
        int int48 = bookRequest12.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest24", (bookRequest7.compareTo(bookRequest24) == 0) == bookRequest7.equals(bookRequest24));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getRequester();
        int int17 = bookRequest14.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
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
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) '#');
        int int31 = bookRequest30.getPriority();
        java.lang.String str32 = bookRequest30.getBookTitle();
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) ' ');
        int int37 = bookRequest30.compareTo(bookRequest36);
        java.lang.String str38 = bookRequest30.getRequester();
        java.lang.String str39 = bookRequest30.getRequester();
        int int40 = bookRequest24.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest30", (bookRequest3.compareTo(bookRequest30) == 0) == bookRequest3.equals(bookRequest30));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
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
        java.lang.String str21 = bookRequest15.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getRequester();
        java.lang.String str29 = bookRequest25.getBookTitle();
        java.lang.String str30 = bookRequest25.getBookTitle();
        java.lang.String str31 = bookRequest25.getBookTitle();
        int int32 = bookRequest25.getPriority();
        request.BookRequest bookRequest36 = new request.BookRequest("", "hi!", 10);
        int int37 = bookRequest36.getPriority();
        java.lang.String str38 = bookRequest36.getBookTitle();
        int int39 = bookRequest25.compareTo(bookRequest36);
        java.lang.String str40 = bookRequest36.getRequester();
        int int41 = bookRequest36.getPriority();
        int int42 = bookRequest15.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest25", (bookRequest9.compareTo(bookRequest25) == 0) == bookRequest9.equals(bookRequest25));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
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
        java.lang.String str19 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str34 = bookRequest33.getRequester();
        java.lang.String str35 = bookRequest33.getBookTitle();
        int int36 = bookRequest29.compareTo(bookRequest33);
        java.lang.String str37 = bookRequest29.getRequester();
        java.lang.String str38 = bookRequest29.getRequester();
        java.lang.String str39 = bookRequest29.getBookTitle();
        int int40 = bookRequest23.compareTo(bookRequest29);
        java.lang.String str41 = bookRequest23.getRequester();
        int int42 = bookRequest12.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "hi!", (int) 'a');
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) (byte) 1);
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest14.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "hi!", (int) '#');
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (short) 10);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest20.compareTo(bookRequest24);
        int int27 = bookRequest14.compareTo(bookRequest20);
        int int28 = bookRequest10.compareTo(bookRequest20);
        java.lang.String str29 = bookRequest20.getRequester();
        int int30 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getBookTitle();
        java.lang.String str25 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) '#');
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getBookTitle();
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) ' ');
        int int36 = bookRequest29.compareTo(bookRequest35);
        java.lang.String str37 = bookRequest29.getBookTitle();
        java.lang.String str38 = bookRequest29.getRequester();
        int int39 = bookRequest20.compareTo(bookRequest29);
        java.lang.String str40 = bookRequest29.getBookTitle();
        int int41 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", 0);
        int int14 = bookRequest9.compareTo(bookRequest13);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 1);
        java.lang.String str19 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        java.lang.String str27 = bookRequest23.getRequester();
        int int28 = bookRequest23.getPriority();
        int int29 = bookRequest18.compareTo(bookRequest23);
        int int30 = bookRequest13.compareTo(bookRequest23);
        int int31 = bookRequest23.getPriority();
        int int32 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str33 = bookRequest32.getRequester();
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest41 = new request.BookRequest("", "", (int) (short) 0);
        int int42 = bookRequest37.compareTo(bookRequest41);
        int int43 = bookRequest32.compareTo(bookRequest41);
        java.lang.String str44 = bookRequest41.getBookTitle();
        int int45 = bookRequest41.getPriority();
        int int46 = bookRequest28.compareTo(bookRequest41);
        int int47 = bookRequest28.getPriority();
        int int48 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest37", (bookRequest7.compareTo(bookRequest37) == 0) == bookRequest7.equals(bookRequest37));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
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
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        java.lang.String str33 = bookRequest31.getRequester();
        java.lang.String str34 = bookRequest31.getRequester();
        java.lang.String str35 = bookRequest31.getRequester();
        request.BookRequest bookRequest39 = new request.BookRequest("", "", 35);
        int int40 = bookRequest31.compareTo(bookRequest39);
        java.lang.String str41 = bookRequest39.getBookTitle();
        request.BookRequest bookRequest45 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str46 = bookRequest45.getBookTitle();
        java.lang.String str47 = bookRequest45.getRequester();
        int int48 = bookRequest39.compareTo(bookRequest45);
        java.lang.String str49 = bookRequest45.getRequester();
        int int50 = bookRequest45.getPriority();
        int int51 = bookRequest45.getPriority();
        int int52 = bookRequest15.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest45", (bookRequest15.compareTo(bookRequest45) == 0) == bookRequest15.equals(bookRequest45));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
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
        int int24 = bookRequest22.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) '#');
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getRequester();
        java.lang.String str37 = bookRequest32.getRequester();
        java.lang.String str38 = bookRequest32.getBookTitle();
        int int39 = bookRequest28.compareTo(bookRequest32);
        int int40 = bookRequest22.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest32", (bookRequest3.compareTo(bookRequest32) == 0) == bookRequest3.equals(bookRequest32));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (byte) 10);
        int int14 = bookRequest13.getPriority();
        int int15 = bookRequest13.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str20 = bookRequest19.getRequester();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        java.lang.String str23 = bookRequest19.getRequester();
        int int24 = bookRequest19.getPriority();
        int int25 = bookRequest13.compareTo(bookRequest19);
        java.lang.String str26 = bookRequest13.getBookTitle();
        java.lang.String str27 = bookRequest13.getRequester();
        java.lang.String str28 = bookRequest13.getRequester();
        int int29 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (byte) 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 97);
        int int12 = bookRequest11.getPriority();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest7.compareTo(bookRequest11);
        int int15 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getRequester();
        int int29 = bookRequest25.getPriority();
        java.lang.String str30 = bookRequest25.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str35 = bookRequest34.getBookTitle();
        int int36 = bookRequest25.compareTo(bookRequest34);
        java.lang.String str37 = bookRequest34.getBookTitle();
        java.lang.String str38 = bookRequest34.getBookTitle();
        int int39 = bookRequest17.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest25", (bookRequest8.compareTo(bookRequest25) == 0) == bookRequest8.equals(bookRequest25));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest9);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getBookTitle();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getBookTitle();
        java.lang.String str23 = bookRequest16.getBookTitle();
        java.lang.String str24 = bookRequest16.getRequester();
        java.lang.String str25 = bookRequest16.getBookTitle();
        int int26 = bookRequest16.getPriority();
        int int27 = bookRequest9.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
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
        java.lang.String str17 = bookRequest12.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        java.lang.String str22 = bookRequest21.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getBookTitle();
        int int31 = bookRequest26.getPriority();
        java.lang.String str32 = bookRequest26.getBookTitle();
        java.lang.String str33 = bookRequest26.getBookTitle();
        int int34 = bookRequest21.compareTo(bookRequest26);
        java.lang.String str35 = bookRequest26.getBookTitle();
        java.lang.String str36 = bookRequest26.getBookTitle();
        int int37 = bookRequest12.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
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
        int int27 = bookRequest11.getPriority();
        int int28 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
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
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str34 = bookRequest33.getRequester();
        int int35 = bookRequest33.getPriority();
        java.lang.String str36 = bookRequest33.getBookTitle();
        java.lang.String str37 = bookRequest33.getRequester();
        int int38 = bookRequest33.getPriority();
        java.lang.String str39 = bookRequest33.getBookTitle();
        int int40 = bookRequest33.getPriority();
        int int41 = bookRequest33.getPriority();
        int int42 = bookRequest29.compareTo(bookRequest33);
        request.BookRequest bookRequest46 = new request.BookRequest("", "", (int) (byte) 10);
        int int47 = bookRequest46.getPriority();
        int int48 = bookRequest33.compareTo(bookRequest46);
        int int49 = bookRequest46.getPriority();
        int int50 = bookRequest3.compareTo(bookRequest46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest33", (bookRequest3.compareTo(bookRequest33) == 0) == bookRequest3.equals(bookRequest33));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str11 = bookRequest10.getRequester();
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.String str13 = bookRequest10.getBookTitle();
        int int14 = bookRequest10.getPriority();
        java.lang.String str15 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", 0);
        int int20 = bookRequest10.compareTo(bookRequest19);
        int int21 = bookRequest3.compareTo(bookRequest19);
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str26 = bookRequest25.getRequester();
        int int27 = bookRequest25.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest31.getPriority();
        int int36 = bookRequest31.getPriority();
        int int37 = bookRequest25.compareTo(bookRequest31);
        request.BookRequest bookRequest41 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int42 = bookRequest31.compareTo(bookRequest41);
        java.lang.String str43 = bookRequest41.getBookTitle();
        java.lang.String str44 = bookRequest41.getRequester();
        request.BookRequest bookRequest48 = new request.BookRequest("", "hi!", (int) (byte) 0);
        java.lang.String str49 = bookRequest48.getBookTitle();
        int int50 = bookRequest48.getPriority();
        int int51 = bookRequest41.compareTo(bookRequest48);
        int int52 = bookRequest3.compareTo(bookRequest48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest31", (bookRequest10.compareTo(bookRequest31) == 0) == bookRequest10.equals(bookRequest31));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 10);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest14.getPriority();
        java.lang.String str17 = bookRequest14.getBookTitle();
        java.lang.String str18 = bookRequest14.getRequester();
        int int19 = bookRequest14.getPriority();
        java.lang.String str20 = bookRequest14.getBookTitle();
        int int21 = bookRequest14.getPriority();
        int int22 = bookRequest14.getPriority();
        int int23 = bookRequest10.compareTo(bookRequest14);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str32 = bookRequest31.getBookTitle();
        java.lang.String str33 = bookRequest31.getRequester();
        int int34 = bookRequest31.getPriority();
        int int35 = bookRequest27.compareTo(bookRequest31);
        int int36 = bookRequest10.compareTo(bookRequest31);
        int int37 = bookRequest10.getPriority();
        int int38 = bookRequest10.getPriority();
        java.lang.String str39 = bookRequest10.getBookTitle();
        java.lang.String str40 = bookRequest10.getBookTitle();
        int int41 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int13 = bookRequest3.compareTo(bookRequest12);
        int int14 = bookRequest3.getPriority();
        java.lang.String str15 = bookRequest3.getRequester();
        java.lang.String str16 = bookRequest3.getRequester();
        java.lang.String str17 = bookRequest3.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        int int28 = bookRequest21.compareTo(bookRequest25);
        java.lang.String str29 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str34 = bookRequest33.getBookTitle();
        java.lang.String str35 = bookRequest33.getRequester();
        java.lang.String str36 = bookRequest33.getRequester();
        java.lang.String str37 = bookRequest33.getRequester();
        java.lang.String str38 = bookRequest33.getRequester();
        int int39 = bookRequest33.getPriority();
        java.lang.String str40 = bookRequest33.getRequester();
        int int41 = bookRequest25.compareTo(bookRequest33);
        int int42 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest25", (bookRequest7.compareTo(bookRequest25) == 0) == bookRequest7.equals(bookRequest25));
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 52);
        int int12 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 100);
        int int17 = bookRequest11.compareTo(bookRequest16);
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) '4');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getBookTitle();
        java.lang.String str24 = bookRequest21.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int29 = bookRequest21.compareTo(bookRequest28);
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (byte) 10);
        int int34 = bookRequest33.getPriority();
        int int35 = bookRequest33.getPriority();
        int int36 = bookRequest21.compareTo(bookRequest33);
        java.lang.String str37 = bookRequest21.getBookTitle();
        int int38 = bookRequest16.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest21", (bookRequest11.compareTo(bookRequest21) == 0) == bookRequest11.equals(bookRequest21));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
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
        java.lang.String str26 = bookRequest7.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", (int) '4');
        int int31 = bookRequest30.getPriority();
        java.lang.String str32 = bookRequest30.getBookTitle();
        java.lang.String str33 = bookRequest30.getBookTitle();
        int int34 = bookRequest30.getPriority();
        java.lang.String str35 = bookRequest30.getBookTitle();
        java.lang.String str36 = bookRequest30.getRequester();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) 'a');
        int int41 = bookRequest40.getPriority();
        java.lang.String str42 = bookRequest40.getRequester();
        int int43 = bookRequest40.getPriority();
        java.lang.String str44 = bookRequest40.getBookTitle();
        java.lang.String str45 = bookRequest40.getRequester();
        java.lang.String str46 = bookRequest40.getRequester();
        int int47 = bookRequest40.getPriority();
        int int48 = bookRequest30.compareTo(bookRequest40);
        int int49 = bookRequest40.getPriority();
        int int50 = bookRequest7.compareTo(bookRequest40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest40", (bookRequest7.compareTo(bookRequest40) == 0) == bookRequest7.equals(bookRequest40));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str11 = bookRequest10.getRequester();
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.String str13 = bookRequest10.getBookTitle();
        int int14 = bookRequest10.getPriority();
        java.lang.String str15 = bookRequest10.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) '#');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) ' ');
        int int26 = bookRequest19.compareTo(bookRequest25);
        java.lang.String str27 = bookRequest19.getRequester();
        java.lang.String str28 = bookRequest19.getRequester();
        int int29 = bookRequest19.getPriority();
        int int30 = bookRequest19.getPriority();
        int int31 = bookRequest19.getPriority();
        int int32 = bookRequest10.compareTo(bookRequest19);
        java.lang.String str33 = bookRequest10.getRequester();
        int int34 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str19 = bookRequest18.getBookTitle();
        java.lang.String str20 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str25 = bookRequest24.getRequester();
        int int26 = bookRequest24.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        int int34 = bookRequest30.getPriority();
        int int35 = bookRequest30.getPriority();
        int int36 = bookRequest24.compareTo(bookRequest30);
        int int37 = bookRequest18.compareTo(bookRequest30);
        int int38 = bookRequest7.compareTo(bookRequest18);
        request.BookRequest bookRequest42 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "hi!", 52);
        int int47 = bookRequest42.compareTo(bookRequest46);
        int int48 = bookRequest7.compareTo(bookRequest46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest46", (bookRequest3.compareTo(bookRequest46) == 0) == bookRequest3.equals(bookRequest46));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
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
        request.BookRequest bookRequest35 = new request.BookRequest("", "", 0);
        java.lang.String str36 = bookRequest35.getBookTitle();
        int int37 = bookRequest12.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest35", (bookRequest12.compareTo(bookRequest35) == 0) == bookRequest12.equals(bookRequest35));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", 1);
        java.lang.String str26 = bookRequest25.getRequester();
        int int27 = bookRequest25.getPriority();
        int int28 = bookRequest9.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest25", (bookRequest9.compareTo(bookRequest25) == 0) == bookRequest9.equals(bookRequest25));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "hi!", 0);
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", 97);
        java.lang.String str34 = bookRequest33.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) ' ');
        int int39 = bookRequest33.compareTo(bookRequest38);
        int int40 = bookRequest29.compareTo(bookRequest38);
        int int41 = bookRequest25.compareTo(bookRequest38);
        int int42 = bookRequest12.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest33", (bookRequest3.compareTo(bookRequest33) == 0) == bookRequest3.equals(bookRequest33));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
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
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        java.lang.String str33 = bookRequest31.getRequester();
        java.lang.String str34 = bookRequest31.getRequester();
        java.lang.String str35 = bookRequest31.getRequester();
        request.BookRequest bookRequest39 = new request.BookRequest("", "", 35);
        int int40 = bookRequest31.compareTo(bookRequest39);
        java.lang.String str41 = bookRequest39.getBookTitle();
        request.BookRequest bookRequest45 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str46 = bookRequest45.getBookTitle();
        java.lang.String str47 = bookRequest45.getRequester();
        int int48 = bookRequest39.compareTo(bookRequest45);
        int int49 = bookRequest20.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest31", (bookRequest9.compareTo(bookRequest31) == 0) == bookRequest9.equals(bookRequest31));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest11 = new request.BookRequest("", "", (int) (byte) 1);
        int int12 = bookRequest7.compareTo(bookRequest11);
        int int13 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        java.lang.String str25 = bookRequest23.getRequester();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest23.getPriority();
        java.lang.String str29 = bookRequest23.getBookTitle();
        int int30 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest23", (bookRequest7.compareTo(bookRequest23) == 0) == bookRequest7.equals(bookRequest23));
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest7.getPriority();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getBookTitle();
        java.lang.String str15 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str20 = bookRequest19.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (short) 0);
        int int29 = bookRequest24.compareTo(bookRequest28);
        int int30 = bookRequest19.compareTo(bookRequest28);
        request.BookRequest bookRequest34 = new request.BookRequest("", "", 1);
        int int35 = bookRequest28.compareTo(bookRequest34);
        int int36 = bookRequest34.getPriority();
        int int37 = bookRequest7.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest24", (bookRequest7.compareTo(bookRequest24) == 0) == bookRequest7.equals(bookRequest24));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", 52);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) '#');
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getRequester();
        int int17 = bookRequest14.getPriority();
        java.lang.String str18 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest22.compareTo(bookRequest26);
        int int28 = bookRequest14.compareTo(bookRequest22);
        java.lang.String str29 = bookRequest22.getRequester();
        int int30 = bookRequest7.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
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
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str25 = bookRequest24.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (short) 0);
        int int34 = bookRequest29.compareTo(bookRequest33);
        int int35 = bookRequest24.compareTo(bookRequest33);
        java.lang.String str36 = bookRequest33.getBookTitle();
        int int37 = bookRequest33.getPriority();
        int int38 = bookRequest33.getPriority();
        int int39 = bookRequest33.getPriority();
        java.lang.String str40 = bookRequest33.getBookTitle();
        request.BookRequest bookRequest44 = new request.BookRequest("", "", 1);
        int int45 = bookRequest33.compareTo(bookRequest44);
        int int46 = bookRequest3.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        java.lang.String str17 = bookRequest15.getRequester();
        java.lang.String str18 = bookRequest15.getRequester();
        java.lang.String str19 = bookRequest15.getBookTitle();
        java.lang.String str20 = bookRequest15.getBookTitle();
        java.lang.String str21 = bookRequest15.getRequester();
        java.lang.String str22 = bookRequest15.getRequester();
        int int23 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str25 = bookRequest24.getRequester();
        java.lang.String str26 = bookRequest24.getRequester();
        java.lang.String str27 = bookRequest24.getBookTitle();
        int int28 = bookRequest20.compareTo(bookRequest24);
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str33 = bookRequest32.getBookTitle();
        int int34 = bookRequest32.getPriority();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "hi!", 52);
        int int39 = bookRequest32.compareTo(bookRequest38);
        int int40 = bookRequest24.compareTo(bookRequest32);
        request.BookRequest bookRequest44 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int45 = bookRequest44.getPriority();
        request.BookRequest bookRequest49 = new request.BookRequest("hi!", "", (int) '#');
        int int50 = bookRequest49.getPriority();
        java.lang.String str51 = bookRequest49.getBookTitle();
        request.BookRequest bookRequest55 = new request.BookRequest("", "", (int) ' ');
        int int56 = bookRequest49.compareTo(bookRequest55);
        int int57 = bookRequest44.compareTo(bookRequest55);
        int int58 = bookRequest32.compareTo(bookRequest44);
        int int59 = bookRequest44.getPriority();
        int int60 = bookRequest12.compareTo(bookRequest44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
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
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", 52);
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str28 = bookRequest27.getBookTitle();
        java.lang.String str29 = bookRequest27.getRequester();
        int int30 = bookRequest27.getPriority();
        int int31 = bookRequest23.compareTo(bookRequest27);
        int int32 = bookRequest23.getPriority();
        int int33 = bookRequest17.compareTo(bookRequest23);
        int int34 = bookRequest17.getPriority();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        int int39 = bookRequest38.getPriority();
        java.lang.String str40 = bookRequest38.getRequester();
        int int41 = bookRequest38.getPriority();
        int int42 = bookRequest38.getPriority();
        java.lang.String str43 = bookRequest38.getBookTitle();
        int int44 = bookRequest38.getPriority();
        java.lang.String str45 = bookRequest38.getBookTitle();
        int int46 = bookRequest17.compareTo(bookRequest38);
        int int47 = bookRequest3.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest38", (bookRequest3.compareTo(bookRequest38) == 0) == bookRequest3.equals(bookRequest38));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
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
        java.lang.String str17 = bookRequest8.getRequester();
        java.lang.String str18 = bookRequest8.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getRequester();
        int int25 = bookRequest22.getPriority();
        java.lang.String str26 = bookRequest22.getBookTitle();
        java.lang.String str27 = bookRequest22.getRequester();
        int int28 = bookRequest8.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest22", (bookRequest8.compareTo(bookRequest22) == 0) == bookRequest8.equals(bookRequest22));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
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
        java.lang.String str27 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str32 = bookRequest31.getBookTitle();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str37 = bookRequest36.getRequester();
        int int38 = bookRequest36.getPriority();
        java.lang.String str39 = bookRequest36.getBookTitle();
        java.lang.String str40 = bookRequest36.getRequester();
        request.BookRequest bookRequest44 = new request.BookRequest("", "hi!", 52);
        int int45 = bookRequest36.compareTo(bookRequest44);
        request.BookRequest bookRequest49 = new request.BookRequest("hi!", "", (int) (short) 100);
        int int50 = bookRequest44.compareTo(bookRequest49);
        int int51 = bookRequest31.compareTo(bookRequest49);
        java.lang.String str52 = bookRequest49.getRequester();
        int int53 = bookRequest3.compareTo(bookRequest49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest36", (bookRequest7.compareTo(bookRequest36) == 0) == bookRequest7.equals(bookRequest36));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str29 = bookRequest28.getBookTitle();
        java.lang.String str30 = bookRequest28.getBookTitle();
        java.lang.String str31 = bookRequest28.getBookTitle();
        int int32 = bookRequest9.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
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
        request.BookRequest bookRequest45 = new request.BookRequest("", "", 1);
        java.lang.String str46 = bookRequest45.getBookTitle();
        request.BookRequest bookRequest50 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str51 = bookRequest50.getRequester();
        int int52 = bookRequest50.getPriority();
        java.lang.String str53 = bookRequest50.getBookTitle();
        java.lang.String str54 = bookRequest50.getRequester();
        int int55 = bookRequest50.getPriority();
        int int56 = bookRequest45.compareTo(bookRequest50);
        int int57 = bookRequest23.compareTo(bookRequest50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest50", (bookRequest3.compareTo(bookRequest50) == 0) == bookRequest3.equals(bookRequest50));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        int int9 = bookRequest3.compareTo(bookRequest8);
        int int10 = bookRequest8.getPriority();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest8.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getBookTitle();
        java.lang.String str21 = bookRequest16.getBookTitle();
        int int22 = bookRequest16.getPriority();
        java.lang.String str23 = bookRequest16.getRequester();
        int int24 = bookRequest8.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", 35);
        java.lang.String str26 = bookRequest25.getRequester();
        int int27 = bookRequest25.getPriority();
        int int28 = bookRequest25.getPriority();
        int int29 = bookRequest25.getPriority();
        int int30 = bookRequest9.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest25", (bookRequest9.compareTo(bookRequest25) == 0) == bookRequest9.equals(bookRequest25));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str21 = bookRequest20.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (short) 0);
        int int30 = bookRequest25.compareTo(bookRequest29);
        int int31 = bookRequest20.compareTo(bookRequest29);
        int int32 = bookRequest20.getPriority();
        int int33 = bookRequest20.getPriority();
        java.lang.String str34 = bookRequest20.getBookTitle();
        int int35 = bookRequest13.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
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
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest26.compareTo(bookRequest30);
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int36 = bookRequest26.compareTo(bookRequest35);
        int int37 = bookRequest35.getPriority();
        java.lang.String str38 = bookRequest35.getBookTitle();
        java.lang.String str39 = bookRequest35.getBookTitle();
        int int40 = bookRequest7.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest30", (bookRequest7.compareTo(bookRequest30) == 0) == bookRequest7.equals(bookRequest30));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
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
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", 97);
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getRequester();
        java.lang.String str25 = bookRequest22.getRequester();
        java.lang.String str26 = bookRequest22.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str31 = bookRequest30.getBookTitle();
        java.lang.String str32 = bookRequest30.getBookTitle();
        int int33 = bookRequest22.compareTo(bookRequest30);
        java.lang.String str34 = bookRequest30.getRequester();
        int int35 = bookRequest17.compareTo(bookRequest30);
        int int36 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getRequester();
        int int17 = bookRequest14.getPriority();
        java.lang.String str18 = bookRequest14.getRequester();
        java.lang.String str19 = bookRequest14.getBookTitle();
        int int20 = bookRequest14.getPriority();
        java.lang.String str21 = bookRequest14.getRequester();
        java.lang.String str22 = bookRequest14.getRequester();
        java.lang.String str23 = bookRequest14.getBookTitle();
        java.lang.String str24 = bookRequest14.getBookTitle();
        int int25 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        java.lang.String str27 = bookRequest23.getRequester();
        int int28 = bookRequest23.getPriority();
        java.lang.String str29 = bookRequest23.getBookTitle();
        int int30 = bookRequest23.getPriority();
        int int31 = bookRequest23.getPriority();
        int int32 = bookRequest9.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) -1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str9 = bookRequest8.getBookTitle();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest8", (bookRequest3.compareTo(bookRequest8) == 0) == bookRequest3.equals(bookRequest8));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.getBookTitle();
        java.lang.String str12 = bookRequest9.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getRequester();
        int int21 = bookRequest16.getPriority();
        java.lang.String str22 = bookRequest16.getBookTitle();
        int int23 = bookRequest16.getPriority();
        int int24 = bookRequest9.compareTo(bookRequest16);
        java.lang.String str25 = bookRequest16.getBookTitle();
        java.lang.String str26 = bookRequest16.getRequester();
        int int27 = bookRequest16.getPriority();
        int int28 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest9", (bookRequest3.compareTo(bookRequest9) == 0) == bookRequest3.equals(bookRequest9));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) (short) 100);
        java.lang.String str23 = bookRequest22.getBookTitle();
        int int24 = bookRequest12.compareTo(bookRequest22);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        java.lang.String str30 = bookRequest28.getRequester();
        java.lang.String str31 = bookRequest28.getRequester();
        java.lang.String str32 = bookRequest28.getBookTitle();
        java.lang.String str33 = bookRequest28.getBookTitle();
        java.lang.String str34 = bookRequest28.getRequester();
        int int35 = bookRequest28.getPriority();
        java.lang.String str36 = bookRequest28.getBookTitle();
        int int37 = bookRequest12.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest28", (bookRequest12.compareTo(bookRequest28) == 0) == bookRequest12.equals(bookRequest28));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (byte) 1);
        int int18 = bookRequest13.compareTo(bookRequest17);
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "hi!", 52);
        int int27 = bookRequest22.compareTo(bookRequest26);
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        java.lang.String str33 = bookRequest31.getRequester();
        int int34 = bookRequest31.getPriority();
        java.lang.String str35 = bookRequest31.getBookTitle();
        java.lang.String str36 = bookRequest31.getRequester();
        int int37 = bookRequest22.compareTo(bookRequest31);
        int int38 = bookRequest31.getPriority();
        int int39 = bookRequest13.compareTo(bookRequest31);
        int int40 = bookRequest31.getPriority();
        int int41 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
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
        request.BookRequest bookRequest35 = new request.BookRequest("", "", 1);
        java.lang.String str36 = bookRequest35.getRequester();
        java.lang.String str37 = bookRequest35.getBookTitle();
        java.lang.String str38 = bookRequest35.getRequester();
        java.lang.String str39 = bookRequest35.getRequester();
        int int40 = bookRequest35.getPriority();
        int int41 = bookRequest35.getPriority();
        int int42 = bookRequest16.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest21 and bookRequest35", (bookRequest21.compareTo(bookRequest35) == 0) == bookRequest21.equals(bookRequest35));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getRequester();
        java.lang.String str23 = bookRequest18.getBookTitle();
        int int24 = bookRequest18.getPriority();
        int int25 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest18", (bookRequest8.compareTo(bookRequest18) == 0) == bookRequest8.equals(bookRequest18));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
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
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str33 = bookRequest32.getRequester();
        java.lang.String str34 = bookRequest32.getBookTitle();
        java.lang.String str35 = bookRequest32.getRequester();
        java.lang.String str36 = bookRequest32.getRequester();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) 'a');
        int int41 = bookRequest40.getPriority();
        int int42 = bookRequest40.getPriority();
        java.lang.String str43 = bookRequest40.getBookTitle();
        int int44 = bookRequest40.getPriority();
        int int45 = bookRequest40.getPriority();
        java.lang.String str46 = bookRequest40.getBookTitle();
        int int47 = bookRequest32.compareTo(bookRequest40);
        int int48 = bookRequest3.compareTo(bookRequest40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest19 and bookRequest32", (bookRequest19.compareTo(bookRequest32) == 0) == bookRequest19.equals(bookRequest32));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
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
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int17 = bookRequest3.compareTo(bookRequest16);
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getRequester();
        java.lang.String str32 = bookRequest27.getBookTitle();
        int int33 = bookRequest27.getPriority();
        java.lang.String str34 = bookRequest27.getBookTitle();
        java.lang.String str35 = bookRequest27.getRequester();
        java.lang.String str36 = bookRequest27.getBookTitle();
        int int37 = bookRequest21.compareTo(bookRequest27);
        int int38 = bookRequest16.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getRequester();
        java.lang.String str17 = bookRequest12.getBookTitle();
        int int18 = bookRequest12.getPriority();
        java.lang.String str19 = bookRequest12.getRequester();
        int int20 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) '4');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getBookTitle();
        java.lang.String str27 = bookRequest24.getBookTitle();
        int int28 = bookRequest24.getPriority();
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) 'a');
        int int37 = bookRequest32.compareTo(bookRequest36);
        int int38 = bookRequest36.getPriority();
        int int39 = bookRequest36.getPriority();
        int int40 = bookRequest24.compareTo(bookRequest36);
        java.lang.String str41 = bookRequest24.getBookTitle();
        int int42 = bookRequest24.getPriority();
        java.lang.String str43 = bookRequest24.getBookTitle();
        java.lang.String str44 = bookRequest24.getRequester();
        int int45 = bookRequest24.getPriority();
        int int46 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest36", (bookRequest12.compareTo(bookRequest36) == 0) == bookRequest12.equals(bookRequest36));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        java.lang.String str34 = bookRequest32.getRequester();
        java.lang.String str35 = bookRequest32.getRequester();
        java.lang.String str36 = bookRequest32.getBookTitle();
        java.lang.String str37 = bookRequest32.getBookTitle();
        java.lang.String str38 = bookRequest32.getRequester();
        int int39 = bookRequest32.getPriority();
        java.lang.String str40 = bookRequest32.getBookTitle();
        java.lang.String str41 = bookRequest32.getBookTitle();
        int int42 = bookRequest32.getPriority();
        java.lang.String str43 = bookRequest32.getBookTitle();
        int int44 = bookRequest28.compareTo(bookRequest32);
        request.BookRequest bookRequest48 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest52 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str53 = bookRequest52.getRequester();
        java.lang.String str54 = bookRequest52.getBookTitle();
        int int55 = bookRequest48.compareTo(bookRequest52);
        java.lang.String str56 = bookRequest48.getRequester();
        java.lang.String str57 = bookRequest48.getRequester();
        java.lang.String str58 = bookRequest48.getBookTitle();
        java.lang.String str59 = bookRequest48.getRequester();
        int int60 = bookRequest48.getPriority();
        int int61 = bookRequest48.getPriority();
        java.lang.String str62 = bookRequest48.getRequester();
        int int63 = bookRequest32.compareTo(bookRequest48);
        java.lang.String str64 = bookRequest48.getRequester();
        int int65 = bookRequest48.getPriority();
        int int66 = bookRequest16.compareTo(bookRequest48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest52", (bookRequest8.compareTo(bookRequest52) == 0) == bookRequest8.equals(bookRequest52));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (byte) 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest10.getRequester();
        int int13 = bookRequest10.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getRequester();
        int int21 = bookRequest17.getPriority();
        java.lang.String str22 = bookRequest17.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) '#');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) ' ');
        int int33 = bookRequest26.compareTo(bookRequest32);
        int int34 = bookRequest17.compareTo(bookRequest26);
        java.lang.String str35 = bookRequest26.getRequester();
        java.lang.String str36 = bookRequest26.getRequester();
        int int37 = bookRequest26.getPriority();
        int int38 = bookRequest26.getPriority();
        java.lang.String str39 = bookRequest26.getRequester();
        java.lang.String str40 = bookRequest26.getBookTitle();
        int int41 = bookRequest10.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "hi!", 0);
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        int int25 = bookRequest22.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 1);
        java.lang.String str30 = bookRequest29.getBookTitle();
        java.lang.String str31 = bookRequest29.getBookTitle();
        java.lang.String str32 = bookRequest29.getRequester();
        int int33 = bookRequest22.compareTo(bookRequest29);
        java.lang.String str34 = bookRequest22.getBookTitle();
        int int35 = bookRequest22.getPriority();
        int int36 = bookRequest22.getPriority();
        int int37 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest29", (bookRequest14.compareTo(bookRequest29) == 0) == bookRequest14.equals(bookRequest29));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (byte) 1);
        int int16 = bookRequest11.compareTo(bookRequest15);
        int int17 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
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
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str32 = bookRequest31.getBookTitle();
        java.lang.String str33 = bookRequest31.getRequester();
        java.lang.String str34 = bookRequest31.getRequester();
        java.lang.String str35 = bookRequest31.getRequester();
        request.BookRequest bookRequest39 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str40 = bookRequest39.getBookTitle();
        java.lang.String str41 = bookRequest39.getBookTitle();
        int int42 = bookRequest31.compareTo(bookRequest39);
        java.lang.String str43 = bookRequest39.getRequester();
        request.BookRequest bookRequest47 = new request.BookRequest("hi!", "", 0);
        java.lang.String str48 = bookRequest47.getBookTitle();
        int int49 = bookRequest39.compareTo(bookRequest47);
        int int50 = bookRequest39.getPriority();
        request.BookRequest bookRequest54 = new request.BookRequest("hi!", "", (int) 'a');
        int int55 = bookRequest54.getPriority();
        java.lang.String str56 = bookRequest54.getRequester();
        int int57 = bookRequest54.getPriority();
        java.lang.String str58 = bookRequest54.getRequester();
        java.lang.String str59 = bookRequest54.getBookTitle();
        int int60 = bookRequest54.getPriority();
        java.lang.String str61 = bookRequest54.getRequester();
        int int62 = bookRequest54.getPriority();
        request.BookRequest bookRequest66 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str67 = bookRequest66.getRequester();
        java.lang.String str68 = bookRequest66.getBookTitle();
        int int69 = bookRequest66.getPriority();
        java.lang.String str70 = bookRequest66.getBookTitle();
        java.lang.String str71 = bookRequest66.getRequester();
        java.lang.String str72 = bookRequest66.getBookTitle();
        java.lang.String str73 = bookRequest66.getRequester();
        java.lang.String str74 = bookRequest66.getBookTitle();
        java.lang.String str75 = bookRequest66.getRequester();
        int int76 = bookRequest54.compareTo(bookRequest66);
        int int77 = bookRequest39.compareTo(bookRequest54);
        int int78 = bookRequest39.getPriority();
        int int79 = bookRequest20.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest66", (bookRequest3.compareTo(bookRequest66) == 0) == bookRequest3.equals(bookRequest66));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getRequester();
        int int19 = bookRequest15.getPriority();
        java.lang.String str20 = bookRequest15.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str25 = bookRequest24.getBookTitle();
        int int26 = bookRequest15.compareTo(bookRequest24);
        java.lang.String str27 = bookRequest15.getRequester();
        int int28 = bookRequest15.getPriority();
        java.lang.String str29 = bookRequest15.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str34 = bookRequest33.getBookTitle();
        java.lang.String str35 = bookRequest33.getRequester();
        int int36 = bookRequest33.getPriority();
        int int37 = bookRequest33.getPriority();
        java.lang.String str38 = bookRequest33.getBookTitle();
        int int39 = bookRequest15.compareTo(bookRequest33);
        int int40 = bookRequest3.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest33", (bookRequest7.compareTo(bookRequest33) == 0) == bookRequest7.equals(bookRequest33));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest25.compareTo(bookRequest29);
        int int32 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
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
        java.lang.String str20 = bookRequest15.getBookTitle();
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
        int int34 = bookRequest15.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest24", (bookRequest15.compareTo(bookRequest24) == 0) == bookRequest15.equals(bookRequest24));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        int int15 = bookRequest3.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str24 = bookRequest23.getRequester();
        java.lang.String str25 = bookRequest23.getBookTitle();
        int int26 = bookRequest19.compareTo(bookRequest23);
        java.lang.String str27 = bookRequest19.getRequester();
        java.lang.String str28 = bookRequest19.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str33 = bookRequest32.getRequester();
        int int34 = bookRequest32.getPriority();
        int int35 = bookRequest19.compareTo(bookRequest32);
        int int36 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest32", (bookRequest12.compareTo(bookRequest32) == 0) == bookRequest12.equals(bookRequest32));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
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
        java.lang.String str19 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", 97);
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getBookTitle();
        int int30 = bookRequest23.compareTo(bookRequest27);
        java.lang.String str31 = bookRequest27.getBookTitle();
        java.lang.String str32 = bookRequest27.getRequester();
        java.lang.String str33 = bookRequest27.getRequester();
        java.lang.String str34 = bookRequest27.getRequester();
        int int35 = bookRequest12.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest27", (bookRequest8.compareTo(bookRequest27) == 0) == bookRequest8.equals(bookRequest27));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
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
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getBookTitle();
        java.lang.String str22 = bookRequest17.getBookTitle();
        java.lang.String str23 = bookRequest17.getRequester();
        java.lang.String str24 = bookRequest17.getRequester();
        java.lang.String str25 = bookRequest17.getBookTitle();
        int int26 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (byte) 10);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 100);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        int int18 = bookRequest17.getPriority();
        java.lang.String str19 = bookRequest17.getRequester();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest13.compareTo(bookRequest17);
        int int23 = bookRequest13.getPriority();
        int int24 = bookRequest7.compareTo(bookRequest13);
        java.lang.String str25 = bookRequest13.getRequester();
        java.lang.String str26 = bookRequest13.getBookTitle();
        int int27 = bookRequest3.compareTo(bookRequest13);
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str32 = bookRequest31.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest40 = new request.BookRequest("", "", (int) (short) 0);
        int int41 = bookRequest36.compareTo(bookRequest40);
        int int42 = bookRequest31.compareTo(bookRequest40);
        java.lang.String str43 = bookRequest40.getBookTitle();
        int int44 = bookRequest40.getPriority();
        java.lang.String str45 = bookRequest40.getRequester();
        int int46 = bookRequest40.getPriority();
        int int47 = bookRequest40.getPriority();
        java.lang.String str48 = bookRequest40.getRequester();
        int int49 = bookRequest3.compareTo(bookRequest40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest17 and bookRequest36", (bookRequest17.compareTo(bookRequest36) == 0) == bookRequest17.equals(bookRequest36));
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", 0);
        java.lang.String str20 = bookRequest19.getBookTitle();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getRequester();
        int int23 = bookRequest19.getPriority();
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", (int) '#');
        int int28 = bookRequest19.compareTo(bookRequest27);
        int int29 = bookRequest3.compareTo(bookRequest19);
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str38 = bookRequest37.getRequester();
        int int39 = bookRequest33.compareTo(bookRequest37);
        int int40 = bookRequest19.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest37", (bookRequest3.compareTo(bookRequest37) == 0) == bookRequest3.equals(bookRequest37));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
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
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        int int32 = bookRequest31.getPriority();
        java.lang.String str33 = bookRequest31.getRequester();
        int int34 = bookRequest31.getPriority();
        java.lang.String str35 = bookRequest31.getRequester();
        request.BookRequest bookRequest39 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str40 = bookRequest39.getRequester();
        int int41 = bookRequest39.getPriority();
        int int42 = bookRequest31.compareTo(bookRequest39);
        int int43 = bookRequest39.getPriority();
        int int44 = bookRequest39.getPriority();
        int int45 = bookRequest39.getPriority();
        request.BookRequest bookRequest49 = new request.BookRequest("hi!", "", (int) (byte) 0);
        java.lang.String str50 = bookRequest49.getRequester();
        int int51 = bookRequest39.compareTo(bookRequest49);
        int int52 = bookRequest3.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest49", (bookRequest11.compareTo(bookRequest49) == 0) == bookRequest11.equals(bookRequest49));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str19 = bookRequest18.getBookTitle();
        java.lang.String str20 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str25 = bookRequest24.getRequester();
        int int26 = bookRequest24.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        int int34 = bookRequest30.getPriority();
        int int35 = bookRequest30.getPriority();
        int int36 = bookRequest24.compareTo(bookRequest30);
        int int37 = bookRequest18.compareTo(bookRequest30);
        int int38 = bookRequest7.compareTo(bookRequest18);
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", 0);
        java.lang.String str43 = bookRequest42.getBookTitle();
        int int44 = bookRequest42.getPriority();
        java.lang.String str45 = bookRequest42.getRequester();
        java.lang.String str46 = bookRequest42.getBookTitle();
        java.lang.String str47 = bookRequest42.getBookTitle();
        request.BookRequest bookRequest51 = new request.BookRequest("", "hi!", 97);
        java.lang.String str52 = bookRequest51.getRequester();
        request.BookRequest bookRequest56 = new request.BookRequest("", "", (int) ' ');
        int int57 = bookRequest51.compareTo(bookRequest56);
        java.lang.String str58 = bookRequest56.getRequester();
        java.lang.String str59 = bookRequest56.getRequester();
        int int60 = bookRequest42.compareTo(bookRequest56);
        java.lang.String str61 = bookRequest56.getBookTitle();
        int int62 = bookRequest18.compareTo(bookRequest56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest30 and bookRequest51", (bookRequest30.compareTo(bookRequest51) == 0) == bookRequest30.equals(bookRequest51));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 10);
        int int15 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str16 = bookRequest14.getBookTitle();
        java.lang.String str17 = bookRequest14.getRequester();
        java.lang.String str18 = bookRequest14.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) '#');
        int int29 = bookRequest28.getPriority();
        java.lang.String str30 = bookRequest28.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) ' ');
        int int35 = bookRequest28.compareTo(bookRequest34);
        java.lang.String str36 = bookRequest28.getRequester();
        int int37 = bookRequest22.compareTo(bookRequest28);
        java.lang.String str38 = bookRequest28.getBookTitle();
        java.lang.String str39 = bookRequest28.getRequester();
        int int40 = bookRequest14.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest22", (bookRequest7.compareTo(bookRequest22) == 0) == bookRequest7.equals(bookRequest22));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
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
        java.lang.String str27 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int32 = bookRequest24.compareTo(bookRequest31);
        int int33 = bookRequest24.getPriority();
        int int34 = bookRequest11.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest24", (bookRequest11.compareTo(bookRequest24) == 0) == bookRequest11.equals(bookRequest24));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 97);
        java.lang.String str12 = bookRequest11.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) ' ');
        int int17 = bookRequest11.compareTo(bookRequest16);
        int int18 = bookRequest7.compareTo(bookRequest16);
        int int19 = bookRequest3.compareTo(bookRequest16);
        int int20 = bookRequest3.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 0);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        int int27 = bookRequest24.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", 1);
        java.lang.String str32 = bookRequest31.getBookTitle();
        java.lang.String str33 = bookRequest31.getBookTitle();
        java.lang.String str34 = bookRequest31.getRequester();
        int int35 = bookRequest24.compareTo(bookRequest31);
        int int36 = bookRequest24.getPriority();
        int int37 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
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
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest28.compareTo(bookRequest32);
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int38 = bookRequest28.compareTo(bookRequest37);
        int int39 = bookRequest28.getPriority();
        java.lang.String str40 = bookRequest28.getRequester();
        int int41 = bookRequest19.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest32", (bookRequest3.compareTo(bookRequest32) == 0) == bookRequest3.equals(bookRequest32));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest7", (bookRequest3.compareTo(bookRequest7) == 0) == bookRequest3.equals(bookRequest7));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 100);
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest11.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getBookTitle();
        int int21 = bookRequest18.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        int int32 = bookRequest25.compareTo(bookRequest29);
        java.lang.String str33 = bookRequest29.getBookTitle();
        int int34 = bookRequest18.compareTo(bookRequest29);
        java.lang.String str35 = bookRequest18.getBookTitle();
        int int36 = bookRequest11.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getBookTitle();
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", 0);
        int int20 = bookRequest15.compareTo(bookRequest19);
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 1);
        java.lang.String str25 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        java.lang.String str33 = bookRequest29.getRequester();
        int int34 = bookRequest29.getPriority();
        int int35 = bookRequest24.compareTo(bookRequest29);
        int int36 = bookRequest19.compareTo(bookRequest29);
        java.lang.String str37 = bookRequest19.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("", "", (int) (byte) 100);
        int int42 = bookRequest41.getPriority();
        java.lang.String str43 = bookRequest41.getBookTitle();
        int int44 = bookRequest19.compareTo(bookRequest41);
        java.lang.String str45 = bookRequest41.getBookTitle();
        int int46 = bookRequest3.compareTo(bookRequest41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
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
        java.lang.String str19 = bookRequest13.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getRequester();
        int int27 = bookRequest23.getPriority();
        java.lang.String str28 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int33 = bookRequest32.getPriority();
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) (byte) 10);
        int int38 = bookRequest37.getPriority();
        int int39 = bookRequest32.compareTo(bookRequest37);
        int int40 = bookRequest32.getPriority();
        int int41 = bookRequest23.compareTo(bookRequest32);
        int int42 = bookRequest13.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest37", (bookRequest3.compareTo(bookRequest37) == 0) == bookRequest3.equals(bookRequest37));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.String str15 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int20 = bookRequest19.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str29 = bookRequest28.getBookTitle();
        java.lang.String str30 = bookRequest28.getRequester();
        int int31 = bookRequest28.getPriority();
        int int32 = bookRequest24.compareTo(bookRequest28);
        int int33 = bookRequest19.compareTo(bookRequest28);
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str38 = bookRequest37.getRequester();
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest46 = new request.BookRequest("", "", (int) (short) 0);
        int int47 = bookRequest42.compareTo(bookRequest46);
        int int48 = bookRequest37.compareTo(bookRequest46);
        java.lang.String str49 = bookRequest37.getBookTitle();
        int int50 = bookRequest19.compareTo(bookRequest37);
        int int51 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest46", (bookRequest3.compareTo(bookRequest46) == 0) == bookRequest3.equals(bookRequest46));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest31 = new request.BookRequest("", "", 1);
        java.lang.String str32 = bookRequest31.getBookTitle();
        java.lang.String str33 = bookRequest31.getBookTitle();
        java.lang.String str34 = bookRequest31.getRequester();
        int int35 = bookRequest27.compareTo(bookRequest31);
        java.lang.String str36 = bookRequest31.getRequester();
        java.lang.String str37 = bookRequest31.getBookTitle();
        int int38 = bookRequest31.getPriority();
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) 'a');
        int int43 = bookRequest42.getPriority();
        java.lang.String str44 = bookRequest42.getRequester();
        int int45 = bookRequest31.compareTo(bookRequest42);
        java.lang.String str46 = bookRequest31.getBookTitle();
        java.lang.String str47 = bookRequest31.getRequester();
        int int48 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest42", (bookRequest7.compareTo(bookRequest42) == 0) == bookRequest7.equals(bookRequest42));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
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
        request.BookRequest bookRequest43 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest47 = new request.BookRequest("hi!", "", (int) 'a');
        int int48 = bookRequest47.getPriority();
        int int49 = bookRequest47.getPriority();
        java.lang.String str50 = bookRequest47.getBookTitle();
        java.lang.String str51 = bookRequest47.getRequester();
        java.lang.String str52 = bookRequest47.getBookTitle();
        int int53 = bookRequest47.getPriority();
        java.lang.String str54 = bookRequest47.getBookTitle();
        int int55 = bookRequest43.compareTo(bookRequest47);
        java.lang.String str56 = bookRequest43.getBookTitle();
        java.lang.String str57 = bookRequest43.getRequester();
        java.lang.String str58 = bookRequest43.getBookTitle();
        int int59 = bookRequest43.getPriority();
        int int60 = bookRequest18.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest31 and bookRequest47", (bookRequest31.compareTo(bookRequest47) == 0) == bookRequest31.equals(bookRequest47));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getBookTitle();
        java.lang.String str13 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", 0);
        java.lang.String str18 = bookRequest17.getBookTitle();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (byte) 10);
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        int int28 = bookRequest17.compareTo(bookRequest25);
        java.lang.String str29 = bookRequest25.getBookTitle();
        int int30 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 32);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str9 = bookRequest8.getBookTitle();
        java.lang.String str10 = bookRequest8.getBookTitle();
        java.lang.String str11 = bookRequest8.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str29 = bookRequest28.getRequester();
        java.lang.String str30 = bookRequest28.getBookTitle();
        int int31 = bookRequest24.compareTo(bookRequest28);
        java.lang.String str32 = bookRequest24.getRequester();
        java.lang.String str33 = bookRequest24.getRequester();
        java.lang.String str34 = bookRequest24.getBookTitle();
        int int35 = bookRequest18.compareTo(bookRequest24);
        java.lang.String str36 = bookRequest18.getRequester();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", 0);
        java.lang.String str41 = bookRequest40.getBookTitle();
        int int42 = bookRequest40.getPriority();
        java.lang.String str43 = bookRequest40.getBookTitle();
        java.lang.String str44 = bookRequest40.getRequester();
        int int45 = bookRequest18.compareTo(bookRequest40);
        request.BookRequest bookRequest49 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str50 = bookRequest49.getRequester();
        int int51 = bookRequest18.compareTo(bookRequest49);
        int int52 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest49", (bookRequest3.compareTo(bookRequest49) == 0) == bookRequest3.equals(bookRequest49));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getRequester();
        java.lang.String str28 = bookRequest25.getRequester();
        java.lang.String str29 = bookRequest25.getRequester();
        int int30 = bookRequest21.compareTo(bookRequest25);
        int int31 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 52);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str35 = bookRequest34.getBookTitle();
        java.lang.String str36 = bookRequest34.getRequester();
        int int37 = bookRequest34.getPriority();
        int int38 = bookRequest30.compareTo(bookRequest34);
        int int39 = bookRequest30.getPriority();
        int int40 = bookRequest24.compareTo(bookRequest30);
        java.lang.String str41 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "", (int) 'a');
        int int46 = bookRequest45.getPriority();
        java.lang.String str47 = bookRequest45.getRequester();
        int int48 = bookRequest45.getPriority();
        int int49 = bookRequest45.getPriority();
        java.lang.String str50 = bookRequest45.getBookTitle();
        int int51 = bookRequest45.getPriority();
        java.lang.String str52 = bookRequest45.getBookTitle();
        int int53 = bookRequest45.getPriority();
        java.lang.String str54 = bookRequest45.getRequester();
        request.BookRequest bookRequest58 = new request.BookRequest("", "", 1);
        java.lang.String str59 = bookRequest58.getRequester();
        int int60 = bookRequest45.compareTo(bookRequest58);
        java.lang.String str61 = bookRequest45.getBookTitle();
        int int62 = bookRequest45.getPriority();
        int int63 = bookRequest24.compareTo(bookRequest45);
        int int64 = bookRequest9.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest45", (bookRequest3.compareTo(bookRequest45) == 0) == bookRequest3.equals(bookRequest45));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
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
        int int21 = bookRequest19.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getRequester();
        java.lang.String str28 = bookRequest25.getRequester();
        java.lang.String str29 = bookRequest25.getBookTitle();
        java.lang.String str30 = bookRequest25.getBookTitle();
        int int31 = bookRequest25.getPriority();
        int int32 = bookRequest19.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest25", (bookRequest8.compareTo(bookRequest25) == 0) == bookRequest8.equals(bookRequest25));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", 97);
        java.lang.String str30 = bookRequest29.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) ' ');
        int int35 = bookRequest29.compareTo(bookRequest34);
        int int36 = bookRequest34.getPriority();
        int int37 = bookRequest34.getPriority();
        int int38 = bookRequest34.getPriority();
        java.lang.String str39 = bookRequest34.getBookTitle();
        int int40 = bookRequest23.compareTo(bookRequest34);
        java.lang.String str41 = bookRequest23.getBookTitle();
        int int42 = bookRequest13.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest29", (bookRequest7.compareTo(bookRequest29) == 0) == bookRequest7.equals(bookRequest29));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest9.compareTo(bookRequest13);
        int int17 = bookRequest13.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest13);
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 1);
        java.lang.String str23 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str28 = bookRequest27.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) (short) 0);
        int int37 = bookRequest32.compareTo(bookRequest36);
        int int38 = bookRequest27.compareTo(bookRequest36);
        java.lang.String str39 = bookRequest36.getBookTitle();
        java.lang.String str40 = bookRequest36.getBookTitle();
        java.lang.String str41 = bookRequest36.getBookTitle();
        java.lang.String str42 = bookRequest36.getRequester();
        int int43 = bookRequest36.getPriority();
        java.lang.String str44 = bookRequest36.getRequester();
        int int45 = bookRequest22.compareTo(bookRequest36);
        int int46 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest36", (bookRequest9.compareTo(bookRequest36) == 0) == bookRequest9.equals(bookRequest36));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
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
        int int20 = bookRequest18.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getBookTitle();
        int int28 = bookRequest24.getPriority();
        int int29 = bookRequest24.getPriority();
        int int30 = bookRequest18.compareTo(bookRequest24);
        java.lang.String str31 = bookRequest24.getBookTitle();
        int int32 = bookRequest3.compareTo(bookRequest24);
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) 'a');
        int int37 = bookRequest36.getPriority();
        java.lang.String str38 = bookRequest36.getRequester();
        java.lang.String str39 = bookRequest36.getRequester();
        java.lang.String str40 = bookRequest36.getRequester();
        request.BookRequest bookRequest44 = new request.BookRequest("", "", 35);
        int int45 = bookRequest36.compareTo(bookRequest44);
        java.lang.String str46 = bookRequest44.getBookTitle();
        request.BookRequest bookRequest50 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str51 = bookRequest50.getBookTitle();
        java.lang.String str52 = bookRequest50.getRequester();
        int int53 = bookRequest44.compareTo(bookRequest50);
        int int54 = bookRequest50.getPriority();
        java.lang.String str55 = bookRequest50.getRequester();
        int int56 = bookRequest3.compareTo(bookRequest50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest44", (bookRequest3.compareTo(bookRequest44) == 0) == bookRequest3.equals(bookRequest44));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
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
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str38 = bookRequest37.getRequester();
        int int39 = bookRequest37.getPriority();
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) 'a');
        int int44 = bookRequest43.getPriority();
        int int45 = bookRequest43.getPriority();
        java.lang.String str46 = bookRequest43.getBookTitle();
        int int47 = bookRequest43.getPriority();
        int int48 = bookRequest43.getPriority();
        int int49 = bookRequest37.compareTo(bookRequest43);
        request.BookRequest bookRequest53 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int54 = bookRequest43.compareTo(bookRequest53);
        java.lang.String str55 = bookRequest43.getRequester();
        int int56 = bookRequest43.getPriority();
        java.lang.String str57 = bookRequest43.getBookTitle();
        int int58 = bookRequest26.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest18 and bookRequest43", (bookRequest18.compareTo(bookRequest43) == 0) == bookRequest18.equals(bookRequest43));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", 32);
        java.lang.String str29 = bookRequest28.getRequester();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        int int36 = bookRequest35.getPriority();
        int int37 = bookRequest35.getPriority();
        java.lang.String str38 = bookRequest35.getBookTitle();
        int int39 = bookRequest35.getPriority();
        int int40 = bookRequest35.getPriority();
        java.lang.String str41 = bookRequest35.getRequester();
        int int42 = bookRequest35.getPriority();
        java.lang.String str43 = bookRequest35.getBookTitle();
        int int44 = bookRequest28.compareTo(bookRequest35);
        int int45 = bookRequest28.getPriority();
        int int46 = bookRequest14.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest35", (bookRequest14.compareTo(bookRequest35) == 0) == bookRequest14.equals(bookRequest35));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
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
        int int50 = bookRequest37.getPriority();
        java.lang.String str51 = bookRequest37.getBookTitle();
        java.lang.String str52 = bookRequest37.getBookTitle();
        int int53 = bookRequest17.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest17 and bookRequest28", (bookRequest17.compareTo(bookRequest28) == 0) == bookRequest17.equals(bookRequest28));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "", 1);
        java.lang.String str26 = bookRequest25.getBookTitle();
        java.lang.String str27 = bookRequest25.getBookTitle();
        java.lang.String str28 = bookRequest25.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str33 = bookRequest32.getRequester();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getRequester();
        int int37 = bookRequest32.getPriority();
        java.lang.String str38 = bookRequest32.getBookTitle();
        int int39 = bookRequest32.getPriority();
        int int40 = bookRequest25.compareTo(bookRequest32);
        java.lang.String str41 = bookRequest32.getBookTitle();
        java.lang.String str42 = bookRequest32.getRequester();
        java.lang.String str43 = bookRequest32.getRequester();
        int int44 = bookRequest17.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest32", (bookRequest12.compareTo(bookRequest32) == 0) == bookRequest12.equals(bookRequest32));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
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
        int int24 = bookRequest3.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str29 = bookRequest28.getRequester();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        java.lang.String str32 = bookRequest28.getRequester();
        int int33 = bookRequest28.getPriority();
        java.lang.String str34 = bookRequest28.getBookTitle();
        int int35 = bookRequest28.getPriority();
        int int36 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest28", (bookRequest12.compareTo(bookRequest28) == 0) == bookRequest12.equals(bookRequest28));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
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
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", 0);
        java.lang.String str37 = bookRequest36.getBookTitle();
        int int38 = bookRequest36.getPriority();
        java.lang.String str39 = bookRequest36.getRequester();
        int int40 = bookRequest36.getPriority();
        request.BookRequest bookRequest44 = new request.BookRequest("", "hi!", 97);
        int int45 = bookRequest44.getPriority();
        java.lang.String str46 = bookRequest44.getBookTitle();
        int int47 = bookRequest36.compareTo(bookRequest44);
        int int48 = bookRequest23.compareTo(bookRequest44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest44", (bookRequest11.compareTo(bookRequest44) == 0) == bookRequest11.equals(bookRequest44));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "hi!", (int) '4');
        int int10 = bookRequest9.getPriority();
        java.lang.String str11 = bookRequest9.getRequester();
        int int12 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str13 = bookRequest3.getBookTitle();
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getBookTitle();
        int int25 = bookRequest18.compareTo(bookRequest22);
        java.lang.String str26 = bookRequest18.getRequester();
        java.lang.String str27 = bookRequest18.getRequester();
        java.lang.String str28 = bookRequest18.getBookTitle();
        java.lang.String str29 = bookRequest18.getRequester();
        int int30 = bookRequest18.getPriority();
        int int31 = bookRequest18.getPriority();
        java.lang.String str32 = bookRequest18.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", 0);
        java.lang.String str37 = bookRequest36.getBookTitle();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) 'a');
        int int42 = bookRequest41.getPriority();
        int int43 = bookRequest41.getPriority();
        java.lang.String str44 = bookRequest41.getBookTitle();
        java.lang.String str45 = bookRequest41.getBookTitle();
        int int46 = bookRequest36.compareTo(bookRequest41);
        java.lang.String str47 = bookRequest36.getBookTitle();
        java.lang.String str48 = bookRequest36.getBookTitle();
        int int49 = bookRequest18.compareTo(bookRequest36);
        java.lang.String str50 = bookRequest36.getRequester();
        int int51 = bookRequest3.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest36", (bookRequest3.compareTo(bookRequest36) == 0) == bookRequest3.equals(bookRequest36));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
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
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        java.lang.String str30 = bookRequest28.getRequester();
        java.lang.String str31 = bookRequest28.getBookTitle();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int36 = bookRequest28.compareTo(bookRequest35);
        int int37 = bookRequest28.getPriority();
        java.lang.String str38 = bookRequest28.getRequester();
        int int39 = bookRequest24.compareTo(bookRequest28);
        int int40 = bookRequest24.getPriority();
        int int41 = bookRequest12.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest28", (bookRequest8.compareTo(bookRequest28) == 0) == bookRequest8.equals(bookRequest28));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str14 = bookRequest13.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 0);
        int int23 = bookRequest18.compareTo(bookRequest22);
        int int24 = bookRequest13.compareTo(bookRequest22);
        java.lang.String str25 = bookRequest22.getBookTitle();
        java.lang.String str26 = bookRequest22.getBookTitle();
        java.lang.String str27 = bookRequest22.getBookTitle();
        java.lang.String str28 = bookRequest22.getRequester();
        java.lang.String str29 = bookRequest22.getBookTitle();
        java.lang.String str30 = bookRequest22.getRequester();
        java.lang.String str31 = bookRequest22.getBookTitle();
        int int32 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) '#');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) ' ');
        int int33 = bookRequest26.compareTo(bookRequest32);
        java.lang.String str34 = bookRequest26.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) 'a');
        int int43 = bookRequest42.getPriority();
        int int44 = bookRequest42.getPriority();
        java.lang.String str45 = bookRequest42.getBookTitle();
        java.lang.String str46 = bookRequest42.getRequester();
        java.lang.String str47 = bookRequest42.getBookTitle();
        int int48 = bookRequest38.compareTo(bookRequest42);
        java.lang.String str49 = bookRequest38.getRequester();
        int int50 = bookRequest38.getPriority();
        int int51 = bookRequest26.compareTo(bookRequest38);
        int int52 = bookRequest12.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest32", (bookRequest3.compareTo(bookRequest32) == 0) == bookRequest3.equals(bookRequest32));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "hi!", 0);
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        int int18 = bookRequest15.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getBookTitle();
        int int25 = bookRequest22.getPriority();
        java.lang.String str26 = bookRequest22.getBookTitle();
        java.lang.String str27 = bookRequest22.getRequester();
        int int28 = bookRequest15.compareTo(bookRequest22);
        int int29 = bookRequest15.getPriority();
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str34 = bookRequest33.getBookTitle();
        java.lang.String str35 = bookRequest33.getBookTitle();
        java.lang.String str36 = bookRequest33.getRequester();
        int int37 = bookRequest33.getPriority();
        int int38 = bookRequest15.compareTo(bookRequest33);
        int int39 = bookRequest9.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest33", (bookRequest3.compareTo(bookRequest33) == 0) == bookRequest3.equals(bookRequest33));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
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
        request.BookRequest bookRequest39 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str44 = bookRequest43.getRequester();
        java.lang.String str45 = bookRequest43.getBookTitle();
        int int46 = bookRequest39.compareTo(bookRequest43);
        java.lang.String str47 = bookRequest39.getRequester();
        request.BookRequest bookRequest51 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str52 = bookRequest51.getBookTitle();
        request.BookRequest bookRequest56 = new request.BookRequest("hi!", "", (int) 'a');
        int int57 = bookRequest56.getPriority();
        java.lang.String str58 = bookRequest56.getRequester();
        int int59 = bookRequest56.getPriority();
        java.lang.String str60 = bookRequest56.getBookTitle();
        java.lang.String str61 = bookRequest56.getRequester();
        java.lang.String str62 = bookRequest56.getRequester();
        int int63 = bookRequest51.compareTo(bookRequest56);
        int int64 = bookRequest56.getPriority();
        int int65 = bookRequest39.compareTo(bookRequest56);
        java.lang.String str66 = bookRequest56.getBookTitle();
        int int67 = bookRequest23.compareTo(bookRequest56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest56", (bookRequest8.compareTo(bookRequest56) == 0) == bookRequest8.equals(bookRequest56));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest10.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str17 = bookRequest16.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (short) 0);
        int int26 = bookRequest21.compareTo(bookRequest25);
        int int27 = bookRequest16.compareTo(bookRequest25);
        java.lang.String str28 = bookRequest16.getBookTitle();
        int int29 = bookRequest10.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
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
        java.lang.String str23 = bookRequest18.getRequester();
        int int24 = bookRequest18.getPriority();
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
        int int43 = bookRequest28.getPriority();
        int int44 = bookRequest18.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest28", (bookRequest14.compareTo(bookRequest28) == 0) == bookRequest14.equals(bookRequest28));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) '#');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) ' ');
        int int19 = bookRequest12.compareTo(bookRequest18);
        java.lang.String str20 = bookRequest18.getBookTitle();
        java.lang.String str21 = bookRequest18.getBookTitle();
        java.lang.String str22 = bookRequest18.getBookTitle();
        int int23 = bookRequest3.compareTo(bookRequest18);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getRequester();
        int int31 = bookRequest27.getPriority();
        java.lang.String str32 = bookRequest27.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) '#');
        int int37 = bookRequest36.getPriority();
        java.lang.String str38 = bookRequest36.getBookTitle();
        request.BookRequest bookRequest42 = new request.BookRequest("", "", (int) ' ');
        int int43 = bookRequest36.compareTo(bookRequest42);
        int int44 = bookRequest27.compareTo(bookRequest36);
        java.lang.String str45 = bookRequest36.getRequester();
        java.lang.String str46 = bookRequest36.getRequester();
        int int47 = bookRequest36.getPriority();
        java.lang.String str48 = bookRequest36.getBookTitle();
        int int49 = bookRequest3.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest36", (bookRequest12.compareTo(bookRequest36) == 0) == bookRequest12.equals(bookRequest36));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        int int11 = bookRequest10.getPriority();
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.String str13 = bookRequest10.getRequester();
        java.lang.String str14 = bookRequest10.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", 35);
        int int19 = bookRequest10.compareTo(bookRequest18);
        int int20 = bookRequest18.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 35);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
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
        java.lang.String str29 = bookRequest20.getRequester();
        java.lang.String str30 = bookRequest20.getRequester();
        int int31 = bookRequest20.getPriority();
        int int32 = bookRequest20.getPriority();
        java.lang.String str33 = bookRequest20.getRequester();
        int int34 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str21 = bookRequest20.getBookTitle();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getRequester();
        java.lang.String str24 = bookRequest20.getRequester();
        java.lang.String str25 = bookRequest20.getRequester();
        int int26 = bookRequest20.getPriority();
        int int27 = bookRequest12.compareTo(bookRequest20);
        java.lang.String str28 = bookRequest20.getRequester();
        java.lang.String str29 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str34 = bookRequest33.getBookTitle();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str39 = bookRequest38.getRequester();
        java.lang.String str40 = bookRequest38.getBookTitle();
        int int41 = bookRequest38.getPriority();
        int int42 = bookRequest33.compareTo(bookRequest38);
        java.lang.String str43 = bookRequest33.getRequester();
        request.BookRequest bookRequest47 = new request.BookRequest("hi!", "", (int) 'a');
        int int48 = bookRequest47.getPriority();
        int int49 = bookRequest47.getPriority();
        java.lang.String str50 = bookRequest47.getRequester();
        int int51 = bookRequest47.getPriority();
        java.lang.String str52 = bookRequest47.getRequester();
        request.BookRequest bookRequest56 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str57 = bookRequest56.getBookTitle();
        int int58 = bookRequest47.compareTo(bookRequest56);
        java.lang.String str59 = bookRequest56.getBookTitle();
        int int60 = bookRequest33.compareTo(bookRequest56);
        int int61 = bookRequest56.getPriority();
        java.lang.String str62 = bookRequest56.getRequester();
        int int63 = bookRequest20.compareTo(bookRequest56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest47", (bookRequest3.compareTo(bookRequest47) == 0) == bookRequest3.equals(bookRequest47));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getBookTitle();
        java.lang.String str26 = bookRequest22.getRequester();
        java.lang.String str27 = bookRequest22.getBookTitle();
        int int28 = bookRequest22.getPriority();
        java.lang.String str29 = bookRequest22.getBookTitle();
        int int30 = bookRequest18.compareTo(bookRequest22);
        java.lang.String str31 = bookRequest18.getBookTitle();
        int int32 = bookRequest18.getPriority();
        java.lang.String str33 = bookRequest18.getBookTitle();
        java.lang.String str34 = bookRequest18.getBookTitle();
        int int35 = bookRequest18.getPriority();
        int int36 = bookRequest8.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest22", (bookRequest8.compareTo(bookRequest22) == 0) == bookRequest8.equals(bookRequest22));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
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
        request.BookRequest bookRequest38 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest42 = new request.BookRequest("", "hi!", 97);
        int int43 = bookRequest42.getPriority();
        java.lang.String str44 = bookRequest42.getBookTitle();
        int int45 = bookRequest38.compareTo(bookRequest42);
        int int46 = bookRequest42.getPriority();
        int int47 = bookRequest42.getPriority();
        java.lang.String str48 = bookRequest42.getRequester();
        java.lang.String str49 = bookRequest42.getRequester();
        java.lang.String str50 = bookRequest42.getRequester();
        int int51 = bookRequest3.compareTo(bookRequest42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest42", (bookRequest16.compareTo(bookRequest42) == 0) == bookRequest16.equals(bookRequest42));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) (short) 10);
        int int20 = bookRequest19.getPriority();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        java.lang.String str27 = bookRequest24.getRequester();
        java.lang.String str28 = bookRequest24.getBookTitle();
        java.lang.String str29 = bookRequest24.getBookTitle();
        java.lang.String str30 = bookRequest24.getRequester();
        int int31 = bookRequest19.compareTo(bookRequest24);
        int int32 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest24", (bookRequest8.compareTo(bookRequest24) == 0) == bookRequest8.equals(bookRequest24));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
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
        java.lang.String str29 = bookRequest26.getRequester();
        java.lang.String str30 = bookRequest26.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("", "", 35);
        int int35 = bookRequest26.compareTo(bookRequest34);
        java.lang.String str36 = bookRequest34.getRequester();
        int int37 = bookRequest11.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest34", (bookRequest11.compareTo(bookRequest34) == 0) == bookRequest11.equals(bookRequest34));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str20 = bookRequest19.getRequester();
        java.lang.String str21 = bookRequest19.getBookTitle();
        int int22 = bookRequest19.getPriority();
        java.lang.String str23 = bookRequest19.getRequester();
        int int24 = bookRequest13.compareTo(bookRequest19);
        java.lang.String str25 = bookRequest13.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int30 = bookRequest13.compareTo(bookRequest29);
        int int31 = bookRequest13.getPriority();
        int int32 = bookRequest13.getPriority();
        int int33 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest19", (bookRequest7.compareTo(bookRequest19) == 0) == bookRequest7.equals(bookRequest19));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", 35);
        int int12 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getBookTitle();
        int int25 = bookRequest22.getPriority();
        java.lang.String str26 = bookRequest22.getRequester();
        int int27 = bookRequest16.compareTo(bookRequest22);
        java.lang.String str28 = bookRequest16.getRequester();
        java.lang.String str29 = bookRequest16.getBookTitle();
        java.lang.String str30 = bookRequest16.getRequester();
        java.lang.String str31 = bookRequest16.getRequester();
        java.lang.String str32 = bookRequest16.getRequester();
        java.lang.String str33 = bookRequest16.getBookTitle();
        java.lang.String str34 = bookRequest16.getRequester();
        int int35 = bookRequest11.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str16 = bookRequest15.getRequester();
        int int17 = bookRequest15.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        int int25 = bookRequest21.getPriority();
        int int26 = bookRequest21.getPriority();
        int int27 = bookRequest15.compareTo(bookRequest21);
        request.BookRequest bookRequest31 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int32 = bookRequest21.compareTo(bookRequest31);
        java.lang.String str33 = bookRequest31.getBookTitle();
        java.lang.String str34 = bookRequest31.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("", "hi!", (int) (byte) 0);
        java.lang.String str39 = bookRequest38.getBookTitle();
        int int40 = bookRequest38.getPriority();
        int int41 = bookRequest31.compareTo(bookRequest38);
        int int42 = bookRequest3.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        int int11 = bookRequest3.getPriority();
        request.BookRequest bookRequest15 = new request.BookRequest("", "", (int) (short) -1);
        java.lang.String str16 = bookRequest15.getRequester();
        int int17 = bookRequest3.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
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
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int35 = bookRequest34.getPriority();
        int int36 = bookRequest34.getPriority();
        int int37 = bookRequest30.compareTo(bookRequest34);
        java.lang.String str38 = bookRequest34.getBookTitle();
        java.lang.String str39 = bookRequest34.getRequester();
        int int40 = bookRequest3.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest30", (bookRequest8.compareTo(bookRequest30) == 0) == bookRequest8.equals(bookRequest30));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
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
        java.lang.String str19 = bookRequest3.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getRequester();
        java.lang.String str27 = bookRequest23.getBookTitle();
        java.lang.String str28 = bookRequest23.getBookTitle();
        java.lang.String str29 = bookRequest23.getBookTitle();
        java.lang.String str30 = bookRequest23.getBookTitle();
        int int31 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        java.lang.String str27 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int32 = bookRequest24.compareTo(bookRequest31);
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getRequester();
        int int35 = bookRequest12.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest24", (bookRequest8.compareTo(bookRequest24) == 0) == bookRequest8.equals(bookRequest24));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 0);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        int int27 = bookRequest24.getPriority();
        java.lang.String str28 = bookRequest24.getBookTitle();
        java.lang.String str29 = bookRequest24.getBookTitle();
        java.lang.String str30 = bookRequest24.getRequester();
        java.lang.String str31 = bookRequest24.getRequester();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str36 = bookRequest35.getRequester();
        int int37 = bookRequest35.getPriority();
        int int38 = bookRequest35.getPriority();
        request.BookRequest bookRequest42 = new request.BookRequest("", "hi!", (int) '#');
        int int43 = bookRequest35.compareTo(bookRequest42);
        int int44 = bookRequest24.compareTo(bookRequest42);
        int int45 = bookRequest15.compareTo(bookRequest42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest35", (bookRequest9.compareTo(bookRequest35) == 0) == bookRequest9.equals(bookRequest35));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (byte) 100);
        int int14 = bookRequest13.getPriority();
        int int15 = bookRequest13.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getRequester();
        int int22 = bookRequest19.getPriority();
        java.lang.String str23 = bookRequest19.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        int int30 = bookRequest19.compareTo(bookRequest27);
        int int31 = bookRequest27.getPriority();
        int int32 = bookRequest27.getPriority();
        int int33 = bookRequest27.getPriority();
        java.lang.String str34 = bookRequest27.getRequester();
        int int35 = bookRequest13.compareTo(bookRequest27);
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str40 = bookRequest39.getRequester();
        int int41 = bookRequest39.getPriority();
        int int42 = bookRequest39.getPriority();
        int int43 = bookRequest27.compareTo(bookRequest39);
        java.lang.String str44 = bookRequest27.getRequester();
        int int45 = bookRequest7.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getRequester();
        java.lang.String str31 = bookRequest26.getBookTitle();
        int int32 = bookRequest26.getPriority();
        java.lang.String str33 = bookRequest26.getBookTitle();
        int int34 = bookRequest19.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest26", (bookRequest9.compareTo(bookRequest26) == 0) == bookRequest9.equals(bookRequest26));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 97);
        java.lang.String str12 = bookRequest11.getRequester();
        java.lang.String str13 = bookRequest11.getBookTitle();
        int int14 = bookRequest11.getPriority();
        java.lang.String str15 = bookRequest11.getRequester();
        java.lang.String str16 = bookRequest11.getRequester();
        int int17 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest11", (bookRequest3.compareTo(bookRequest11) == 0) == bookRequest3.equals(bookRequest11));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getBookTitle();
        java.lang.String str32 = bookRequest27.getBookTitle();
        int int33 = bookRequest20.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest27", (bookRequest7.compareTo(bookRequest27) == 0) == bookRequest7.equals(bookRequest27));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
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
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 52);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        java.lang.String str32 = bookRequest28.getBookTitle();
        int int33 = bookRequest28.getPriority();
        int int34 = bookRequest28.getPriority();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int39 = bookRequest28.compareTo(bookRequest38);
        java.lang.String str40 = bookRequest38.getRequester();
        int int41 = bookRequest38.getPriority();
        java.lang.String str42 = bookRequest38.getBookTitle();
        int int43 = bookRequest24.compareTo(bookRequest38);
        java.lang.String str44 = bookRequest24.getRequester();
        int int45 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
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
        java.lang.String str22 = bookRequest15.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str31 = bookRequest30.getRequester();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        java.lang.String str34 = bookRequest30.getRequester();
        int int35 = bookRequest30.getPriority();
        java.lang.String str36 = bookRequest30.getBookTitle();
        int int37 = bookRequest30.getPriority();
        int int38 = bookRequest30.getPriority();
        int int39 = bookRequest26.compareTo(bookRequest30);
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str44 = bookRequest43.getRequester();
        java.lang.String str45 = bookRequest43.getBookTitle();
        java.lang.String str46 = bookRequest43.getBookTitle();
        int int47 = bookRequest26.compareTo(bookRequest43);
        int int48 = bookRequest43.getPriority();
        int int49 = bookRequest15.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest30", (bookRequest9.compareTo(bookRequest30) == 0) == bookRequest9.equals(bookRequest30));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
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
        request.BookRequest bookRequest53 = new request.BookRequest("hi!", "", 0);
        java.lang.String str54 = bookRequest53.getBookTitle();
        request.BookRequest bookRequest58 = new request.BookRequest("hi!", "", (int) 'a');
        int int59 = bookRequest58.getPriority();
        int int60 = bookRequest58.getPriority();
        java.lang.String str61 = bookRequest58.getBookTitle();
        java.lang.String str62 = bookRequest58.getBookTitle();
        int int63 = bookRequest53.compareTo(bookRequest58);
        java.lang.String str64 = bookRequest53.getBookTitle();
        java.lang.String str65 = bookRequest53.getRequester();
        java.lang.String str66 = bookRequest53.getRequester();
        int int67 = bookRequest47.compareTo(bookRequest53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest28 and bookRequest58", (bookRequest28.compareTo(bookRequest58) == 0) == bookRequest28.equals(bookRequest58));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
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
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getBookTitle();
        int int31 = bookRequest26.getPriority();
        int int32 = bookRequest26.getPriority();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int37 = bookRequest26.compareTo(bookRequest36);
        java.lang.String str38 = bookRequest26.getRequester();
        int int39 = bookRequest26.getPriority();
        java.lang.String str40 = bookRequest26.getBookTitle();
        request.BookRequest bookRequest44 = new request.BookRequest("", "hi!", (int) '4');
        int int45 = bookRequest44.getPriority();
        java.lang.String str46 = bookRequest44.getRequester();
        java.lang.String str47 = bookRequest44.getRequester();
        java.lang.String str48 = bookRequest44.getRequester();
        int int49 = bookRequest26.compareTo(bookRequest44);
        int int50 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest26", (bookRequest15.compareTo(bookRequest26) == 0) == bookRequest15.equals(bookRequest26));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "hi!", 100);
        int int12 = bookRequest3.compareTo(bookRequest11);
        int int13 = bookRequest11.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", 97);
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getBookTitle();
        int int24 = bookRequest17.compareTo(bookRequest21);
        int int25 = bookRequest21.getPriority();
        int int26 = bookRequest21.getPriority();
        java.lang.String str27 = bookRequest21.getBookTitle();
        java.lang.String str28 = bookRequest21.getRequester();
        int int29 = bookRequest11.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest17", (bookRequest11.compareTo(bookRequest17) == 0) == bookRequest11.equals(bookRequest17));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str21 = bookRequest20.getBookTitle();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getRequester();
        java.lang.String str24 = bookRequest20.getRequester();
        java.lang.String str25 = bookRequest20.getRequester();
        int int26 = bookRequest20.getPriority();
        int int27 = bookRequest12.compareTo(bookRequest20);
        java.lang.String str28 = bookRequest12.getRequester();
        java.lang.String str29 = bookRequest12.getRequester();
        java.lang.String str30 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str35 = bookRequest34.getRequester();
        java.lang.String str36 = bookRequest34.getRequester();
        java.lang.String str37 = bookRequest34.getBookTitle();
        int int38 = bookRequest34.getPriority();
        java.lang.String str39 = bookRequest34.getBookTitle();
        int int40 = bookRequest34.getPriority();
        int int41 = bookRequest12.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest34", (bookRequest3.compareTo(bookRequest34) == 0) == bookRequest3.equals(bookRequest34));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
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
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "hi!", 52);
        int int23 = bookRequest18.compareTo(bookRequest22);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        int int30 = bookRequest27.getPriority();
        java.lang.String str31 = bookRequest27.getBookTitle();
        java.lang.String str32 = bookRequest27.getRequester();
        int int33 = bookRequest18.compareTo(bookRequest27);
        int int34 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest14.getPriority();
        java.lang.String str17 = bookRequest14.getBookTitle();
        java.lang.String str18 = bookRequest14.getRequester();
        int int19 = bookRequest14.getPriority();
        int int20 = bookRequest9.compareTo(bookRequest14);
        java.lang.String str21 = bookRequest14.getBookTitle();
        java.lang.String str22 = bookRequest14.getBookTitle();
        int int23 = bookRequest14.getPriority();
        int int24 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest9", (bookRequest3.compareTo(bookRequest9) == 0) == bookRequest3.equals(bookRequest9));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str25 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str30 = bookRequest29.getRequester();
        java.lang.String str31 = bookRequest29.getBookTitle();
        int int32 = bookRequest29.getPriority();
        int int33 = bookRequest24.compareTo(bookRequest29);
        java.lang.String str34 = bookRequest24.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        int int39 = bookRequest38.getPriority();
        int int40 = bookRequest38.getPriority();
        java.lang.String str41 = bookRequest38.getRequester();
        int int42 = bookRequest38.getPriority();
        java.lang.String str43 = bookRequest38.getRequester();
        request.BookRequest bookRequest47 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str48 = bookRequest47.getBookTitle();
        int int49 = bookRequest38.compareTo(bookRequest47);
        java.lang.String str50 = bookRequest47.getBookTitle();
        int int51 = bookRequest24.compareTo(bookRequest47);
        int int52 = bookRequest10.compareTo(bookRequest47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        java.lang.String str13 = bookRequest8.getBookTitle();
        int int14 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        java.lang.String str21 = bookRequest18.getRequester();
        java.lang.String str22 = bookRequest18.getBookTitle();
        java.lang.String str23 = bookRequest18.getBookTitle();
        java.lang.String str24 = bookRequest18.getRequester();
        java.lang.String str25 = bookRequest18.getRequester();
        java.lang.String str26 = bookRequest18.getRequester();
        int int27 = bookRequest8.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest18", (bookRequest8.compareTo(bookRequest18) == 0) == bookRequest8.equals(bookRequest18));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        int int31 = bookRequest27.getPriority();
        int int32 = bookRequest27.getPriority();
        request.BookRequest bookRequest36 = new request.BookRequest("", "hi!", 52);
        int int37 = bookRequest27.compareTo(bookRequest36);
        int int38 = bookRequest36.getPriority();
        int int39 = bookRequest23.compareTo(bookRequest36);
        java.lang.String str40 = bookRequest23.getBookTitle();
        int int41 = bookRequest23.getPriority();
        int int42 = bookRequest23.getPriority();
        request.BookRequest bookRequest46 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int47 = bookRequest46.getPriority();
        request.BookRequest bookRequest51 = new request.BookRequest("hi!", "", (int) (short) 100);
        java.lang.String str52 = bookRequest51.getBookTitle();
        int int53 = bookRequest46.compareTo(bookRequest51);
        int int54 = bookRequest23.compareTo(bookRequest51);
        int int55 = bookRequest14.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
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
        java.lang.String str39 = bookRequest16.getBookTitle();
        int int40 = bookRequest16.getPriority();
        java.lang.String str41 = bookRequest16.getRequester();
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "", (int) 'a');
        int int46 = bookRequest45.getPriority();
        int int47 = bookRequest45.getPriority();
        java.lang.String str48 = bookRequest45.getRequester();
        java.lang.String str49 = bookRequest45.getBookTitle();
        java.lang.String str50 = bookRequest45.getBookTitle();
        java.lang.String str51 = bookRequest45.getBookTitle();
        int int52 = bookRequest45.getPriority();
        request.BookRequest bookRequest56 = new request.BookRequest("", "hi!", 10);
        int int57 = bookRequest56.getPriority();
        java.lang.String str58 = bookRequest56.getBookTitle();
        int int59 = bookRequest45.compareTo(bookRequest56);
        java.lang.String str60 = bookRequest56.getBookTitle();
        java.lang.String str61 = bookRequest56.getBookTitle();
        java.lang.String str62 = bookRequest56.getBookTitle();
        int int63 = bookRequest16.compareTo(bookRequest56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest20 and bookRequest45", (bookRequest20.compareTo(bookRequest45) == 0) == bookRequest20.equals(bookRequest45));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
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
        int int16 = bookRequest3.getPriority();
        java.lang.String str17 = bookRequest3.getBookTitle();
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
        java.lang.String str35 = bookRequest21.getRequester();
        java.lang.String str36 = bookRequest21.getRequester();
        int int37 = bookRequest21.getPriority();
        int int38 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
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
        java.lang.String str24 = bookRequest17.getRequester();
        int int25 = bookRequest17.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", 97);
        java.lang.String str34 = bookRequest33.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) ' ');
        int int39 = bookRequest33.compareTo(bookRequest38);
        int int40 = bookRequest29.compareTo(bookRequest38);
        int int41 = bookRequest17.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest33", (bookRequest3.compareTo(bookRequest33) == 0) == bookRequest3.equals(bookRequest33));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
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
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str25 = bookRequest24.getBookTitle();
        java.lang.String str26 = bookRequest24.getRequester();
        int int27 = bookRequest24.getPriority();
        java.lang.String str28 = bookRequest24.getRequester();
        java.lang.String str29 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        int int34 = bookRequest33.getPriority();
        java.lang.String str35 = bookRequest33.getRequester();
        int int36 = bookRequest24.compareTo(bookRequest33);
        int int37 = bookRequest33.getPriority();
        int int38 = bookRequest3.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest33", (bookRequest3.compareTo(bookRequest33) == 0) == bookRequest3.equals(bookRequest33));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 0);
        int int4 = bookRequest3.getPriority();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", 1);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.getBookTitle();
        java.lang.String str15 = bookRequest12.getRequester();
        int int16 = bookRequest8.compareTo(bookRequest12);
        java.lang.String str17 = bookRequest12.getRequester();
        java.lang.String str18 = bookRequest12.getBookTitle();
        int int19 = bookRequest12.getPriority();
        java.lang.String str20 = bookRequest12.getRequester();
        int int21 = bookRequest12.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", 35);
        java.lang.String str26 = bookRequest25.getRequester();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str34 = bookRequest33.getBookTitle();
        java.lang.String str35 = bookRequest33.getRequester();
        int int36 = bookRequest33.getPriority();
        java.lang.String str37 = bookRequest33.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str42 = bookRequest41.getRequester();
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest50 = new request.BookRequest("", "", (int) (short) 0);
        int int51 = bookRequest46.compareTo(bookRequest50);
        int int52 = bookRequest41.compareTo(bookRequest50);
        int int53 = bookRequest41.getPriority();
        int int54 = bookRequest41.getPriority();
        java.lang.String str55 = bookRequest41.getRequester();
        int int56 = bookRequest33.compareTo(bookRequest41);
        java.lang.String str57 = bookRequest33.getRequester();
        int int58 = bookRequest25.compareTo(bookRequest33);
        int int59 = bookRequest25.getPriority();
        int int60 = bookRequest12.compareTo(bookRequest25);
        int int61 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest50", (bookRequest3.compareTo(bookRequest50) == 0) == bookRequest3.equals(bookRequest50));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 52);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str35 = bookRequest34.getBookTitle();
        java.lang.String str36 = bookRequest34.getRequester();
        int int37 = bookRequest34.getPriority();
        int int38 = bookRequest30.compareTo(bookRequest34);
        int int39 = bookRequest30.getPriority();
        int int40 = bookRequest24.compareTo(bookRequest30);
        java.lang.String str41 = bookRequest24.getBookTitle();
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "", (int) 'a');
        int int46 = bookRequest45.getPriority();
        java.lang.String str47 = bookRequest45.getRequester();
        int int48 = bookRequest45.getPriority();
        int int49 = bookRequest45.getPriority();
        java.lang.String str50 = bookRequest45.getBookTitle();
        int int51 = bookRequest45.getPriority();
        java.lang.String str52 = bookRequest45.getBookTitle();
        int int53 = bookRequest45.getPriority();
        java.lang.String str54 = bookRequest45.getRequester();
        request.BookRequest bookRequest58 = new request.BookRequest("", "", 1);
        java.lang.String str59 = bookRequest58.getRequester();
        int int60 = bookRequest45.compareTo(bookRequest58);
        java.lang.String str61 = bookRequest45.getBookTitle();
        int int62 = bookRequest45.getPriority();
        int int63 = bookRequest24.compareTo(bookRequest45);
        java.lang.String str64 = bookRequest45.getBookTitle();
        int int65 = bookRequest45.getPriority();
        int int66 = bookRequest3.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
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
        int int26 = bookRequest21.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (byte) 10);
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) (byte) 100);
        int int35 = bookRequest34.getPriority();
        int int36 = bookRequest34.getPriority();
        request.BookRequest bookRequest40 = new request.BookRequest("", "hi!", (int) (byte) 1);
        request.BookRequest bookRequest44 = new request.BookRequest("hi!", "", (int) 'a');
        int int45 = bookRequest44.getPriority();
        java.lang.String str46 = bookRequest44.getRequester();
        java.lang.String str47 = bookRequest44.getRequester();
        java.lang.String str48 = bookRequest44.getRequester();
        int int49 = bookRequest40.compareTo(bookRequest44);
        int int50 = bookRequest40.getPriority();
        int int51 = bookRequest34.compareTo(bookRequest40);
        java.lang.String str52 = bookRequest40.getRequester();
        java.lang.String str53 = bookRequest40.getBookTitle();
        int int54 = bookRequest30.compareTo(bookRequest40);
        int int55 = bookRequest21.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest44", (bookRequest8.compareTo(bookRequest44) == 0) == bookRequest8.equals(bookRequest44));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
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
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", 0);
        java.lang.String str34 = bookRequest33.getBookTitle();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        int int39 = bookRequest38.getPriority();
        int int40 = bookRequest38.getPriority();
        java.lang.String str41 = bookRequest38.getBookTitle();
        java.lang.String str42 = bookRequest38.getBookTitle();
        int int43 = bookRequest33.compareTo(bookRequest38);
        java.lang.String str44 = bookRequest33.getRequester();
        java.lang.String str45 = bookRequest33.getRequester();
        java.lang.String str46 = bookRequest33.getRequester();
        int int47 = bookRequest9.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest38", (bookRequest9.compareTo(bookRequest38) == 0) == bookRequest9.equals(bookRequest38));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
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
        java.lang.String str38 = bookRequest25.getBookTitle();
        java.lang.String str39 = bookRequest25.getRequester();
        int int40 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", 52);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        java.lang.String str33 = bookRequest29.getRequester();
        java.lang.String str34 = bookRequest29.getBookTitle();
        int int35 = bookRequest25.compareTo(bookRequest29);
        java.lang.String str36 = bookRequest25.getRequester();
        java.lang.String str37 = bookRequest25.getRequester();
        int int38 = bookRequest25.getPriority();
        int int39 = bookRequest19.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest29", (bookRequest9.compareTo(bookRequest29) == 0) == bookRequest9.equals(bookRequest29));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        int int14 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getBookTitle();
        int int21 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        int int11 = bookRequest8.getPriority();
        java.lang.String str12 = bookRequest8.getRequester();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest3.getRequester();
        java.lang.String str15 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest23 = new request.BookRequest("", "", 1);
        java.lang.String str24 = bookRequest23.getBookTitle();
        java.lang.String str25 = bookRequest23.getBookTitle();
        java.lang.String str26 = bookRequest23.getRequester();
        int int27 = bookRequest19.compareTo(bookRequest23);
        java.lang.String str28 = bookRequest23.getRequester();
        java.lang.String str29 = bookRequest23.getBookTitle();
        int int30 = bookRequest23.getPriority();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int35 = bookRequest34.getPriority();
        int int36 = bookRequest23.compareTo(bookRequest34);
        int int37 = bookRequest3.compareTo(bookRequest34);
        request.BookRequest bookRequest41 = new request.BookRequest("", "", 1);
        java.lang.String str42 = bookRequest41.getBookTitle();
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str47 = bookRequest46.getRequester();
        int int48 = bookRequest46.getPriority();
        java.lang.String str49 = bookRequest46.getBookTitle();
        java.lang.String str50 = bookRequest46.getRequester();
        int int51 = bookRequest46.getPriority();
        int int52 = bookRequest41.compareTo(bookRequest46);
        java.lang.String str53 = bookRequest41.getBookTitle();
        request.BookRequest bookRequest57 = new request.BookRequest("", "hi!", 52);
        int int58 = bookRequest41.compareTo(bookRequest57);
        java.lang.String str59 = bookRequest57.getRequester();
        java.lang.String str60 = bookRequest57.getRequester();
        int int61 = bookRequest57.getPriority();
        int int62 = bookRequest57.getPriority();
        int int63 = bookRequest34.compareTo(bookRequest57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest46", (bookRequest8.compareTo(bookRequest46) == 0) == bookRequest8.equals(bookRequest46));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
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
        java.lang.String str16 = bookRequest3.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) '4');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getBookTitle();
        java.lang.String str23 = bookRequest20.getBookTitle();
        int int24 = bookRequest20.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest28.compareTo(bookRequest32);
        int int34 = bookRequest32.getPriority();
        int int35 = bookRequest32.getPriority();
        int int36 = bookRequest20.compareTo(bookRequest32);
        int int37 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest32", (bookRequest3.compareTo(bookRequest32) == 0) == bookRequest3.equals(bookRequest32));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
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
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) 'a');
        int int44 = bookRequest43.getPriority();
        java.lang.String str45 = bookRequest43.getRequester();
        java.lang.String str46 = bookRequest43.getRequester();
        java.lang.String str47 = bookRequest43.getBookTitle();
        java.lang.String str48 = bookRequest43.getBookTitle();
        java.lang.String str49 = bookRequest43.getRequester();
        int int50 = bookRequest43.getPriority();
        java.lang.String str51 = bookRequest43.getBookTitle();
        java.lang.String str52 = bookRequest43.getBookTitle();
        int int53 = bookRequest43.getPriority();
        java.lang.String str54 = bookRequest43.getBookTitle();
        int int55 = bookRequest39.compareTo(bookRequest43);
        request.BookRequest bookRequest59 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest63 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str64 = bookRequest63.getRequester();
        java.lang.String str65 = bookRequest63.getBookTitle();
        int int66 = bookRequest59.compareTo(bookRequest63);
        java.lang.String str67 = bookRequest59.getRequester();
        java.lang.String str68 = bookRequest59.getRequester();
        java.lang.String str69 = bookRequest59.getBookTitle();
        java.lang.String str70 = bookRequest59.getRequester();
        int int71 = bookRequest59.getPriority();
        int int72 = bookRequest59.getPriority();
        java.lang.String str73 = bookRequest59.getRequester();
        int int74 = bookRequest43.compareTo(bookRequest59);
        java.lang.String str75 = bookRequest59.getRequester();
        int int76 = bookRequest8.compareTo(bookRequest59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest63", (bookRequest8.compareTo(bookRequest63) == 0) == bookRequest8.equals(bookRequest63));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", 52);
        int int12 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) (short) 100);
        int int17 = bookRequest11.compareTo(bookRequest16);
        java.lang.String str18 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", 0);
        java.lang.String str23 = bookRequest22.getBookTitle();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getBookTitle();
        java.lang.String str26 = bookRequest22.getRequester();
        java.lang.String str27 = bookRequest22.getBookTitle();
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
        int int46 = bookRequest22.compareTo(bookRequest31);
        request.BookRequest bookRequest50 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int51 = bookRequest50.getPriority();
        java.lang.String str52 = bookRequest50.getBookTitle();
        int int53 = bookRequest50.getPriority();
        java.lang.String str54 = bookRequest50.getBookTitle();
        int int55 = bookRequest22.compareTo(bookRequest50);
        int int56 = bookRequest11.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest35", (bookRequest3.compareTo(bookRequest35) == 0) == bookRequest3.equals(bookRequest35));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "hi!", 10);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getRequester();
        int int20 = bookRequest16.getPriority();
        java.lang.String str21 = bookRequest16.getBookTitle();
        int int22 = bookRequest16.getPriority();
        int int23 = bookRequest12.compareTo(bookRequest16);
        java.lang.String str24 = bookRequest12.getBookTitle();
        java.lang.String str25 = bookRequest12.getBookTitle();
        java.lang.String str26 = bookRequest12.getBookTitle();
        int int27 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
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
        java.lang.String str31 = bookRequest7.getRequester();
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str36 = bookRequest35.getRequester();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest44 = new request.BookRequest("", "", (int) (short) 0);
        int int45 = bookRequest40.compareTo(bookRequest44);
        int int46 = bookRequest35.compareTo(bookRequest44);
        java.lang.String str47 = bookRequest44.getBookTitle();
        int int48 = bookRequest44.getPriority();
        java.lang.String str49 = bookRequest44.getRequester();
        int int50 = bookRequest44.getPriority();
        request.BookRequest bookRequest54 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest58 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str59 = bookRequest58.getRequester();
        java.lang.String str60 = bookRequest58.getBookTitle();
        int int61 = bookRequest54.compareTo(bookRequest58);
        java.lang.String str62 = bookRequest58.getBookTitle();
        java.lang.String str63 = bookRequest58.getRequester();
        int int64 = bookRequest44.compareTo(bookRequest58);
        int int65 = bookRequest7.compareTo(bookRequest44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest35", (bookRequest7.compareTo(bookRequest35) == 0) == bookRequest7.equals(bookRequest35));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
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
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str25 = bookRequest24.getBookTitle();
        java.lang.String str26 = bookRequest24.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", 97);
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest24.compareTo(bookRequest30);
        java.lang.String str33 = bookRequest24.getBookTitle();
        int int34 = bookRequest24.getPriority();
        int int35 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest30", (bookRequest14.compareTo(bookRequest30) == 0) == bookRequest14.equals(bookRequest30));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
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
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) '#');
        int int34 = bookRequest33.getPriority();
        java.lang.String str35 = bookRequest33.getBookTitle();
        request.BookRequest bookRequest39 = new request.BookRequest("", "", (int) ' ');
        int int40 = bookRequest33.compareTo(bookRequest39);
        int int41 = bookRequest39.getPriority();
        int int42 = bookRequest39.getPriority();
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str47 = bookRequest46.getRequester();
        java.lang.String str48 = bookRequest46.getBookTitle();
        int int49 = bookRequest46.getPriority();
        java.lang.String str50 = bookRequest46.getBookTitle();
        java.lang.String str51 = bookRequest46.getRequester();
        int int52 = bookRequest46.getPriority();
        int int53 = bookRequest46.getPriority();
        int int54 = bookRequest39.compareTo(bookRequest46);
        int int55 = bookRequest20.compareTo(bookRequest46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest33", (bookRequest3.compareTo(bookRequest33) == 0) == bookRequest3.equals(bookRequest33));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getRequester();
        int int8 = bookRequest3.getPriority();
        int int9 = bookRequest3.getPriority();
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str15 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str20 = bookRequest19.getRequester();
        java.lang.String str21 = bookRequest19.getBookTitle();
        int int22 = bookRequest19.getPriority();
        int int23 = bookRequest14.compareTo(bookRequest19);
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        int int31 = bookRequest27.getPriority();
        int int32 = bookRequest27.getPriority();
        java.lang.String str33 = bookRequest27.getBookTitle();
        int int34 = bookRequest14.compareTo(bookRequest27);
        int int35 = bookRequest14.getPriority();
        java.lang.String str36 = bookRequest14.getRequester();
        int int37 = bookRequest14.getPriority();
        java.lang.String str38 = bookRequest14.getRequester();
        int int39 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
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
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getRequester();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest31.getPriority();
        java.lang.String str36 = bookRequest31.getBookTitle();
        int int37 = bookRequest31.getPriority();
        java.lang.String str38 = bookRequest31.getRequester();
        java.lang.String str39 = bookRequest31.getRequester();
        int int40 = bookRequest24.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
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
        java.lang.String str30 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "hi!", 0);
        int int35 = bookRequest34.getPriority();
        int int36 = bookRequest34.getPriority();
        int int37 = bookRequest34.getPriority();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str42 = bookRequest41.getRequester();
        java.lang.String str43 = bookRequest41.getBookTitle();
        int int44 = bookRequest41.getPriority();
        java.lang.String str45 = bookRequest41.getBookTitle();
        java.lang.String str46 = bookRequest41.getRequester();
        int int47 = bookRequest34.compareTo(bookRequest41);
        request.BookRequest bookRequest51 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str52 = bookRequest51.getRequester();
        int int53 = bookRequest51.getPriority();
        java.lang.String str54 = bookRequest51.getBookTitle();
        java.lang.String str55 = bookRequest51.getRequester();
        request.BookRequest bookRequest59 = new request.BookRequest("", "hi!", 52);
        int int60 = bookRequest51.compareTo(bookRequest59);
        java.lang.String str61 = bookRequest51.getRequester();
        int int62 = bookRequest41.compareTo(bookRequest51);
        int int63 = bookRequest12.compareTo(bookRequest41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest51", (bookRequest8.compareTo(bookRequest51) == 0) == bookRequest8.equals(bookRequest51));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
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
        request.BookRequest bookRequest44 = new request.BookRequest("", "", (int) 'a');
        java.lang.String str45 = bookRequest44.getBookTitle();
        java.lang.String str46 = bookRequest44.getBookTitle();
        int int47 = bookRequest3.compareTo(bookRequest44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest17 and bookRequest44", (bookRequest17.compareTo(bookRequest44) == 0) == bookRequest17.equals(bookRequest44));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
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
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest22 = new request.BookRequest("", "", 1);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getBookTitle();
        java.lang.String str25 = bookRequest22.getRequester();
        int int26 = bookRequest18.compareTo(bookRequest22);
        java.lang.String str27 = bookRequest22.getBookTitle();
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
        request.BookRequest bookRequest47 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str48 = bookRequest47.getBookTitle();
        java.lang.String str49 = bookRequest47.getRequester();
        java.lang.String str50 = bookRequest47.getRequester();
        int int51 = bookRequest31.compareTo(bookRequest47);
        int int52 = bookRequest31.getPriority();
        int int53 = bookRequest22.compareTo(bookRequest31);
        java.lang.String str54 = bookRequest31.getBookTitle();
        int int55 = bookRequest3.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest35", (bookRequest3.compareTo(bookRequest35) == 0) == bookRequest3.equals(bookRequest35));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
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
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str21 = bookRequest20.getBookTitle();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getRequester();
        java.lang.String str24 = bookRequest20.getRequester();
        java.lang.String str25 = bookRequest20.getRequester();
        int int26 = bookRequest20.getPriority();
        int int27 = bookRequest12.compareTo(bookRequest20);
        java.lang.String str28 = bookRequest20.getRequester();
        java.lang.String str29 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        int int34 = bookRequest33.getPriority();
        java.lang.String str35 = bookRequest33.getRequester();
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str40 = bookRequest39.getRequester();
        java.lang.String str41 = bookRequest39.getBookTitle();
        int int42 = bookRequest39.getPriority();
        java.lang.String str43 = bookRequest39.getRequester();
        int int44 = bookRequest33.compareTo(bookRequest39);
        int int45 = bookRequest39.getPriority();
        int int46 = bookRequest20.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest33", (bookRequest3.compareTo(bookRequest33) == 0) == bookRequest3.equals(bookRequest33));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
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
        java.lang.String str18 = bookRequest3.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", 35);
        java.lang.String str23 = bookRequest22.getRequester();
        int int24 = bookRequest22.getPriority();
        int int25 = bookRequest22.getPriority();
        int int26 = bookRequest22.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "hi!", 10);
        int int31 = bookRequest22.compareTo(bookRequest30);
        java.lang.String str32 = bookRequest22.getBookTitle();
        int int33 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest30", (bookRequest3.compareTo(bookRequest30) == 0) == bookRequest3.equals(bookRequest30));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getRequester();
        int int11 = bookRequest3.getPriority();
        java.lang.String str12 = bookRequest3.getBookTitle();
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", 0);
        int int22 = bookRequest17.compareTo(bookRequest21);
        request.BookRequest bookRequest26 = new request.BookRequest("", "", 1);
        java.lang.String str27 = bookRequest26.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str32 = bookRequest31.getRequester();
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        java.lang.String str35 = bookRequest31.getRequester();
        int int36 = bookRequest31.getPriority();
        int int37 = bookRequest26.compareTo(bookRequest31);
        int int38 = bookRequest21.compareTo(bookRequest31);
        java.lang.String str39 = bookRequest21.getRequester();
        request.BookRequest bookRequest43 = new request.BookRequest("", "", (int) (byte) 100);
        int int44 = bookRequest43.getPriority();
        java.lang.String str45 = bookRequest43.getBookTitle();
        int int46 = bookRequest21.compareTo(bookRequest43);
        java.lang.String str47 = bookRequest43.getBookTitle();
        java.lang.String str48 = bookRequest43.getBookTitle();
        int int49 = bookRequest3.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", 35);
        java.lang.String str23 = bookRequest22.getRequester();
        int int24 = bookRequest22.getPriority();
        int int25 = bookRequest22.getPriority();
        int int26 = bookRequest22.getPriority();
        int int27 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", 0);
        java.lang.String str28 = bookRequest27.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getBookTitle();
        int int37 = bookRequest27.compareTo(bookRequest32);
        java.lang.String str38 = bookRequest27.getRequester();
        int int39 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest32", (bookRequest9.compareTo(bookRequest32) == 0) == bookRequest9.equals(bookRequest32));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int32 = bookRequest31.getPriority();
        java.lang.String str33 = bookRequest31.getRequester();
        int int34 = bookRequest27.compareTo(bookRequest31);
        java.lang.String str35 = bookRequest27.getRequester();
        int int36 = bookRequest12.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest31", (bookRequest8.compareTo(bookRequest31) == 0) == bookRequest8.equals(bookRequest31));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getRequester();
        int int17 = bookRequest14.getPriority();
        java.lang.String str18 = bookRequest14.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str23 = bookRequest22.getRequester();
        int int24 = bookRequest22.getPriority();
        int int25 = bookRequest14.compareTo(bookRequest22);
        int int26 = bookRequest22.getPriority();
        int int27 = bookRequest22.getPriority();
        int int28 = bookRequest22.getPriority();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) (byte) 0);
        java.lang.String str33 = bookRequest32.getRequester();
        int int34 = bookRequest22.compareTo(bookRequest32);
        int int35 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest29.getPriority();
        request.BookRequest bookRequest35 = new request.BookRequest("", "", 1);
        java.lang.String str36 = bookRequest35.getBookTitle();
        int int37 = bookRequest29.compareTo(bookRequest35);
        int int38 = bookRequest25.compareTo(bookRequest35);
        int int39 = bookRequest35.getPriority();
        java.lang.String str40 = bookRequest35.getRequester();
        java.lang.String str41 = bookRequest35.getRequester();
        int int42 = bookRequest3.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", 0);
        java.lang.String str26 = bookRequest25.getBookTitle();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getRequester();
        java.lang.String str30 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        int int39 = bookRequest38.getPriority();
        int int40 = bookRequest38.getPriority();
        java.lang.String str41 = bookRequest38.getBookTitle();
        java.lang.String str42 = bookRequest38.getRequester();
        java.lang.String str43 = bookRequest38.getBookTitle();
        int int44 = bookRequest38.getPriority();
        java.lang.String str45 = bookRequest38.getBookTitle();
        int int46 = bookRequest34.compareTo(bookRequest38);
        java.lang.String str47 = bookRequest34.getBookTitle();
        java.lang.String str48 = bookRequest34.getRequester();
        int int49 = bookRequest25.compareTo(bookRequest34);
        request.BookRequest bookRequest53 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int54 = bookRequest53.getPriority();
        java.lang.String str55 = bookRequest53.getBookTitle();
        int int56 = bookRequest53.getPriority();
        java.lang.String str57 = bookRequest53.getBookTitle();
        int int58 = bookRequest25.compareTo(bookRequest53);
        int int59 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest53", (bookRequest7.compareTo(bookRequest53) == 0) == bookRequest7.equals(bookRequest53));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
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
        java.lang.String str27 = bookRequest3.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str36 = bookRequest35.getRequester();
        java.lang.String str37 = bookRequest35.getRequester();
        java.lang.String str38 = bookRequest35.getBookTitle();
        int int39 = bookRequest31.compareTo(bookRequest35);
        java.lang.String str40 = bookRequest35.getBookTitle();
        java.lang.String str41 = bookRequest35.getRequester();
        int int42 = bookRequest3.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest35", (bookRequest7.compareTo(bookRequest35) == 0) == bookRequest7.equals(bookRequest35));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getRequester();
        int int9 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str15 = bookRequest14.getBookTitle();
        int int16 = bookRequest14.getPriority();
        java.lang.String str17 = bookRequest14.getRequester();
        int int18 = bookRequest14.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (byte) -1);
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getBookTitle();
        java.lang.String str25 = bookRequest22.getBookTitle();
        int int26 = bookRequest14.compareTo(bookRequest22);
        java.lang.String str27 = bookRequest14.getRequester();
        int int28 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest20 = new request.BookRequest("", "", 1);
        java.lang.String str21 = bookRequest20.getBookTitle();
        java.lang.String str22 = bookRequest20.getBookTitle();
        java.lang.String str23 = bookRequest20.getRequester();
        int int24 = bookRequest16.compareTo(bookRequest20);
        java.lang.String str25 = bookRequest16.getRequester();
        java.lang.String str26 = bookRequest16.getBookTitle();
        int int27 = bookRequest16.getPriority();
        int int28 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest20", (bookRequest8.compareTo(bookRequest20) == 0) == bookRequest8.equals(bookRequest20));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        int int13 = bookRequest7.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 0);
        int int27 = bookRequest22.compareTo(bookRequest26);
        int int28 = bookRequest17.compareTo(bookRequest26);
        int int29 = bookRequest17.getPriority();
        int int30 = bookRequest17.getPriority();
        int int31 = bookRequest17.getPriority();
        int int32 = bookRequest17.getPriority();
        java.lang.String str33 = bookRequest17.getBookTitle();
        int int34 = bookRequest17.getPriority();
        int int35 = bookRequest17.getPriority();
        int int36 = bookRequest7.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest22", (bookRequest7.compareTo(bookRequest22) == 0) == bookRequest7.equals(bookRequest22));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest8.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getRequester();
        java.lang.String str23 = bookRequest18.getBookTitle();
        int int24 = bookRequest18.getPriority();
        int int25 = bookRequest8.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest18", (bookRequest8.compareTo(bookRequest18) == 0) == bookRequest8.equals(bookRequest18));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
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
        int int17 = bookRequest11.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (byte) 10);
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getRequester();
        int int32 = bookRequest27.getPriority();
        int int33 = bookRequest21.compareTo(bookRequest27);
        java.lang.String str34 = bookRequest21.getBookTitle();
        int int35 = bookRequest11.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest27", (bookRequest11.compareTo(bookRequest27) == 0) == bookRequest11.equals(bookRequest27));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
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
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", 100);
        int int31 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest30", (bookRequest16.compareTo(bookRequest30) == 0) == bookRequest16.equals(bookRequest30));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str15 = bookRequest9.getBookTitle();
        int int16 = bookRequest9.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", 0);
        java.lang.String str21 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getBookTitle();
        int int30 = bookRequest20.compareTo(bookRequest25);
        java.lang.String str31 = bookRequest25.getBookTitle();
        int int32 = bookRequest25.getPriority();
        java.lang.String str33 = bookRequest25.getBookTitle();
        int int34 = bookRequest9.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 0);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str10 = bookRequest9.getBookTitle();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str15 = bookRequest14.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 0);
        int int24 = bookRequest19.compareTo(bookRequest23);
        int int25 = bookRequest14.compareTo(bookRequest23);
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str36 = bookRequest35.getRequester();
        java.lang.String str37 = bookRequest35.getBookTitle();
        int int38 = bookRequest31.compareTo(bookRequest35);
        java.lang.String str39 = bookRequest31.getRequester();
        java.lang.String str40 = bookRequest31.getBookTitle();
        int int41 = bookRequest23.compareTo(bookRequest31);
        int int42 = bookRequest23.getPriority();
        int int43 = bookRequest23.getPriority();
        int int44 = bookRequest9.compareTo(bookRequest23);
        int int45 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
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
        int int28 = bookRequest8.getPriority();
        int int29 = bookRequest8.getPriority();
        java.lang.String str30 = bookRequest8.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", 10);
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) 'a');
        int int39 = bookRequest38.getPriority();
        int int40 = bookRequest38.getPriority();
        java.lang.String str41 = bookRequest38.getRequester();
        int int42 = bookRequest38.getPriority();
        java.lang.String str43 = bookRequest38.getBookTitle();
        int int44 = bookRequest38.getPriority();
        int int45 = bookRequest34.compareTo(bookRequest38);
        int int46 = bookRequest38.getPriority();
        int int47 = bookRequest38.getPriority();
        int int48 = bookRequest8.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest38", (bookRequest16.compareTo(bookRequest38) == 0) == bookRequest16.equals(bookRequest38));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getBookTitle();
        java.lang.String str30 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) (byte) -1);
        int int35 = bookRequest34.getPriority();
        int int36 = bookRequest25.compareTo(bookRequest34);
        int int37 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest25", (bookRequest12.compareTo(bookRequest25) == 0) == bookRequest12.equals(bookRequest25));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str18 = bookRequest17.getBookTitle();
        int int19 = bookRequest7.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
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
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getBookTitle();
        int int33 = bookRequest26.compareTo(bookRequest30);
        java.lang.String str34 = bookRequest26.getRequester();
        java.lang.String str35 = bookRequest26.getRequester();
        java.lang.String str36 = bookRequest26.getBookTitle();
        java.lang.String str37 = bookRequest26.getRequester();
        int int38 = bookRequest26.getPriority();
        int int39 = bookRequest13.compareTo(bookRequest26);
        request.BookRequest bookRequest43 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str44 = bookRequest43.getRequester();
        java.lang.String str45 = bookRequest43.getBookTitle();
        int int46 = bookRequest43.getPriority();
        int int47 = bookRequest13.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest30 and bookRequest43", (bookRequest30.compareTo(bookRequest43) == 0) == bookRequest30.equals(bookRequest43));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        int int14 = bookRequest13.getPriority();
        int int15 = bookRequest13.getPriority();
        int int16 = bookRequest9.compareTo(bookRequest13);
        int int17 = bookRequest9.getPriority();
        int int18 = bookRequest9.getPriority();
        java.lang.String str19 = bookRequest9.getRequester();
        int int20 = bookRequest9.getPriority();
        int int21 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
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
        java.lang.String str16 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest20 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", 97);
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest20.compareTo(bookRequest24);
        int int28 = bookRequest24.getPriority();
        java.lang.String str29 = bookRequest24.getBookTitle();
        int int30 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest24", (bookRequest8.compareTo(bookRequest24) == 0) == bookRequest8.equals(bookRequest24));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "hi!", 97);
        int int10 = bookRequest9.getPriority();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) '#');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        int int19 = bookRequest16.getPriority();
        java.lang.String str20 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str29 = bookRequest28.getRequester();
        int int30 = bookRequest28.getPriority();
        request.BookRequest bookRequest34 = new request.BookRequest("", "", 1);
        java.lang.String str35 = bookRequest34.getBookTitle();
        int int36 = bookRequest28.compareTo(bookRequest34);
        int int37 = bookRequest24.compareTo(bookRequest34);
        int int38 = bookRequest16.compareTo(bookRequest24);
        int int39 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "", 1);
        java.lang.String str12 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str17 = bookRequest16.getRequester();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getBookTitle();
        java.lang.String str20 = bookRequest16.getRequester();
        int int21 = bookRequest16.getPriority();
        int int22 = bookRequest11.compareTo(bookRequest16);
        int int23 = bookRequest3.compareTo(bookRequest11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
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
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str34 = bookRequest33.getRequester();
        int int35 = bookRequest33.getPriority();
        java.lang.String str36 = bookRequest33.getBookTitle();
        java.lang.String str37 = bookRequest33.getRequester();
        int int38 = bookRequest33.getPriority();
        java.lang.String str39 = bookRequest33.getBookTitle();
        int int40 = bookRequest33.getPriority();
        int int41 = bookRequest33.getPriority();
        int int42 = bookRequest29.compareTo(bookRequest33);
        request.BookRequest bookRequest46 = new request.BookRequest("", "", (int) (byte) 10);
        int int47 = bookRequest46.getPriority();
        int int48 = bookRequest33.compareTo(bookRequest46);
        java.lang.String str49 = bookRequest46.getRequester();
        int int50 = bookRequest46.getPriority();
        int int51 = bookRequest46.getPriority();
        java.lang.String str52 = bookRequest46.getRequester();
        java.lang.String str53 = bookRequest46.getRequester();
        int int54 = bookRequest46.getPriority();
        int int55 = bookRequest24.compareTo(bookRequest46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest33", (bookRequest3.compareTo(bookRequest33) == 0) == bookRequest3.equals(bookRequest33));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
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
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) (byte) 100);
        int int39 = bookRequest16.compareTo(bookRequest38);
        request.BookRequest bookRequest43 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str44 = bookRequest43.getBookTitle();
        int int45 = bookRequest43.getPriority();
        java.lang.String str46 = bookRequest43.getBookTitle();
        java.lang.String str47 = bookRequest43.getBookTitle();
        request.BookRequest bookRequest51 = new request.BookRequest("hi!", "", (int) 'a');
        int int52 = bookRequest51.getPriority();
        int int53 = bookRequest51.getPriority();
        java.lang.String str54 = bookRequest51.getBookTitle();
        int int55 = bookRequest51.getPriority();
        int int56 = bookRequest51.getPriority();
        int int57 = bookRequest51.getPriority();
        int int58 = bookRequest51.getPriority();
        int int59 = bookRequest51.getPriority();
        request.BookRequest bookRequest63 = new request.BookRequest("", "hi!", (int) '4');
        int int64 = bookRequest63.getPriority();
        java.lang.String str65 = bookRequest63.getBookTitle();
        java.lang.String str66 = bookRequest63.getBookTitle();
        int int67 = bookRequest63.getPriority();
        int int68 = bookRequest63.getPriority();
        int int69 = bookRequest63.getPriority();
        int int70 = bookRequest51.compareTo(bookRequest63);
        int int71 = bookRequest43.compareTo(bookRequest63);
        int int72 = bookRequest43.getPriority();
        int int73 = bookRequest16.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest43", (bookRequest3.compareTo(bookRequest43) == 0) == bookRequest3.equals(bookRequest43));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("", "", (int) ' ');
        int int9 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) (short) 0);
        int int27 = bookRequest22.compareTo(bookRequest26);
        int int28 = bookRequest17.compareTo(bookRequest26);
        java.lang.String str29 = bookRequest26.getBookTitle();
        int int30 = bookRequest26.getPriority();
        int int31 = bookRequest13.compareTo(bookRequest26);
        java.lang.String str32 = bookRequest26.getRequester();
        java.lang.String str33 = bookRequest26.getBookTitle();
        int int34 = bookRequest26.getPriority();
        int int35 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest19.compareTo(bookRequest23);
        int int26 = bookRequest23.getPriority();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getBookTitle();
        int int33 = bookRequest30.getPriority();
        int int34 = bookRequest30.getPriority();
        java.lang.String str35 = bookRequest30.getRequester();
        java.lang.String str36 = bookRequest30.getBookTitle();
        int int37 = bookRequest23.compareTo(bookRequest30);
        int int38 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest30", (bookRequest7.compareTo(bookRequest30) == 0) == bookRequest7.equals(bookRequest30));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        int int11 = bookRequest3.getPriority();
        int int12 = bookRequest3.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        int int18 = bookRequest16.getPriority();
        java.lang.String str19 = bookRequest16.getRequester();
        int int20 = bookRequest16.getPriority();
        java.lang.String str21 = bookRequest16.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) '#');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) ' ');
        int int32 = bookRequest25.compareTo(bookRequest31);
        int int33 = bookRequest16.compareTo(bookRequest25);
        java.lang.String str34 = bookRequest25.getRequester();
        java.lang.String str35 = bookRequest25.getRequester();
        int int36 = bookRequest25.getPriority();
        java.lang.String str37 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int46 = bookRequest41.compareTo(bookRequest45);
        java.lang.String str47 = bookRequest41.getRequester();
        int int48 = bookRequest25.compareTo(bookRequest41);
        int int49 = bookRequest3.compareTo(bookRequest41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest45", (bookRequest3.compareTo(bookRequest45) == 0) == bookRequest3.equals(bookRequest45));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
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
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getRequester();
        java.lang.String str34 = bookRequest30.getBookTitle();
        java.lang.String str35 = bookRequest30.getBookTitle();
        java.lang.String str36 = bookRequest30.getBookTitle();
        java.lang.String str37 = bookRequest30.getRequester();
        int int38 = bookRequest30.getPriority();
        int int39 = bookRequest30.getPriority();
        java.lang.String str40 = bookRequest30.getBookTitle();
        int int41 = bookRequest12.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest30", (bookRequest3.compareTo(bookRequest30) == 0) == bookRequest3.equals(bookRequest30));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
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
        java.lang.String str28 = bookRequest16.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str37 = bookRequest36.getRequester();
        java.lang.String str38 = bookRequest36.getBookTitle();
        int int39 = bookRequest36.getPriority();
        java.lang.String str40 = bookRequest36.getBookTitle();
        java.lang.String str41 = bookRequest36.getRequester();
        java.lang.String str42 = bookRequest36.getBookTitle();
        java.lang.String str43 = bookRequest36.getRequester();
        java.lang.String str44 = bookRequest36.getBookTitle();
        java.lang.String str45 = bookRequest36.getRequester();
        int int46 = bookRequest32.compareTo(bookRequest36);
        int int47 = bookRequest16.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest36", (bookRequest8.compareTo(bookRequest36) == 0) == bookRequest8.equals(bookRequest36));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
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
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", 0);
        java.lang.String str35 = bookRequest34.getBookTitle();
        int int36 = bookRequest34.getPriority();
        java.lang.String str37 = bookRequest34.getRequester();
        int int38 = bookRequest34.getPriority();
        java.lang.String str39 = bookRequest34.getBookTitle();
        int int40 = bookRequest3.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest34", (bookRequest10.compareTo(bookRequest34) == 0) == bookRequest10.equals(bookRequest34));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
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
        int int18 = bookRequest3.getPriority();
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (byte) -1);
        java.lang.String str23 = bookRequest22.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        java.lang.String str30 = bookRequest27.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int35 = bookRequest27.compareTo(bookRequest34);
        int int36 = bookRequest34.getPriority();
        int int37 = bookRequest34.getPriority();
        int int38 = bookRequest22.compareTo(bookRequest34);
        int int39 = bookRequest34.getPriority();
        int int40 = bookRequest3.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest34", (bookRequest3.compareTo(bookRequest34) == 0) == bookRequest3.equals(bookRequest34));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) 'a');
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        int int19 = bookRequest16.getPriority();
        java.lang.String str20 = bookRequest16.getBookTitle();
        java.lang.String str21 = bookRequest16.getRequester();
        java.lang.String str22 = bookRequest16.getRequester();
        java.lang.String str23 = bookRequest16.getRequester();
        int int24 = bookRequest16.getPriority();
        int int25 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest16", (bookRequest7.compareTo(bookRequest16) == 0) == bookRequest7.equals(bookRequest16));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getRequester();
        java.lang.String str14 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 0);
        int int23 = bookRequest18.compareTo(bookRequest22);
        java.lang.String str24 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str29 = bookRequest28.getBookTitle();
        java.lang.String str30 = bookRequest28.getRequester();
        int int31 = bookRequest18.compareTo(bookRequest28);
        int int32 = bookRequest7.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest28", (bookRequest7.compareTo(bookRequest28) == 0) == bookRequest7.equals(bookRequest28));
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getRequester();
        java.lang.String str15 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", 1);
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getBookTitle();
        java.lang.String str22 = bookRequest19.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str27 = bookRequest26.getRequester();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getRequester();
        int int31 = bookRequest26.getPriority();
        java.lang.String str32 = bookRequest26.getBookTitle();
        int int33 = bookRequest26.getPriority();
        int int34 = bookRequest19.compareTo(bookRequest26);
        int int35 = bookRequest26.getPriority();
        int int36 = bookRequest7.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest19", (bookRequest7.compareTo(bookRequest19) == 0) == bookRequest7.equals(bookRequest19));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
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
        java.lang.String str19 = bookRequest13.getRequester();
        java.lang.String str20 = bookRequest13.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (byte) 10);
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        int int27 = bookRequest24.getPriority();
        int int28 = bookRequest13.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", 0);
        java.lang.String str27 = bookRequest26.getBookTitle();
        java.lang.String str28 = bookRequest26.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) 'a');
        int int33 = bookRequest32.getPriority();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getRequester();
        java.lang.String str36 = bookRequest32.getBookTitle();
        java.lang.String str37 = bookRequest32.getBookTitle();
        java.lang.String str38 = bookRequest32.getBookTitle();
        java.lang.String str39 = bookRequest32.getBookTitle();
        int int40 = bookRequest26.compareTo(bookRequest32);
        int int41 = bookRequest9.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest32", (bookRequest13.compareTo(bookRequest32) == 0) == bookRequest13.equals(bookRequest32));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
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
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str38 = bookRequest37.getRequester();
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest46 = new request.BookRequest("", "", (int) (short) 0);
        int int47 = bookRequest42.compareTo(bookRequest46);
        int int48 = bookRequest37.compareTo(bookRequest46);
        java.lang.String str49 = bookRequest46.getBookTitle();
        int int50 = bookRequest46.getPriority();
        java.lang.String str51 = bookRequest46.getRequester();
        int int52 = bookRequest46.getPriority();
        request.BookRequest bookRequest56 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest60 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str61 = bookRequest60.getRequester();
        java.lang.String str62 = bookRequest60.getBookTitle();
        int int63 = bookRequest56.compareTo(bookRequest60);
        java.lang.String str64 = bookRequest60.getBookTitle();
        java.lang.String str65 = bookRequest60.getRequester();
        int int66 = bookRequest46.compareTo(bookRequest60);
        int int67 = bookRequest3.compareTo(bookRequest46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest24 and bookRequest42", (bookRequest24.compareTo(bookRequest42) == 0) == bookRequest24.equals(bookRequest42));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getRequester();
        java.lang.String str23 = bookRequest20.getBookTitle();
        java.lang.String str24 = bookRequest20.getBookTitle();
        java.lang.String str25 = bookRequest20.getRequester();
        java.lang.String str26 = bookRequest20.getBookTitle();
        java.lang.String str27 = bookRequest20.getBookTitle();
        java.lang.String str28 = bookRequest20.getBookTitle();
        int int29 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest20", (bookRequest8.compareTo(bookRequest20) == 0) == bookRequest8.equals(bookRequest20));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", (int) 'a');
        int int16 = bookRequest15.getPriority();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getRequester();
        java.lang.String str19 = bookRequest15.getBookTitle();
        java.lang.String str20 = bookRequest15.getBookTitle();
        java.lang.String str21 = bookRequest15.getBookTitle();
        java.lang.String str22 = bookRequest15.getRequester();
        int int23 = bookRequest7.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest15", (bookRequest3.compareTo(bookRequest15) == 0) == bookRequest3.equals(bookRequest15));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
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
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str39 = bookRequest38.getRequester();
        int int40 = bookRequest34.compareTo(bookRequest38);
        int int41 = bookRequest23.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest34", (bookRequest13.compareTo(bookRequest34) == 0) == bookRequest13.equals(bookRequest34));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", 1);
        java.lang.String str10 = bookRequest9.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str12 = bookRequest9.getRequester();
        java.lang.String str13 = bookRequest9.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str22 = bookRequest21.getRequester();
        java.lang.String str23 = bookRequest21.getRequester();
        java.lang.String str24 = bookRequest21.getBookTitle();
        int int25 = bookRequest17.compareTo(bookRequest21);
        java.lang.String str26 = bookRequest21.getBookTitle();
        int int27 = bookRequest21.getPriority();
        int int28 = bookRequest9.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", 97);
        java.lang.String str15 = bookRequest14.getRequester();
        int int16 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest3.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) '#');
        int int14 = bookRequest13.getPriority();
        java.lang.String str15 = bookRequest13.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", (int) ' ');
        int int20 = bookRequest13.compareTo(bookRequest19);
        java.lang.String str21 = bookRequest13.getRequester();
        java.lang.String str22 = bookRequest13.getRequester();
        java.lang.String str23 = bookRequest13.getBookTitle();
        int int24 = bookRequest13.getPriority();
        int int25 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getBookTitle();
        java.lang.String str14 = bookRequest7.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("", "hi!", (int) '4');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getBookTitle();
        java.lang.String str21 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", 0);
        java.lang.String str26 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        java.lang.String str34 = bookRequest30.getBookTitle();
        int int35 = bookRequest25.compareTo(bookRequest30);
        request.BookRequest bookRequest39 = new request.BookRequest("", "", (int) (byte) 10);
        int int40 = bookRequest39.getPriority();
        int int41 = bookRequest25.compareTo(bookRequest39);
        int int42 = bookRequest18.compareTo(bookRequest25);
        java.lang.String str43 = bookRequest18.getRequester();
        int int44 = bookRequest18.getPriority();
        java.lang.String str45 = bookRequest18.getRequester();
        int int46 = bookRequest7.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest30", (bookRequest7.compareTo(bookRequest30) == 0) == bookRequest7.equals(bookRequest30));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) '#');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        java.lang.String str27 = bookRequest24.getBookTitle();
        int int28 = bookRequest24.getPriority();
        int int29 = bookRequest24.getPriority();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        int int34 = bookRequest33.getPriority();
        int int35 = bookRequest33.getPriority();
        java.lang.String str36 = bookRequest33.getBookTitle();
        java.lang.String str37 = bookRequest33.getBookTitle();
        int int38 = bookRequest33.getPriority();
        java.lang.String str39 = bookRequest33.getBookTitle();
        java.lang.String str40 = bookRequest33.getBookTitle();
        java.lang.String str41 = bookRequest33.getRequester();
        int int42 = bookRequest33.getPriority();
        int int43 = bookRequest24.compareTo(bookRequest33);
        int int44 = bookRequest9.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest33", (bookRequest13.compareTo(bookRequest33) == 0) == bookRequest13.equals(bookRequest33));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
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
        java.lang.String str64 = bookRequest43.getRequester();
        int int65 = bookRequest3.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest59", (bookRequest3.compareTo(bookRequest59) == 0) == bookRequest3.equals(bookRequest59));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
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
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str26 = bookRequest25.getRequester();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getRequester();
        int int30 = bookRequest25.getPriority();
        java.lang.String str31 = bookRequest25.getBookTitle();
        int int32 = bookRequest25.getPriority();
        int int33 = bookRequest25.getPriority();
        int int34 = bookRequest21.compareTo(bookRequest25);
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) (byte) 10);
        int int39 = bookRequest38.getPriority();
        int int40 = bookRequest25.compareTo(bookRequest38);
        java.lang.String str41 = bookRequest25.getRequester();
        int int42 = bookRequest25.getPriority();
        java.lang.String str43 = bookRequest25.getRequester();
        int int44 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", 52);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest7.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str15 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str20 = bookRequest19.getRequester();
        int int21 = bookRequest19.getPriority();
        java.lang.String str22 = bookRequest19.getBookTitle();
        java.lang.String str23 = bookRequest19.getRequester();
        request.BookRequest bookRequest27 = new request.BookRequest("", "hi!", 52);
        int int28 = bookRequest19.compareTo(bookRequest27);
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) (short) 100);
        int int33 = bookRequest27.compareTo(bookRequest32);
        int int34 = bookRequest14.compareTo(bookRequest32);
        int int35 = bookRequest7.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest27", (bookRequest7.compareTo(bookRequest27) == 0) == bookRequest7.equals(bookRequest27));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str10 = bookRequest9.getRequester();
        int int11 = bookRequest9.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest9);
        int int13 = bookRequest3.getPriority();
        java.lang.String str14 = bookRequest3.getRequester();
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
        java.lang.String str37 = bookRequest18.getRequester();
        int int38 = bookRequest18.getPriority();
        java.lang.String str39 = bookRequest18.getBookTitle();
        java.lang.String str40 = bookRequest18.getRequester();
        java.lang.String str41 = bookRequest18.getBookTitle();
        int int42 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest27", (bookRequest3.compareTo(bookRequest27) == 0) == bookRequest3.equals(bookRequest27));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getRequester();
        int int25 = bookRequest22.getPriority();
        java.lang.String str26 = bookRequest22.getBookTitle();
        int int27 = bookRequest11.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest22", (bookRequest15.compareTo(bookRequest22) == 0) == bookRequest15.equals(bookRequest22));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (byte) 1);
        request.BookRequest bookRequest33 = new request.BookRequest("", "hi!", 97);
        java.lang.String str34 = bookRequest33.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) ' ');
        int int39 = bookRequest33.compareTo(bookRequest38);
        int int40 = bookRequest29.compareTo(bookRequest38);
        int int41 = bookRequest38.getPriority();
        int int42 = bookRequest38.getPriority();
        java.lang.String str43 = bookRequest38.getRequester();
        int int44 = bookRequest22.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest38", (bookRequest3.compareTo(bookRequest38) == 0) == bookRequest3.equals(bookRequest38));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", 52);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str14 = bookRequest13.getRequester();
        int int15 = bookRequest13.getPriority();
        java.lang.String str16 = bookRequest13.getBookTitle();
        java.lang.String str17 = bookRequest13.getRequester();
        request.BookRequest bookRequest21 = new request.BookRequest("", "hi!", 52);
        int int22 = bookRequest13.compareTo(bookRequest21);
        int int23 = bookRequest3.compareTo(bookRequest21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest21", (bookRequest7.compareTo(bookRequest21) == 0) == bookRequest7.equals(bookRequest21));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
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
        java.lang.String str27 = bookRequest18.getRequester();
        java.lang.String str28 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) (short) 100);
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str37 = bookRequest36.getBookTitle();
        java.lang.String str38 = bookRequest36.getRequester();
        int int39 = bookRequest36.getPriority();
        java.lang.String str40 = bookRequest36.getRequester();
        request.BookRequest bookRequest44 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str45 = bookRequest44.getRequester();
        request.BookRequest bookRequest49 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest53 = new request.BookRequest("", "", (int) (short) 0);
        int int54 = bookRequest49.compareTo(bookRequest53);
        int int55 = bookRequest44.compareTo(bookRequest53);
        int int56 = bookRequest44.getPriority();
        int int57 = bookRequest44.getPriority();
        java.lang.String str58 = bookRequest44.getRequester();
        int int59 = bookRequest36.compareTo(bookRequest44);
        request.BookRequest bookRequest63 = new request.BookRequest("hi!", "", (int) '#');
        int int64 = bookRequest63.getPriority();
        java.lang.String str65 = bookRequest63.getRequester();
        java.lang.String str66 = bookRequest63.getBookTitle();
        int int67 = bookRequest63.getPriority();
        int int68 = bookRequest44.compareTo(bookRequest63);
        java.lang.String str69 = bookRequest44.getBookTitle();
        int int70 = bookRequest32.compareTo(bookRequest44);
        int int71 = bookRequest18.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest63", (bookRequest3.compareTo(bookRequest63) == 0) == bookRequest3.equals(bookRequest63));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest7.getPriority();
        java.lang.String str11 = bookRequest7.getRequester();
        request.BookRequest bookRequest15 = new request.BookRequest("hi!", "", 35);
        java.lang.String str16 = bookRequest15.getRequester();
        int int17 = bookRequest15.getPriority();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str24 = bookRequest23.getBookTitle();
        java.lang.String str25 = bookRequest23.getRequester();
        int int26 = bookRequest23.getPriority();
        java.lang.String str27 = bookRequest23.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str32 = bookRequest31.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest40 = new request.BookRequest("", "", (int) (short) 0);
        int int41 = bookRequest36.compareTo(bookRequest40);
        int int42 = bookRequest31.compareTo(bookRequest40);
        int int43 = bookRequest31.getPriority();
        int int44 = bookRequest31.getPriority();
        java.lang.String str45 = bookRequest31.getRequester();
        int int46 = bookRequest23.compareTo(bookRequest31);
        java.lang.String str47 = bookRequest23.getRequester();
        int int48 = bookRequest15.compareTo(bookRequest23);
        java.lang.String str49 = bookRequest15.getBookTitle();
        int int50 = bookRequest7.compareTo(bookRequest15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest40", (bookRequest3.compareTo(bookRequest40) == 0) == bookRequest3.equals(bookRequest40));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
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
        request.BookRequest bookRequest53 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str54 = bookRequest53.getRequester();
        java.lang.String str55 = bookRequest53.getBookTitle();
        int int56 = bookRequest53.getPriority();
        java.lang.String str57 = bookRequest53.getBookTitle();
        java.lang.String str58 = bookRequest53.getRequester();
        java.lang.String str59 = bookRequest53.getBookTitle();
        java.lang.String str60 = bookRequest53.getRequester();
        java.lang.String str61 = bookRequest53.getBookTitle();
        java.lang.String str62 = bookRequest53.getRequester();
        request.BookRequest bookRequest66 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str67 = bookRequest66.getBookTitle();
        java.lang.String str68 = bookRequest66.getBookTitle();
        int int69 = bookRequest53.compareTo(bookRequest66);
        java.lang.String str70 = bookRequest66.getRequester();
        int int71 = bookRequest9.compareTo(bookRequest66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest16 and bookRequest53", (bookRequest16.compareTo(bookRequest53) == 0) == bookRequest16.equals(bookRequest53));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
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
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", 97);
        int int18 = bookRequest17.getPriority();
        java.lang.String str19 = bookRequest17.getRequester();
        int int20 = bookRequest3.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest25.compareTo(bookRequest29);
        java.lang.String str31 = bookRequest25.getRequester();
        java.lang.String str32 = bookRequest25.getRequester();
        java.lang.String str33 = bookRequest25.getBookTitle();
        int int34 = bookRequest11.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest19 and bookRequest25", (bookRequest19.compareTo(bookRequest25) == 0) == bookRequest19.equals(bookRequest25));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 32);
        java.lang.String str4 = bookRequest3.getRequester();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str12 = bookRequest11.getRequester();
        java.lang.String str13 = bookRequest11.getRequester();
        java.lang.String str14 = bookRequest11.getBookTitle();
        int int15 = bookRequest11.getPriority();
        java.lang.String str16 = bookRequest11.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) '#');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", (int) ' ');
        int int27 = bookRequest20.compareTo(bookRequest26);
        java.lang.String str28 = bookRequest20.getRequester();
        java.lang.String str29 = bookRequest20.getRequester();
        int int30 = bookRequest20.getPriority();
        int int31 = bookRequest20.getPriority();
        int int32 = bookRequest20.getPriority();
        int int33 = bookRequest11.compareTo(bookRequest20);
        int int34 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
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
        java.lang.String str18 = bookRequest12.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getBookTitle();
        int int26 = bookRequest22.getPriority();
        int int27 = bookRequest22.getPriority();
        request.BookRequest bookRequest31 = new request.BookRequest("", "hi!", 52);
        int int32 = bookRequest22.compareTo(bookRequest31);
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest12.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest22", (bookRequest3.compareTo(bookRequest22) == 0) == bookRequest3.equals(bookRequest22));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
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
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str30 = bookRequest29.getRequester();
        java.lang.String str31 = bookRequest29.getRequester();
        java.lang.String str32 = bookRequest29.getBookTitle();
        java.lang.String str33 = bookRequest29.getRequester();
        java.lang.String str34 = bookRequest29.getBookTitle();
        java.lang.String str35 = bookRequest29.getBookTitle();
        int int36 = bookRequest21.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest29", (bookRequest8.compareTo(bookRequest29) == 0) == bookRequest8.equals(bookRequest29));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", 10);
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getBookTitle();
        java.lang.String str22 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", 1);
        java.lang.String str27 = bookRequest26.getBookTitle();
        java.lang.String str28 = bookRequest26.getBookTitle();
        java.lang.String str29 = bookRequest26.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str34 = bookRequest33.getRequester();
        int int35 = bookRequest33.getPriority();
        java.lang.String str36 = bookRequest33.getBookTitle();
        java.lang.String str37 = bookRequest33.getRequester();
        int int38 = bookRequest33.getPriority();
        java.lang.String str39 = bookRequest33.getBookTitle();
        int int40 = bookRequest33.getPriority();
        int int41 = bookRequest26.compareTo(bookRequest33);
        int int42 = bookRequest19.compareTo(bookRequest33);
        java.lang.String str43 = bookRequest19.getRequester();
        int int44 = bookRequest8.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest26", (bookRequest3.compareTo(bookRequest26) == 0) == bookRequest3.equals(bookRequest26));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
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
        request.BookRequest bookRequest16 = new request.BookRequest("", "", 1);
        java.lang.String str17 = bookRequest16.getBookTitle();
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str22 = bookRequest21.getRequester();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getBookTitle();
        java.lang.String str25 = bookRequest21.getRequester();
        int int26 = bookRequest21.getPriority();
        int int27 = bookRequest16.compareTo(bookRequest21);
        int int28 = bookRequest16.getPriority();
        java.lang.String str29 = bookRequest16.getRequester();
        java.lang.String str30 = bookRequest16.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str35 = bookRequest34.getBookTitle();
        java.lang.String str36 = bookRequest34.getRequester();
        java.lang.String str37 = bookRequest34.getRequester();
        int int38 = bookRequest16.compareTo(bookRequest34);
        request.BookRequest bookRequest42 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str43 = bookRequest42.getRequester();
        int int44 = bookRequest16.compareTo(bookRequest42);
        int int45 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
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
        request.BookRequest bookRequest36 = new request.BookRequest("", "hi!", (int) (byte) -1);
        java.lang.String str37 = bookRequest36.getBookTitle();
        int int38 = bookRequest36.getPriority();
        int int39 = bookRequest3.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest36", (bookRequest9.compareTo(bookRequest36) == 0) == bookRequest9.equals(bookRequest36));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        int int12 = bookRequest7.getPriority();
        java.lang.String str13 = bookRequest7.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", 0);
        java.lang.String str18 = bookRequest17.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getBookTitle();
        java.lang.String str26 = bookRequest22.getBookTitle();
        int int27 = bookRequest17.compareTo(bookRequest22);
        java.lang.String str28 = bookRequest17.getRequester();
        java.lang.String str29 = bookRequest17.getRequester();
        int int30 = bookRequest7.compareTo(bookRequest17);
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) 'a');
        int int35 = bookRequest34.getPriority();
        int int36 = bookRequest34.getPriority();
        java.lang.String str37 = bookRequest34.getRequester();
        java.lang.String str38 = bookRequest34.getBookTitle();
        java.lang.String str39 = bookRequest34.getBookTitle();
        java.lang.String str40 = bookRequest34.getBookTitle();
        int int41 = bookRequest34.getPriority();
        request.BookRequest bookRequest45 = new request.BookRequest("", "hi!", 10);
        int int46 = bookRequest45.getPriority();
        java.lang.String str47 = bookRequest45.getBookTitle();
        int int48 = bookRequest34.compareTo(bookRequest45);
        java.lang.String str49 = bookRequest45.getBookTitle();
        java.lang.String str50 = bookRequest45.getBookTitle();
        int int51 = bookRequest45.getPriority();
        java.lang.String str52 = bookRequest45.getRequester();
        int int53 = bookRequest7.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest22 and bookRequest34", (bookRequest22.compareTo(bookRequest34) == 0) == bookRequest22.equals(bookRequest34));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
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
        java.lang.String str21 = bookRequest3.getBookTitle();
        java.lang.String str22 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "hi!", 0);
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        request.BookRequest bookRequest32 = new request.BookRequest("", "", 1);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.getBookTitle();
        int int35 = bookRequest26.compareTo(bookRequest32);
        int int36 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest32", (bookRequest7.compareTo(bookRequest32) == 0) == bookRequest7.equals(bookRequest32));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
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
        request.BookRequest bookRequest49 = new request.BookRequest("hi!", "", (int) 'a');
        int int50 = bookRequest49.getPriority();
        java.lang.String str51 = bookRequest49.getRequester();
        java.lang.String str52 = bookRequest49.getBookTitle();
        request.BookRequest bookRequest56 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int57 = bookRequest49.compareTo(bookRequest56);
        int int58 = bookRequest56.getPriority();
        int int59 = bookRequest56.getPriority();
        java.lang.String str60 = bookRequest56.getRequester();
        request.BookRequest bookRequest64 = new request.BookRequest("hi!", "", 0);
        java.lang.String str65 = bookRequest64.getBookTitle();
        int int66 = bookRequest64.getPriority();
        java.lang.String str67 = bookRequest64.getBookTitle();
        java.lang.String str68 = bookRequest64.getBookTitle();
        int int69 = bookRequest56.compareTo(bookRequest64);
        int int70 = bookRequest64.getPriority();
        int int71 = bookRequest40.compareTo(bookRequest64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest24 and bookRequest49", (bookRequest24.compareTo(bookRequest49) == 0) == bookRequest24.equals(bookRequest49));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str15 = bookRequest14.getRequester();
        java.lang.String str16 = bookRequest14.getBookTitle();
        int int17 = bookRequest10.compareTo(bookRequest14);
        java.lang.String str18 = bookRequest10.getRequester();
        int int19 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
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
        java.lang.String str40 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest44 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest48 = new request.BookRequest("hi!", "", (int) 'a');
        int int49 = bookRequest48.getPriority();
        int int50 = bookRequest48.getPriority();
        int int51 = bookRequest44.compareTo(bookRequest48);
        java.lang.String str52 = bookRequest44.getRequester();
        request.BookRequest bookRequest56 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str57 = bookRequest56.getBookTitle();
        int int58 = bookRequest56.getPriority();
        java.lang.String str59 = bookRequest56.getBookTitle();
        int int60 = bookRequest44.compareTo(bookRequest56);
        int int61 = bookRequest23.compareTo(bookRequest44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest48", (bookRequest7.compareTo(bookRequest48) == 0) == bookRequest7.equals(bookRequest48));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
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
        int int36 = bookRequest35.getPriority();
        int int37 = bookRequest35.getPriority();
        java.lang.String str38 = bookRequest35.getRequester();
        java.lang.String str39 = bookRequest35.getBookTitle();
        int int40 = bookRequest35.getPriority();
        java.lang.String str41 = bookRequest35.getBookTitle();
        java.lang.String str42 = bookRequest35.getBookTitle();
        java.lang.String str43 = bookRequest35.getRequester();
        int int44 = bookRequest26.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest17 and bookRequest35", (bookRequest17.compareTo(bookRequest35) == 0) == bookRequest17.equals(bookRequest35));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
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
        java.lang.String str20 = bookRequest14.getRequester();
        java.lang.String str21 = bookRequest14.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getRequester();
        int int28 = bookRequest25.getPriority();
        java.lang.String str29 = bookRequest25.getRequester();
        java.lang.String str30 = bookRequest25.getBookTitle();
        int int31 = bookRequest25.getPriority();
        java.lang.String str32 = bookRequest25.getRequester();
        java.lang.String str33 = bookRequest25.getBookTitle();
        java.lang.String str34 = bookRequest25.getRequester();
        int int35 = bookRequest25.getPriority();
        int int36 = bookRequest25.getPriority();
        java.lang.String str37 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest41 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str46 = bookRequest45.getRequester();
        java.lang.String str47 = bookRequest45.getBookTitle();
        int int48 = bookRequest41.compareTo(bookRequest45);
        java.lang.String str49 = bookRequest45.getBookTitle();
        int int50 = bookRequest45.getPriority();
        int int51 = bookRequest25.compareTo(bookRequest45);
        int int52 = bookRequest14.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest45", (bookRequest10.compareTo(bookRequest45) == 0) == bookRequest10.equals(bookRequest45));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        java.lang.String str11 = bookRequest3.getBookTitle();
        int int12 = bookRequest3.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) (byte) 10);
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest20.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("", "", 1);
        java.lang.String str27 = bookRequest26.getBookTitle();
        int int28 = bookRequest20.compareTo(bookRequest26);
        int int29 = bookRequest16.compareTo(bookRequest26);
        int int30 = bookRequest26.getPriority();
        int int31 = bookRequest26.getPriority();
        java.lang.String str32 = bookRequest26.getBookTitle();
        int int33 = bookRequest26.getPriority();
        java.lang.String str34 = bookRequest26.getBookTitle();
        int int35 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str26 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getBookTitle();
        int int33 = bookRequest30.getPriority();
        int int34 = bookRequest25.compareTo(bookRequest30);
        java.lang.String str35 = bookRequest30.getRequester();
        java.lang.String str36 = bookRequest30.getBookTitle();
        java.lang.String str37 = bookRequest30.getBookTitle();
        int int38 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest25", (bookRequest12.compareTo(bookRequest25) == 0) == bookRequest12.equals(bookRequest25));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
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
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        int int23 = bookRequest21.getPriority();
        java.lang.String str24 = bookRequest21.getRequester();
        int int25 = bookRequest21.getPriority();
        java.lang.String str26 = bookRequest21.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) '#');
        int int31 = bookRequest30.getPriority();
        java.lang.String str32 = bookRequest30.getBookTitle();
        request.BookRequest bookRequest36 = new request.BookRequest("", "", (int) ' ');
        int int37 = bookRequest30.compareTo(bookRequest36);
        int int38 = bookRequest21.compareTo(bookRequest30);
        java.lang.String str39 = bookRequest30.getRequester();
        int int40 = bookRequest30.getPriority();
        int int41 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest21", (bookRequest8.compareTo(bookRequest21) == 0) == bookRequest8.equals(bookRequest21));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
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
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", 0);
        java.lang.String str33 = bookRequest32.getBookTitle();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getRequester();
        java.lang.String str37 = bookRequest32.getBookTitle();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", 100);
        int int42 = bookRequest32.compareTo(bookRequest41);
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str47 = bookRequest46.getRequester();
        java.lang.String str48 = bookRequest46.getBookTitle();
        int int49 = bookRequest46.getPriority();
        java.lang.String str50 = bookRequest46.getBookTitle();
        int int51 = bookRequest41.compareTo(bookRequest46);
        int int52 = bookRequest3.compareTo(bookRequest41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest46", (bookRequest13.compareTo(bookRequest46) == 0) == bookRequest13.equals(bookRequest46));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.String str29 = bookRequest28.getBookTitle();
        java.lang.String str30 = bookRequest28.getRequester();
        java.lang.String str31 = bookRequest28.getRequester();
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) (byte) 100);
        int int36 = bookRequest28.compareTo(bookRequest35);
        java.lang.String str37 = bookRequest35.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest45 = new request.BookRequest("", "hi!", (int) (short) 10);
        java.lang.String str46 = bookRequest45.getRequester();
        int int47 = bookRequest41.compareTo(bookRequest45);
        int int48 = bookRequest35.compareTo(bookRequest41);
        int int49 = bookRequest3.compareTo(bookRequest41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest45", (bookRequest9.compareTo(bookRequest45) == 0) == bookRequest9.equals(bookRequest45));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "hi!", 100);
        int int37 = bookRequest29.compareTo(bookRequest36);
        java.lang.String str38 = bookRequest29.getBookTitle();
        request.BookRequest bookRequest42 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str43 = bookRequest42.getBookTitle();
        java.lang.String str44 = bookRequest42.getRequester();
        java.lang.String str45 = bookRequest42.getRequester();
        request.BookRequest bookRequest49 = new request.BookRequest("hi!", "", (int) '#');
        int int50 = bookRequest42.compareTo(bookRequest49);
        request.BookRequest bookRequest54 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str55 = bookRequest54.getRequester();
        request.BookRequest bookRequest59 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest63 = new request.BookRequest("", "", (int) (short) 0);
        int int64 = bookRequest59.compareTo(bookRequest63);
        int int65 = bookRequest54.compareTo(bookRequest63);
        java.lang.String str66 = bookRequest63.getBookTitle();
        request.BookRequest bookRequest70 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str71 = bookRequest70.getRequester();
        int int72 = bookRequest70.getPriority();
        int int73 = bookRequest63.compareTo(bookRequest70);
        java.lang.String str74 = bookRequest63.getBookTitle();
        int int75 = bookRequest42.compareTo(bookRequest63);
        int int76 = bookRequest29.compareTo(bookRequest63);
        int int77 = bookRequest7.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("", "hi!", (int) '4');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getBookTitle();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest8.getPriority();
        java.lang.String str13 = bookRequest8.getBookTitle();
        java.lang.String str14 = bookRequest8.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        int int21 = bookRequest18.getPriority();
        java.lang.String str22 = bookRequest18.getBookTitle();
        java.lang.String str23 = bookRequest18.getRequester();
        java.lang.String str24 = bookRequest18.getRequester();
        int int25 = bookRequest18.getPriority();
        int int26 = bookRequest8.compareTo(bookRequest18);
        java.lang.String str27 = bookRequest18.getBookTitle();
        int int28 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest3.getRequester();
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
        request.BookRequest bookRequest35 = new request.BookRequest("", "", 1);
        java.lang.String str36 = bookRequest35.getRequester();
        java.lang.String str37 = bookRequest35.getBookTitle();
        int int38 = bookRequest20.compareTo(bookRequest35);
        java.lang.String str39 = bookRequest35.getRequester();
        int int40 = bookRequest3.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest35", (bookRequest7.compareTo(bookRequest35) == 0) == bookRequest7.equals(bookRequest35));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
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
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) ' ');
        int int37 = bookRequest36.getPriority();
        java.lang.String str38 = bookRequest36.getRequester();
        java.lang.String str39 = bookRequest36.getBookTitle();
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) 'a');
        int int44 = bookRequest43.getPriority();
        int int45 = bookRequest43.getPriority();
        java.lang.String str46 = bookRequest43.getBookTitle();
        java.lang.String str47 = bookRequest43.getBookTitle();
        int int48 = bookRequest43.getPriority();
        int int49 = bookRequest43.getPriority();
        request.BookRequest bookRequest53 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int54 = bookRequest43.compareTo(bookRequest53);
        java.lang.String str55 = bookRequest43.getRequester();
        int int56 = bookRequest43.getPriority();
        java.lang.String str57 = bookRequest43.getBookTitle();
        int int58 = bookRequest36.compareTo(bookRequest43);
        int int59 = bookRequest20.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest36", (bookRequest3.compareTo(bookRequest36) == 0) == bookRequest3.equals(bookRequest36));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
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
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str31 = bookRequest30.getBookTitle();
        java.lang.String str32 = bookRequest30.getRequester();
        int int33 = bookRequest30.getPriority();
        java.lang.String str34 = bookRequest30.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str39 = bookRequest38.getRequester();
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest47 = new request.BookRequest("", "", (int) (short) 0);
        int int48 = bookRequest43.compareTo(bookRequest47);
        int int49 = bookRequest38.compareTo(bookRequest47);
        int int50 = bookRequest38.getPriority();
        int int51 = bookRequest38.getPriority();
        java.lang.String str52 = bookRequest38.getRequester();
        int int53 = bookRequest30.compareTo(bookRequest38);
        int int54 = bookRequest38.getPriority();
        int int55 = bookRequest38.getPriority();
        int int56 = bookRequest3.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest43", (bookRequest3.compareTo(bookRequest43) == 0) == bookRequest3.equals(bookRequest43));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
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
        int int22 = bookRequest3.compareTo(bookRequest9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest9", (bookRequest3.compareTo(bookRequest9) == 0) == bookRequest3.equals(bookRequest9));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
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
        java.lang.String str19 = bookRequest3.getRequester();
        java.lang.String str20 = bookRequest3.getRequester();
        java.lang.String str21 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str26 = bookRequest25.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        java.lang.String str32 = bookRequest30.getRequester();
        int int33 = bookRequest30.getPriority();
        java.lang.String str34 = bookRequest30.getRequester();
        int int35 = bookRequest25.compareTo(bookRequest30);
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str40 = bookRequest39.getBookTitle();
        int int41 = bookRequest39.getPriority();
        java.lang.String str42 = bookRequest39.getRequester();
        int int43 = bookRequest39.getPriority();
        java.lang.String str44 = bookRequest39.getRequester();
        int int45 = bookRequest39.getPriority();
        int int46 = bookRequest25.compareTo(bookRequest39);
        java.lang.String str47 = bookRequest25.getBookTitle();
        int int48 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest30", (bookRequest8.compareTo(bookRequest30) == 0) == bookRequest8.equals(bookRequest30));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
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
        java.lang.String str23 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str28 = bookRequest27.getRequester();
        int int29 = bookRequest27.getPriority();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getRequester();
        int int32 = bookRequest27.getPriority();
        int int33 = bookRequest22.compareTo(bookRequest27);
        java.lang.String str34 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest38 = new request.BookRequest("", "hi!", 52);
        int int39 = bookRequest22.compareTo(bookRequest38);
        int int40 = bookRequest38.getPriority();
        int int41 = bookRequest7.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest27", (bookRequest7.compareTo(bookRequest27) == 0) == bookRequest7.equals(bookRequest27));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
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
        java.lang.String str21 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        java.lang.String str29 = bookRequest25.getBookTitle();
        java.lang.String str30 = bookRequest25.getBookTitle();
        java.lang.String str31 = bookRequest25.getRequester();
        java.lang.String str32 = bookRequest25.getBookTitle();
        int int33 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str9 = bookRequest7.getRequester();
        request.BookRequest bookRequest13 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest13.getPriority();
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        int int23 = bookRequest20.getPriority();
        java.lang.String str24 = bookRequest20.getRequester();
        java.lang.String str25 = bookRequest20.getBookTitle();
        int int26 = bookRequest20.getPriority();
        java.lang.String str27 = bookRequest20.getRequester();
        java.lang.String str28 = bookRequest20.getBookTitle();
        java.lang.String str29 = bookRequest20.getBookTitle();
        int int30 = bookRequest20.getPriority();
        int int31 = bookRequest13.compareTo(bookRequest20);
        int int32 = bookRequest7.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
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
        int int20 = bookRequest12.getPriority();
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
        int int38 = bookRequest12.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest24", (bookRequest8.compareTo(bookRequest24) == 0) == bookRequest8.equals(bookRequest24));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str8 = bookRequest7.getRequester();
        java.lang.String str9 = bookRequest7.getRequester();
        java.lang.String str10 = bookRequest7.getBookTitle();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest7.getBookTitle();
        int int13 = bookRequest7.getPriority();
        java.lang.String str14 = bookRequest7.getBookTitle();
        java.lang.String str15 = bookRequest7.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "hi!", (int) (byte) 1);
        java.lang.String str20 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getBookTitle();
        java.lang.String str28 = bookRequest24.getBookTitle();
        int int29 = bookRequest24.getPriority();
        int int30 = bookRequest24.getPriority();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        int int35 = bookRequest24.compareTo(bookRequest34);
        java.lang.String str36 = bookRequest34.getRequester();
        java.lang.String str37 = bookRequest34.getRequester();
        java.lang.String str38 = bookRequest34.getRequester();
        int int39 = bookRequest19.compareTo(bookRequest34);
        java.lang.String str40 = bookRequest34.getRequester();
        int int41 = bookRequest7.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest34", (bookRequest3.compareTo(bookRequest34) == 0) == bookRequest3.equals(bookRequest34));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
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
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "hi!", (int) 'a');
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getBookTitle();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) '#');
        int int37 = bookRequest36.getPriority();
        java.lang.String str38 = bookRequest36.getBookTitle();
        request.BookRequest bookRequest42 = new request.BookRequest("", "", (int) ' ');
        int int43 = bookRequest36.compareTo(bookRequest42);
        java.lang.String str44 = bookRequest36.getRequester();
        int int45 = bookRequest30.compareTo(bookRequest36);
        java.lang.String str46 = bookRequest36.getBookTitle();
        int int47 = bookRequest3.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest17 and bookRequest30", (bookRequest17.compareTo(bookRequest30) == 0) == bookRequest17.equals(bookRequest30));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
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
        java.lang.String str24 = bookRequest7.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        java.lang.String str31 = bookRequest28.getBookTitle();
        int int32 = bookRequest28.getPriority();
        int int33 = bookRequest28.getPriority();
        java.lang.String str34 = bookRequest28.getRequester();
        int int35 = bookRequest28.getPriority();
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int44 = bookRequest39.compareTo(bookRequest43);
        java.lang.String str45 = bookRequest39.getRequester();
        int int46 = bookRequest28.compareTo(bookRequest39);
        java.lang.String str47 = bookRequest39.getBookTitle();
        java.lang.String str48 = bookRequest39.getBookTitle();
        int int49 = bookRequest7.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest28", (bookRequest7.compareTo(bookRequest28) == 0) == bookRequest7.equals(bookRequest28));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) '#');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) ' ');
        int int32 = bookRequest25.compareTo(bookRequest31);
        int int33 = bookRequest31.getPriority();
        int int34 = bookRequest31.getPriority();
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str39 = bookRequest38.getRequester();
        java.lang.String str40 = bookRequest38.getBookTitle();
        int int41 = bookRequest38.getPriority();
        java.lang.String str42 = bookRequest38.getBookTitle();
        java.lang.String str43 = bookRequest38.getRequester();
        int int44 = bookRequest38.getPriority();
        int int45 = bookRequest38.getPriority();
        int int46 = bookRequest31.compareTo(bookRequest38);
        int int47 = bookRequest18.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest38", (bookRequest7.compareTo(bookRequest38) == 0) == bookRequest7.equals(bookRequest38));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getBookTitle();
        java.lang.String str15 = bookRequest13.getBookTitle();
        java.lang.String str16 = bookRequest13.getRequester();
        int int17 = bookRequest9.compareTo(bookRequest13);
        java.lang.String str18 = bookRequest13.getBookTitle();
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
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str39 = bookRequest38.getBookTitle();
        java.lang.String str40 = bookRequest38.getRequester();
        java.lang.String str41 = bookRequest38.getRequester();
        int int42 = bookRequest22.compareTo(bookRequest38);
        int int43 = bookRequest22.getPriority();
        int int44 = bookRequest13.compareTo(bookRequest22);
        int int45 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        int int12 = bookRequest7.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str21 = bookRequest20.getRequester();
        java.lang.String str22 = bookRequest20.getBookTitle();
        int int23 = bookRequest16.compareTo(bookRequest20);
        java.lang.String str24 = bookRequest16.getRequester();
        java.lang.String str25 = bookRequest16.getRequester();
        java.lang.String str26 = bookRequest16.getBookTitle();
        int int27 = bookRequest7.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest20", (bookRequest7.compareTo(bookRequest20) == 0) == bookRequest7.equals(bookRequest20));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
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
        request.BookRequest bookRequest30 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", 97);
        int int35 = bookRequest34.getPriority();
        java.lang.String str36 = bookRequest34.getBookTitle();
        int int37 = bookRequest30.compareTo(bookRequest34);
        request.BookRequest bookRequest41 = new request.BookRequest("", "", (int) (short) 10);
        int int42 = bookRequest30.compareTo(bookRequest41);
        java.lang.String str43 = bookRequest41.getRequester();
        int int44 = bookRequest7.compareTo(bookRequest41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest30", (bookRequest3.compareTo(bookRequest30) == 0) == bookRequest3.equals(bookRequest30));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
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
        java.lang.String str21 = bookRequest13.getRequester();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str26 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str31 = bookRequest30.getRequester();
        java.lang.String str32 = bookRequest30.getBookTitle();
        int int33 = bookRequest30.getPriority();
        int int34 = bookRequest25.compareTo(bookRequest30);
        int int35 = bookRequest30.getPriority();
        int int36 = bookRequest13.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest30", (bookRequest13.compareTo(bookRequest30) == 0) == bookRequest13.equals(bookRequest30));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getBookTitle();
        java.lang.String str15 = bookRequest11.getRequester();
        int int16 = bookRequest11.getPriority();
        int int17 = bookRequest11.getPriority();
        int int18 = bookRequest11.getPriority();
        java.lang.String str19 = bookRequest11.getRequester();
        int int20 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest28 = new request.BookRequest("", "", 1);
        java.lang.String str29 = bookRequest28.getBookTitle();
        java.lang.String str30 = bookRequest28.getBookTitle();
        java.lang.String str31 = bookRequest28.getRequester();
        int int32 = bookRequest24.compareTo(bookRequest28);
        java.lang.String str33 = bookRequest24.getRequester();
        java.lang.String str34 = bookRequest24.getBookTitle();
        int int35 = bookRequest11.compareTo(bookRequest24);
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str44 = bookRequest43.getRequester();
        int int45 = bookRequest43.getPriority();
        java.lang.String str46 = bookRequest43.getBookTitle();
        java.lang.String str47 = bookRequest43.getRequester();
        int int48 = bookRequest43.getPriority();
        java.lang.String str49 = bookRequest43.getBookTitle();
        int int50 = bookRequest43.getPriority();
        int int51 = bookRequest43.getPriority();
        int int52 = bookRequest39.compareTo(bookRequest43);
        request.BookRequest bookRequest56 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest60 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str61 = bookRequest60.getBookTitle();
        java.lang.String str62 = bookRequest60.getRequester();
        int int63 = bookRequest60.getPriority();
        int int64 = bookRequest56.compareTo(bookRequest60);
        int int65 = bookRequest39.compareTo(bookRequest60);
        int int66 = bookRequest11.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest60", (bookRequest3.compareTo(bookRequest60) == 0) == bookRequest3.equals(bookRequest60));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str10 = bookRequest9.getRequester();
        java.lang.String str11 = bookRequest9.getBookTitle();
        int int12 = bookRequest9.getPriority();
        java.lang.String str13 = bookRequest9.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str15 = bookRequest9.getRequester();
        request.BookRequest bookRequest19 = new request.BookRequest("", "", 1);
        java.lang.String str20 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str25 = bookRequest24.getRequester();
        int int26 = bookRequest24.getPriority();
        java.lang.String str27 = bookRequest24.getBookTitle();
        java.lang.String str28 = bookRequest24.getRequester();
        int int29 = bookRequest24.getPriority();
        int int30 = bookRequest19.compareTo(bookRequest24);
        java.lang.String str31 = bookRequest19.getBookTitle();
        java.lang.String str32 = bookRequest19.getBookTitle();
        int int33 = bookRequest19.getPriority();
        int int34 = bookRequest19.getPriority();
        java.lang.String str35 = bookRequest19.getBookTitle();
        int int36 = bookRequest9.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 32);
        java.lang.String str4 = bookRequest3.getRequester();
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
        int int30 = bookRequest25.getPriority();
        int int31 = bookRequest3.compareTo(bookRequest25);
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        int int36 = bookRequest35.getPriority();
        java.lang.String str37 = bookRequest35.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str42 = bookRequest41.getRequester();
        java.lang.String str43 = bookRequest41.getBookTitle();
        int int44 = bookRequest41.getPriority();
        java.lang.String str45 = bookRequest41.getRequester();
        int int46 = bookRequest35.compareTo(bookRequest41);
        java.lang.String str47 = bookRequest41.getBookTitle();
        int int48 = bookRequest41.getPriority();
        int int49 = bookRequest3.compareTo(bookRequest41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest35", (bookRequest12.compareTo(bookRequest35) == 0) == bookRequest12.equals(bookRequest35));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        java.lang.String str25 = bookRequest23.getRequester();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest23.getPriority();
        int int29 = bookRequest23.getPriority();
        java.lang.String str30 = bookRequest23.getRequester();
        int int31 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 32);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest12 = new request.BookRequest("", "", 1);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.getBookTitle();
        java.lang.String str15 = bookRequest12.getRequester();
        int int16 = bookRequest8.compareTo(bookRequest12);
        java.lang.String str17 = bookRequest8.getRequester();
        java.lang.String str18 = bookRequest8.getBookTitle();
        int int19 = bookRequest8.getPriority();
        java.lang.String str20 = bookRequest8.getRequester();
        int int21 = bookRequest3.compareTo(bookRequest8);
        request.BookRequest bookRequest25 = new request.BookRequest("", "", 1);
        java.lang.String str26 = bookRequest25.getRequester();
        java.lang.String str27 = bookRequest25.getBookTitle();
        java.lang.String str28 = bookRequest25.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "hi!", 52);
        int int37 = bookRequest32.compareTo(bookRequest36);
        int int38 = bookRequest32.getPriority();
        int int39 = bookRequest25.compareTo(bookRequest32);
        java.lang.String str40 = bookRequest32.getRequester();
        int int41 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest36", (bookRequest8.compareTo(bookRequest36) == 0) == bookRequest8.equals(bookRequest36));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
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
        java.lang.String str38 = bookRequest20.getBookTitle();
        int int39 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest20", (bookRequest10.compareTo(bookRequest20) == 0) == bookRequest10.equals(bookRequest20));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest12 = new request.BookRequest("", "", (int) (short) 0);
        int int13 = bookRequest8.compareTo(bookRequest12);
        int int14 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str15 = bookRequest12.getBookTitle();
        java.lang.String str16 = bookRequest12.getBookTitle();
        int int17 = bookRequest12.getPriority();
        java.lang.String str18 = bookRequest12.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", (int) '4');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getBookTitle();
        java.lang.String str25 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int30 = bookRequest22.compareTo(bookRequest29);
        int int31 = bookRequest22.getPriority();
        java.lang.String str32 = bookRequest22.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) ' ');
        int int37 = bookRequest36.getPriority();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str42 = bookRequest41.getRequester();
        int int43 = bookRequest41.getPriority();
        request.BookRequest bookRequest47 = new request.BookRequest("", "", 1);
        java.lang.String str48 = bookRequest47.getBookTitle();
        int int49 = bookRequest41.compareTo(bookRequest47);
        int int50 = bookRequest36.compareTo(bookRequest47);
        java.lang.String str51 = bookRequest36.getRequester();
        int int52 = bookRequest22.compareTo(bookRequest36);
        int int53 = bookRequest12.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest36", (bookRequest3.compareTo(bookRequest36) == 0) == bookRequest3.equals(bookRequest36));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
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
        request.BookRequest bookRequest19 = new request.BookRequest("", "hi!", (int) '4');
        int int20 = bookRequest19.getPriority();
        java.lang.String str21 = bookRequest19.getBookTitle();
        java.lang.String str22 = bookRequest19.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int27 = bookRequest19.compareTo(bookRequest26);
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) ' ');
        int int32 = bookRequest31.getPriority();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str37 = bookRequest36.getRequester();
        int int38 = bookRequest36.getPriority();
        request.BookRequest bookRequest42 = new request.BookRequest("", "", 1);
        java.lang.String str43 = bookRequest42.getBookTitle();
        int int44 = bookRequest36.compareTo(bookRequest42);
        int int45 = bookRequest31.compareTo(bookRequest42);
        int int46 = bookRequest26.compareTo(bookRequest42);
        java.lang.String str47 = bookRequest26.getRequester();
        java.lang.String str48 = bookRequest26.getRequester();
        int int49 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
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
        java.lang.String str16 = bookRequest10.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("", "hi!", (int) (byte) 100);
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
        java.lang.String str42 = bookRequest24.getRequester();
        int int43 = bookRequest24.getPriority();
        int int44 = bookRequest20.compareTo(bookRequest24);
        java.lang.String str45 = bookRequest20.getBookTitle();
        java.lang.String str46 = bookRequest20.getRequester();
        int int47 = bookRequest10.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str9 = bookRequest8.getRequester();
        java.lang.String str10 = bookRequest8.getBookTitle();
        int int11 = bookRequest8.getPriority();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest3.getRequester();
        java.lang.String str14 = bookRequest3.getRequester();
        int int15 = bookRequest3.getPriority();
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
        java.lang.String str33 = bookRequest19.getBookTitle();
        int int34 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest25", (bookRequest8.compareTo(bookRequest25) == 0) == bookRequest8.equals(bookRequest25));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
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
        int int27 = bookRequest8.getPriority();
        java.lang.String str28 = bookRequest8.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str33 = bookRequest32.getRequester();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getBookTitle();
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "hi!", 100);
        int int40 = bookRequest32.compareTo(bookRequest39);
        java.lang.String str41 = bookRequest32.getRequester();
        java.lang.String str42 = bookRequest32.getBookTitle();
        java.lang.String str43 = bookRequest32.getRequester();
        int int44 = bookRequest8.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest21 and bookRequest32", (bookRequest21.compareTo(bookRequest32) == 0) == bookRequest21.equals(bookRequest32));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int28 = bookRequest27.getPriority();
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", (int) '#');
        int int33 = bookRequest32.getPriority();
        java.lang.String str34 = bookRequest32.getBookTitle();
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) ' ');
        int int39 = bookRequest32.compareTo(bookRequest38);
        int int40 = bookRequest27.compareTo(bookRequest38);
        int int41 = bookRequest15.compareTo(bookRequest27);
        int int42 = bookRequest27.getPriority();
        request.BookRequest bookRequest46 = new request.BookRequest("", "hi!", (int) (byte) 100);
        request.BookRequest bookRequest50 = new request.BookRequest("hi!", "", (int) 'a');
        int int51 = bookRequest50.getPriority();
        int int52 = bookRequest50.getPriority();
        java.lang.String str53 = bookRequest50.getBookTitle();
        java.lang.String str54 = bookRequest50.getRequester();
        java.lang.String str55 = bookRequest50.getBookTitle();
        int int56 = bookRequest50.getPriority();
        java.lang.String str57 = bookRequest50.getBookTitle();
        int int58 = bookRequest46.compareTo(bookRequest50);
        java.lang.String str59 = bookRequest46.getBookTitle();
        java.lang.String str60 = bookRequest46.getRequester();
        int int61 = bookRequest46.getPriority();
        int int62 = bookRequest27.compareTo(bookRequest46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest50", (bookRequest7.compareTo(bookRequest50) == 0) == bookRequest7.equals(bookRequest50));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
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
        int int33 = bookRequest30.getPriority();
        java.lang.String str34 = bookRequest30.getRequester();
        java.lang.String str35 = bookRequest30.getRequester();
        request.BookRequest bookRequest39 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str40 = bookRequest39.getRequester();
        int int41 = bookRequest39.getPriority();
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "", (int) 'a');
        int int46 = bookRequest45.getPriority();
        int int47 = bookRequest45.getPriority();
        java.lang.String str48 = bookRequest45.getBookTitle();
        int int49 = bookRequest45.getPriority();
        int int50 = bookRequest45.getPriority();
        int int51 = bookRequest39.compareTo(bookRequest45);
        request.BookRequest bookRequest55 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int56 = bookRequest45.compareTo(bookRequest55);
        int int57 = bookRequest30.compareTo(bookRequest45);
        java.lang.String str58 = bookRequest30.getBookTitle();
        int int59 = bookRequest30.getPriority();
        int int60 = bookRequest11.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest39", (bookRequest3.compareTo(bookRequest39) == 0) == bookRequest3.equals(bookRequest39));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
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
        java.lang.String str18 = bookRequest3.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str23 = bookRequest22.getRequester();
        java.lang.String str24 = bookRequest22.getBookTitle();
        int int25 = bookRequest22.getPriority();
        java.lang.String str26 = bookRequest22.getBookTitle();
        java.lang.String str27 = bookRequest22.getRequester();
        java.lang.String str28 = bookRequest22.getBookTitle();
        java.lang.String str29 = bookRequest22.getRequester();
        java.lang.String str30 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) 'a');
        int int35 = bookRequest34.getPriority();
        java.lang.String str36 = bookRequest34.getRequester();
        java.lang.String str37 = bookRequest34.getRequester();
        int int38 = bookRequest34.getPriority();
        int int39 = bookRequest34.getPriority();
        java.lang.String str40 = bookRequest34.getRequester();
        int int41 = bookRequest22.compareTo(bookRequest34);
        request.BookRequest bookRequest45 = new request.BookRequest("", "hi!", 10);
        java.lang.String str46 = bookRequest45.getRequester();
        java.lang.String str47 = bookRequest45.getBookTitle();
        int int48 = bookRequest22.compareTo(bookRequest45);
        int int49 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest45", (bookRequest3.compareTo(bookRequest45) == 0) == bookRequest3.equals(bookRequest45));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest9.compareTo(bookRequest13);
        int int17 = bookRequest13.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str19 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest23.getPriority();
        java.lang.String str29 = bookRequest23.getRequester();
        int int30 = bookRequest23.getPriority();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int39 = bookRequest34.compareTo(bookRequest38);
        java.lang.String str40 = bookRequest34.getRequester();
        int int41 = bookRequest23.compareTo(bookRequest34);
        java.lang.String str42 = bookRequest34.getRequester();
        java.lang.String str43 = bookRequest34.getBookTitle();
        java.lang.String str44 = bookRequest34.getBookTitle();
        int int45 = bookRequest34.getPriority();
        int int46 = bookRequest3.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest38", (bookRequest9.compareTo(bookRequest38) == 0) == bookRequest9.equals(bookRequest38));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
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
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) '4');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getBookTitle();
        int int27 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest24", (bookRequest3.compareTo(bookRequest24) == 0) == bookRequest3.equals(bookRequest24));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
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
        request.BookRequest bookRequest38 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str39 = bookRequest38.getBookTitle();
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str44 = bookRequest43.getBookTitle();
        int int45 = bookRequest43.getPriority();
        java.lang.String str46 = bookRequest43.getBookTitle();
        int int47 = bookRequest38.compareTo(bookRequest43);
        int int48 = bookRequest9.compareTo(bookRequest43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest43", (bookRequest9.compareTo(bookRequest43) == 0) == bookRequest9.equals(bookRequest43));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) 'a');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        int int30 = bookRequest13.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest27", (bookRequest13.compareTo(bookRequest27) == 0) == bookRequest13.equals(bookRequest27));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
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
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) 'a');
        int int21 = bookRequest20.getPriority();
        java.lang.String str22 = bookRequest20.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str27 = bookRequest26.getRequester();
        java.lang.String str28 = bookRequest26.getBookTitle();
        int int29 = bookRequest26.getPriority();
        java.lang.String str30 = bookRequest26.getRequester();
        int int31 = bookRequest20.compareTo(bookRequest26);
        java.lang.String str32 = bookRequest20.getRequester();
        java.lang.String str33 = bookRequest20.getRequester();
        java.lang.String str34 = bookRequest20.getBookTitle();
        int int35 = bookRequest20.getPriority();
        int int36 = bookRequest3.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest20", (bookRequest8.compareTo(bookRequest20) == 0) == bookRequest8.equals(bookRequest20));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.String str27 = bookRequest26.getBookTitle();
        java.lang.String str28 = bookRequest26.getRequester();
        java.lang.String str29 = bookRequest26.getRequester();
        request.BookRequest bookRequest33 = new request.BookRequest("", "", (int) (byte) 100);
        int int34 = bookRequest26.compareTo(bookRequest33);
        java.lang.String str35 = bookRequest33.getRequester();
        java.lang.String str36 = bookRequest33.getBookTitle();
        int int37 = bookRequest3.compareTo(bookRequest33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest20 and bookRequest33", (bookRequest20.compareTo(bookRequest33) == 0) == bookRequest20.equals(bookRequest33));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 10);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (short) 0);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (short) 100);
        java.lang.String str14 = bookRequest13.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest22 = new request.BookRequest("", "", (int) (short) 0);
        int int23 = bookRequest18.compareTo(bookRequest22);
        java.lang.String str24 = bookRequest22.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", 1);
        java.lang.String str29 = bookRequest28.getBookTitle();
        java.lang.String str30 = bookRequest28.getBookTitle();
        int int31 = bookRequest22.compareTo(bookRequest28);
        int int32 = bookRequest13.compareTo(bookRequest22);
        int int33 = bookRequest13.getPriority();
        int int34 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest22", (bookRequest7.compareTo(bookRequest22) == 0) == bookRequest7.equals(bookRequest22));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", 10);
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getBookTitle();
        int int29 = bookRequest9.compareTo(bookRequest26);
        request.BookRequest bookRequest33 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest37 = new request.BookRequest("", "hi!", 97);
        int int38 = bookRequest37.getPriority();
        java.lang.String str39 = bookRequest37.getBookTitle();
        int int40 = bookRequest33.compareTo(bookRequest37);
        java.lang.String str41 = bookRequest37.getBookTitle();
        java.lang.String str42 = bookRequest37.getRequester();
        int int43 = bookRequest9.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest37", (bookRequest3.compareTo(bookRequest37) == 0) == bookRequest3.equals(bookRequest37));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
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
        java.lang.String str13 = bookRequest3.getRequester();
        int int14 = bookRequest3.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) ' ');
        int int19 = bookRequest18.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 1);
        java.lang.String str30 = bookRequest29.getBookTitle();
        int int31 = bookRequest23.compareTo(bookRequest29);
        int int32 = bookRequest18.compareTo(bookRequest29);
        java.lang.String str33 = bookRequest18.getRequester();
        java.lang.String str34 = bookRequest18.getRequester();
        int int35 = bookRequest18.getPriority();
        int int36 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str11 = bookRequest10.getRequester();
        java.lang.String str12 = bookRequest10.getRequester();
        java.lang.String str13 = bookRequest10.getBookTitle();
        int int14 = bookRequest10.getPriority();
        java.lang.String str15 = bookRequest10.getBookTitle();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", 0);
        int int20 = bookRequest10.compareTo(bookRequest19);
        int int21 = bookRequest3.compareTo(bookRequest19);
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        java.lang.String str33 = bookRequest29.getRequester();
        int int34 = bookRequest29.getPriority();
        java.lang.String str35 = bookRequest29.getBookTitle();
        int int36 = bookRequest29.getPriority();
        int int37 = bookRequest29.getPriority();
        int int38 = bookRequest25.compareTo(bookRequest29);
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str43 = bookRequest42.getRequester();
        java.lang.String str44 = bookRequest42.getBookTitle();
        java.lang.String str45 = bookRequest42.getBookTitle();
        int int46 = bookRequest25.compareTo(bookRequest42);
        java.lang.String str47 = bookRequest25.getRequester();
        int int48 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest29", (bookRequest10.compareTo(bookRequest29) == 0) == bookRequest10.equals(bookRequest29));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str4 = bookRequest3.getRequester();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        java.lang.String str10 = bookRequest8.getRequester();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest8.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", 0);
        java.lang.String str18 = bookRequest17.getBookTitle();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getRequester();
        java.lang.String str21 = bookRequest17.getBookTitle();
        java.lang.String str22 = bookRequest17.getBookTitle();
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", 97);
        java.lang.String str27 = bookRequest26.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) ' ');
        int int32 = bookRequest26.compareTo(bookRequest31);
        java.lang.String str33 = bookRequest31.getRequester();
        java.lang.String str34 = bookRequest31.getRequester();
        int int35 = bookRequest17.compareTo(bookRequest31);
        java.lang.String str36 = bookRequest31.getBookTitle();
        int int37 = bookRequest8.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
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
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        int int36 = bookRequest35.getPriority();
        java.lang.String str37 = bookRequest35.getRequester();
        java.lang.String str38 = bookRequest35.getBookTitle();
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int43 = bookRequest35.compareTo(bookRequest42);
        int int44 = bookRequest42.getPriority();
        int int45 = bookRequest42.getPriority();
        java.lang.String str46 = bookRequest42.getBookTitle();
        int int47 = bookRequest3.compareTo(bookRequest42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest42", (bookRequest3.compareTo(bookRequest42) == 0) == bookRequest3.equals(bookRequest42));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
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
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "hi!", (-1));
        int int36 = bookRequest31.compareTo(bookRequest35);
        java.lang.String str37 = bookRequest35.getBookTitle();
        int int38 = bookRequest24.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest24 and bookRequest35", (bookRequest24.compareTo(bookRequest35) == 0) == bookRequest24.equals(bookRequest35));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
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
        int int24 = bookRequest22.getPriority();
        int int25 = bookRequest22.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) '#');
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getBookTitle();
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) ' ');
        int int36 = bookRequest29.compareTo(bookRequest35);
        java.lang.String str37 = bookRequest29.getRequester();
        java.lang.String str38 = bookRequest29.getRequester();
        int int39 = bookRequest29.getPriority();
        int int40 = bookRequest29.getPriority();
        java.lang.String str41 = bookRequest29.getBookTitle();
        int int42 = bookRequest22.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest29", (bookRequest9.compareTo(bookRequest29) == 0) == bookRequest9.equals(bookRequest29));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        request.BookRequest bookRequest9 = new request.BookRequest("hi!", "", (int) (short) 0);
        request.BookRequest bookRequest13 = new request.BookRequest("", "", (int) (byte) 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getRequester();
        int int16 = bookRequest9.compareTo(bookRequest13);
        int int17 = bookRequest13.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest13);
        java.lang.String str19 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest23 = new request.BookRequest("", "hi!", (int) (short) 0);
        int int24 = bookRequest23.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) (short) 100);
        java.lang.String str29 = bookRequest28.getBookTitle();
        int int30 = bookRequest23.compareTo(bookRequest28);
        java.lang.String str31 = bookRequest28.getRequester();
        java.lang.String str32 = bookRequest28.getBookTitle();
        int int33 = bookRequest3.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest23", (bookRequest9.compareTo(bookRequest23) == 0) == bookRequest9.equals(bookRequest23));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
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
        int int21 = bookRequest8.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", (int) (short) -1);
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str30 = bookRequest29.getBookTitle();
        java.lang.String str31 = bookRequest29.getRequester();
        int int32 = bookRequest29.getPriority();
        java.lang.String str33 = bookRequest29.getRequester();
        java.lang.String str34 = bookRequest29.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str43 = bookRequest42.getRequester();
        java.lang.String str44 = bookRequest42.getBookTitle();
        int int45 = bookRequest38.compareTo(bookRequest42);
        java.lang.String str46 = bookRequest38.getRequester();
        java.lang.String str47 = bookRequest38.getBookTitle();
        java.lang.String str48 = bookRequest38.getRequester();
        int int49 = bookRequest29.compareTo(bookRequest38);
        int int50 = bookRequest25.compareTo(bookRequest29);
        request.BookRequest bookRequest54 = new request.BookRequest("hi!", "", (int) 'a');
        int int55 = bookRequest54.getPriority();
        int int56 = bookRequest54.getPriority();
        java.lang.String str57 = bookRequest54.getRequester();
        int int58 = bookRequest54.getPriority();
        java.lang.String str59 = bookRequest54.getRequester();
        request.BookRequest bookRequest63 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str64 = bookRequest63.getBookTitle();
        int int65 = bookRequest54.compareTo(bookRequest63);
        int int66 = bookRequest29.compareTo(bookRequest54);
        java.lang.String str67 = bookRequest54.getRequester();
        int int68 = bookRequest54.getPriority();
        int int69 = bookRequest54.getPriority();
        int int70 = bookRequest8.compareTo(bookRequest54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
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
        java.lang.String str20 = bookRequest3.getRequester();
        java.lang.String str21 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", 10);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getRequester();
        int int33 = bookRequest29.getPriority();
        java.lang.String str34 = bookRequest29.getBookTitle();
        int int35 = bookRequest29.getPriority();
        int int36 = bookRequest25.compareTo(bookRequest29);
        int int37 = bookRequest29.getPriority();
        java.lang.String str38 = bookRequest29.getRequester();
        java.lang.String str39 = bookRequest29.getRequester();
        java.lang.String str40 = bookRequest29.getBookTitle();
        int int41 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest29", (bookRequest7.compareTo(bookRequest29) == 0) == bookRequest7.equals(bookRequest29));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getBookTitle();
        int int27 = bookRequest23.getPriority();
        int int28 = bookRequest23.getPriority();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", 52);
        int int33 = bookRequest23.compareTo(bookRequest32);
        int int34 = bookRequest32.getPriority();
        int int35 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
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
        request.BookRequest bookRequest28 = new request.BookRequest("", "", 100);
        int int29 = bookRequest28.getPriority();
        int int30 = bookRequest28.getPriority();
        int int31 = bookRequest17.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", 97);
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
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
        int int23 = bookRequest3.compareTo(bookRequest10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest10", (bookRequest3.compareTo(bookRequest10) == 0) == bookRequest3.equals(bookRequest10));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 0);
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", 1);
        java.lang.String str11 = bookRequest10.getBookTitle();
        java.lang.String str12 = bookRequest10.getBookTitle();
        java.lang.String str13 = bookRequest10.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest10);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "hi!", 52);
        int int23 = bookRequest18.compareTo(bookRequest22);
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getRequester();
        java.lang.String str34 = bookRequest31.getBookTitle();
        int int35 = bookRequest27.compareTo(bookRequest31);
        java.lang.String str36 = bookRequest27.getBookTitle();
        int int37 = bookRequest27.getPriority();
        java.lang.String str38 = bookRequest27.getBookTitle();
        int int39 = bookRequest22.compareTo(bookRequest27);
        int int40 = bookRequest3.compareTo(bookRequest22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str15 = bookRequest14.getRequester();
        java.lang.String str16 = bookRequest14.getBookTitle();
        int int17 = bookRequest14.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str19 = bookRequest3.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (byte) 10);
        int int24 = bookRequest23.getPriority();
        int int25 = bookRequest23.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        java.lang.String str33 = bookRequest29.getRequester();
        int int34 = bookRequest29.getPriority();
        int int35 = bookRequest23.compareTo(bookRequest29);
        int int36 = bookRequest23.getPriority();
        java.lang.String str37 = bookRequest23.getRequester();
        int int38 = bookRequest23.getPriority();
        int int39 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest29", (bookRequest3.compareTo(bookRequest29) == 0) == bookRequest3.equals(bookRequest29));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        request.BookRequest bookRequest10 = new request.BookRequest("", "hi!", (int) (byte) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest3.getBookTitle();
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
        java.lang.String str32 = bookRequest29.getRequester();
        java.lang.String str33 = bookRequest29.getBookTitle();
        int int34 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest29", (bookRequest10.compareTo(bookRequest29) == 0) == bookRequest10.equals(bookRequest29));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getRequester();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "", (int) 'a');
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str21 = bookRequest20.getRequester();
        int int22 = bookRequest20.getPriority();
        int int23 = bookRequest14.compareTo(bookRequest20);
        int int24 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest14", (bookRequest3.compareTo(bookRequest14) == 0) == bookRequest3.equals(bookRequest14));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
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
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        int int24 = bookRequest23.getPriority();
        java.lang.String str25 = bookRequest23.getRequester();
        int int26 = bookRequest23.getPriority();
        int int27 = bookRequest23.getPriority();
        java.lang.String str28 = bookRequest23.getBookTitle();
        int int29 = bookRequest23.getPriority();
        java.lang.String str30 = bookRequest23.getBookTitle();
        int int31 = bookRequest23.getPriority();
        java.lang.String str32 = bookRequest23.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("", "", 1);
        java.lang.String str37 = bookRequest36.getRequester();
        int int38 = bookRequest23.compareTo(bookRequest36);
        int int39 = bookRequest19.compareTo(bookRequest36);
        java.lang.String str40 = bookRequest19.getRequester();
        int int41 = bookRequest7.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 0);
        int int28 = bookRequest23.compareTo(bookRequest27);
        java.lang.String str29 = bookRequest27.getRequester();
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getBookTitle();
        java.lang.String str32 = bookRequest27.getRequester();
        int int33 = bookRequest12.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getRequester();
        int int14 = bookRequest7.getPriority();
        int int15 = bookRequest7.getPriority();
        request.BookRequest bookRequest19 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest19.compareTo(bookRequest23);
        java.lang.String str26 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str31 = bookRequest30.getRequester();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest39 = new request.BookRequest("", "", (int) (short) 0);
        int int40 = bookRequest35.compareTo(bookRequest39);
        int int41 = bookRequest30.compareTo(bookRequest39);
        java.lang.String str42 = bookRequest39.getBookTitle();
        java.lang.String str43 = bookRequest39.getBookTitle();
        java.lang.String str44 = bookRequest39.getBookTitle();
        java.lang.String str45 = bookRequest39.getRequester();
        int int46 = bookRequest39.getPriority();
        java.lang.String str47 = bookRequest39.getRequester();
        int int48 = bookRequest23.compareTo(bookRequest39);
        int int49 = bookRequest7.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
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
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str22 = bookRequest21.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 0);
        int int31 = bookRequest26.compareTo(bookRequest30);
        int int32 = bookRequest21.compareTo(bookRequest30);
        java.lang.String str33 = bookRequest30.getBookTitle();
        int int34 = bookRequest30.getPriority();
        java.lang.String str35 = bookRequest30.getBookTitle();
        java.lang.String str36 = bookRequest30.getBookTitle();
        java.lang.String str37 = bookRequest30.getBookTitle();
        int int38 = bookRequest30.getPriority();
        java.lang.String str39 = bookRequest30.getBookTitle();
        int int40 = bookRequest3.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest26", (bookRequest9.compareTo(bookRequest26) == 0) == bookRequest9.equals(bookRequest26));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
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
        java.lang.String str30 = bookRequest19.getRequester();
        int int31 = bookRequest19.getPriority();
        int int32 = bookRequest3.compareTo(bookRequest19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", 97);
        int int8 = bookRequest7.getPriority();
        java.lang.String str9 = bookRequest7.getBookTitle();
        int int10 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 10);
        int int15 = bookRequest3.compareTo(bookRequest14);
        java.lang.String str16 = bookRequest14.getRequester();
        request.BookRequest bookRequest20 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str21 = bookRequest20.getBookTitle();
        java.lang.String str22 = bookRequest20.getRequester();
        int int23 = bookRequest20.getPriority();
        java.lang.String str24 = bookRequest20.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        java.lang.String str30 = bookRequest28.getRequester();
        int int31 = bookRequest28.getPriority();
        java.lang.String str32 = bookRequest28.getRequester();
        java.lang.String str33 = bookRequest28.getBookTitle();
        int int34 = bookRequest28.getPriority();
        java.lang.String str35 = bookRequest28.getRequester();
        java.lang.String str36 = bookRequest28.getBookTitle();
        int int37 = bookRequest20.compareTo(bookRequest28);
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "hi!", 52);
        int int42 = bookRequest20.compareTo(bookRequest41);
        java.lang.String str43 = bookRequest20.getRequester();
        java.lang.String str44 = bookRequest20.getRequester();
        int int45 = bookRequest20.getPriority();
        int int46 = bookRequest14.compareTo(bookRequest20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest28", (bookRequest7.compareTo(bookRequest28) == 0) == bookRequest7.equals(bookRequest28));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getBookTitle();
        java.lang.String str7 = bookRequest3.getBookTitle();
        int int8 = bookRequest3.getPriority();
        java.lang.String str9 = bookRequest3.getBookTitle();
        java.lang.String str10 = bookRequest3.getBookTitle();
        java.lang.String str11 = bookRequest3.getRequester();
        int int12 = bookRequest3.getPriority();
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "hi!", (int) 'a');
        request.BookRequest bookRequest20 = new request.BookRequest("hi!", "", (int) (byte) 1);
        java.lang.String str21 = bookRequest20.getBookTitle();
        int int22 = bookRequest20.getPriority();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "hi!", (int) '#');
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 10);
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest26.compareTo(bookRequest30);
        int int33 = bookRequest20.compareTo(bookRequest26);
        int int34 = bookRequest16.compareTo(bookRequest26);
        java.lang.String str35 = bookRequest26.getRequester();
        int int36 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest16", (bookRequest3.compareTo(bookRequest16) == 0) == bookRequest3.equals(bookRequest16));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest10 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int11 = bookRequest3.compareTo(bookRequest10);
        int int12 = bookRequest10.getPriority();
        java.lang.String str13 = bookRequest10.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("", "hi!", (int) (byte) 10);
        java.lang.String str18 = bookRequest17.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) '#');
        int int23 = bookRequest22.getPriority();
        java.lang.String str24 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("", "", (int) ' ');
        int int29 = bookRequest22.compareTo(bookRequest28);
        java.lang.String str30 = bookRequest22.getBookTitle();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest38 = new request.BookRequest("", "", 1);
        java.lang.String str39 = bookRequest38.getBookTitle();
        java.lang.String str40 = bookRequest38.getBookTitle();
        java.lang.String str41 = bookRequest38.getRequester();
        int int42 = bookRequest34.compareTo(bookRequest38);
        int int43 = bookRequest38.getPriority();
        int int44 = bookRequest22.compareTo(bookRequest38);
        int int45 = bookRequest38.getPriority();
        int int46 = bookRequest17.compareTo(bookRequest38);
        int int47 = bookRequest17.getPriority();
        int int48 = bookRequest17.getPriority();
        java.lang.String str49 = bookRequest17.getRequester();
        int int50 = bookRequest10.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest38", (bookRequest10.compareTo(bookRequest38) == 0) == bookRequest10.equals(bookRequest38));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
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
        request.BookRequest bookRequest32 = new request.BookRequest("hi!", "", 0);
        java.lang.String str33 = bookRequest32.getBookTitle();
        int int34 = bookRequest32.getPriority();
        java.lang.String str35 = bookRequest32.getBookTitle();
        java.lang.String str36 = bookRequest32.getRequester();
        int int37 = bookRequest3.compareTo(bookRequest32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest23 and bookRequest32", (bookRequest23.compareTo(bookRequest32) == 0) == bookRequest23.equals(bookRequest32));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
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
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "hi!", 0);
        int int40 = bookRequest39.getPriority();
        java.lang.String str41 = bookRequest39.getBookTitle();
        int int42 = bookRequest30.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest20 and bookRequest39", (bookRequest20.compareTo(bookRequest39) == 0) == bookRequest20.equals(bookRequest39));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (byte) 10);
        int int15 = bookRequest14.getPriority();
        java.lang.String str16 = bookRequest14.getRequester();
        java.lang.String str17 = bookRequest14.getRequester();
        java.lang.String str18 = bookRequest14.getBookTitle();
        int int19 = bookRequest7.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest14", (bookRequest7.compareTo(bookRequest14) == 0) == bookRequest7.equals(bookRequest14));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str4 = bookRequest3.getRequester();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", 0);
        int int13 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (-1));
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str22 = bookRequest21.getRequester();
        int int23 = bookRequest17.compareTo(bookRequest21);
        java.lang.String str24 = bookRequest17.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("", "hi!", (int) '4');
        int int29 = bookRequest17.compareTo(bookRequest28);
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
        int int46 = bookRequest28.compareTo(bookRequest37);
        java.lang.String str47 = bookRequest37.getRequester();
        int int48 = bookRequest3.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest37", (bookRequest3.compareTo(bookRequest37) == 0) == bookRequest3.equals(bookRequest37));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getRequester();
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str32 = bookRequest31.getRequester();
        java.lang.String str33 = bookRequest31.getBookTitle();
        int int34 = bookRequest31.getPriority();
        java.lang.String str35 = bookRequest31.getRequester();
        int int36 = bookRequest25.compareTo(bookRequest31);
        java.lang.String str37 = bookRequest25.getRequester();
        request.BookRequest bookRequest41 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int42 = bookRequest25.compareTo(bookRequest41);
        int int43 = bookRequest25.getPriority();
        request.BookRequest bookRequest47 = new request.BookRequest("", "hi!", 52);
        int int48 = bookRequest25.compareTo(bookRequest47);
        int int49 = bookRequest3.compareTo(bookRequest47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest25", (bookRequest3.compareTo(bookRequest25) == 0) == bookRequest3.equals(bookRequest25));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
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
        int int24 = bookRequest12.getPriority();
        int int25 = bookRequest12.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str30 = bookRequest29.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest38 = new request.BookRequest("", "", (int) (short) 0);
        int int39 = bookRequest34.compareTo(bookRequest38);
        int int40 = bookRequest29.compareTo(bookRequest38);
        java.lang.String str41 = bookRequest38.getBookTitle();
        request.BookRequest bookRequest45 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str46 = bookRequest45.getRequester();
        int int47 = bookRequest45.getPriority();
        int int48 = bookRequest38.compareTo(bookRequest45);
        java.lang.String str49 = bookRequest45.getRequester();
        java.lang.String str50 = bookRequest45.getRequester();
        java.lang.String str51 = bookRequest45.getRequester();
        int int52 = bookRequest12.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest45", (bookRequest3.compareTo(bookRequest45) == 0) == bookRequest3.equals(bookRequest45));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
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
        int int21 = bookRequest3.getPriority();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 1);
        java.lang.String str30 = bookRequest29.getBookTitle();
        java.lang.String str31 = bookRequest29.getBookTitle();
        java.lang.String str32 = bookRequest29.getRequester();
        int int33 = bookRequest25.compareTo(bookRequest29);
        java.lang.String str34 = bookRequest29.getRequester();
        java.lang.String str35 = bookRequest29.getBookTitle();
        int int36 = bookRequest29.getPriority();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", (int) 'a');
        int int41 = bookRequest40.getPriority();
        java.lang.String str42 = bookRequest40.getRequester();
        int int43 = bookRequest29.compareTo(bookRequest40);
        int int44 = bookRequest3.compareTo(bookRequest40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest29", (bookRequest8.compareTo(bookRequest29) == 0) == bookRequest8.equals(bookRequest29));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) '#');
        int int26 = bookRequest25.getPriority();
        java.lang.String str27 = bookRequest25.getBookTitle();
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) ' ');
        int int32 = bookRequest25.compareTo(bookRequest31);
        java.lang.String str33 = bookRequest31.getBookTitle();
        int int34 = bookRequest31.getPriority();
        java.lang.String str35 = bookRequest31.getRequester();
        request.BookRequest bookRequest39 = new request.BookRequest("", "", (int) (byte) -1);
        request.BookRequest bookRequest43 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str44 = bookRequest43.getRequester();
        java.lang.String str45 = bookRequest43.getRequester();
        java.lang.String str46 = bookRequest43.getBookTitle();
        int int47 = bookRequest39.compareTo(bookRequest43);
        java.lang.String str48 = bookRequest39.getBookTitle();
        int int49 = bookRequest39.getPriority();
        int int50 = bookRequest31.compareTo(bookRequest39);
        int int51 = bookRequest19.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest43", (bookRequest3.compareTo(bookRequest43) == 0) == bookRequest3.equals(bookRequest43));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) 'a');
        int int9 = bookRequest8.getPriority();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        java.lang.String str12 = bookRequest8.getBookTitle();
        int int13 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str14 = bookRequest3.getRequester();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) ' ');
        int int19 = bookRequest18.getPriority();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str24 = bookRequest23.getRequester();
        int int25 = bookRequest23.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "", 1);
        java.lang.String str30 = bookRequest29.getBookTitle();
        int int31 = bookRequest23.compareTo(bookRequest29);
        int int32 = bookRequest18.compareTo(bookRequest29);
        java.lang.String str33 = bookRequest18.getRequester();
        java.lang.String str34 = bookRequest18.getRequester();
        int int35 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest23", (bookRequest8.compareTo(bookRequest23) == 0) == bookRequest8.equals(bookRequest23));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
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
        java.lang.String str20 = bookRequest3.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", 35);
        int int25 = bookRequest24.getPriority();
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) '4');
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getRequester();
        java.lang.String str32 = bookRequest29.getRequester();
        java.lang.String str33 = bookRequest29.getRequester();
        request.BookRequest bookRequest37 = new request.BookRequest("hi!", "", (int) 'a');
        int int38 = bookRequest37.getPriority();
        java.lang.String str39 = bookRequest37.getRequester();
        int int40 = bookRequest37.getPriority();
        int int41 = bookRequest37.getPriority();
        java.lang.String str42 = bookRequest37.getBookTitle();
        int int43 = bookRequest37.getPriority();
        java.lang.String str44 = bookRequest37.getBookTitle();
        int int45 = bookRequest37.getPriority();
        java.lang.String str46 = bookRequest37.getRequester();
        request.BookRequest bookRequest50 = new request.BookRequest("", "", 1);
        java.lang.String str51 = bookRequest50.getRequester();
        int int52 = bookRequest37.compareTo(bookRequest50);
        java.lang.String str53 = bookRequest37.getRequester();
        int int54 = bookRequest29.compareTo(bookRequest37);
        int int55 = bookRequest24.compareTo(bookRequest37);
        int int56 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest37", (bookRequest3.compareTo(bookRequest37) == 0) == bookRequest3.equals(bookRequest37));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getBookTitle();
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getBookTitle();
        java.lang.String str13 = bookRequest7.getRequester();
        int int14 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str19 = bookRequest18.getBookTitle();
        java.lang.String str20 = bookRequest18.getRequester();
        java.lang.String str21 = bookRequest18.getRequester();
        java.lang.String str22 = bookRequest18.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str27 = bookRequest26.getBookTitle();
        java.lang.String str28 = bookRequest26.getBookTitle();
        int int29 = bookRequest18.compareTo(bookRequest26);
        java.lang.String str30 = bookRequest26.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str35 = bookRequest34.getRequester();
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest43 = new request.BookRequest("", "", (int) (short) 0);
        int int44 = bookRequest39.compareTo(bookRequest43);
        int int45 = bookRequest34.compareTo(bookRequest43);
        java.lang.String str46 = bookRequest43.getBookTitle();
        int int47 = bookRequest43.getPriority();
        int int48 = bookRequest43.getPriority();
        int int49 = bookRequest43.getPriority();
        int int50 = bookRequest43.getPriority();
        java.lang.String str51 = bookRequest43.getRequester();
        int int52 = bookRequest26.compareTo(bookRequest43);
        int int53 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest43", (bookRequest3.compareTo(bookRequest43) == 0) == bookRequest3.equals(bookRequest43));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
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
        request.BookRequest bookRequest24 = new request.BookRequest("hi!", "", (int) 'a');
        int int25 = bookRequest24.getPriority();
        java.lang.String str26 = bookRequest24.getRequester();
        int int27 = bookRequest24.getPriority();
        java.lang.String str28 = bookRequest24.getRequester();
        java.lang.String str29 = bookRequest24.getBookTitle();
        int int30 = bookRequest24.getPriority();
        java.lang.String str31 = bookRequest24.getRequester();
        java.lang.String str32 = bookRequest24.getBookTitle();
        int int33 = bookRequest24.getPriority();
        java.lang.String str34 = bookRequest24.getBookTitle();
        java.lang.String str35 = bookRequest24.getBookTitle();
        java.lang.String str36 = bookRequest24.getRequester();
        int int37 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest24", (bookRequest9.compareTo(bookRequest24) == 0) == bookRequest9.equals(bookRequest24));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) (byte) 1);
        int int13 = bookRequest3.compareTo(bookRequest12);
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", 0);
        java.lang.String str18 = bookRequest17.getBookTitle();
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) 'a');
        int int23 = bookRequest22.getPriority();
        int int24 = bookRequest22.getPriority();
        java.lang.String str25 = bookRequest22.getBookTitle();
        java.lang.String str26 = bookRequest22.getBookTitle();
        int int27 = bookRequest17.compareTo(bookRequest22);
        request.BookRequest bookRequest31 = new request.BookRequest("", "", (int) (byte) 10);
        int int32 = bookRequest31.getPriority();
        int int33 = bookRequest17.compareTo(bookRequest31);
        java.lang.String str34 = bookRequest31.getBookTitle();
        java.lang.String str35 = bookRequest31.getRequester();
        int int36 = bookRequest31.getPriority();
        int int37 = bookRequest12.compareTo(bookRequest31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 52);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", 1);
        java.lang.String str8 = bookRequest7.getBookTitle();
        java.lang.String str9 = bookRequest7.getBookTitle();
        java.lang.String str10 = bookRequest7.getRequester();
        int int11 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str12 = bookRequest3.getRequester();
        java.lang.String str13 = bookRequest3.getBookTitle();
        int int14 = bookRequest3.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", (int) 'a');
        int int19 = bookRequest18.getPriority();
        java.lang.String str20 = bookRequest18.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str29 = bookRequest28.getRequester();
        java.lang.String str30 = bookRequest28.getBookTitle();
        int int31 = bookRequest24.compareTo(bookRequest28);
        java.lang.String str32 = bookRequest24.getRequester();
        java.lang.String str33 = bookRequest24.getRequester();
        java.lang.String str34 = bookRequest24.getBookTitle();
        int int35 = bookRequest18.compareTo(bookRequest24);
        java.lang.String str36 = bookRequest18.getRequester();
        request.BookRequest bookRequest40 = new request.BookRequest("hi!", "", 0);
        java.lang.String str41 = bookRequest40.getBookTitle();
        int int42 = bookRequest40.getPriority();
        java.lang.String str43 = bookRequest40.getBookTitle();
        java.lang.String str44 = bookRequest40.getRequester();
        int int45 = bookRequest18.compareTo(bookRequest40);
        request.BookRequest bookRequest49 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str50 = bookRequest49.getRequester();
        int int51 = bookRequest18.compareTo(bookRequest49);
        java.lang.String str52 = bookRequest49.getRequester();
        java.lang.String str53 = bookRequest49.getRequester();
        int int54 = bookRequest3.compareTo(bookRequest49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest28", (bookRequest7.compareTo(bookRequest28) == 0) == bookRequest7.equals(bookRequest28));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
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
        java.lang.String str30 = bookRequest18.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", (int) (byte) 100);
        int int35 = bookRequest18.compareTo(bookRequest34);
        int int36 = bookRequest18.getPriority();
        int int37 = bookRequest18.getPriority();
        int int38 = bookRequest3.compareTo(bookRequest18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest18", (bookRequest3.compareTo(bookRequest18) == 0) == bookRequest3.equals(bookRequest18));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
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
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str32 = bookRequest31.getRequester();
        int int33 = bookRequest31.getPriority();
        java.lang.String str34 = bookRequest31.getBookTitle();
        java.lang.String str35 = bookRequest31.getRequester();
        int int36 = bookRequest31.getPriority();
        int int37 = bookRequest31.getPriority();
        int int38 = bookRequest31.getPriority();
        int int39 = bookRequest31.getPriority();
        java.lang.String str40 = bookRequest31.getBookTitle();
        int int41 = bookRequest31.getPriority();
        request.BookRequest bookRequest45 = new request.BookRequest("hi!", "", 0);
        java.lang.String str46 = bookRequest45.getBookTitle();
        int int47 = bookRequest45.getPriority();
        java.lang.String str48 = bookRequest45.getBookTitle();
        java.lang.String str49 = bookRequest45.getRequester();
        java.lang.String str50 = bookRequest45.getBookTitle();
        int int51 = bookRequest45.getPriority();
        int int52 = bookRequest31.compareTo(bookRequest45);
        int int53 = bookRequest25.compareTo(bookRequest45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getRequester();
        request.BookRequest bookRequest11 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str12 = bookRequest11.getRequester();
        int int13 = bookRequest11.getPriority();
        java.lang.String str14 = bookRequest11.getBookTitle();
        java.lang.String str15 = bookRequest11.getRequester();
        int int16 = bookRequest11.getPriority();
        int int17 = bookRequest11.getPriority();
        int int18 = bookRequest11.getPriority();
        java.lang.String str19 = bookRequest11.getRequester();
        int int20 = bookRequest3.compareTo(bookRequest11);
        request.BookRequest bookRequest24 = new request.BookRequest("", "hi!", 100);
        java.lang.String str25 = bookRequest24.getRequester();
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        java.lang.String str33 = bookRequest29.getBookTitle();
        int int34 = bookRequest29.getPriority();
        int int35 = bookRequest29.getPriority();
        int int36 = bookRequest29.getPriority();
        java.lang.String str37 = bookRequest29.getRequester();
        int int38 = bookRequest24.compareTo(bookRequest29);
        int int39 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest11 and bookRequest29", (bookRequest11.compareTo(bookRequest29) == 0) == bookRequest11.equals(bookRequest29));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
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
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        java.lang.String str34 = bookRequest30.getBookTitle();
        int int35 = bookRequest30.getPriority();
        java.lang.String str36 = bookRequest30.getBookTitle();
        java.lang.String str37 = bookRequest30.getBookTitle();
        java.lang.String str38 = bookRequest30.getRequester();
        java.lang.String str39 = bookRequest30.getBookTitle();
        int int40 = bookRequest30.getPriority();
        int int41 = bookRequest7.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest30", (bookRequest7.compareTo(bookRequest30) == 0) == bookRequest7.equals(bookRequest30));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getBookTitle();
        java.lang.String str31 = bookRequest26.getBookTitle();
        java.lang.String str32 = bookRequest26.getRequester();
        int int33 = bookRequest26.getPriority();
        int int34 = bookRequest26.getPriority();
        int int35 = bookRequest19.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest26", (bookRequest9.compareTo(bookRequest26) == 0) == bookRequest9.equals(bookRequest26));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getRequester();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getRequester();
        int int14 = bookRequest7.getPriority();
        request.BookRequest bookRequest18 = new request.BookRequest("hi!", "", 32);
        java.lang.String str19 = bookRequest18.getRequester();
        int int20 = bookRequest18.getPriority();
        java.lang.String str21 = bookRequest18.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) 'a');
        int int26 = bookRequest25.getPriority();
        int int27 = bookRequest25.getPriority();
        java.lang.String str28 = bookRequest25.getBookTitle();
        int int29 = bookRequest25.getPriority();
        int int30 = bookRequest25.getPriority();
        java.lang.String str31 = bookRequest25.getRequester();
        int int32 = bookRequest25.getPriority();
        java.lang.String str33 = bookRequest25.getBookTitle();
        int int34 = bookRequest18.compareTo(bookRequest25);
        int int35 = bookRequest7.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest25", (bookRequest7.compareTo(bookRequest25) == 0) == bookRequest7.equals(bookRequest25));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", 0);
        java.lang.String str24 = bookRequest23.getBookTitle();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getRequester();
        java.lang.String str27 = bookRequest23.getBookTitle();
        java.lang.String str28 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", 97);
        java.lang.String str33 = bookRequest32.getRequester();
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) ' ');
        int int38 = bookRequest32.compareTo(bookRequest37);
        java.lang.String str39 = bookRequest37.getRequester();
        java.lang.String str40 = bookRequest37.getRequester();
        int int41 = bookRequest23.compareTo(bookRequest37);
        java.lang.String str42 = bookRequest37.getBookTitle();
        int int43 = bookRequest37.getPriority();
        int int44 = bookRequest10.compareTo(bookRequest37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest32", (bookRequest10.compareTo(bookRequest32) == 0) == bookRequest10.equals(bookRequest32));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
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
        request.BookRequest bookRequest27 = new request.BookRequest("hi!", "", (int) '#');
        int int28 = bookRequest27.getPriority();
        java.lang.String str29 = bookRequest27.getRequester();
        int int30 = bookRequest27.getPriority();
        java.lang.String str31 = bookRequest27.getBookTitle();
        request.BookRequest bookRequest35 = new request.BookRequest("hi!", "hi!", 100);
        int int36 = bookRequest27.compareTo(bookRequest35);
        int int37 = bookRequest27.getPriority();
        int int38 = bookRequest16.compareTo(bookRequest27);
        request.BookRequest bookRequest42 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str43 = bookRequest42.getBookTitle();
        java.lang.String str44 = bookRequest42.getBookTitle();
        request.BookRequest bookRequest48 = new request.BookRequest("hi!", "", 1);
        java.lang.String str49 = bookRequest48.getRequester();
        int int50 = bookRequest48.getPriority();
        int int51 = bookRequest42.compareTo(bookRequest48);
        java.lang.String str52 = bookRequest48.getRequester();
        int int53 = bookRequest16.compareTo(bookRequest48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest27 and bookRequest42", (bookRequest27.compareTo(bookRequest42) == 0) == bookRequest27.equals(bookRequest42));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest7.getPriority();
        int int11 = bookRequest7.getPriority();
        java.lang.String str12 = bookRequest7.getRequester();
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
        int int26 = bookRequest16.getPriority();
        int int27 = bookRequest7.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest16", (bookRequest7.compareTo(bookRequest16) == 0) == bookRequest7.equals(bookRequest16));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
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
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", 0);
        java.lang.String str24 = bookRequest23.getBookTitle();
        int int25 = bookRequest23.getPriority();
        java.lang.String str26 = bookRequest23.getRequester();
        java.lang.String str27 = bookRequest23.getBookTitle();
        java.lang.String str28 = bookRequest23.getBookTitle();
        request.BookRequest bookRequest32 = new request.BookRequest("", "hi!", 97);
        java.lang.String str33 = bookRequest32.getRequester();
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) ' ');
        int int38 = bookRequest32.compareTo(bookRequest37);
        java.lang.String str39 = bookRequest37.getRequester();
        java.lang.String str40 = bookRequest37.getRequester();
        int int41 = bookRequest23.compareTo(bookRequest37);
        int int42 = bookRequest9.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest32", (bookRequest3.compareTo(bookRequest32) == 0) == bookRequest3.equals(bookRequest32));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
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
        request.BookRequest bookRequest25 = new request.BookRequest("", "hi!", 52);
        int int26 = bookRequest3.compareTo(bookRequest25);
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str35 = bookRequest34.getRequester();
        int int36 = bookRequest30.compareTo(bookRequest34);
        java.lang.String str37 = bookRequest34.getBookTitle();
        int int38 = bookRequest34.getPriority();
        int int39 = bookRequest3.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest9 and bookRequest34", (bookRequest9.compareTo(bookRequest34) == 0) == bookRequest9.equals(bookRequest34));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
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
        request.BookRequest bookRequest34 = new request.BookRequest("hi!", "", (int) '4');
        int int35 = bookRequest20.compareTo(bookRequest34);
        request.BookRequest bookRequest39 = new request.BookRequest("", "hi!", 10);
        int int40 = bookRequest20.compareTo(bookRequest39);
        int int41 = bookRequest3.compareTo(bookRequest39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
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
        java.lang.String str32 = bookRequest16.getBookTitle();
        int int33 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest20", (bookRequest3.compareTo(bookRequest20) == 0) == bookRequest3.equals(bookRequest20));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) '4');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getBookTitle();
        int int7 = bookRequest3.getPriority();
        java.lang.String str8 = bookRequest3.getRequester();
        request.BookRequest bookRequest12 = new request.BookRequest("", "", 1);
        java.lang.String str13 = bookRequest12.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str18 = bookRequest17.getRequester();
        int int19 = bookRequest17.getPriority();
        java.lang.String str20 = bookRequest17.getBookTitle();
        java.lang.String str21 = bookRequest17.getRequester();
        int int22 = bookRequest17.getPriority();
        int int23 = bookRequest12.compareTo(bookRequest17);
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest31 = new request.BookRequest("hi!", "hi!", 52);
        int int32 = bookRequest27.compareTo(bookRequest31);
        int int33 = bookRequest12.compareTo(bookRequest31);
        java.lang.String str34 = bookRequest12.getBookTitle();
        int int35 = bookRequest12.getPriority();
        java.lang.String str36 = bookRequest12.getBookTitle();
        int int37 = bookRequest3.compareTo(bookRequest12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest31", (bookRequest3.compareTo(bookRequest31) == 0) == bookRequest3.equals(bookRequest31));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        int int9 = bookRequest3.getPriority();
        request.BookRequest bookRequest13 = new request.BookRequest("", "", 1);
        java.lang.String str14 = bookRequest13.getRequester();
        java.lang.String str15 = bookRequest13.getBookTitle();
        int int16 = bookRequest3.compareTo(bookRequest13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest13", (bookRequest3.compareTo(bookRequest13) == 0) == bookRequest3.equals(bookRequest13));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str30 = bookRequest29.getBookTitle();
        java.lang.String str31 = bookRequest29.getRequester();
        java.lang.String str32 = bookRequest29.getBookTitle();
        int int33 = bookRequest3.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest15 and bookRequest29", (bookRequest15.compareTo(bookRequest29) == 0) == bookRequest15.equals(bookRequest29));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
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
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str31 = bookRequest30.getBookTitle();
        java.lang.String str32 = bookRequest30.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("", "hi!", 97);
        int int37 = bookRequest36.getPriority();
        int int38 = bookRequest30.compareTo(bookRequest36);
        int int39 = bookRequest14.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest36", (bookRequest14.compareTo(bookRequest36) == 0) == bookRequest14.equals(bookRequest36));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
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
        request.BookRequest bookRequest37 = new request.BookRequest("", "", 1);
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str42 = bookRequest41.getRequester();
        int int43 = bookRequest41.getPriority();
        java.lang.String str44 = bookRequest41.getBookTitle();
        java.lang.String str45 = bookRequest41.getRequester();
        request.BookRequest bookRequest49 = new request.BookRequest("", "hi!", 52);
        int int50 = bookRequest41.compareTo(bookRequest49);
        request.BookRequest bookRequest54 = new request.BookRequest("hi!", "", (int) (short) 100);
        int int55 = bookRequest49.compareTo(bookRequest54);
        int int56 = bookRequest37.compareTo(bookRequest54);
        java.lang.String str57 = bookRequest54.getRequester();
        request.BookRequest bookRequest61 = new request.BookRequest("hi!", "hi!", (int) (byte) -1);
        request.BookRequest bookRequest65 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str66 = bookRequest65.getBookTitle();
        java.lang.String str67 = bookRequest65.getRequester();
        int int68 = bookRequest65.getPriority();
        int int69 = bookRequest61.compareTo(bookRequest65);
        int int70 = bookRequest61.getPriority();
        int int71 = bookRequest54.compareTo(bookRequest61);
        int int72 = bookRequest26.compareTo(bookRequest54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest18 and bookRequest41", (bookRequest18.compareTo(bookRequest41) == 0) == bookRequest18.equals(bookRequest41));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        java.lang.String str28 = bookRequest26.getRequester();
        java.lang.String str29 = bookRequest26.getRequester();
        int int30 = bookRequest26.getPriority();
        int int31 = bookRequest26.getPriority();
        java.lang.String str32 = bookRequest26.getRequester();
        java.lang.String str33 = bookRequest26.getRequester();
        int int34 = bookRequest3.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest13 and bookRequest26", (bookRequest13.compareTo(bookRequest26) == 0) == bookRequest13.equals(bookRequest26));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
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
        java.lang.String str14 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest18 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str19 = bookRequest18.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 0);
        int int28 = bookRequest23.compareTo(bookRequest27);
        int int29 = bookRequest18.compareTo(bookRequest27);
        java.lang.String str30 = bookRequest27.getBookTitle();
        java.lang.String str31 = bookRequest27.getBookTitle();
        java.lang.String str32 = bookRequest27.getBookTitle();
        java.lang.String str33 = bookRequest27.getRequester();
        java.lang.String str34 = bookRequest27.getBookTitle();
        java.lang.String str35 = bookRequest27.getBookTitle();
        int int36 = bookRequest27.getPriority();
        int int37 = bookRequest3.compareTo(bookRequest27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest23", (bookRequest3.compareTo(bookRequest23) == 0) == bookRequest3.equals(bookRequest23));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) '#');
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getRequester();
        java.lang.String str6 = bookRequest3.getRequester();
        request.BookRequest bookRequest10 = new request.BookRequest("", "", (int) (byte) 100);
        int int11 = bookRequest3.compareTo(bookRequest10);
        java.lang.String str12 = bookRequest10.getRequester();
        int int13 = bookRequest10.getPriority();
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
        java.lang.String str30 = bookRequest17.getBookTitle();
        int int31 = bookRequest17.getPriority();
        java.lang.String str32 = bookRequest17.getRequester();
        int int33 = bookRequest10.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest10 and bookRequest17", (bookRequest10.compareTo(bookRequest17) == 0) == bookRequest10.equals(bookRequest17));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 97);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "hi!", (int) (byte) 10);
        int int8 = bookRequest7.getPriority();
        int int9 = bookRequest7.getPriority();
        int int10 = bookRequest3.compareTo(bookRequest7);
        java.lang.String str11 = bookRequest7.getBookTitle();
        java.lang.String str12 = bookRequest7.getRequester();
        java.lang.String str13 = bookRequest7.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest21 = new request.BookRequest("hi!", "", (int) 'a');
        int int22 = bookRequest21.getPriority();
        java.lang.String str23 = bookRequest21.getRequester();
        int int24 = bookRequest21.getPriority();
        int int25 = bookRequest21.getPriority();
        java.lang.String str26 = bookRequest21.getBookTitle();
        int int27 = bookRequest21.getPriority();
        java.lang.String str28 = bookRequest21.getBookTitle();
        int int29 = bookRequest21.getPriority();
        java.lang.String str30 = bookRequest21.getRequester();
        request.BookRequest bookRequest34 = new request.BookRequest("", "", 1);
        java.lang.String str35 = bookRequest34.getRequester();
        int int36 = bookRequest21.compareTo(bookRequest34);
        int int37 = bookRequest17.compareTo(bookRequest34);
        java.lang.String str38 = bookRequest17.getBookTitle();
        java.lang.String str39 = bookRequest17.getRequester();
        int int40 = bookRequest7.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
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
        request.BookRequest bookRequest34 = new request.BookRequest("", "hi!", (int) '4');
        int int35 = bookRequest34.getPriority();
        java.lang.String str36 = bookRequest34.getBookTitle();
        java.lang.String str37 = bookRequest34.getBookTitle();
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", 0);
        java.lang.String str42 = bookRequest41.getBookTitle();
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "", (int) 'a');
        int int47 = bookRequest46.getPriority();
        int int48 = bookRequest46.getPriority();
        java.lang.String str49 = bookRequest46.getBookTitle();
        java.lang.String str50 = bookRequest46.getBookTitle();
        int int51 = bookRequest41.compareTo(bookRequest46);
        request.BookRequest bookRequest55 = new request.BookRequest("", "", (int) (byte) 10);
        int int56 = bookRequest55.getPriority();
        int int57 = bookRequest41.compareTo(bookRequest55);
        int int58 = bookRequest34.compareTo(bookRequest41);
        java.lang.String str59 = bookRequest34.getRequester();
        java.lang.String str60 = bookRequest34.getBookTitle();
        java.lang.String str61 = bookRequest34.getBookTitle();
        int int62 = bookRequest7.compareTo(bookRequest34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest46", (bookRequest7.compareTo(bookRequest46) == 0) == bookRequest7.equals(bookRequest46));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
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
        request.BookRequest bookRequest27 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str28 = bookRequest27.getBookTitle();
        java.lang.String str29 = bookRequest27.getRequester();
        int int30 = bookRequest27.getPriority();
        java.lang.String str31 = bookRequest27.getRequester();
        java.lang.String str32 = bookRequest27.getRequester();
        request.BookRequest bookRequest36 = new request.BookRequest("", "hi!", (int) '4');
        int int37 = bookRequest36.getPriority();
        java.lang.String str38 = bookRequest36.getBookTitle();
        java.lang.String str39 = bookRequest36.getBookTitle();
        int int40 = bookRequest36.getPriority();
        int int41 = bookRequest36.getPriority();
        int int42 = bookRequest27.compareTo(bookRequest36);
        int int43 = bookRequest36.getPriority();
        java.lang.String str44 = bookRequest36.getRequester();
        int int45 = bookRequest13.compareTo(bookRequest36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest36", (bookRequest3.compareTo(bookRequest36) == 0) == bookRequest3.equals(bookRequest36));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", 35);
        request.BookRequest bookRequest7 = new request.BookRequest("", "", (int) (byte) 1);
        int int8 = bookRequest3.compareTo(bookRequest7);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        java.lang.String str14 = bookRequest12.getRequester();
        int int15 = bookRequest12.getPriority();
        java.lang.String str16 = bookRequest12.getRequester();
        java.lang.String str17 = bookRequest12.getBookTitle();
        java.lang.String str18 = bookRequest12.getBookTitle();
        int int19 = bookRequest3.compareTo(bookRequest12);
        java.lang.String str20 = bookRequest3.getRequester();
        request.BookRequest bookRequest24 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str25 = bookRequest24.getBookTitle();
        java.lang.String str26 = bookRequest24.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("", "hi!", 97);
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest24.compareTo(bookRequest30);
        int int33 = bookRequest3.compareTo(bookRequest24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest30", (bookRequest12.compareTo(bookRequest30) == 0) == bookRequest12.equals(bookRequest30));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
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
        request.BookRequest bookRequest28 = new request.BookRequest("", "", 1);
        java.lang.String str29 = bookRequest28.getRequester();
        java.lang.String str30 = bookRequest28.getBookTitle();
        java.lang.String str31 = bookRequest28.getRequester();
        request.BookRequest bookRequest35 = new request.BookRequest("", "", (int) (short) 0);
        request.BookRequest bookRequest39 = new request.BookRequest("hi!", "hi!", 52);
        int int40 = bookRequest35.compareTo(bookRequest39);
        int int41 = bookRequest35.getPriority();
        int int42 = bookRequest28.compareTo(bookRequest35);
        int int43 = bookRequest35.getPriority();
        java.lang.String str44 = bookRequest35.getBookTitle();
        java.lang.String str45 = bookRequest35.getBookTitle();
        java.lang.String str46 = bookRequest35.getBookTitle();
        int int47 = bookRequest3.compareTo(bookRequest35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest28", (bookRequest7.compareTo(bookRequest28) == 0) == bookRequest7.equals(bookRequest28));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
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
        request.BookRequest bookRequest29 = new request.BookRequest("", "hi!", (int) '4');
        int int30 = bookRequest29.getPriority();
        java.lang.String str31 = bookRequest29.getBookTitle();
        java.lang.String str32 = bookRequest29.getBookTitle();
        request.BookRequest bookRequest36 = new request.BookRequest("hi!", "", (int) (byte) -1);
        int int37 = bookRequest29.compareTo(bookRequest36);
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) ' ');
        int int42 = bookRequest41.getPriority();
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str47 = bookRequest46.getRequester();
        int int48 = bookRequest46.getPriority();
        request.BookRequest bookRequest52 = new request.BookRequest("", "", 1);
        java.lang.String str53 = bookRequest52.getBookTitle();
        int int54 = bookRequest46.compareTo(bookRequest52);
        int int55 = bookRequest41.compareTo(bookRequest52);
        int int56 = bookRequest36.compareTo(bookRequest52);
        int int57 = bookRequest7.compareTo(bookRequest52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest36", (bookRequest3.compareTo(bookRequest36) == 0) == bookRequest3.equals(bookRequest36));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
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
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        int int27 = bookRequest26.getPriority();
        int int28 = bookRequest26.getPriority();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getBookTitle();
        int int31 = bookRequest26.getPriority();
        java.lang.String str32 = bookRequest26.getBookTitle();
        java.lang.String str33 = bookRequest26.getRequester();
        java.lang.String str34 = bookRequest26.getRequester();
        int int35 = bookRequest12.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest26", (bookRequest12.compareTo(bookRequest26) == 0) == bookRequest12.equals(bookRequest26));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", 0);
        java.lang.String str4 = bookRequest3.getBookTitle();
        int int5 = bookRequest3.getPriority();
        java.lang.String str6 = bookRequest3.getRequester();
        int int7 = bookRequest3.getPriority();
        request.BookRequest bookRequest11 = new request.BookRequest("", "hi!", (int) '#');
        int int12 = bookRequest3.compareTo(bookRequest11);
        java.lang.String str13 = bookRequest11.getBookTitle();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) (short) 10);
        request.BookRequest bookRequest21 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str22 = bookRequest21.getRequester();
        request.BookRequest bookRequest26 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest30 = new request.BookRequest("", "", (int) (short) 0);
        int int31 = bookRequest26.compareTo(bookRequest30);
        int int32 = bookRequest21.compareTo(bookRequest30);
        java.lang.String str33 = bookRequest30.getBookTitle();
        int int34 = bookRequest30.getPriority();
        int int35 = bookRequest17.compareTo(bookRequest30);
        java.lang.String str36 = bookRequest17.getRequester();
        java.lang.String str37 = bookRequest17.getRequester();
        int int38 = bookRequest11.compareTo(bookRequest17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest30", (bookRequest3.compareTo(bookRequest30) == 0) == bookRequest3.equals(bookRequest30));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
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
        request.BookRequest bookRequest44 = new request.BookRequest("hi!", "", (int) 'a');
        int int45 = bookRequest44.getPriority();
        java.lang.String str46 = bookRequest44.getRequester();
        java.lang.String str47 = bookRequest44.getBookTitle();
        request.BookRequest bookRequest51 = new request.BookRequest("hi!", "", (int) (short) 1);
        int int52 = bookRequest44.compareTo(bookRequest51);
        int int53 = bookRequest44.getPriority();
        java.lang.String str54 = bookRequest44.getRequester();
        java.lang.String str55 = bookRequest44.getBookTitle();
        int int56 = bookRequest44.getPriority();
        request.BookRequest bookRequest60 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str61 = bookRequest60.getBookTitle();
        java.lang.String str62 = bookRequest60.getRequester();
        java.lang.String str63 = bookRequest60.getRequester();
        java.lang.String str64 = bookRequest60.getBookTitle();
        int int65 = bookRequest44.compareTo(bookRequest60);
        java.lang.String str66 = bookRequest44.getBookTitle();
        int int67 = bookRequest3.compareTo(bookRequest44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest18 and bookRequest51", (bookRequest18.compareTo(bookRequest51) == 0) == bookRequest18.equals(bookRequest51));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "hi!", (int) (short) 100);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (-1));
        java.lang.String str9 = bookRequest8.getBookTitle();
        int int10 = bookRequest8.getPriority();
        java.lang.String str11 = bookRequest8.getBookTitle();
        int int12 = bookRequest3.compareTo(bookRequest8);
        java.lang.String str13 = bookRequest3.getRequester();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "hi!", (-1));
        java.lang.String str18 = bookRequest17.getRequester();
        java.lang.String str19 = bookRequest17.getRequester();
        request.BookRequest bookRequest23 = new request.BookRequest("", "", (int) (short) 0);
        java.lang.String str24 = bookRequest23.getRequester();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) 'a');
        int int29 = bookRequest28.getPriority();
        java.lang.String str30 = bookRequest28.getRequester();
        int int31 = bookRequest28.getPriority();
        java.lang.String str32 = bookRequest28.getRequester();
        int int33 = bookRequest23.compareTo(bookRequest28);
        request.BookRequest bookRequest37 = new request.BookRequest("", "hi!", (int) '#');
        request.BookRequest bookRequest41 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str42 = bookRequest41.getRequester();
        java.lang.String str43 = bookRequest41.getBookTitle();
        int int44 = bookRequest37.compareTo(bookRequest41);
        java.lang.String str45 = bookRequest37.getRequester();
        java.lang.String str46 = bookRequest37.getRequester();
        int int47 = bookRequest37.getPriority();
        int int48 = bookRequest23.compareTo(bookRequest37);
        java.lang.String str49 = bookRequest23.getBookTitle();
        int int50 = bookRequest17.compareTo(bookRequest23);
        int int51 = bookRequest3.compareTo(bookRequest23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest8 and bookRequest17", (bookRequest8.compareTo(bookRequest17) == 0) == bookRequest8.equals(bookRequest17));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
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
        java.lang.String str26 = bookRequest20.getRequester();
        request.BookRequest bookRequest30 = new request.BookRequest("hi!", "", (int) 'a');
        int int31 = bookRequest30.getPriority();
        int int32 = bookRequest30.getPriority();
        java.lang.String str33 = bookRequest30.getBookTitle();
        java.lang.String str34 = bookRequest30.getBookTitle();
        int int35 = bookRequest30.getPriority();
        java.lang.String str36 = bookRequest30.getBookTitle();
        java.lang.String str37 = bookRequest30.getRequester();
        java.lang.String str38 = bookRequest30.getBookTitle();
        int int39 = bookRequest30.getPriority();
        java.lang.String str40 = bookRequest30.getRequester();
        java.lang.String str41 = bookRequest30.getBookTitle();
        java.lang.String str42 = bookRequest30.getBookTitle();
        int int43 = bookRequest20.compareTo(bookRequest30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest30", (bookRequest7.compareTo(bookRequest30) == 0) == bookRequest7.equals(bookRequest30));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) '#');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest9 = new request.BookRequest("", "", (int) ' ');
        int int10 = bookRequest3.compareTo(bookRequest9);
        java.lang.String str11 = bookRequest3.getRequester();
        java.lang.String str12 = bookRequest3.getRequester();
        int int13 = bookRequest3.getPriority();
        request.BookRequest bookRequest17 = new request.BookRequest("hi!", "", (int) '#');
        int int18 = bookRequest17.getPriority();
        java.lang.String str19 = bookRequest17.getRequester();
        int int20 = bookRequest17.getPriority();
        java.lang.String str21 = bookRequest17.getBookTitle();
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "hi!", 100);
        int int26 = bookRequest17.compareTo(bookRequest25);
        int int27 = bookRequest25.getPriority();
        int int28 = bookRequest3.compareTo(bookRequest25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest17", (bookRequest3.compareTo(bookRequest17) == 0) == bookRequest3.equals(bookRequest17));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
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
        java.lang.String str28 = bookRequest3.getRequester();
        request.BookRequest bookRequest32 = new request.BookRequest("", "", (int) (byte) 100);
        int int33 = bookRequest32.getPriority();
        request.BookRequest bookRequest37 = new request.BookRequest("", "", (int) ' ');
        java.lang.String str38 = bookRequest37.getRequester();
        request.BookRequest bookRequest42 = new request.BookRequest("hi!", "", (int) 'a');
        request.BookRequest bookRequest46 = new request.BookRequest("", "", (int) (short) 0);
        int int47 = bookRequest42.compareTo(bookRequest46);
        int int48 = bookRequest37.compareTo(bookRequest46);
        java.lang.String str49 = bookRequest46.getBookTitle();
        int int50 = bookRequest46.getPriority();
        int int51 = bookRequest46.getPriority();
        java.lang.String str52 = bookRequest46.getRequester();
        int int53 = bookRequest32.compareTo(bookRequest46);
        java.lang.String str54 = bookRequest46.getBookTitle();
        java.lang.String str55 = bookRequest46.getRequester();
        java.lang.String str56 = bookRequest46.getRequester();
        int int57 = bookRequest3.compareTo(bookRequest46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest37", (bookRequest3.compareTo(bookRequest37) == 0) == bookRequest3.equals(bookRequest37));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
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
        java.lang.String str21 = bookRequest14.getBookTitle();
        int int22 = bookRequest14.getPriority();
        int int23 = bookRequest14.getPriority();
        java.lang.String str24 = bookRequest14.getBookTitle();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", 0);
        java.lang.String str29 = bookRequest28.getBookTitle();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        int int34 = bookRequest33.getPriority();
        int int35 = bookRequest33.getPriority();
        java.lang.String str36 = bookRequest33.getBookTitle();
        java.lang.String str37 = bookRequest33.getBookTitle();
        int int38 = bookRequest28.compareTo(bookRequest33);
        java.lang.String str39 = bookRequest28.getBookTitle();
        java.lang.String str40 = bookRequest28.getBookTitle();
        int int41 = bookRequest28.getPriority();
        int int42 = bookRequest28.getPriority();
        int int43 = bookRequest14.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest14 and bookRequest33", (bookRequest14.compareTo(bookRequest33) == 0) == bookRequest14.equals(bookRequest33));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
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
        request.BookRequest bookRequest16 = new request.BookRequest("hi!", "", (int) 'a');
        int int17 = bookRequest16.getPriority();
        java.lang.String str18 = bookRequest16.getRequester();
        int int19 = bookRequest16.getPriority();
        java.lang.String str20 = bookRequest16.getRequester();
        java.lang.String str21 = bookRequest16.getBookTitle();
        int int22 = bookRequest16.getPriority();
        java.lang.String str23 = bookRequest16.getRequester();
        int int24 = bookRequest16.getPriority();
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) (short) 1);
        java.lang.String str29 = bookRequest28.getRequester();
        java.lang.String str30 = bookRequest28.getBookTitle();
        int int31 = bookRequest28.getPriority();
        java.lang.String str32 = bookRequest28.getBookTitle();
        java.lang.String str33 = bookRequest28.getRequester();
        java.lang.String str34 = bookRequest28.getBookTitle();
        java.lang.String str35 = bookRequest28.getRequester();
        java.lang.String str36 = bookRequest28.getBookTitle();
        java.lang.String str37 = bookRequest28.getRequester();
        int int38 = bookRequest16.compareTo(bookRequest28);
        java.lang.String str39 = bookRequest16.getBookTitle();
        int int40 = bookRequest16.getPriority();
        java.lang.String str41 = bookRequest16.getRequester();
        int int42 = bookRequest3.compareTo(bookRequest16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
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
        request.BookRequest bookRequest46 = new request.BookRequest("hi!", "", (int) 'a');
        int int47 = bookRequest46.getPriority();
        int int48 = bookRequest46.getPriority();
        java.lang.String str49 = bookRequest46.getBookTitle();
        java.lang.String str50 = bookRequest46.getRequester();
        java.lang.String str51 = bookRequest46.getBookTitle();
        request.BookRequest bookRequest55 = new request.BookRequest("", "", 100);
        request.BookRequest bookRequest59 = new request.BookRequest("", "hi!", (int) (byte) 10);
        int int60 = bookRequest55.compareTo(bookRequest59);
        java.lang.String str61 = bookRequest55.getBookTitle();
        int int62 = bookRequest46.compareTo(bookRequest55);
        java.lang.String str63 = bookRequest55.getRequester();
        java.lang.String str64 = bookRequest55.getBookTitle();
        int int65 = bookRequest23.compareTo(bookRequest55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest46", (bookRequest7.compareTo(bookRequest46) == 0) == bookRequest7.equals(bookRequest46));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (byte) 0);
        request.BookRequest bookRequest7 = new request.BookRequest("hi!", "", (int) 'a');
        int int8 = bookRequest3.compareTo(bookRequest7);
        int int9 = bookRequest7.getPriority();
        java.lang.String str10 = bookRequest7.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "", (int) (short) 10);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getRequester();
        java.lang.String str17 = bookRequest14.getRequester();
        java.lang.String str18 = bookRequest14.getRequester();
        request.BookRequest bookRequest22 = new request.BookRequest("", "hi!", (int) '#');
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getBookTitle();
        int int25 = bookRequest14.compareTo(bookRequest22);
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        int int30 = bookRequest29.getPriority();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getRequester();
        int int33 = bookRequest29.getPriority();
        java.lang.String str34 = bookRequest29.getRequester();
        request.BookRequest bookRequest38 = new request.BookRequest("", "hi!", (int) '4');
        java.lang.String str39 = bookRequest38.getBookTitle();
        int int40 = bookRequest29.compareTo(bookRequest38);
        java.lang.String str41 = bookRequest38.getRequester();
        int int42 = bookRequest38.getPriority();
        int int43 = bookRequest22.compareTo(bookRequest38);
        int int44 = bookRequest7.compareTo(bookRequest38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest29", (bookRequest7.compareTo(bookRequest29) == 0) == bookRequest7.equals(bookRequest29));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
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
        request.BookRequest bookRequest28 = new request.BookRequest("hi!", "", (int) ' ');
        int int29 = bookRequest28.getPriority();
        request.BookRequest bookRequest33 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str34 = bookRequest33.getRequester();
        int int35 = bookRequest33.getPriority();
        request.BookRequest bookRequest39 = new request.BookRequest("", "", 1);
        java.lang.String str40 = bookRequest39.getBookTitle();
        int int41 = bookRequest33.compareTo(bookRequest39);
        int int42 = bookRequest28.compareTo(bookRequest39);
        int int43 = bookRequest28.getPriority();
        request.BookRequest bookRequest47 = new request.BookRequest("", "", (int) (byte) 10);
        java.lang.String str48 = bookRequest47.getBookTitle();
        int int49 = bookRequest47.getPriority();
        request.BookRequest bookRequest53 = new request.BookRequest("hi!", "hi!", 52);
        int int54 = bookRequest47.compareTo(bookRequest53);
        java.lang.String str55 = bookRequest53.getRequester();
        int int56 = bookRequest28.compareTo(bookRequest53);
        int int57 = bookRequest20.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest7 and bookRequest33", (bookRequest7.compareTo(bookRequest33) == 0) == bookRequest7.equals(bookRequest33));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
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
        request.BookRequest bookRequest25 = new request.BookRequest("hi!", "", (int) '#');
        request.BookRequest bookRequest29 = new request.BookRequest("hi!", "", (int) 'a');
        java.lang.String str30 = bookRequest29.getRequester();
        int int31 = bookRequest29.getPriority();
        java.lang.String str32 = bookRequest29.getBookTitle();
        java.lang.String str33 = bookRequest29.getRequester();
        int int34 = bookRequest29.getPriority();
        java.lang.String str35 = bookRequest29.getBookTitle();
        int int36 = bookRequest29.getPriority();
        int int37 = bookRequest29.getPriority();
        int int38 = bookRequest25.compareTo(bookRequest29);
        request.BookRequest bookRequest42 = new request.BookRequest("", "", (int) (byte) 10);
        int int43 = bookRequest42.getPriority();
        int int44 = bookRequest29.compareTo(bookRequest42);
        int int45 = bookRequest29.getPriority();
        java.lang.String str46 = bookRequest29.getRequester();
        int int47 = bookRequest19.compareTo(bookRequest29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest42", (bookRequest3.compareTo(bookRequest42) == 0) == bookRequest3.equals(bookRequest42));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
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
        int int46 = bookRequest28.getPriority();
        int int47 = bookRequest14.compareTo(bookRequest28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest28", (bookRequest3.compareTo(bookRequest28) == 0) == bookRequest3.equals(bookRequest28));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        request.BookRequest bookRequest3 = new request.BookRequest("hi!", "", (int) 'a');
        int int4 = bookRequest3.getPriority();
        java.lang.String str5 = bookRequest3.getRequester();
        int int6 = bookRequest3.getPriority();
        java.lang.String str7 = bookRequest3.getBookTitle();
        java.lang.String str8 = bookRequest3.getRequester();
        java.lang.String str9 = bookRequest3.getRequester();
        java.lang.String str10 = bookRequest3.getRequester();
        request.BookRequest bookRequest14 = new request.BookRequest("", "hi!", 10);
        java.lang.String str15 = bookRequest14.getRequester();
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
        request.BookRequest bookRequest32 = new request.BookRequest("", "", 1);
        java.lang.String str33 = bookRequest32.getRequester();
        int int34 = bookRequest19.compareTo(bookRequest32);
        java.lang.String str35 = bookRequest19.getBookTitle();
        int int36 = bookRequest19.getPriority();
        int int37 = bookRequest14.compareTo(bookRequest19);
        java.lang.String str38 = bookRequest14.getRequester();
        java.lang.String str39 = bookRequest14.getRequester();
        java.lang.String str40 = bookRequest14.getBookTitle();
        int int41 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest19", (bookRequest3.compareTo(bookRequest19) == 0) == bookRequest3.equals(bookRequest19));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        request.BookRequest bookRequest3 = new request.BookRequest("", "hi!", (int) (byte) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        java.lang.String str5 = bookRequest3.getBookTitle();
        java.lang.String str6 = bookRequest3.getRequester();
        java.lang.String str7 = bookRequest3.getRequester();
        java.lang.String str8 = bookRequest3.getBookTitle();
        java.lang.String str9 = bookRequest3.getBookTitle();
        int int10 = bookRequest3.getPriority();
        request.BookRequest bookRequest14 = new request.BookRequest("hi!", "hi!", 0);
        int int15 = bookRequest14.getPriority();
        int int16 = bookRequest14.getPriority();
        int int17 = bookRequest14.getPriority();
        request.BookRequest bookRequest21 = new request.BookRequest("", "", 1);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.getBookTitle();
        java.lang.String str24 = bookRequest21.getRequester();
        int int25 = bookRequest14.compareTo(bookRequest21);
        java.lang.String str26 = bookRequest14.getBookTitle();
        java.lang.String str27 = bookRequest14.getBookTitle();
        int int28 = bookRequest14.getPriority();
        int int29 = bookRequest3.compareTo(bookRequest14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest21", (bookRequest3.compareTo(bookRequest21) == 0) == bookRequest3.equals(bookRequest21));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
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
        request.BookRequest bookRequest22 = new request.BookRequest("hi!", "", (int) '4');
        request.BookRequest bookRequest26 = new request.BookRequest("", "", 100);
        java.lang.String str27 = bookRequest26.getBookTitle();
        java.lang.String str28 = bookRequest26.getBookTitle();
        java.lang.String str29 = bookRequest26.getRequester();
        int int30 = bookRequest22.compareTo(bookRequest26);
        int int31 = bookRequest12.compareTo(bookRequest26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest12 and bookRequest22", (bookRequest12.compareTo(bookRequest22) == 0) == bookRequest12.equals(bookRequest22));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        request.BookRequest bookRequest3 = new request.BookRequest("", "", (int) (short) 1);
        java.lang.String str4 = bookRequest3.getBookTitle();
        request.BookRequest bookRequest8 = new request.BookRequest("hi!", "", (int) (short) 1);
        request.BookRequest bookRequest12 = new request.BookRequest("hi!", "", (int) 'a');
        int int13 = bookRequest12.getPriority();
        int int14 = bookRequest12.getPriority();
        int int15 = bookRequest8.compareTo(bookRequest12);
        int int16 = bookRequest8.getPriority();
        int int17 = bookRequest8.getPriority();
        int int18 = bookRequest3.compareTo(bookRequest8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bookRequest3 and bookRequest8", (bookRequest3.compareTo(bookRequest8) == 0) == bookRequest3.equals(bookRequest8));
    }
}

